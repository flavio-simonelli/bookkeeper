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
import io.netty.buffer.CompositeByteBuf;
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
 * JUnit 4 tests for BufferedChannel - Part 2: Basic Write Operations.
 */
public class BufferedChannelPartIITest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part2", ".log");
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

    // 11. Write Single Byte
    // Write a buffer with 1 byte (capacity > 1).
    @Test
    public void testWriteSingleByte() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 10);
        ByteBuf src = createBuffer("A");

        bufferedChannel.write(src);

        assertEquals("Position should increment by 1", 1L, bufferedChannel.position());
        assertEquals("Buffer should contain 1 byte", 1, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position should not change yet", 0L, bufferedChannel.getFileChannelPosition());
        src.release();
    }

    // 12. Write Small Chunk
    // Write a buffer significantly smaller than capacity.
    @Test
    public void testWriteSmallChunk() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        ByteBuf src = createBuffer("12345"); // 5 bytes

        bufferedChannel.write(src);

        assertEquals("Position should increment by 5", 5L, bufferedChannel.position());
        assertEquals("Buffer should contain 5 bytes", 5, bufferedChannel.getNumOfBytesInWriteBuffer());
        src.release();
    }

    // 13. Write Exact Capacity
    // Write a buffer that exactly fills the writeBuffer.
    // Note: Implementation flushes if !writeBuffer.isWritable(), so exact fill triggers flush.
    @Test
    public void testWriteExactCapacity() throws IOException {
        int capacity = 5;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);
        ByteBuf src = createBuffer("ABCDE"); // 5 bytes

        bufferedChannel.write(src);

        // buffer filled -> automatic flush happens
        assertEquals("Position should be 5", 5L, bufferedChannel.position());
        assertEquals("Buffer should be empty after flush", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position should advance to 5", 5L, bufferedChannel.getFileChannelPosition());
        src.release();
    }

    // 14. Write Overflow (Trigger Flush)
    // Write a buffer of capacity + 1 bytes to trigger an automatic flush.
    @Test
    public void testWriteOverflow() throws IOException {
        int capacity = 5;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);
        ByteBuf src = createBuffer("ABCDEF"); // 6 bytes

        bufferedChannel.write(src);

        // 5 bytes flushed, 1 byte remains in buffer
        assertEquals("Total position should be 6", 6L, bufferedChannel.position());
        assertEquals("Buffer should contain 1 remaining byte", 1, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position should be 5 (flushed part)", 5L, bufferedChannel.getFileChannelPosition());
        src.release();
    }

    // 15. Write Zero Length
    // Write a ByteBuf with 0 readable bytes (no-op).
    @Test
    public void testWriteZeroLength() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 10);
        ByteBuf src = Unpooled.buffer(0);

        bufferedChannel.write(src);

        assertEquals("Position should not change", 0L, bufferedChannel.position());
        assertEquals("Buffer should be empty", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        src.release();
    }

    // 16. Write Null
    // Verify NullPointerException when writing null.
    @Test
    public void testWriteNull() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 10);
        try {
            bufferedChannel.write(null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    // 17. Multiple Small Writes
    // Perform sequential small writes that do not fill the buffer.
    @Test
    public void testMultipleSmallWrites() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 20);
        ByteBuf src1 = createBuffer("ABC"); // 3
        ByteBuf src2 = createBuffer("DEF"); // 3

        bufferedChannel.write(src1);
        bufferedChannel.write(src2);

        assertEquals("Position should be 6", 6L, bufferedChannel.position());
        assertEquals("Buffer should hold 6 bytes", 6, bufferedChannel.getNumOfBytesInWriteBuffer());
        src1.release();
        src2.release();
    }

    // 18. Accumulation to Capacity
    // Perform sequential writes that eventually exactly fill the buffer.
    @Test
    public void testAccumulationToCapacity() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 6);
        ByteBuf src1 = createBuffer("ABC"); // 3
        ByteBuf src2 = createBuffer("DEF"); // 3

        bufferedChannel.write(src1);
        // Not full yet
        assertEquals(3, bufferedChannel.getNumOfBytesInWriteBuffer());

        bufferedChannel.write(src2);
        // Now full (3+3=6), triggers flush

        assertEquals("Position should be 6", 6L, bufferedChannel.position());
        assertEquals("Buffer should be empty after exact fill flush", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position should move to 6", 6L, bufferedChannel.getFileChannelPosition());
        src1.release();
        src2.release();
    }

    // 19. Accumulation to Overflow
    // Perform sequential writes that eventually spill over capacity.
    @Test
    public void testAccumulationToOverflow() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 5);
        ByteBuf src1 = createBuffer("ABC"); // 3
        ByteBuf src2 = createBuffer("DEF"); // 3

        bufferedChannel.write(src1);
        // 3 bytes in buffer
        bufferedChannel.write(src2);
        // 3 + 3 = 6. Capacity 5.
        // Flush 5 bytes, 1 remains.

        assertEquals("Position should be 6", 6L, bufferedChannel.position());
        assertEquals("Buffer should contain 1 byte", 1, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position should be 5", 5L, bufferedChannel.getFileChannelPosition());
        src1.release();
        src2.release();
    }

    // 20. Large Write (Multi-Flush)
    // Write a buffer sized 3.5x capacity, verifying multiple flushes occur.
    @Test
    public void testLargeWriteMultiFlush() throws IOException {
        int capacity = 4;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);
        // 14 bytes = 3 full flushes (12 bytes) + 2 bytes remainder
        ByteBuf src = createBuffer("12345678901234");

        bufferedChannel.write(src);

        assertEquals("Position should be 14", 14L, bufferedChannel.position());
        assertEquals("Buffer should contain remainder (2 bytes)", 2, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position should be 12", 12L, bufferedChannel.getFileChannelPosition());
        src.release();
    }

    // 21. Write with Offset
    // Write a ByteBuf where readerIndex > 0.
    @Test
    public void testWriteWithOffset() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 10);
        ByteBuf src = createBuffer("IGNORE_THIS_KEEP_THIS");
        src.readerIndex(12); // Skip "IGNORE_THIS_" (12 chars)

        bufferedChannel.write(src);

        // "KEEP_THIS" is 9 chars
        assertEquals("Should write 9 bytes", 9L, bufferedChannel.position());
        assertEquals(9, bufferedChannel.getNumOfBytesInWriteBuffer());
        src.release();
    }

    // 22. Write Composite Buffer
    // Write a Netty CompositeByteBuf to verify handling of complex buffer types.
    @Test
    public void testWriteCompositeBuffer() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 20);
        CompositeByteBuf compBuf = allocator.compositeBuffer();
        ByteBuf buf1 = createBuffer("Hello");
        ByteBuf buf2 = createBuffer("World");
        compBuf.addComponent(true, buf1);
        compBuf.addComponent(true, buf2);

        bufferedChannel.write(compBuf);

        assertEquals("Position should be 10", 10L, bufferedChannel.position());
        assertEquals(10, bufferedChannel.getNumOfBytesInWriteBuffer());
        compBuf.release();
    }

    // 23. Position Update
    // Verify position() increments correctly after every write.
    @Test
    public void testPositionUpdate() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        long pos0 = bufferedChannel.position();
        bufferedChannel.write(createBuffer("A"));
        long pos1 = bufferedChannel.position();
        bufferedChannel.write(createBuffer("B"));
        long pos2 = bufferedChannel.position();

        assertEquals(0L, pos0);
        assertEquals(1L, pos1);
        assertEquals(2L, pos2);
    }

    // 24. FileChannel Position Lag
    // Verify getFileChannelPosition() does not change during buffering (before flush).
    @Test
    public void testFileChannelPositionLag() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        bufferedChannel.write(createBuffer("12345"));

        assertEquals("Virtual position advanced", 5L, bufferedChannel.position());
        assertEquals("Disk position stayed at 0", 0L, bufferedChannel.getFileChannelPosition());
    }

    // 25. Write Buffer Reusability
    // Verify writeBuffer accepts new data correctly after an automatic flush.
    @Test
    public void testWriteBufferReusability() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 5);

        // Fill and flush
        bufferedChannel.write(createBuffer("12345"));
        assertEquals("Buffer empty after flush", 0, bufferedChannel.getNumOfBytesInWriteBuffer());

        // Write new data
        bufferedChannel.write(createBuffer("67"));

        assertEquals("Position accumulated", 7L, bufferedChannel.position());
        assertEquals("Buffer holding new data", 2, bufferedChannel.getNumOfBytesInWriteBuffer());
    }
}