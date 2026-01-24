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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 tests for BufferedChannel - Part 1: Construction & Initialization.
 */
public class BufferedChannelPartITest {

    private ByteBufAllocator allocator;
    private File tempFile;
    private RandomAccessFile randomAccessFile;
    private FileChannel fileChannel;

    @Before
    public void setUp() throws IOException {
        allocator = UnpooledByteBufAllocator.DEFAULT;
        tempFile = File.createTempFile("bufferedChannelTest", ".log");
        tempFile.deleteOnExit();
        randomAccessFile = new RandomAccessFile(tempFile, "rw");
        fileChannel = randomAccessFile.getChannel();
    }

    @After
    public void tearDown() throws IOException {
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

    // 1. Valid Construction (Default)
    // Verify instantiation with valid ByteBufAllocator, FileChannel, and capacity.
    @Test
    public void testValidConstructionDefault() throws IOException {
        int capacity = 1024;
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, capacity);

        assertNotNull("BufferedChannel instance should not be null", bc);
        assertEquals("Write capacity should match constructor argument",
                capacity, bc.writeCapacity);
        assertEquals("Initial position should be 0", 0L, bc.position());
        bc.close();
    }

    // 2. Valid Construction (With Bound)
    // Verify instantiation with explicit unpersistedBytesBound.
    @Test
    public void testValidConstructionWithBound() throws IOException {
        int capacity = 1024;
        long bound = 2048L;
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, capacity, bound);

        assertNotNull("BufferedChannel instance should not be null", bc);
        assertEquals("Unpersisted bytes bound should match constructor argument",
                bound, bc.unpersistedBytesBound);
        bc.close();
    }

    // 3. Null Allocator
    // Verify NullPointerException or behavior when ByteBufAllocator is null.
    @Test
    public void testConstructionWithNullAllocator() throws IOException {
        try {
            new BufferedChannel(null, fileChannel, 1024);
            fail("Should throw NullPointerException when allocator is null");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    // 4. Null FileChannel
    // Verify behavior when FileChannel is null.
    @Test
    public void testConstructionWithNullFileChannel() throws IOException {
        try {
            new BufferedChannel(allocator, null, 1024);
            fail("Should throw NullPointerException when FileChannel is null");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    // 5. Zero Capacity
    // Verify behavior for capacity = 0 (Assuming implementation allows 0 or throws error).
    // Netty directBuffer(0) is valid but useless for buffering, checking logical constraints.
    @Test
    public void testConstructionWithZeroCapacity() throws IOException {
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, 0);
        assertNotNull(bc);
        assertEquals(0, bc.writeCapacity);
        bc.close();
    }

    // 6. Negative Capacity
    // Verify IllegalArgumentException for negative capacity.
    @Test
    public void testConstructionWithNegativeCapacity() throws IOException {
        try {
            new BufferedChannel(allocator, fileChannel, -1);
            fail("Should throw IllegalArgumentException for negative capacity");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // 7. Negative UnpersistedBound
    // Verify behavior/exception for negative unpersistedBytesBound.
    // The implementation assigns it to a long, logic implies it should be positive or zero.
    // Assuming no explicit check in constructor based on source provided, 
    // but semantically it should likely be accepted but effectively disabled or just stored.
    @Test
    public void testConstructionWithNegativeBound() throws IOException {
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, 1024, -100L);
        assertEquals(-100L, bc.unpersistedBytesBound);
        bc.close();
    }

    // 8. Initial State Verification
    // Assert position(), writeBufferStartPosition, and unpersistedBytes are 0 initially.
    @Test
    public void testInitialStateVerification() throws IOException {
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, 512);

        assertEquals("Initial position should be 0", 0L, bc.position());
        assertEquals("Initial file channel position should be 0",
                0L, bc.getFileChannelPosition());
        assertEquals("Unpersisted bytes should be 0",
                0L, bc.getUnpersistedBytes());

        bc.close();
    }

    // 9. Initial Buffer State
    // Verify writeBuffer is allocated but empty immediately after construction.
    @Test
    public void testInitialBufferState() throws IOException {
        int capacity = 256;
        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, capacity);

        // writeBuffer is protected, so we access state via public methods
        assertEquals("Buffer should be empty initially",
                0, bc.getNumOfBytesInWriteBuffer());

        bc.close();
    }

    // 10. File Position Sync
    // Verify writeBufferStartPosition matches the underlying FileChannel position if the channel was not at 0.
    @Test
    public void testFilePositionSync() throws IOException {
        // Advance file channel position manually
        long initialPos = 123L;
        // We need to write something or set position explicitly if the file is large enough
        // Since it's a new file, we can't just set position > length usually without gaps, 
        // but RandomAccessFile allows setting length or writing.
        randomAccessFile.setLength(200L);
        fileChannel.position(initialPos);

        BufferedChannel bc = new BufferedChannel(allocator, fileChannel, 1024);

        assertEquals("BufferedChannel position should match existing FileChannel position",
                initialPos, bc.position());
        assertEquals("WriteBufferStartPosition should match existing FileChannel position",
                initialPos, bc.getFileChannelPosition());

        bc.close();
    }
}