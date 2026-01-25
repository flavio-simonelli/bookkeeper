package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JournalChannelTest6 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3001");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        int int8 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel6.bc = bufferedChannel9;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, 6L, (int) '4', serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3002");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        byte[] byteArray12 = journalChannel2.magicWord;
        long long13 = journalChannel2.nextPrealloc;
        int int14 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel15 = journalChannel2.fc;
        int int16 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3003");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        int int4 = journalChannel2.fd;
        journalChannel2.close();
// flaky "1) test3003(org.apache.bookkeeper.bookie.JournalChannelTest6)":         org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3004");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        journalChannel11.nextPrealloc = 10;
        journalChannel11.nextPrealloc = 0L;
        int int16 = journalChannel11.formatVersion;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel19.bc;
        journalChannel19.close();
        java.nio.ByteBuffer byteBuffer22 = journalChannel19.zeros;
        int int23 = journalChannel11.read(byteBuffer22);
        int int24 = journalChannel2.read(byteBuffer22);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = null;
        journalChannel2.bc = bufferedChannel25;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel27 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer28 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3005");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        int int15 = journalChannel2.getFormatVersion();
        byte[] byteArray16 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNull(bufferedChannel19);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3006");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        java.nio.ByteBuffer byteBuffer10 = journalChannel8.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel2.configuration;
        int int14 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3007");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        int int17 = journalChannel9.read(byteBuffer16);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel9.configuration;
        java.nio.channels.FileChannel fileChannel20 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel9.bc;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel9.channel;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) (short) -1, 10, 6, false, (int) 'a', serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertNotNull(bookieFileChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3008");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 8;
        journalChannel2.close();
        int int9 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3009");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel18);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3010");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        int int10 = journalChannel8.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel8.channel;
        java.nio.ByteBuffer byteBuffer12 = journalChannel8.zeros;
        int int13 = journalChannel2.read(byteBuffer12);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3011");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(serverConfiguration3);
