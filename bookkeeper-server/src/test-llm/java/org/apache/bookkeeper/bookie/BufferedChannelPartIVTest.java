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
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * JUnit 4 tests for BufferedChannel - Part 4: Explicit Flushing.
 */
public class BufferedChannelPartIVTest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel; // Real file channel
    private FileChannel spyFileChannel; // Spy to verify IO interactions
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part4", ".log");
        tempFile.deleteOnExit();
        randomAccessFile = new RandomAccessFile(tempFile, "rw");

        // We use a spy to mock partial writes or exceptions
        FileChannel realChannel = randomAccessFile.getChannel();
        spyFileChannel = spy(realChannel);
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            bufferedChannel.close();
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

    // 41. Manual Flush
    // Verify flush() moves bytes from writeBuffer to FileChannel.
    @Test
    public void testManualFlush() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);

        bufferedChannel.write(createBuffer("12345"));
        assertEquals("Buffer should have 5 bytes", 5, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position at 0", 0L, bufferedChannel.getFileChannelPosition());

        bufferedChannel.flush();

        assertEquals("Buffer should be empty", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("FileChannel position updated to 5", 5L, bufferedChannel.getFileChannelPosition());
        assertEquals("Disk file size should be 5", 5L, spyFileChannel.size());
    }

    // 42. Empty Flush
    // Verify flush() on an empty buffer is safe (no-op).
    @Test
    public void testEmptyFlush() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);

        long startPos = spyFileChannel.position();
        bufferedChannel.flush();
        long endPos = spyFileChannel.position();

        assertEquals("Position should not change", startPos, endPos);
        // Verify write was called 0 times? Or implementation might call write with empty buffer?
        // ByteBuf.internalNioBuffer() on empty returns empty ByteBuffer. 
        // FileChannel.write(empty) usually does nothing.
        // The implementation does: do { fileChannel.write(toWrite) } while (toWrite.hasRemaining());
        // if toWrite is empty, hasRemaining is false immediately. Loop runs once?
        // Actually: hasRemaining is checked at end. Do-while loop runs at least once.
        // However, if empty, write(empty) is harmless.
    }

    // 43. Flush Updates Positions
    // Verify writeBufferStartPosition updates to current file position after flush.
    @Test
    public void testFlushUpdatesPositions() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);

        bufferedChannel.write(createBuffer("ABC")); // 3 bytes

        // Before flush
        assertEquals(0L, bufferedChannel.getFileChannelPosition()); // Points to start of buffer relative to file

        bufferedChannel.flush();

        // After flush
        // writeBufferStartPosition should be set to fileChannel.position() which is 3
        assertEquals(3L, bufferedChannel.getFileChannelPosition());
    }

    // 44. Flush Clears Buffer
    // Verify writeBuffer is empty (cleared) after flush.
    @Test
    public void testFlushClearsBuffer() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("Testing"));

        assertEquals(7, bufferedChannel.getNumOfBytesInWriteBuffer());
        bufferedChannel.flush();
        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    // 45. Flush Propagates IOErrors
    // Mock FileChannel.write to throw exception during flush.
    @Test
    public void testFlushPropagatesIOErrors() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("CrashThis"));

        doThrow(new IOException("Disk Failure")).when(spyFileChannel).write(any(ByteBuffer.class));

        try {
            bufferedChannel.flush();
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("Disk Failure", e.getMessage());
        }
    }

    // 46. Partial Flush Loop
    // Mock FileChannel.write to write partial bytes, verifying flush loops until buffer is empty.
    @Test
    public void testPartialFlushLoop() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        ByteBuf src = createBuffer("1234567890"); // 10 bytes
        bufferedChannel.write(src);

        // Mock behavior: write only 1 byte at a time
        doAnswer(new Answer<Integer>() {
            @Override
            public Integer answer(InvocationOnMock invocation) throws Throwable {
                ByteBuffer bb = invocation.getArgument(0);
                if (bb.hasRemaining()) {
                    // Consume 1 byte from buffer
                    bb.get();
                    return 1; // wrote 1 byte
                }
                return 0;
            }
        }).when(spyFileChannel).write(any(ByteBuffer.class));

        bufferedChannel.flush();

        assertEquals("Buffer should be fully flushed despite partial writes",
                0, bufferedChannel.getNumOfBytesInWriteBuffer());

        // 10 bytes written, 1 byte at a time -> 10 calls + potentially 1 check? 
        // The loop is: do { write } while (hasRemaining).
        // It will call write 10 times (each taking 1 byte). 
        // After 10th byte, hasRemaining is false.
        verify(spyFileChannel, times(10)).write(any(ByteBuffer.class));
    }

    // 47. Position Consistency
    // Verify position() (absolute) matches fileChannel.position() after flush.
    @Test
    public void testPositionConsistency() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);

        bufferedChannel.write(createBuffer("12345"));
        long expectedPos = 5L;

        assertEquals(expectedPos, bufferedChannel.position()); // Virtual pos

        bufferedChannel.flush();

        assertEquals(expectedPos, spyFileChannel.position()); // Physical pos
        assertEquals(expectedPos, bufferedChannel.position());
    }

    // 48. Flush after Large Write
    // Verify manual flush after a write that already triggered auto-flushes.
    @Test
    public void testFlushAfterLargeWrite() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 4); // Small capacity

        // Write 10 bytes: [4 flushed] [4 flushed] [2 pending]
        bufferedChannel.write(createBuffer("0123456789"));

        assertEquals(2, bufferedChannel.getNumOfBytesInWriteBuffer());

        bufferedChannel.flush(); // Flush the remainder

        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(10L, spyFileChannel.size());
    }

    // 49. FlushAndForce Metadata Propagation
    // Verify the forceMetadata boolean is passed correctly down the chain.
    @Test
    public void testFlushAndForceMetadataPropagation() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("Data"));

        // Case 1: True
        bufferedChannel.flushAndForceWrite(true);
        verify(spyFileChannel).force(true);

        // Case 2: False
        bufferedChannel.write(createBuffer("MoreData"));
        bufferedChannel.flushAndForceWrite(false);
        verify(spyFileChannel).force(false);
    }

    // 50. Flush Concurrency (Simulated)
    // Verify behavior if flush is called while buffer is empty (safe no-op).
    // Note: True concurrency requires threads, but here we verify safety of state 
    // when operations are interleaved sequentially to simulate "nothing to do".
    @Test
    public void testFlushSafetyOnCleanState() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("A"));

        bufferedChannel.flush();
        // State is clean
        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());

        // Call flush again
        bufferedChannel.flush();
        // Should remain clean, no errors
        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(1L, bufferedChannel.getFileChannelPosition());
    }
}