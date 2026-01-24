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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * JUnit 4 tests for BufferedChannel - Part 9: Exceptions & Edge Cases.
 */
public class BufferedChannelPartIXTest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel;
    private FileChannel spyFileChannel;
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part9", ".log");
        tempFile.deleteOnExit();
        randomAccessFile = new RandomAccessFile(tempFile, "rw");
        fileChannel = randomAccessFile.getChannel();
        spyFileChannel = spy(fileChannel);
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            try {
                bufferedChannel.close();
            } catch (Exception e) {
                // Ignore
            }
        }
        if (spyFileChannel != null) {
            spyFileChannel.close();
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

    // 93. Allocator OOM
    // Mock ByteBufAllocator to throw OutOfMemoryError during construction.
    @Test
    public void testAllocatorOOM() throws IOException {
        ByteBufAllocator mockAllocator = mock(ByteBufAllocator.class);
        when(mockAllocator.directBuffer(anyInt())).thenThrow(new OutOfMemoryError("Simulated OOM"));

        try {
            new BufferedChannel(mockAllocator, fileChannel, 100);
            fail("Should throw OutOfMemoryError");
        } catch (OutOfMemoryError e) {
            assertEquals("Simulated OOM", e.getMessage());
        }
    }

    // 94. Disk Full on Flush
    // Mock FileChannel.write to throw IOException (disk full).
    @Test
    public void testDiskFullOnFlush() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("Data"));

        doThrow(new IOException("No space left on device")).when(spyFileChannel).write(any(ByteBuffer.class));

        try {
            bufferedChannel.flush();
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("No space left on device", e.getMessage());
        }

        // Data should still be in buffer (flush failed before clear)
        assertEquals(4, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    // 95. Disk Error on Force
    // Mock FileChannel.force to throw IOException.
    @Test
    public void testDiskErrorOnForce() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("Data"));

        doThrow(new IOException("Hardware Error")).when(spyFileChannel).force(anyBoolean());

        try {
            bufferedChannel.forceWrite(false);
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("Hardware Error", e.getMessage());
        }
    }

    // 96. Recoverable Error
    // If flush fails, verify state allows retry (or fails safe).
    @Test
    public void testRecoverableFlushError() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("CrucialData"));

        // 1. Fail first write
        doThrow(new IOException("Temporary Glitch"))
                .doCallRealMethod() // Succeed second time
                .when(spyFileChannel).write(any(ByteBuffer.class));

        try {
            bufferedChannel.flush();
            fail("First flush should fail");
        } catch (IOException e) {
            assertEquals("Temporary Glitch", e.getMessage());
        }

        // Buffer should remain dirty
        assertEquals(11, bufferedChannel.getNumOfBytesInWriteBuffer());

        // 2. Retry flush
        bufferedChannel.flush();

        // Success
        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(11L, spyFileChannel.position());
    }

    // 97. Int Overflow Position
    // Test position behavior near Long.MAX_VALUE (theoretical boundary).
    @Test
    public void testPositionOverflow() throws Exception {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        // Use reflection to set position to near Long.MAX_VALUE
        Field posField = BufferedChannel.class.getDeclaredField("position");
        posField.setAccessible(true);
        long nearMax = Long.MAX_VALUE - 5;
        posField.set(bufferedChannel, nearMax);

        bufferedChannel.write(createBuffer("1234567890")); // 10 bytes

        // position += 10. Long.MAX_VALUE - 5 + 10 = overflow to negative.
        // Standard Java behavior wrapping is expected, just ensuring no crash.
        long newPos = bufferedChannel.position();

        // Expected: (MAX - 5) + 10 = MAX + 5 -> wraps to MIN_VALUE + 4
        assertEquals(Long.MIN_VALUE + 4, newPos);
    }

    // 98. System Clock Change
    // Verify no time-based logic exists (simple sanity check).
    @Test
    public void testNoTimeDependency() throws IOException, InterruptedException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        bufferedChannel.write(createBuffer("A"));

        // Sleep to simulate time passage or clock change
        Thread.sleep(10);

        bufferedChannel.write(createBuffer("B"));

        // Logic should remain identical regardless of wall clock
        assertEquals(2L, bufferedChannel.position());
        assertEquals(2, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    // 99. Zero-Byte FileChannel (Existing Data Init)
    // Initialize with a FileChannel that has existing data, verify position init.
    @Test
    public void testInitWithExistingData() throws IOException {
        // Write data to file first
        randomAccessFile.writeBytes("PreExistingData"); // 15 bytes
        long fileLen = randomAccessFile.length();
        assertEquals(15, fileLen);

        // Create new BufferedChannel on this channel
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, 100);

        // Verify it picked up the position
        assertEquals("Should start at end of file", 15L, bc.position());
        assertEquals("WriteBufferStart should match file pos", 15L, bc.getFileChannelPosition());

        bc.write(createBuffer("New"));
        assertEquals(18L, bc.position());

        bc.close();
    }

    // 100. Reference Counting
    // Verify writeBuffer reference count is 1 after init and 0 after close.
    @Test
    public void testReferenceCounting() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        // Access buffer to check ref count
        assertEquals(1, bufferedChannel.writeBuffer.refCnt());

        bufferedChannel.close();

        assertEquals(0, bufferedChannel.writeBuffer.refCnt());
    }
}