// flaky "2) test3011(org.apache.bookkeeper.bookie.JournalChannelTest6)":         org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3012");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        journalChannel2.nextPrealloc = 0L;
        int int17 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel19 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 4;
        int int22 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3013");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel2.configuration;
        int int20 = journalChannel2.fd;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel23.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel25 = journalChannel23.channel;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = journalChannel28.bc;
        journalChannel28.close();
        java.nio.ByteBuffer byteBuffer31 = journalChannel28.zeros;
        byte[] byteArray32 = journalChannel28.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = journalChannel28.configuration;
        java.nio.ByteBuffer byteBuffer34 = journalChannel28.zeros;
        int int35 = journalChannel23.read(byteBuffer34);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = journalChannel2.read(byteBuffer34);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky "3) test3013(org.apache.bookkeeper.bookie.JournalChannelTest6)":         org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bookieFileChannel25);
        org.junit.Assert.assertNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3014");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        journalChannel2.nextPrealloc = (byte) -1;
        journalChannel2.nextPrealloc = 4;
        int int14 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3015");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        byte[] byteArray9 = journalChannel2.magicWord;
        long long10 = journalChannel2.nextPrealloc;
        int int11 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3016");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        journalChannel7.nextPrealloc = (byte) 1;
        long long12 = journalChannel7.nextPrealloc;
        java.nio.ByteBuffer byteBuffer13 = journalChannel7.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        int int16 = journalChannel2.formatVersion;
        int int17 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
        int int19 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3017");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        int int15 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel16 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 1;
        byte[] byteArray20 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel24 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = null;
        journalChannel2.bc = bufferedChannel25;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel23);
        org.junit.Assert.assertNotNull(fileChannel24);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3018");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        journalChannel7.nextPrealloc = 3;
        long long12 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) (byte) 0, 2, 0L, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3019");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel12.configuration;
        java.nio.channels.FileChannel fileChannel22 = journalChannel12.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel12.bc = bufferedChannel23;
        journalChannel12.nextPrealloc = (-1);
        java.io.File file27 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file27, (long) 2);
        journalChannel29.nextPrealloc = 10;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        int int35 = journalChannel34.fd;
        java.nio.ByteBuffer byteBuffer36 = journalChannel34.zeros;
        int int37 = journalChannel29.read(byteBuffer36);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration38 = journalChannel29.configuration;
        java.nio.channels.FileChannel fileChannel39 = journalChannel29.fc;
        int int40 = journalChannel29.formatVersion;
        journalChannel29.nextPrealloc = (byte) 1;
        java.io.File file43 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel45 = new org.apache.bookkeeper.bookie.JournalChannel(file43, (long) 3);
        java.io.File file46 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel48 = new org.apache.bookkeeper.bookie.JournalChannel(file46, (long) 2);
        journalChannel48.nextPrealloc = 10;
        journalChannel48.nextPrealloc = 0L;
        int int53 = journalChannel48.formatVersion;
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = journalChannel56.bc;
        journalChannel56.close();
        java.nio.ByteBuffer byteBuffer59 = journalChannel56.zeros;
        int int60 = journalChannel48.read(byteBuffer59);
        java.io.File file61 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel63 = new org.apache.bookkeeper.bookie.JournalChannel(file61, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel64 = journalChannel63.channel;
        java.nio.ByteBuffer byteBuffer65 = journalChannel63.zeros;
        int int66 = journalChannel48.read(byteBuffer65);
        int int67 = journalChannel45.read(byteBuffer65);
        java.nio.ByteBuffer byteBuffer68 = journalChannel45.zeros;
        int int69 = journalChannel29.read(byteBuffer68);
        int int70 = journalChannel12.read(byteBuffer68);
        int int71 = journalChannel2.read(byteBuffer68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration38);
        org.junit.Assert.assertNotNull(fileChannel39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNull(bufferedChannel57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 512 + "'", int66 == 512);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteBuffer68);
// flaky "4) test3019(org.apache.bookkeeper.bookie.JournalChannelTest6)":         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3020");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel10.channel;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        int int13 = journalChannel2.read(byteBuffer12);
        int int14 = journalChannel2.fd;
        int int15 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 52L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3021");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3022");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3023");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 0);
        int int10 = journalChannel9.getFormatVersion();
        int int11 = journalChannel9.getFormatVersion();
        byte[] byteArray12 = journalChannel9.magicWord;
        byte[] byteArray13 = journalChannel9.magicWord;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        journalChannel16.nextPrealloc = 0L;
        long long21 = journalChannel16.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel16.bc = bufferedChannel22;
        java.nio.ByteBuffer byteBuffer24 = journalChannel16.zeros;
        int int25 = journalChannel9.read(byteBuffer24);
        int int26 = journalChannel2.read(byteBuffer24);
        byte[] byteArray27 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3024");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        int int9 = journalChannel2.getFormatVersion();
        int int10 = journalChannel2.fd;
        int int11 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3025");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        int int15 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel16 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3026");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        java.nio.ByteBuffer byteBuffer10 = journalChannel8.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel2.configuration;
        int int14 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3027");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        byte[] byteArray12 = journalChannel2.magicWord;
        long long13 = journalChannel2.nextPrealloc;
        int int14 = journalChannel2.getFormatVersion();
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        journalChannel17.nextPrealloc = 10;
        journalChannel17.nextPrealloc = 0L;
        int int22 = journalChannel17.formatVersion;
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel25.bc;
        journalChannel25.close();
        java.nio.ByteBuffer byteBuffer28 = journalChannel25.zeros;
        int int29 = journalChannel17.read(byteBuffer28);
        java.io.File file30 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file30, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel33 = journalChannel32.channel;
        java.nio.ByteBuffer byteBuffer34 = journalChannel32.zeros;
        int int35 = journalChannel17.read(byteBuffer34);
        int int36 = journalChannel2.read(byteBuffer34);
        long long37 = journalChannel2.nextPrealloc;
        long long38 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3028");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        int int10 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3029");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        int int17 = journalChannel9.read(byteBuffer16);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = null;
        journalChannel9.bc = bufferedChannel19;
        int int21 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel9.configuration;
        java.nio.ByteBuffer byteBuffer23 = journalChannel9.zeros;
        java.nio.ByteBuffer byteBuffer24 = journalChannel9.zeros;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, (long) (short) 1, 4, (int) '4', true, 6, serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3030");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(6L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3031");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L);
        java.io.File file3 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel5 = new org.apache.bookkeeper.bookie.JournalChannel(file3, (long) 2);
        journalChannel5.nextPrealloc = 10;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        int int13 = journalChannel5.read(byteBuffer12);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel5.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel5.configuration;
        java.nio.channels.FileChannel fileChannel16 = journalChannel5.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel5.bc;
        int int18 = journalChannel5.fd;
        journalChannel5.nextPrealloc = 10;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        journalChannel23.nextPrealloc = 10;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        int int29 = journalChannel28.fd;
        java.nio.ByteBuffer byteBuffer30 = journalChannel28.zeros;
        int int31 = journalChannel23.read(byteBuffer30);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration32 = journalChannel23.configuration;
        int int33 = journalChannel23.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = journalChannel23.bc;
        java.nio.ByteBuffer byteBuffer35 = journalChannel23.zeros;
        int int36 = journalChannel5.read(byteBuffer35);
        int int37 = journalChannel2.read(byteBuffer35);
        byte[] byteArray38 = journalChannel2.magicWord;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 0);
        int int42 = journalChannel41.getFormatVersion();
        int int43 = journalChannel41.fd;
        int int44 = journalChannel41.getFormatVersion();
        int int45 = journalChannel41.formatVersion;
        java.nio.ByteBuffer byteBuffer46 = journalChannel41.zeros;
        int int47 = journalChannel2.read(byteBuffer46);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3032");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 10L;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        journalChannel12.nextPrealloc = 0L;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        byte[] byteArray22 = journalChannel19.magicWord;
        java.nio.ByteBuffer byteBuffer23 = journalChannel19.zeros;
        int int24 = journalChannel12.read(byteBuffer23);
        int int25 = journalChannel2.read(byteBuffer23);
        long long26 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = 2;
        int int29 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3033");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        int int12 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3034");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) '#');
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', 6L, (int) (short) -1, (long) 3, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3035");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3036");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        int int15 = journalChannel2.getFormatVersion();
        byte[] byteArray16 = journalChannel2.magicWord;
        journalChannel2.close();
        journalChannel2.close();
        byte[] byteArray19 = journalChannel2.magicWord;
        long long20 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3037");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        int int5 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3038");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        byte[] byteArray10 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3039");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.close();
        int int7 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (byte) 10;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel10);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3040");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        int int9 = journalChannel7.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel7.bc = bufferedChannel10;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) 8, 3, (long) 8, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3041");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        int int15 = journalChannel7.read(byteBuffer14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel7.configuration;
        java.nio.channels.FileChannel fileChannel17 = journalChannel7.fc;
        java.nio.channels.FileChannel fileChannel18 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) (short) 10, 3, 6L, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3042");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        int int16 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3043");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        byte[] byteArray6 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (-1);
        int int9 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3044");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        int int9 = journalChannel2.formatVersion;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3045");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        int int15 = journalChannel7.read(byteBuffer14);
        int int16 = journalChannel2.read(byteBuffer14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3046");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        long long9 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3047");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3048");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        journalChannel6.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel6.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel6.bc = bufferedChannel12;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel6.bc = bufferedChannel14;
        long long16 = journalChannel6.nextPrealloc;
        byte[] byteArray17 = journalChannel6.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 5, 0, serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3049");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        journalChannel2.nextPrealloc = 0L;
        int int17 = journalChannel2.formatVersion;
        int int18 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3050");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel6.bc;
        byte[] byteArray8 = journalChannel6.magicWord;
        journalChannel6.nextPrealloc = (byte) -1;
        journalChannel6.nextPrealloc = (short) 100;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        journalChannel15.nextPrealloc = 10;
        byte[] byteArray18 = journalChannel15.magicWord;
        java.nio.ByteBuffer byteBuffer19 = journalChannel15.zeros;
        java.nio.channels.FileChannel fileChannel20 = journalChannel15.fc;
        int int21 = journalChannel15.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel15.bc;
        java.nio.ByteBuffer byteBuffer23 = journalChannel15.zeros;
        int int24 = journalChannel6.read(byteBuffer23);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) (byte) 10, (int) (byte) 0, serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "5) test3050(org.apache.bookkeeper.bookie.JournalChannelTest6)":         org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3051");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        journalChannel2.nextPrealloc = 100;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        journalChannel11.nextPrealloc = 10;
        journalChannel11.nextPrealloc = 0L;
        int int16 = journalChannel11.formatVersion;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel19.bc;
        journalChannel19.close();
        java.nio.ByteBuffer byteBuffer22 = journalChannel19.zeros;
        int int23 = journalChannel11.read(byteBuffer22);
        int int24 = journalChannel2.read(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3052");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        int int13 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNull(bufferedChannel20);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3053");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3054");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        int int12 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        byte[] byteArray18 = journalChannel2.magicWord;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        journalChannel21.nextPrealloc = 10;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        int int27 = journalChannel26.fd;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        int int29 = journalChannel21.read(byteBuffer28);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel21.configuration;
        int int31 = journalChannel21.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel21.bc;
        java.nio.ByteBuffer byteBuffer33 = journalChannel21.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration34 = journalChannel21.configuration;
        long long35 = journalChannel21.nextPrealloc;
        byte[] byteArray36 = journalChannel21.magicWord;
        java.nio.ByteBuffer byteBuffer37 = journalChannel21.zeros;
        int int38 = journalChannel2.read(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(serverConfiguration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3055");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel12.bc;
        long long14 = journalChannel12.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel12.bc = bufferedChannel15;
        int int17 = journalChannel12.formatVersion;
        journalChannel12.nextPrealloc = (byte) 0;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel12.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel12.bc;
        java.nio.ByteBuffer byteBuffer22 = journalChannel12.zeros;
        int int23 = journalChannel2.read(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3056");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        byte[] byteArray12 = journalChannel9.magicWord;
        java.nio.ByteBuffer byteBuffer13 = journalChannel9.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3057");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 52L, (long) 8, 10, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3058");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        journalChannel7.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel7.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel7.bc = bufferedChannel13;
        int int15 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) 5, (int) '#', 32L, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3059");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        int int15 = journalChannel7.read(byteBuffer14);
        int int16 = journalChannel2.read(byteBuffer14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel2.bc = bufferedChannel20;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel2.bc = bufferedChannel23;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3060");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3061");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L);
        java.io.File file3 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel5 = new org.apache.bookkeeper.bookie.JournalChannel(file3, (long) 2);
        journalChannel5.nextPrealloc = 10;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        int int13 = journalChannel5.read(byteBuffer12);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel5.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel5.configuration;
        java.nio.channels.FileChannel fileChannel16 = journalChannel5.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel5.bc;
        int int18 = journalChannel5.fd;
        journalChannel5.nextPrealloc = 10;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        journalChannel23.nextPrealloc = 10;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        int int29 = journalChannel28.fd;
        java.nio.ByteBuffer byteBuffer30 = journalChannel28.zeros;
        int int31 = journalChannel23.read(byteBuffer30);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration32 = journalChannel23.configuration;
        int int33 = journalChannel23.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = journalChannel23.bc;
        java.nio.ByteBuffer byteBuffer35 = journalChannel23.zeros;
        int int36 = journalChannel5.read(byteBuffer35);
        int int37 = journalChannel2.read(byteBuffer35);
        byte[] byteArray38 = journalChannel2.magicWord;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 0);
        int int42 = journalChannel41.getFormatVersion();
        int int43 = journalChannel41.fd;
        int int44 = journalChannel41.getFormatVersion();
        int int45 = journalChannel41.formatVersion;
        java.nio.ByteBuffer byteBuffer46 = journalChannel41.zeros;
        int int47 = journalChannel2.read(byteBuffer46);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel49 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(bookieFileChannel49);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3062");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3063");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 3L;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3064");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        int int10 = journalChannel2.getFormatVersion();
        long long11 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        long long14 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3065");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        byte[] byteArray4 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (byte) -1;
        journalChannel2.nextPrealloc = (short) 100;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        journalChannel11.nextPrealloc = 10;
        byte[] byteArray14 = journalChannel11.magicWord;
        java.nio.ByteBuffer byteBuffer15 = journalChannel11.zeros;
        java.nio.channels.FileChannel fileChannel16 = journalChannel11.fc;
        int int17 = journalChannel11.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel11.bc;
        java.nio.ByteBuffer byteBuffer19 = journalChannel11.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        java.nio.ByteBuffer byteBuffer21 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel24 = journalChannel2.fc;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(fileChannel24);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3066");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        int int5 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        journalChannel2.nextPrealloc = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3067");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        java.io.File file3 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel5 = new org.apache.bookkeeper.bookie.JournalChannel(file3, (long) (byte) 10);
        long long6 = journalChannel5.nextPrealloc;
        int int7 = journalChannel5.fd;
        journalChannel5.close();
        java.nio.ByteBuffer byteBuffer9 = journalChannel5.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3068");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100);
        int int3 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3069");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        byte[] byteArray9 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3070");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3071");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        int int15 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3072");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.fd;
        java.nio.ByteBuffer byteBuffer13 = journalChannel11.zeros;
        int int14 = journalChannel6.read(byteBuffer13);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = null;
        journalChannel6.bc = bufferedChannel19;
        journalChannel6.nextPrealloc = 100L;
        byte[] byteArray23 = journalChannel6.magicWord;
        int int24 = journalChannel6.formatVersion;
        byte[] byteArray25 = journalChannel6.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, 97L, (int) (short) 1, serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3073");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        int int13 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 1;
        journalChannel2.nextPrealloc = (byte) 0;
        int int18 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3074");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        journalChannel2.close();
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3075");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), 1048576L, (-1), serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3076");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        byte[] byteArray3 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
// flaky "6) test3076(org.apache.bookkeeper.bookie.JournalChannelTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3077");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel2.bc = bufferedChannel12;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel2.bc = bufferedChannel14;
        int int16 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3078");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        int int13 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        journalChannel2.close();
        journalChannel2.close();
        journalChannel2.nextPrealloc = (short) 100;
        int int22 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel2.bc = bufferedChannel23;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel25);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3079");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        int int11 = journalChannel2.getFormatVersion();
        byte[] byteArray12 = journalChannel2.magicWord;
        int int13 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3080");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        int int9 = journalChannel6.formatVersion;
        int int10 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel6.bc = bufferedChannel11;
        byte[] byteArray13 = journalChannel6.magicWord;
        long long14 = journalChannel6.nextPrealloc;
        int int15 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) 8, (int) (byte) -1, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3081");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.formatVersion;
        journalChannel6.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer10 = journalChannel6.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3082");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.fd;
        java.nio.ByteBuffer byteBuffer13 = journalChannel11.zeros;
        int int14 = journalChannel6.read(byteBuffer13);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel6.configuration;
        java.nio.channels.FileChannel fileChannel17 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel6.bc;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel6.channel;
        journalChannel6.close();
        java.nio.ByteBuffer byteBuffer23 = journalChannel6.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) 100, (int) (byte) 100, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3083");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        byte[] byteArray12 = journalChannel9.magicWord;
        java.nio.ByteBuffer byteBuffer13 = journalChannel9.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel2.channel;
        int int19 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3084");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
        int int15 = journalChannel10.getFormatVersion();
        int int16 = journalChannel10.fd;
        int int17 = journalChannel10.fd;
        int int18 = journalChannel10.fd;
        long long19 = journalChannel10.nextPrealloc;
        byte[] byteArray20 = journalChannel10.magicWord;
        long long21 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 512, 512, (int) (short) 0, true, 100, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3085");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        int int11 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3086");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3087");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3088");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        int int3 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3089");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        journalChannel15.nextPrealloc = 10;
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        int int21 = journalChannel20.fd;
        java.nio.ByteBuffer byteBuffer22 = journalChannel20.zeros;
        int int23 = journalChannel15.read(byteBuffer22);
        int int24 = journalChannel10.read(byteBuffer22);
        int int25 = journalChannel10.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 0L, (int) (short) -1, 0, true, 100, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 6L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3090");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        int int15 = journalChannel7.read(byteBuffer14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel7.bc = bufferedChannel20;
        journalChannel7.nextPrealloc = 100L;
        byte[] byteArray24 = journalChannel7.magicWord;
        int int25 = journalChannel7.formatVersion;
        byte[] byteArray26 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, 52L, (int) (byte) 10, 97L, serverConfiguration27, fileChannelProvider28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3091");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        int int4 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        long long7 = journalChannel2.nextPrealloc;
        byte[] byteArray8 = journalChannel2.magicWord;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3092");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.formatVersion;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, 0L);
        long long11 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel10.bc = bufferedChannel12;
        long long14 = journalChannel10.nextPrealloc;
        java.nio.ByteBuffer byteBuffer15 = journalChannel10.zeros;
        int int16 = journalChannel2.read(byteBuffer15);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3093");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        long long7 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3094");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3095");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        int int15 = journalChannel7.read(byteBuffer14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel7.configuration;
        java.nio.channels.FileChannel fileChannel18 = journalChannel7.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel7.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, 97L, (int) 'a', 512L, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3096");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        int int9 = journalChannel2.fd;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel12.configuration;
        java.nio.channels.FileChannel fileChannel22 = journalChannel12.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel12.bc = bufferedChannel23;
        journalChannel12.nextPrealloc = (-1);
        java.io.File file27 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file27, (long) 2);
        journalChannel29.nextPrealloc = 10;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        int int35 = journalChannel34.fd;
        java.nio.ByteBuffer byteBuffer36 = journalChannel34.zeros;
        int int37 = journalChannel29.read(byteBuffer36);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration38 = journalChannel29.configuration;
        java.nio.channels.FileChannel fileChannel39 = journalChannel29.fc;
        int int40 = journalChannel29.formatVersion;
        journalChannel29.nextPrealloc = (byte) 1;
        java.io.File file43 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel45 = new org.apache.bookkeeper.bookie.JournalChannel(file43, (long) 3);
        java.io.File file46 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel48 = new org.apache.bookkeeper.bookie.JournalChannel(file46, (long) 2);
        journalChannel48.nextPrealloc = 10;
        journalChannel48.nextPrealloc = 0L;
        int int53 = journalChannel48.formatVersion;
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = journalChannel56.bc;
        journalChannel56.close();
        java.nio.ByteBuffer byteBuffer59 = journalChannel56.zeros;
        int int60 = journalChannel48.read(byteBuffer59);
        java.io.File file61 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel63 = new org.apache.bookkeeper.bookie.JournalChannel(file61, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel64 = journalChannel63.channel;
        java.nio.ByteBuffer byteBuffer65 = journalChannel63.zeros;
        int int66 = journalChannel48.read(byteBuffer65);
        int int67 = journalChannel45.read(byteBuffer65);
        java.nio.ByteBuffer byteBuffer68 = journalChannel45.zeros;
        int int69 = journalChannel29.read(byteBuffer68);
        int int70 = journalChannel12.read(byteBuffer68);
        int int71 = journalChannel2.read(byteBuffer68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration38);
        org.junit.Assert.assertNotNull(fileChannel39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNull(bufferedChannel57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 512 + "'", int66 == 512);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest6.test3097");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fileChannel5);
    }
}
