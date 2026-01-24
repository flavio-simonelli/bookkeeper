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
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
 * JUnit 4 tests for BufferedChannel - Part 3: Unpersisted Bytes & Force Logic.
 */
public class BufferedChannelPartIIITest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel; // Real file channel
    private FileChannel spyFileChannel; // Spy to verify calls
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest_Part3", ".log");
        tempFile.deleteOnExit();
        randomAccessFile = new RandomAccessFile(tempFile, "rw");

        // We use a spy on the real channel to verify force() calls while keeping real behavior
        FileChannel realChannel = randomAccessFile.getChannel();
        spyFileChannel = spy(realChannel);
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            bufferedChannel.close();
        }
        // closing spy closes the real channel too
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

    // 26. Unpersisted Bytes Tracking
    // Verify getUnpersistedBytes() increases with writes.
    @Test
    public void testUnpersistedBytesTracking() throws IOException {
        long bound = 1000;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("123")); // 3 bytes

        assertEquals("Unpersisted bytes should be 3", 3L, bufferedChannel.getUnpersistedBytes());

        bufferedChannel.write(createBuffer("45")); // 2 bytes

        assertEquals("Unpersisted bytes should be 5", 5L, bufferedChannel.getUnpersistedBytes());
    }

    // 27. Bound Not Reached
    // Verify no force() is called when writes are below unpersistedBytesBound.
    @Test
    public void testBoundNotReached() throws IOException {
        long bound = 10;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("12345")); // 5 bytes < 10

        assertEquals(5L, bufferedChannel.getUnpersistedBytes());
        verify(spyFileChannel, never()).force(anyBoolean());
    }

    // 28. Bound Reached (Exact)
    // Verify force() is triggered when writes exactly hit unpersistedBytesBound.
    @Test
    public void testBoundReachedExact() throws IOException {
        long bound = 5;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("12345")); // 5 bytes == 5

        verify(spyFileChannel, times(1)).force(false);
    }

    // 29. Bound Exceeded
    // Verify force() is triggered when writes exceed unpersistedBytesBound.
    @Test
    public void testBoundExceeded() throws IOException {
        long bound = 4;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("12345")); // 5 bytes > 4

        verify(spyFileChannel, times(1)).force(false);
    }

    // 30. Unpersisted Reset (Auto-Force)
    // Verify unpersistedBytes resets to 0 after an automatic force write.
    // Note: implementation details:
    // If auto-flush happens, it calls flush() then forceWrite(false).
    // unpersistedBytes is reset via AtomicLong inside forceWrite logic indirectly or explicit set?
    // Looking at source: 
    // forceWrite() sets unpersistedBytes.set(writeBuffer.readableBytes()) inside synchronized block if bound > 0.
    // Since auto-flush calls flush() first, writeBuffer is empty.
    // So unpersistedBytes.set(0).
    @Test
    public void testUnpersistedResetAutoForce() throws IOException {
        long bound = 5;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("12345")); // Trigger force

        assertEquals("Unpersisted bytes should reset to 0 (buffer empty)",
                0L, bufferedChannel.getUnpersistedBytes());
    }

    // 31. Unpersisted Retention (Flush)
    // Verify unpersistedBytes is NOT reset by a standard flush() (only by force).
    @Test
    public void testUnpersistedRetentionFlush() throws IOException {
        long bound = 100;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("123"));
        assertEquals(3L, bufferedChannel.getUnpersistedBytes());

        bufferedChannel.flush(); // Just flush, no force

        assertEquals("Unpersisted bytes should persist after flush",
                3L, bufferedChannel.getUnpersistedBytes());
        verify(spyFileChannel, never()).force(anyBoolean());
    }

    // 32. Disabled Regular Flushes
    // Test constructor with unpersistedBytesBound = 0 (feature disabled).
    @Test
    public void testDisabledRegularFlushes() throws IOException {
        long bound = 0;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("12345"));

        // When bound is 0, unpersistedBytes is usually not tracked/updated in write()
        // Source: if (doRegularFlushes) { unpersistedBytes.addAndGet(...) }
        assertEquals("Should not track unpersisted bytes if bound is 0",
                0L, bufferedChannel.getUnpersistedBytes());

        verify(spyFileChannel, never()).force(anyBoolean());
    }

    // 33. ForceWrite Method (Metadata True)
    // Verify forceWrite(true) calls FileChannel.force(true).
    @Test
    public void testForceWriteMetadataTrue() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("A"));

        bufferedChannel.forceWrite(true);

        verify(spyFileChannel).force(true);
    }

    // 34. ForceWrite Method (Metadata False)
    // Verify forceWrite(false) calls FileChannel.force(false).
    @Test
    public void testForceWriteMetadataFalse() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("A"));

        bufferedChannel.forceWrite(false);

        verify(spyFileChannel).force(false);
    }

    // 35. FlushAndForceWrite
    // Verify this calls flush() followed by forceWrite().
    // We check that the buffer is empty (flushed) when force is called.
    @Test
    public void testFlushAndForceWrite() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);
        bufferedChannel.write(createBuffer("123"));

        assertEquals(3, bufferedChannel.getNumOfBytesInWriteBuffer());

        bufferedChannel.flushAndForceWrite(false);

        assertEquals("Buffer should be flushed", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        verify(spyFileChannel).force(false);
    }

    // 36. FlushAndForceWriteIfRegularFlush (Enabled)
    // Verify it acts like FlushAndForceWrite when bound > 0.
    @Test
    public void testFlushAndForceWriteIfRegularFlushEnabled() throws IOException {
        long bound = 1000; // Enabled
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);
        bufferedChannel.write(createBuffer("123"));

        bufferedChannel.flushAndForceWriteIfRegularFlush(false);

        verify(spyFileChannel).force(false);
    }

    // 37. FlushAndForceWriteIfRegularFlush (Disabled)
    // Verify it is a no-op when bound = 0.
    @Test
    public void testFlushAndForceWriteIfRegularFlushDisabled() throws IOException {
        long bound = 0; // Disabled
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);
        bufferedChannel.write(createBuffer("123"));

        bufferedChannel.flushAndForceWriteIfRegularFlush(false);

        verify(spyFileChannel, never()).force(anyBoolean());
        // Buffer should still have data (flush not called)
        assertEquals(3, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    // 38. Unpersisted Calculation Consistency
    // Verify calculation accounts for writeBuffer readable bytes inside forceWrite.
    // If we have 10 bytes unpersisted total, 5 in cache (flushed but not forced), 5 in writeBuffer.
    // Calling forceWrite should reset unpersistedBytes to readableBytes() (which is 5).
    // Wait, if forceWrite is called, FileChannel.force happens.
    // The source code says: "bytes written to filechannel... will be persisted... so we don't need to consider those."
    // "Hence setting writeBuffer.readableBytes() to unpersistedBytes."
    @Test
    public void testUnpersistedCalculationConsistency() throws IOException {
        long bound = 1000;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        // 1. Write 5 bytes -> Buffer has 5. Unpersisted = 5.
        bufferedChannel.write(createBuffer("12345"));

        // 2. Flush -> Buffer has 0. FileChannel has 5 (dirty). Unpersisted still 5.
        bufferedChannel.flush();
        assertEquals(5L, bufferedChannel.getUnpersistedBytes());

        // 3. Write 2 bytes -> Buffer has 2. FileChannel has 5. Unpersisted = 7.
        bufferedChannel.write(createBuffer("AB"));
        assertEquals(7L, bufferedChannel.getUnpersistedBytes());

        // 4. ForceWrite -> Persists the 5 in FileChannel. The 2 in buffer remain unpersisted.
        // Implementation logic: sets unpersistedBytes = writeBuffer.readableBytes() = 2.
        bufferedChannel.forceWrite(false);

        assertEquals("After force, unpersisted count should match buffer size",
                2L, bufferedChannel.getUnpersistedBytes());
    }

    // 39. Accumulated Writes Trigger Force
    // Multiple small writes accumulating to hit the bound.
    @Test
    public void testAccumulatedWritesTriggerForce() throws IOException {
        long bound = 6;
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100, bound);

        bufferedChannel.write(createBuffer("12")); // 2
        bufferedChannel.write(createBuffer("34")); // 4
        verify(spyFileChannel, never()).force(anyBoolean());

        bufferedChannel.write(createBuffer("56")); // 6 -> Trigger
        verify(spyFileChannel, times(1)).force(false);
    }

    // 40. ForceWrite Return Value
    // Verify forceWrite returns the correct writeBufferStartPosition.
    // Returns the position up to which we flushed to filesystem cache.
    @Test
    public void testForceWriteReturnValue() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, spyFileChannel, 100);

        // Write 10 bytes
        bufferedChannel.write(createBuffer("0123456789"));
        // Flush manually to move position to 10
        bufferedChannel.flush();

        long ret = bufferedChannel.forceWrite(false);

        assertEquals("Should return the file channel position (10)", 10L, ret);
    }
}