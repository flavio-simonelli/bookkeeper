/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.bookkeeper.bookie;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 tests for BufferedChannel - Part 7: Complex Read Logic.
 * * Updated to handle Greedy Read (fixed capacity buffers) and Composite Buffer setup.
 */
public class BufferedChannelPartVIITest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part7", ".log");
        tempFile.deleteOnExit();
        randomAccessFile = new RandomAccessFile(tempFile, "rw");
        fileChannel = randomAccessFile.getChannel();
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            bufferedChannel.close();
        }
        if (fileChannel != null) {
            fileChannel.close();
        }
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        if (tempFile != null) {
            tempFile.delete();
        }
    }

    private ByteBuf createBuffer(String content) {
        byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes.length);
        buf.writeBytes(bytes);
        return buf;
    }

    private String getBufferContent(ByteBuf buf) {
        byte[] bytes = new byte[buf.readableBytes()];
        buf.getBytes(buf.readerIndex(), bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    // 76. Loop Iteration Logic
    @Test
    public void testLoopIterationLogic() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100, 10, 0);

        bufferedChannel.write(createBuffer("0123456789"));
        bufferedChannel.flush();
        bufferedChannel.write(createBuffer("ABCDEFGHIJ"));
        bufferedChannel.flush();
        bufferedChannel.write(createBuffer("klmnopqrst"));

        // Prime ReadBuffer
        ByteBuf prime = Unpooled.buffer(10, 10);
        bufferedChannel.read(prime, 10, 10);
        prime.release();

        // Fix: Limit capacity to 20
        ByteBuf dest = Unpooled.buffer(20, 20);
        int readBytes = bufferedChannel.read(dest, 5, 20);

        assertEquals(20, readBytes);
        assertEquals("56789ABCDEFGHIJklmno", getBufferContent(dest));
        dest.release();
    }

    // 77. WriteBufferStart Logic
    @Test
    public void testWriteBufferStartLogic() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        bufferedChannel.write(createBuffer("AAAAA"));
        bufferedChannel.flush();
        bufferedChannel.write(createBuffer("BBBBB"));

        // Fix: Limit capacity
        ByteBuf dest1 = Unpooled.buffer(5, 5);
        bufferedChannel.read(dest1, 0, 5);
        assertEquals("AAAAA", getBufferContent(dest1));

        // Fix: Limit capacity
        ByteBuf dest2 = Unpooled.buffer(5, 5);
        bufferedChannel.read(dest2, 5, 5);
        assertEquals("BBBBB", getBufferContent(dest2));

        dest1.release();
        dest2.release();
    }

    // 78. Read Buffer Invalidation
    @Test
    public void testReadBufferInvalidation() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100, 5, 0);
        bufferedChannel.write(createBuffer("1234567890"));
        bufferedChannel.flush();

        ByteBuf dest1 = Unpooled.buffer(5, 5);
        bufferedChannel.read(dest1, 0, 5);
        assertEquals("12345", getBufferContent(dest1));

        ByteBuf dest2 = Unpooled.buffer(5, 5);
        bufferedChannel.read(dest2, 5, 5);
        assertEquals("67890", getBufferContent(dest2));

        dest1.release();
        dest2.release();
    }

    // 79. Destination Buffer Growth
    @Test
    public void testDestinationBufferGrowth() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("1234567890"));
        bufferedChannel.flush();

        ByteBuf dest = Unpooled.buffer(1, 100);

        try {
            bufferedChannel.read(dest, 0, 10);
        } catch (IllegalArgumentException e) {
            assertEquals("dest buffer remaining capacity is not enough(must be at least as \"length\"=10)", e.getMessage());
            return;
        }

        dest.ensureWritable(10);
        // Ensure max capacity limits reading
        ByteBuf tightDest = Unpooled.buffer(10, 10);
        bufferedChannel.read(tightDest, 0, 10);
        assertEquals("1234567890", getBufferContent(tightDest));

        dest.release();
        tightDest.release();
    }

    // 80. Read into Composite Buffer
    // Fixed setup to ensure capacity is correctly recognized
    @Test
    public void testReadIntoCompositeBuffer() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("HeaderPayload"));
        bufferedChannel.flush();

        // Fix: Explicitly manage composite buffer capacity/components for writing
        CompositeByteBuf comp = allocator.compositeBuffer();

        // Add components. Note: Unpooled.buffer(6) has 0 readable bytes.
        // We need components that provide WRITABLE space.
        // In Netty, addComponent(true, buf) updates writerIndex by readableBytes.
        // So writerIndex stays 0.
        // We manually ensure capacity covers the read length.
        comp.addComponent(true, Unpooled.buffer(6, 6));
        comp.addComponent(true, Unpooled.buffer(7, 7));

        // Sanity check: cap should be 13, writerIndex 0.
        // If this fails, we force it.
        if (comp.capacity() < 13) {
            comp.capacity(13);
        }

        bufferedChannel.read(comp, 0, 13);

        assertEquals("HeaderPayload", getBufferContent(comp));
        comp.release();
    }

    // 81. Read Does Not Alter Source
    @Test
    public void testReadDoesNotAlterSource() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("StableData"));
        long posBefore = bufferedChannel.position();

        ByteBuf tooSmall = Unpooled.buffer(1);
        try {
            bufferedChannel.read(tooSmall, 0, 10);
        } catch (IllegalArgumentException e) {
            // ignore
        }

        assertEquals("Position should remain unchanged", posBefore, bufferedChannel.position());
        assertEquals("Buffer content should remain", 10, bufferedChannel.getNumOfBytesInWriteBuffer());

        ByteBuf correct = Unpooled.buffer(10, 10);
        bufferedChannel.read(correct, 0, 10);
        assertEquals("StableData", getBufferContent(correct));

        tooSmall.release();
        correct.release();
    }

    // 82. Read Logic with Null WriteBuffer (Simulated)
    @Test
    public void testReadWithNullWriteBuffer() throws Exception {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("FileOnly"));
        bufferedChannel.flush();

        Field wbField = BufferedChannel.class.getDeclaredField("writeBuffer");
        wbField.setAccessible(true);
        ByteBuf oldBuf = (ByteBuf) wbField.get(bufferedChannel);
        wbField.set(bufferedChannel, null);

        try {
            ByteBuf dest = Unpooled.buffer(8, 8);
            bufferedChannel.read(dest, 0, 8);
            assertEquals("FileOnly", getBufferContent(dest));
        } finally {
            if (oldBuf != null) oldBuf.release();
        }
    }

    // 83. Overlap Calculation
    @Test
    public void testOverlapCalculation() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("0123456789"));
        bufferedChannel.flush();
        bufferedChannel.write(createBuffer("ABCDEFGHIJ"));

        // Read starting at 8, length 4 (8,9 from file; A,B from buffer)
        ByteBuf dest = Unpooled.buffer(4, 4);
        bufferedChannel.read(dest, 8, 4);

        assertEquals("89AB", getBufferContent(dest));
        dest.release();
    }

    // 84. Read Buffer Alignment
    @Test
    public void testReadBufferAlignment() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100, 10, 0);
        bufferedChannel.write(createBuffer("0123456789ABCDEF")); // 16 bytes
        bufferedChannel.flush();

        ByteBuf dest = Unpooled.buffer(5, 5);

        bufferedChannel.read(dest, 5, 5);
        assertEquals("56789", getBufferContent(dest));
        dest.clear();

        bufferedChannel.read(dest, 2, 5);
        assertEquals("23456", getBufferContent(dest));

        dest.release();
    }

    // 85. Concurrent Read/Write Simulation
    @Test
    public void testInterleavedReadWrite() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        ByteBuf buf = Unpooled.buffer(1, 1); // IMPORTANT: Limit to 1 to avoid greedy read

        bufferedChannel.write(createBuffer("A"));
        bufferedChannel.read(buf, 0, 1);
        assertEquals("A", getBufferContent(buf));
        buf.clear();

        bufferedChannel.write(createBuffer("B"));
        bufferedChannel.read(buf, 1, 1);
        assertEquals("B", getBufferContent(buf));
        buf.clear();

        ByteBuf buf2 = Unpooled.buffer(2, 2);
        bufferedChannel.read(buf2, 0, 2);
        assertEquals("AB", getBufferContent(buf2));

        buf.release();
        buf2.release();
    }
}