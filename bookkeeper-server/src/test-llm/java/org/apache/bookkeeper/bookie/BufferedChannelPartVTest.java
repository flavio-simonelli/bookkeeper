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
import static org.junit.Assert.fail;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 tests for BufferedChannel - Part 5: Reading - Hot Data (Write Buffer).
 * * Updated to handle Greedy Read behavior by using fixed-capacity buffers: Unpooled.buffer(len, len).
 */
public class BufferedChannelPartVTest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part5", ".log");
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

    // 51. Read from WriteBuffer (Full)
    @Test
    public void testReadFromWriteBufferFull() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        ByteBuf writeBuf = createBuffer("Hello World");
        bufferedChannel.write(writeBuf);

        // Fix: Limit capacity to exactly 11
        ByteBuf readBuf = Unpooled.buffer(11, 11);
        int readBytes = bufferedChannel.read(readBuf, 0, 11);

        assertEquals("Should read 11 bytes", 11, readBytes);
        assertEquals("Content should match", "Hello World", getBufferContent(readBuf));
        writeBuf.release();
        readBuf.release();
    }

    // 52. Read from WriteBuffer (Partial)
    @Test
    public void testReadFromWriteBufferPartial() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("ABCDEFGHIJ")); // 10 bytes

        // Fix: Limit capacity to exactly 3
        ByteBuf readBuf = Unpooled.buffer(3, 3);
        // Read "DEF" (indices 3, 4, 5)
        int readBytes = bufferedChannel.read(readBuf, 3, 3);

        assertEquals("Should read 3 bytes", 3, readBytes);
        assertEquals("Content should match", "DEF", getBufferContent(readBuf));
        readBuf.release();
    }

    // 53. Read from WriteBuffer (Offset)
    @Test
    public void testReadFromWriteBufferWithOffset() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("0123456789"));

        // Fix: Limit capacity to exactly 5
        ByteBuf readBuf = Unpooled.buffer(5, 5);
        // Read starting at index 5 until end
        int readBytes = bufferedChannel.read(readBuf, 5, 5);

        assertEquals("Should read 5 bytes", 5, readBytes);
        assertEquals("Content should match", "56789", getBufferContent(readBuf));
        readBuf.release();
    }

    // 54. Read Exact WriteBuffer Size
    @Test
    public void testReadExactWriteBufferSize() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("Exact"));

        // Fix: Limit capacity to 5
        ByteBuf readBuf = Unpooled.buffer(5, 5);
        int readBytes = bufferedChannel.read(readBuf, 0, 5);

        assertEquals(5, readBytes);
        assertEquals("Exact", getBufferContent(readBuf));
        readBuf.release();
    }

    // 55. Read "Past" WriteBuffer
    @Test
    public void testReadPastWriteBuffer() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("ABC"));

        ByteBuf readBuf = Unpooled.buffer(10);

        try {
            bufferedChannel.read(readBuf, 3, 1);
            fail("Should throw IOException for reading past EOF");
        } catch (IOException e) {
            assertEquals("Read past EOF", e.getMessage());
        }
        readBuf.release();
    }

    // 56. Read Hot Data After Append
    @Test
    public void testReadHotDataAfterAppend() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("First_"));
        bufferedChannel.write(createBuffer("Second"));

        // Fix: Limit capacity to 6
        ByteBuf readBuf = Unpooled.buffer(6, 6);
        int readBytes = bufferedChannel.read(readBuf, 6, 6);

        assertEquals(6, readBytes);
        assertEquals("Second", getBufferContent(readBuf));
        readBuf.release();
    }

    // 57. Read Hot Data After Seek
    @Test
    public void testReadHotDataAfterSeek() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("Part1_"));
        bufferedChannel.write(createBuffer("Part2"));

        // Fix: Limit capacity to 6
        ByteBuf readBuf = Unpooled.buffer(6, 6);
        // Seek back to 0
        int readBytes = bufferedChannel.read(readBuf, 0, 6);

        assertEquals(6, readBytes);
        assertEquals("Part1_", getBufferContent(readBuf));
        readBuf.release();
    }

    // 58. Read Buffer State Preservation
    @Test
    public void testReadBufferStatePreservation() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("Immutable?"));

        int bytesInBufBefore = bufferedChannel.getNumOfBytesInWriteBuffer();
        long posBefore = bufferedChannel.position();

        // Fix: Exact capacity
        ByteBuf readBuf = Unpooled.buffer(10, 10);
        bufferedChannel.read(readBuf, 0, 10);

        assertEquals("Write buffer size should not change after read",
                bytesInBufBefore, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("Channel position should not change after read",
                posBefore, bufferedChannel.position());

        bufferedChannel.write(createBuffer("_Yes"));

        // Fix: Exact capacity for verify
        ByteBuf verifyBuf = Unpooled.buffer(14, 14);
        bufferedChannel.read(verifyBuf, 0, 14);
        assertEquals("Immutable?_Yes", getBufferContent(verifyBuf));

        readBuf.release();
        verifyBuf.release();
    }

    // 59. Dest Buffer Index
    @Test
    public void testDestBufferIndexUpdate() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("Data"));

        // Fix: Exact capacity
        ByteBuf dest = Unpooled.buffer(4, 4);
        assertEquals("Dest writer index start", 0, dest.writerIndex());

        bufferedChannel.read(dest, 0, 4);

        assertEquals("Dest writer index end", 4, dest.writerIndex());
        assertEquals("Data", getBufferContent(dest));
        dest.release();
    }

    // 60. Dest Buffer Capacity
    @Test
    public void testDestBufferCapacity() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("LongData"));

        ByteBuf dest = Unpooled.buffer(4); // Capacity 4

        try {
            bufferedChannel.read(dest, 0, 8);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        dest.release();
    }
}