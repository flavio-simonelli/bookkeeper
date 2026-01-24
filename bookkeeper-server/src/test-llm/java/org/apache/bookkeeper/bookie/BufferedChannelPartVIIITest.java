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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.util.IllegalReferenceCountException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 tests for BufferedChannel - Part 8: Lifecycle (Clear & Close).
 */
public class BufferedChannelPartVIIITest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel;
    private FileChannel spyFileChannel;
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part8", ".log");
        tempFile.deleteOnExit();
        randomAccessFile = new RandomAccessFile(tempFile, "rw");
        fileChannel = randomAccessFile.getChannel();
        spyFileChannel = spy(fileChannel);
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            // Ensure we try to close, but handle if it's already closed in tests
            try {
                bufferedChannel.close();
            } catch (Exception e) {
                // ignore
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

    // 86. Clear Resets State
    // Verify clear() resets writeBuffer indices.
    @Test
    public void testClearResetsState() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("DirtyData"));

        assertEquals("Buffer should have data", 9, bufferedChannel.getNumOfBytesInWriteBuffer());

        bufferedChannel.clear();

        assertEquals("Buffer should be empty after clear", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        // Verify internal writer index is 0?
        // getNumOfBytesInWriteBuffer returns readableBytes(), which is writerIndex - readerIndex.
        // clear() usually resets both to 0.
    }

    // 87. Clear Keeps Capacity
    // Verify clear() does not deallocate memory, just resets indices.
    // We access writeBuffer via reflection (or protected access since we are in same package)
    // to check capacity.
    @Test
    public void testClearKeepsCapacity() throws IOException {
        int capacity = 100;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);
        bufferedChannel.write(createBuffer("Data"));

        bufferedChannel.clear();

        // Access protected field writeBuffer directly (same package)
        assertEquals("Capacity should remain unchanged", capacity, bufferedChannel.writeBuffer.capacity());
        assertEquals("Reference count should still be > 0", 1, bufferedChannel.writeBuffer.refCnt());
    }

    // 88. Close Releases Resource
    // Verify close() releases the writeBuffer (ref count decrement).
    @Test
    public void testCloseReleasesResource() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        ByteBuf internalBuffer = bufferedChannel.writeBuffer;

        assertEquals("Ref count start", 1, internalBuffer.refCnt());

        bufferedChannel.close();

        assertEquals("Ref count after close should be 0", 0, internalBuffer.refCnt());
    }

    // 89. Close Closes FileChannel
    // Verify underlying FileChannel.close() is called.
    @Test
    public void testCloseClosesFileChannel() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);

        bufferedChannel.close();

        verify(spyFileChannel).close();
    }

    // 90. Idempotent Close
    // Verify calling close() twice does not throw exceptions.
    @Test
    public void testIdempotentClose() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);

        bufferedChannel.close();

        try {
            bufferedChannel.close();
        } catch (Exception e) {
            fail("Second close should not throw exception: " + e.getMessage());
        }
    }

    // 91. Operations After Close
    // Verify write() throws IOException or similar after close.
    // Since close() releases the buffer, writing to it will likely cause IllegalReferenceCountException
    // or if it tries to flush, ClosedChannelException.
    @Test
    public void testOperationsAfterClose() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.close();

        ByteBuf data = createBuffer("ShouldFail");
        try {
            bufferedChannel.write(data);
            fail("Should throw exception when writing after close");
        } catch (IllegalReferenceCountException e) {
            // Netty throws this if we touch the released writeBuffer
        } catch (ClosedChannelException e) {
            // FileChannel throws this if we try to write to it
        } catch (Exception e) {
            // General safety net, though we expect specific ones
            assertTrue("Exception should indicate closed state or released buffer",
                    e instanceof IOException || e instanceof IllegalReferenceCountException);
        } finally {
            data.release();
        }
    }

    // 92. Getters After Close
    // Verify behavior of position() after close.
    // position is a primitive long, it should persist.
    @Test
    public void testGettersAfterClose() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100);
        bufferedChannel.write(createBuffer("12345")); // pos = 5

        bufferedChannel.close();

        // Position is just a long field, should be accessible
        assertEquals("Position should be retrievable after close", 5L, bufferedChannel.position());
    }
}