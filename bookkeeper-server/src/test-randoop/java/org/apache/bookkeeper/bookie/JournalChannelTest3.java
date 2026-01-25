package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JournalChannelTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1501");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel21);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1502");
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
        java.nio.ByteBuffer byteBuffer19 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1503");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        int int8 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel6.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel14.bc;
        byte[] byteArray16 = journalChannel14.magicWord;
        journalChannel14.nextPrealloc = (byte) -1;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, 0L);
        long long22 = journalChannel21.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel21.bc = bufferedChannel23;
        long long25 = journalChannel21.nextPrealloc;
        java.nio.ByteBuffer byteBuffer26 = journalChannel21.zeros;
        int int27 = journalChannel14.read(byteBuffer26);
        int int28 = journalChannel2.read(byteBuffer26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = journalChannel2.getBufferedChannel();
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer26);
// flaky "1) test1503(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1504");
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
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        byte[] byteArray19 = journalChannel16.magicWord;
        java.nio.ByteBuffer byteBuffer20 = journalChannel16.zeros;
        java.nio.channels.FileChannel fileChannel21 = journalChannel16.fc;
        int int22 = journalChannel16.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel16.bc;
        java.nio.ByteBuffer byteBuffer24 = journalChannel16.zeros;
        int int25 = journalChannel2.read(byteBuffer24);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel26 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel26);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1505");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        journalChannel6.nextPrealloc = 3;
        byte[] byteArray11 = journalChannel6.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 512, 2, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1506");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        byte[] byteArray4 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration5);
// flaky "2) test1506(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1507");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        int int8 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1508");
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
        int int14 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 1;
        byte[] byteArray17 = journalChannel2.magicWord;
        journalChannel2.close();
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1509");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.getBufferedChannel();
// flaky "3) test1509(org.apache.bookkeeper.bookie.JournalChannelTest3)":             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1510");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1511");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
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
        int int34 = journalChannel2.read(byteBuffer33);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 5);
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNull(bufferedChannel35);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1512");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
        long long15 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, 4L, 1, (int) (short) 1, false, (-1), bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 6L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1513");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 5);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel6.channel;
        byte[] byteArray8 = journalChannel6.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 0L, 2, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1514");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        journalChannel2.close();
        int int10 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1515");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass11 = byteBuffer10.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1516");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1517");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel7.bc = bufferedChannel18;
        journalChannel7.nextPrealloc = 0L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) 3, (int) (short) -1, (long) 6, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1518");
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
        int int19 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1519");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        int int4 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1520");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = (byte) 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1521");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1522");
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
        int int14 = journalChannel2.fd;
        int int15 = journalChannel2.formatVersion;
        long long16 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1523");
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
        journalChannel10.nextPrealloc = ' ';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) (short) 10, 0, 1, true, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1524");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        long long7 = journalChannel2.nextPrealloc;
        long long8 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1525");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 4, (int) (byte) 0, (int) (short) 10, true, 10, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1526");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1527");
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
        java.nio.channels.FileChannel fileChannel19 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel9.bc = bufferedChannel20;
        int int22 = journalChannel9.getFormatVersion();
        java.nio.channels.FileChannel fileChannel23 = journalChannel9.fc;
        java.nio.channels.FileChannel fileChannel24 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) ' ', (-1), 0, true, (int) (short) 10, serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1528");
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
        int int16 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fileChannel17);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1529");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) 4, 4, 0, false, 512, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1530");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = (byte) 0;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        int int8 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1531");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1532");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        int int15 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1533");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 10);
// flaky "4) test1533(org.apache.bookkeeper.bookie.JournalChannelTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1534");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        java.nio.channels.FileChannel fileChannel20 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel10.bc = bufferedChannel21;
        int int23 = journalChannel10.getFormatVersion();
        byte[] byteArray24 = journalChannel10.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) (byte) 10, 2, 1, false, 4, bufferedChannelBuilder7, serverConfiguration29, fileChannelProvider30, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1535");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.getFormatVersion();
        long long6 = journalChannel2.nextPrealloc;
        long long7 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1536");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        int int8 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1048576L;
        int int11 = journalChannel2.formatVersion;
        int int12 = journalChannel2.fd;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel15.bc;
        int int18 = journalChannel15.formatVersion;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        int int22 = journalChannel21.fd;
        java.nio.ByteBuffer byteBuffer23 = journalChannel21.zeros;
        int int24 = journalChannel15.read(byteBuffer23);
        journalChannel15.close();
        long long26 = journalChannel15.nextPrealloc;
        journalChannel15.close();
        int int28 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer29 = journalChannel15.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = journalChannel2.read(byteBuffer29);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1537");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        long long11 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1538");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 0L;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1539");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        long long13 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1540");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fileChannel9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1541");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel7.bc = bufferedChannel18;
        journalChannel7.nextPrealloc = 0L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) (short) -1, (int) '#', 0L, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1542");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1543");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        long long7 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1544");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1545");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel6.channel;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        journalChannel15.nextPrealloc = 10;
        journalChannel15.nextPrealloc = 0L;
        int int20 = journalChannel15.formatVersion;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel23.bc;
        journalChannel23.close();
        java.nio.ByteBuffer byteBuffer26 = journalChannel23.zeros;
        int int27 = journalChannel15.read(byteBuffer26);
        int int28 = journalChannel6.read(byteBuffer26);
        int int29 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (byte) -1, 6, serverConfiguration30, fileChannelProvider31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration30);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1546");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        journalChannel2.nextPrealloc = (byte) -1;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass13 = bookieFileChannel12.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1547");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1548");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.close();
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1549");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) (short) -1, (int) (short) 1, (int) 'a', false, 1, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1550");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        long long17 = journalChannel2.nextPrealloc;
        int int18 = journalChannel2.fd;
        int int19 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNull(bufferedChannel21);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1551");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.channels.FileChannel fileChannel34 = journalChannel2.fc;
        journalChannel2.close();
        int int36 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 100;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) (-1));
        long long42 = journalChannel41.nextPrealloc;
        java.io.File file43 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel45 = new org.apache.bookkeeper.bookie.JournalChannel(file43, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration46 = journalChannel45.configuration;
        journalChannel45.nextPrealloc = 1048576L;
        int int49 = journalChannel45.formatVersion;
        java.nio.ByteBuffer byteBuffer50 = journalChannel45.zeros;
        int int51 = journalChannel41.read(byteBuffer50);
        java.io.File file52 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel54 = new org.apache.bookkeeper.bookie.JournalChannel(file52, (long) 2);
        int int55 = journalChannel54.fd;
        java.nio.ByteBuffer byteBuffer56 = journalChannel54.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel57 = journalChannel54.channel;
        journalChannel54.nextPrealloc = 'a';
        java.io.File file60 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel62 = new org.apache.bookkeeper.bookie.JournalChannel(file60, (long) 2);
        int int63 = journalChannel62.fd;
        java.nio.ByteBuffer byteBuffer64 = journalChannel62.zeros;
        journalChannel62.nextPrealloc = (byte) 1;
        long long67 = journalChannel62.nextPrealloc;
        java.io.File file68 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel70 = new org.apache.bookkeeper.bookie.JournalChannel(file68, (long) 2);
        int int71 = journalChannel70.fd;
        java.nio.ByteBuffer byteBuffer72 = journalChannel70.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel73 = journalChannel70.channel;
        journalChannel70.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel76 = journalChannel70.channel;
        java.io.File file77 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel79 = new org.apache.bookkeeper.bookie.JournalChannel(file77, (long) 2);
        journalChannel79.nextPrealloc = 10;
        journalChannel79.nextPrealloc = 0L;
        int int84 = journalChannel79.formatVersion;
        java.io.File file85 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel87 = new org.apache.bookkeeper.bookie.JournalChannel(file85, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel88 = journalChannel87.bc;
        journalChannel87.close();
        java.nio.ByteBuffer byteBuffer90 = journalChannel87.zeros;
        int int91 = journalChannel79.read(byteBuffer90);
        int int92 = journalChannel70.read(byteBuffer90);
        int int93 = journalChannel62.read(byteBuffer90);
        int int94 = journalChannel54.read(byteBuffer90);
        int int95 = journalChannel41.read(byteBuffer90);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = journalChannel2.read(byteBuffer90);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(bookieFileChannel57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(bookieFileChannel73);
        org.junit.Assert.assertNotNull(bookieFileChannel76);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertNull(bufferedChannel88);
        org.junit.Assert.assertNotNull(byteBuffer90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 512 + "'", int91 == 512);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1552");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        int int9 = journalChannel2.getFormatVersion();
        long long10 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1553");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        int int13 = journalChannel10.formatVersion;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        int int17 = journalChannel16.fd;
        java.nio.ByteBuffer byteBuffer18 = journalChannel16.zeros;
        int int19 = journalChannel10.read(byteBuffer18);
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) (byte) -1, 3, 0, false, 6, bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1554");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass9 = fileChannel8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1555");
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
        int int14 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1556");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) -1);
        byte[] byteArray11 = journalChannel10.magicWord;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        journalChannel15.nextPrealloc = (byte) 1;
        long long20 = journalChannel15.nextPrealloc;
        java.nio.ByteBuffer byteBuffer21 = journalChannel15.zeros;
        int int22 = journalChannel10.read(byteBuffer21);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel10.channel;
        int int24 = journalChannel10.formatVersion;
        int int25 = journalChannel10.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) 512, (int) (byte) 0, (int) (byte) 100, false, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1557");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, 10L);
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        int int25 = journalChannel24.fd;
        java.nio.ByteBuffer byteBuffer26 = journalChannel24.zeros;
        int int27 = journalChannel19.read(byteBuffer26);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel19.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel19.configuration;
        java.nio.channels.FileChannel fileChannel30 = journalChannel19.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = journalChannel19.bc;
        int int32 = journalChannel19.fd;
        journalChannel19.nextPrealloc = 10;
        java.io.File file35 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel37 = new org.apache.bookkeeper.bookie.JournalChannel(file35, (long) 2);
        journalChannel37.nextPrealloc = 10;
        java.io.File file40 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel42 = new org.apache.bookkeeper.bookie.JournalChannel(file40, (long) 2);
        int int43 = journalChannel42.fd;
        java.nio.ByteBuffer byteBuffer44 = journalChannel42.zeros;
        int int45 = journalChannel37.read(byteBuffer44);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration46 = journalChannel37.configuration;
        int int47 = journalChannel37.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = journalChannel37.bc;
        java.nio.ByteBuffer byteBuffer49 = journalChannel37.zeros;
        int int50 = journalChannel19.read(byteBuffer49);
        int int51 = journalChannel16.read(byteBuffer49);
        int int52 = journalChannel2.read(byteBuffer49);
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration28);
        org.junit.Assert.assertNotNull(serverConfiguration29);
        org.junit.Assert.assertNotNull(fileChannel30);
        org.junit.Assert.assertNull(bufferedChannel31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1558");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.channels.FileChannel fileChannel34 = journalChannel2.fc;
        journalChannel2.close();
        int int36 = journalChannel2.formatVersion;
        long long37 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1559");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1560");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        byte[] byteArray9 = journalChannel2.magicWord;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel12.configuration;
        int int22 = journalChannel12.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel12.bc;
        java.nio.ByteBuffer byteBuffer24 = journalChannel12.zeros;
        int int25 = journalChannel2.read(byteBuffer24);
        int int26 = journalChannel2.fd;
        java.lang.Class<?> wildcardClass27 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1561");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1562");
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
        int int14 = journalChannel2.fd;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        int int18 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1563");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        int int6 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1564");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        journalChannel2.nextPrealloc = (byte) 100;
        int int13 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel2.bc = bufferedChannel14;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1565");
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
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        int int21 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel22 = journalChannel2.fc;
        int int23 = journalChannel2.getFormatVersion();
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, 0L);
        journalChannel26.nextPrealloc = 0L;
        long long29 = journalChannel26.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = journalChannel26.bc;
        java.nio.ByteBuffer byteBuffer31 = journalChannel26.zeros;
        int int32 = journalChannel2.read(byteBuffer31);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = null;
        journalChannel2.bc = bufferedChannel33;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel35 = journalChannel2.channel;
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
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel35);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1566");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        int int16 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        int int19 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1567");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        byte[] byteArray12 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1568");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        long long17 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass18 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1569");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        java.nio.channels.FileChannel fileChannel13 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) 1, (int) (byte) 1, 0, true, 5, bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1570");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer19 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        journalChannel2.nextPrealloc = (short) -1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNull(bufferedChannel21);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1571");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 100L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1572");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        journalChannel2.nextPrealloc = 100L;
        byte[] byteArray19 = journalChannel2.magicWord;
        int int20 = journalChannel2.fd;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) (byte) -1);
        journalChannel23.close();
        int int25 = journalChannel23.formatVersion;
        java.nio.ByteBuffer byteBuffer26 = journalChannel23.zeros;
        int int27 = journalChannel2.read(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1573");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1574");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        int int10 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass11 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1575");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        java.nio.channels.FileChannel fileChannel20 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 6L, 0, (int) (byte) 1, true, 8, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1576");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1577");
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
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel17.bc;
        journalChannel17.close();
        java.nio.ByteBuffer byteBuffer20 = journalChannel17.zeros;
        java.nio.ByteBuffer byteBuffer21 = journalChannel17.zeros;
        int int22 = journalChannel2.read(byteBuffer21);
        java.nio.channels.FileChannel fileChannel23 = journalChannel2.fc;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        int int27 = journalChannel26.fd;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        java.nio.channels.FileChannel fileChannel29 = journalChannel26.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = null;
        journalChannel26.bc = bufferedChannel30;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel35 = journalChannel34.channel;
        java.nio.ByteBuffer byteBuffer36 = journalChannel34.zeros;
        int int37 = journalChannel26.read(byteBuffer36);
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 2);
        journalChannel40.nextPrealloc = 10;
        byte[] byteArray43 = journalChannel40.magicWord;
        java.nio.ByteBuffer byteBuffer44 = journalChannel40.zeros;
        java.nio.channels.FileChannel fileChannel45 = journalChannel40.fc;
        int int46 = journalChannel40.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = journalChannel40.bc;
        java.nio.ByteBuffer byteBuffer48 = journalChannel40.zeros;
        int int49 = journalChannel26.read(byteBuffer48);
        int int50 = journalChannel2.read(byteBuffer48);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(fileChannel29);
        org.junit.Assert.assertNotNull(bookieFileChannel35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(fileChannel45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNull(bufferedChannel47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1578");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) 8, 100, (-1L), serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1579");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        int int9 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) ' ', (int) (byte) -1, 1L, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1580");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel11.bc;
        journalChannel11.nextPrealloc = 3;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        journalChannel18.nextPrealloc = 10;
        journalChannel18.nextPrealloc = 0L;
        int int23 = journalChannel18.formatVersion;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel26.bc;
        journalChannel26.close();
        java.nio.ByteBuffer byteBuffer29 = journalChannel26.zeros;
        int int30 = journalChannel18.read(byteBuffer29);
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel34 = journalChannel33.channel;
        java.nio.ByteBuffer byteBuffer35 = journalChannel33.zeros;
        int int36 = journalChannel18.read(byteBuffer35);
        int int37 = journalChannel11.read(byteBuffer35);
        int int38 = journalChannel2.read(byteBuffer35);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 1048576L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(bufferedChannel39);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1581");
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
        journalChannel2.nextPrealloc = 100L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel2.bc = bufferedChannel22;
        journalChannel2.nextPrealloc = 97L;
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1582");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        int int4 = journalChannel2.getFormatVersion();
        int int5 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1583");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        journalChannel14.nextPrealloc = (byte) 1;
        long long19 = journalChannel14.nextPrealloc;
        java.nio.ByteBuffer byteBuffer20 = journalChannel14.zeros;
        int int21 = journalChannel9.read(byteBuffer20);
        long long22 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) '4', (int) (short) -1, (int) '4', false, (int) (short) 10, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1584");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        journalChannel11.nextPrealloc = 10;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        int int17 = journalChannel16.fd;
        java.nio.ByteBuffer byteBuffer18 = journalChannel16.zeros;
        int int19 = journalChannel11.read(byteBuffer18);
        int int20 = journalChannel6.read(byteBuffer18);
        int int21 = journalChannel6.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 10, (int) ' ', serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1585");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bufferedChannel7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1586");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        int int26 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) 0, 2, (int) (short) 100, true, (-1), serverConfiguration27, fileChannelProvider28);
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
        org.junit.Assert.assertNotNull(serverConfiguration24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1587");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        int int7 = journalChannel2.fd;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1588");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        byte[] byteArray4 = journalChannel2.magicWord;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.formatVersion;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1589");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 1048576L;
        int int10 = journalChannel6.formatVersion;
        java.nio.ByteBuffer byteBuffer11 = journalChannel6.zeros;
        int int12 = journalChannel2.read(byteBuffer11);
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel15.channel;
        journalChannel15.nextPrealloc = 'a';
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        int int24 = journalChannel23.fd;
        java.nio.ByteBuffer byteBuffer25 = journalChannel23.zeros;
        journalChannel23.nextPrealloc = (byte) 1;
        long long28 = journalChannel23.nextPrealloc;
        java.io.File file29 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file29, (long) 2);
        int int32 = journalChannel31.fd;
        java.nio.ByteBuffer byteBuffer33 = journalChannel31.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel34 = journalChannel31.channel;
        journalChannel31.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel37 = journalChannel31.channel;
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 2);
        journalChannel40.nextPrealloc = 10;
        journalChannel40.nextPrealloc = 0L;
        int int45 = journalChannel40.formatVersion;
        java.io.File file46 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel48 = new org.apache.bookkeeper.bookie.JournalChannel(file46, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = journalChannel48.bc;
        journalChannel48.close();
        java.nio.ByteBuffer byteBuffer51 = journalChannel48.zeros;
        int int52 = journalChannel40.read(byteBuffer51);
        int int53 = journalChannel31.read(byteBuffer51);
        int int54 = journalChannel23.read(byteBuffer51);
        int int55 = journalChannel15.read(byteBuffer51);
        int int56 = journalChannel2.read(byteBuffer51);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = null;
        journalChannel2.bc = bufferedChannel57;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(bookieFileChannel34);
        org.junit.Assert.assertNotNull(bookieFileChannel37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNull(bufferedChannel49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1590");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 4L;
        byte[] byteArray10 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1591");
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
        byte[] byteArray18 = journalChannel2.magicWord;
        journalChannel2.close();
        int int20 = journalChannel2.getFormatVersion();
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel23.bc;
        journalChannel23.close();
        java.nio.ByteBuffer byteBuffer26 = journalChannel23.zeros;
        byte[] byteArray27 = journalChannel23.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel23.configuration;
        java.nio.ByteBuffer byteBuffer29 = journalChannel23.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = journalChannel2.read(byteBuffer29);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration28);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1592");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        byte[] byteArray12 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1593");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        journalChannel2.close();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1594");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel6.channel;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        journalChannel15.nextPrealloc = 10;
        journalChannel15.nextPrealloc = 0L;
        int int20 = journalChannel15.formatVersion;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel23.bc;
        journalChannel23.close();
        java.nio.ByteBuffer byteBuffer26 = journalChannel23.zeros;
        int int27 = journalChannel15.read(byteBuffer26);
        int int28 = journalChannel6.read(byteBuffer26);
        int int29 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) (short) -1, 10, serverConfiguration30, fileChannelProvider31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration30);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1595");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        journalChannel6.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel10 = journalChannel6.fc;
        long long11 = journalChannel6.nextPrealloc;
        journalChannel6.close();
        int int13 = journalChannel6.getFormatVersion();
        int int14 = journalChannel6.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) 1, (int) (short) -1, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1596");
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
        int int17 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel2.channel;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1597");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1598");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        journalChannel2.nextPrealloc = '4';
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1599");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1600");
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
        int int19 = journalChannel9.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 8, (int) ' ', (int) (byte) 0, true, (int) (byte) 10, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1601");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        journalChannel7.nextPrealloc = 100L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) 6, (int) (short) 100, (long) (short) -1, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1602");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1603");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = null;
        journalChannel2.bc = bufferedChannel19;
        int int21 = journalChannel2.getFormatVersion();
        byte[] byteArray22 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel23 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel23);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1604");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        byte[] byteArray6 = journalChannel2.magicWord;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1605");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, 97L, (int) (short) 0, 2, true, 0, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1606");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1607");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) (-1), 10, (int) (byte) 1, true, 100, serverConfiguration22, fileChannelProvider23);
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
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1608");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        journalChannel17.nextPrealloc = 10;
        java.io.File file20 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file20, (long) 2);
        int int23 = journalChannel22.fd;
        java.nio.ByteBuffer byteBuffer24 = journalChannel22.zeros;
        int int25 = journalChannel17.read(byteBuffer24);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel17.configuration;
        java.nio.channels.FileChannel fileChannel27 = journalChannel17.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = null;
        journalChannel17.bc = bufferedChannel28;
        int int30 = journalChannel17.getFormatVersion();
        byte[] byteArray31 = journalChannel17.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel17.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = journalChannel17.configuration;
        long long34 = journalChannel17.nextPrealloc;
        java.io.File file35 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel37 = new org.apache.bookkeeper.bookie.JournalChannel(file35, (long) 2);
        journalChannel37.nextPrealloc = 10;
        journalChannel37.nextPrealloc = 0L;
        java.io.File file42 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel44 = new org.apache.bookkeeper.bookie.JournalChannel(file42, (long) 2);
        journalChannel44.nextPrealloc = 10;
        byte[] byteArray47 = journalChannel44.magicWord;
        java.nio.ByteBuffer byteBuffer48 = journalChannel44.zeros;
        int int49 = journalChannel37.read(byteBuffer48);
        int int50 = journalChannel17.read(byteBuffer48);
        int int51 = journalChannel2.read(byteBuffer48);
        java.nio.channels.FileChannel fileChannel52 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration26);
        org.junit.Assert.assertNotNull(fileChannel27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fileChannel52);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1609");
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
        int int14 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1610");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.channels.FileChannel fileChannel34 = journalChannel2.fc;
        journalChannel2.close();
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fileChannel34);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1611");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass7 = serverConfiguration6.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1612");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 6;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1613");
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
        long long13 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        int int15 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1614");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(fileChannel17);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1615");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1616");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        int int8 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel6.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel14.bc;
        byte[] byteArray16 = journalChannel14.magicWord;
        journalChannel14.nextPrealloc = (byte) -1;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, 0L);
        long long22 = journalChannel21.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel21.bc = bufferedChannel23;
        long long25 = journalChannel21.nextPrealloc;
        java.nio.ByteBuffer byteBuffer26 = journalChannel21.zeros;
        int int27 = journalChannel14.read(byteBuffer26);
        int int28 = journalChannel2.read(byteBuffer26);
        long long29 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel30 = journalChannel2.channel;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(bookieFileChannel30);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1617");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        int int8 = journalChannel6.getFormatVersion();
        java.nio.ByteBuffer byteBuffer9 = journalChannel6.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, 3L, 1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1618");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.channels.FileChannel fileChannel34 = journalChannel2.fc;
        journalChannel2.close();
        int int36 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNull(bufferedChannel37);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1619");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (byte) 100, (int) (short) -1, 0L, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1620");
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
        int int27 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel28 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel28);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1621");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
        int int15 = journalChannel10.getFormatVersion();
        byte[] byteArray16 = journalChannel10.magicWord;
        int int17 = journalChannel10.getFormatVersion();
        java.nio.ByteBuffer byteBuffer18 = journalChannel10.zeros;
        int int19 = journalChannel2.read(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1622");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        int int11 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer12 = journalChannel2.zeros;
        long long13 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1623");
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
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        int int22 = journalChannel21.fd;
        java.nio.ByteBuffer byteBuffer23 = journalChannel21.zeros;
        int int24 = journalChannel16.read(byteBuffer23);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel16.configuration;
        java.nio.channels.FileChannel fileChannel26 = journalChannel16.fc;
        java.nio.ByteBuffer byteBuffer27 = journalChannel16.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel16.configuration;
        java.io.File file29 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file29, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel31.bc;
        journalChannel31.close();
        java.nio.ByteBuffer byteBuffer34 = journalChannel31.zeros;
        java.nio.ByteBuffer byteBuffer35 = journalChannel31.zeros;
        int int36 = journalChannel16.read(byteBuffer35);
        int int37 = journalChannel2.read(byteBuffer35);
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 2);
        int int41 = journalChannel40.fd;
        java.nio.ByteBuffer byteBuffer42 = journalChannel40.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel43 = journalChannel40.channel;
        journalChannel40.nextPrealloc = 'a';
        long long46 = journalChannel40.nextPrealloc;
        int int47 = journalChannel40.fd;
        java.io.File file48 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel50 = new org.apache.bookkeeper.bookie.JournalChannel(file48, (long) 2);
        journalChannel50.nextPrealloc = 10;
        byte[] byteArray53 = journalChannel50.magicWord;
        java.nio.ByteBuffer byteBuffer54 = journalChannel50.zeros;
        byte[] byteArray55 = journalChannel50.magicWord;
        java.io.File file56 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel58 = new org.apache.bookkeeper.bookie.JournalChannel(file56, (long) 2);
        int int59 = journalChannel58.fd;
        java.nio.ByteBuffer byteBuffer60 = journalChannel58.zeros;
        java.nio.channels.FileChannel fileChannel61 = journalChannel58.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = null;
        journalChannel58.bc = bufferedChannel62;
        java.io.File file64 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel66 = new org.apache.bookkeeper.bookie.JournalChannel(file64, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel67 = journalChannel66.channel;
        java.nio.ByteBuffer byteBuffer68 = journalChannel66.zeros;
        int int69 = journalChannel58.read(byteBuffer68);
        int int70 = journalChannel50.read(byteBuffer68);
        int int71 = journalChannel40.read(byteBuffer68);
        int int72 = journalChannel2.read(byteBuffer68);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertNotNull(fileChannel26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(serverConfiguration28);
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(bookieFileChannel43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 97L + "'", long46 == 97L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(fileChannel61);
        org.junit.Assert.assertNotNull(bookieFileChannel67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1624");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        int int16 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel17);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1625");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        journalChannel2.close();
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
// flaky "5) test1625(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1626");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = null;
        journalChannel2.bc = bufferedChannel34;
        int int36 = journalChannel2.fd;
        int int37 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = null;
        journalChannel2.bc = bufferedChannel38;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1627");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1628");
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
        java.nio.ByteBuffer byteBuffer19 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        byte[] byteArray21 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1629");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        journalChannel10.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel10.bc = bufferedChannel12;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, (long) (short) 100, (int) (short) 1, 0, true, 3, bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1630");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 3;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1631");
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
        java.nio.ByteBuffer byteBuffer27 = journalChannel2.zeros;
        int int28 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1632");
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
        long long15 = journalChannel2.nextPrealloc;
        byte[] byteArray16 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1633");
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
        int int14 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        byte[] byteArray16 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 1;
        java.nio.channels.FileChannel fileChannel19 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel19);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1634");
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
        java.nio.channels.FileChannel fileChannel16 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel6.bc = bufferedChannel17;
        int int19 = journalChannel6.getFormatVersion();
        byte[] byteArray20 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel6.bc;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 8, (int) (short) 0, serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1635");
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
        byte[] byteArray17 = journalChannel7.magicWord;
        long long18 = journalChannel7.nextPrealloc;
        int int19 = journalChannel7.getFormatVersion();
        java.nio.channels.FileChannel fileChannel20 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) 10, (int) (short) -1, (long) (short) -1, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1636");
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
        int int16 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(bufferedChannel17);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1637");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.close();
        int int8 = journalChannel2.getFormatVersion();
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1638");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        journalChannel2.nextPrealloc = 100L;
        byte[] byteArray19 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel2.channel;
        int int21 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1639");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1640");
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
        java.nio.ByteBuffer byteBuffer12 = journalChannel2.zeros;
        int int13 = journalChannel2.formatVersion;
        byte[] byteArray14 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1641");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = '4';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1642");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel9.channel;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 4, (int) (byte) 10, (int) (byte) 10, true, (int) (short) 100, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1643");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) -1);
        journalChannel10.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 6;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, (long) 3, (int) '4', (int) 'a', true, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1644");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel11.configuration;
        int int13 = journalChannel11.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel11.zeros;
        int int15 = journalChannel7.read(byteBuffer14);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel7.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel19.bc;
        byte[] byteArray21 = journalChannel19.magicWord;
        journalChannel19.nextPrealloc = (byte) -1;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, 0L);
        long long27 = journalChannel26.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = null;
        journalChannel26.bc = bufferedChannel28;
        long long30 = journalChannel26.nextPrealloc;
        java.nio.ByteBuffer byteBuffer31 = journalChannel26.zeros;
        int int32 = journalChannel19.read(byteBuffer31);
        int int33 = journalChannel7.read(byteBuffer31);
        int int34 = journalChannel2.read(byteBuffer31);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1645");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel2.configuration;
        byte[] byteArray20 = journalChannel2.magicWord;
        int int21 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1646");
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
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1647");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) (short) 100, 0, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1648");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1649");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        journalChannel10.nextPrealloc = (byte) 1;
        int int15 = journalChannel10.fd;
        byte[] byteArray16 = journalChannel10.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (short) 10, 3, (int) (byte) 100, false, 0, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1650");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1651");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = 0;
        int int7 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel8);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1652");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        long long10 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 3L, 6, (long) (short) 10, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1653");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        long long17 = journalChannel2.nextPrealloc;
        int int18 = journalChannel2.fd;
        int int19 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel20 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fileChannel20);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1654");
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
        journalChannel2.nextPrealloc = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1655");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        journalChannel2.nextPrealloc = (-1L);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1656");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        journalChannel9.nextPrealloc = (byte) 1;
        long long14 = journalChannel9.nextPrealloc;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel17.channel;
        journalChannel17.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel17.channel;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        journalChannel26.nextPrealloc = 10;
        journalChannel26.nextPrealloc = 0L;
        int int31 = journalChannel26.formatVersion;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = journalChannel34.bc;
        journalChannel34.close();
        java.nio.ByteBuffer byteBuffer37 = journalChannel34.zeros;
        int int38 = journalChannel26.read(byteBuffer37);
        int int39 = journalChannel17.read(byteBuffer37);
        int int40 = journalChannel9.read(byteBuffer37);
        java.nio.channels.FileChannel fileChannel41 = journalChannel9.fc;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration43 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel45 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (byte) 0, 0, (int) (short) 1, true, 8, serverConfiguration43, fileChannelProvider44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(bookieFileChannel23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(fileChannel41);
        org.junit.Assert.assertNotNull(serverConfiguration43);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1657");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, 100L, 8, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1658");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        byte[] byteArray9 = journalChannel2.magicWord;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel12.configuration;
        int int22 = journalChannel12.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel12.bc;
        java.nio.ByteBuffer byteBuffer24 = journalChannel12.zeros;
        int int25 = journalChannel2.read(byteBuffer24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNull(bufferedChannel27);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1659");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        long long18 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1660");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        journalChannel2.nextPrealloc = ' ';
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1661");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        long long7 = journalChannel2.nextPrealloc;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1662");
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
        long long13 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        int int15 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        int int17 = journalChannel2.fd;
        long long18 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1663");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1664");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', 0L, (int) (short) 1, serverConfiguration21, fileChannelProvider22);
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
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1665");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        journalChannel2.close();
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1666");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1667");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        journalChannel21.nextPrealloc = 10;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        int int27 = journalChannel26.fd;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        int int29 = journalChannel21.read(byteBuffer28);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel21.configuration;
        java.nio.channels.FileChannel fileChannel31 = journalChannel21.fc;
        java.nio.channels.FileChannel fileChannel32 = journalChannel21.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = journalChannel21.configuration;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        journalChannel36.nextPrealloc = 10;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        int int42 = journalChannel41.fd;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        int int44 = journalChannel36.read(byteBuffer43);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration45 = journalChannel36.configuration;
        java.nio.channels.FileChannel fileChannel46 = journalChannel36.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = null;
        journalChannel36.bc = bufferedChannel47;
        int int49 = journalChannel36.getFormatVersion();
        byte[] byteArray50 = journalChannel36.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = journalChannel36.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration52 = journalChannel36.configuration;
        long long53 = journalChannel36.nextPrealloc;
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        journalChannel56.nextPrealloc = 10;
        journalChannel56.nextPrealloc = 0L;
        java.io.File file61 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel63 = new org.apache.bookkeeper.bookie.JournalChannel(file61, (long) 2);
        journalChannel63.nextPrealloc = 10;
        byte[] byteArray66 = journalChannel63.magicWord;
        java.nio.ByteBuffer byteBuffer67 = journalChannel63.zeros;
        int int68 = journalChannel56.read(byteBuffer67);
        int int69 = journalChannel36.read(byteBuffer67);
        int int70 = journalChannel21.read(byteBuffer67);
        int int71 = journalChannel2.read(byteBuffer67);
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertNotNull(fileChannel31);
        org.junit.Assert.assertNotNull(fileChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration45);
        org.junit.Assert.assertNotNull(fileChannel46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(serverConfiguration52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1668");
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
        int int11 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1669");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1670");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        long long6 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel33 = journalChannel10.channel;
        java.nio.ByteBuffer byteBuffer34 = journalChannel10.zeros;
        int int35 = journalChannel2.read(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1671");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
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
        int int34 = journalChannel2.read(byteBuffer33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1672");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 1048576L;
        int int10 = journalChannel6.formatVersion;
        java.nio.ByteBuffer byteBuffer11 = journalChannel6.zeros;
        int int12 = journalChannel2.read(byteBuffer11);
        int int13 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1673");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1674");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 97L, 10, 0L, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1675");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1676");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 512;
        journalChannel2.nextPrealloc = 3L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(bufferedChannel13);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1677");
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
        journalChannel2.nextPrealloc = 100L;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
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
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1678");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1679");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1680");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        java.nio.channels.FileChannel fileChannel13 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 1048576L, (int) (byte) 1, 2, false, (int) (byte) 0, bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1681");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.ByteBuffer byteBuffer34 = journalChannel2.zeros;
        int int35 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel36 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = null;
        journalChannel2.bc = bufferedChannel37;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fileChannel36);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1682");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        java.nio.channels.FileChannel fileChannel20 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel10.bc = bufferedChannel21;
        int int23 = journalChannel10.getFormatVersion();
        java.nio.channels.FileChannel fileChannel24 = journalChannel10.fc;
        java.nio.channels.FileChannel fileChannel25 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, 1L, (int) (byte) 100, (int) (byte) 100, false, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration28, fileChannelProvider29, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1683");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1684");
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
        java.nio.channels.FileChannel fileChannel16 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel6.bc = bufferedChannel17;
        int int19 = journalChannel6.getFormatVersion();
        byte[] byteArray20 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel6.bc;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) 4, 2, serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1685");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        journalChannel2.nextPrealloc = '4';
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.nextPrealloc = (-1L);
        int int12 = journalChannel2.fd;
        long long13 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1686");
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
        java.nio.channels.FileChannel fileChannel20 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(fileChannel20);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1687");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 10;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        byte[] byteArray11 = journalChannel2.magicWord;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1688");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1689");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 0L;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNull(bufferedChannel13);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1690");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        int int9 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 1L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1691");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        journalChannel2.nextPrealloc = '4';
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.nextPrealloc = (-1L);
        int int12 = journalChannel2.fd;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1692");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1693");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 3;
        journalChannel2.nextPrealloc = 4;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1694");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        int int11 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1695");
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
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1696");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        int int4 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1697");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        int int5 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1698");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        int int6 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1699");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
        int int15 = journalChannel10.getFormatVersion();
        int int16 = journalChannel10.fd;
        long long17 = journalChannel10.nextPrealloc;
        int int18 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, 0L, (int) (short) 10, (int) (byte) 10, true, 10, bufferedChannelBuilder7, serverConfiguration19, fileChannelProvider20, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1700");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        journalChannel2.nextPrealloc = '4';
        journalChannel2.nextPrealloc = 4;
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1701");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, 1048576L, (int) (short) 100, (int) (short) 0, false, 0, bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1702");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        int int16 = journalChannel2.fd;
        int int17 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1703");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.formatVersion;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1704");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        byte[] byteArray9 = journalChannel2.magicWord;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel12.configuration;
        int int22 = journalChannel12.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel12.bc;
        java.nio.ByteBuffer byteBuffer24 = journalChannel12.zeros;
        int int25 = journalChannel2.read(byteBuffer24);
        int int26 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer27 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1705");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        int int21 = journalChannel7.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 1L, 4, 0L, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1706");
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
        java.nio.ByteBuffer byteBuffer19 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass20 = byteBuffer19.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1707");
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
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        int int21 = journalChannel20.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel20.bc;
        journalChannel20.nextPrealloc = 3;
        int int25 = journalChannel20.getFormatVersion();
        byte[] byteArray26 = journalChannel20.magicWord;
        int int27 = journalChannel20.getFormatVersion();
        int int28 = journalChannel20.getFormatVersion();
        java.nio.ByteBuffer byteBuffer29 = journalChannel20.zeros;
        int int30 = journalChannel2.read(byteBuffer29);
        int int31 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1708");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        byte[] byteArray4 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1709");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 100;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1710");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        int int19 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(2L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1711");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        int int20 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel21);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1712");
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
        int int17 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel7.configuration;
        long long19 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel7.bc = bufferedChannel20;
        journalChannel7.nextPrealloc = 1;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 'a', (int) '#', (long) (short) -1, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1713");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1714");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, 0L);
        long long10 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel9.bc = bufferedChannel11;
        long long13 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) '4', (int) ' ', (int) (short) 100, false, 8, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1715");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        byte[] byteArray8 = journalChannel2.magicWord;
        journalChannel2.close();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1716");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1717");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        int int4 = journalChannel2.formatVersion;
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
        int int18 = journalChannel7.formatVersion;
        journalChannel7.nextPrealloc = (byte) 1;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 3);
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        journalChannel26.nextPrealloc = 10;
        journalChannel26.nextPrealloc = 0L;
        int int31 = journalChannel26.formatVersion;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = journalChannel34.bc;
        journalChannel34.close();
        java.nio.ByteBuffer byteBuffer37 = journalChannel34.zeros;
        int int38 = journalChannel26.read(byteBuffer37);
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel42 = journalChannel41.channel;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        int int44 = journalChannel26.read(byteBuffer43);
        int int45 = journalChannel23.read(byteBuffer43);
        java.nio.ByteBuffer byteBuffer46 = journalChannel23.zeros;
        int int47 = journalChannel7.read(byteBuffer46);
        int int48 = journalChannel2.read(byteBuffer46);
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteBuffer46);
// flaky "6) test1717(org.apache.bookkeeper.bookie.JournalChannelTest3)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1718");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass15 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1719");
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
        byte[] byteArray19 = journalChannel9.magicWord;
        long long20 = journalChannel9.nextPrealloc;
        int int21 = journalChannel9.getFormatVersion();
        java.nio.channels.FileChannel fileChannel22 = journalChannel9.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, 10L, (int) (byte) -1, 4, false, (int) '4', serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1720");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        int int16 = journalChannel2.fd;
        int int17 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1721");
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
        int int29 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer30 = journalChannel2.zeros;
        int int31 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1722");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        journalChannel21.nextPrealloc = 10;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        int int27 = journalChannel26.fd;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        int int29 = journalChannel21.read(byteBuffer28);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel21.configuration;
        java.nio.channels.FileChannel fileChannel31 = journalChannel21.fc;
        java.nio.channels.FileChannel fileChannel32 = journalChannel21.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = journalChannel21.configuration;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        journalChannel36.nextPrealloc = 10;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        int int42 = journalChannel41.fd;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        int int44 = journalChannel36.read(byteBuffer43);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration45 = journalChannel36.configuration;
        java.nio.channels.FileChannel fileChannel46 = journalChannel36.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = null;
        journalChannel36.bc = bufferedChannel47;
        int int49 = journalChannel36.getFormatVersion();
        byte[] byteArray50 = journalChannel36.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = journalChannel36.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration52 = journalChannel36.configuration;
        long long53 = journalChannel36.nextPrealloc;
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        journalChannel56.nextPrealloc = 10;
        journalChannel56.nextPrealloc = 0L;
        java.io.File file61 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel63 = new org.apache.bookkeeper.bookie.JournalChannel(file61, (long) 2);
        journalChannel63.nextPrealloc = 10;
        byte[] byteArray66 = journalChannel63.magicWord;
        java.nio.ByteBuffer byteBuffer67 = journalChannel63.zeros;
        int int68 = journalChannel56.read(byteBuffer67);
        int int69 = journalChannel36.read(byteBuffer67);
        int int70 = journalChannel21.read(byteBuffer67);
        int int71 = journalChannel2.read(byteBuffer67);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel72 = journalChannel2.channel;
        long long73 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertNotNull(fileChannel31);
        org.junit.Assert.assertNotNull(fileChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration45);
        org.junit.Assert.assertNotNull(fileChannel46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(serverConfiguration52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1723");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.close();
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNull(bufferedChannel11);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1724");
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
        byte[] byteArray18 = journalChannel2.magicWord;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNull(bufferedChannel21);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1725");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.fd;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1726");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 512;
        journalChannel2.nextPrealloc = 3L;
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1727");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        long long3 = journalChannel2.nextPrealloc;
        long long4 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = '#';
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1728");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, 0L);
        journalChannel6.nextPrealloc = 0L;
        long long9 = journalChannel6.nextPrealloc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel6.fc;
        int int11 = journalChannel6.formatVersion;
        int int12 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 2L, (long) (short) 10, (int) (byte) 100, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1729");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        int int12 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 2L, 1, (int) (short) 1, true, (int) (short) 0, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1730");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = 0L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1731");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        int int20 = journalChannel2.fd;
        long long21 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass22 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1732");
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
        int int13 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = ' ';
        long long16 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1733");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        int int5 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1734");
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
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fileChannel17);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1735");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        byte[] byteArray3 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1736");
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
        int int15 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 4L;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1737");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1738");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel9.bc;
        byte[] byteArray11 = journalChannel9.magicWord;
        journalChannel9.nextPrealloc = (byte) -1;
        journalChannel9.nextPrealloc = (short) 100;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        journalChannel18.nextPrealloc = 10;
        byte[] byteArray21 = journalChannel18.magicWord;
        java.nio.ByteBuffer byteBuffer22 = journalChannel18.zeros;
        java.nio.channels.FileChannel fileChannel23 = journalChannel18.fc;
        int int24 = journalChannel18.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel18.bc;
        java.nio.ByteBuffer byteBuffer26 = journalChannel18.zeros;
        int int27 = journalChannel9.read(byteBuffer26);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) 5, 2, 1, true, (int) (short) 0, serverConfiguration28, fileChannelProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1739");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        int int12 = journalChannel9.getFormatVersion();
        java.nio.ByteBuffer byteBuffer13 = journalChannel9.zeros;
        int int14 = journalChannel9.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) (byte) -1, 5, (int) ' ', true, 0, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1740");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) (byte) 0, 3, 8, true, 10, serverConfiguration23, fileChannelProvider24);
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
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1741");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        int int5 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1742");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        int int7 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1743");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        int int3 = journalChannel2.fd;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.fd;
        java.nio.ByteBuffer byteBuffer13 = journalChannel11.zeros;
        int int14 = journalChannel6.read(byteBuffer13);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        java.nio.channels.FileChannel fileChannel16 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel6.bc = bufferedChannel17;
        int int19 = journalChannel6.getFormatVersion();
        byte[] byteArray20 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel6.bc;
        java.nio.ByteBuffer byteBuffer24 = journalChannel6.zeros;
        int int25 = journalChannel2.read(byteBuffer24);
        long long26 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1744");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = 0;
        int int7 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1745");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        long long10 = journalChannel2.nextPrealloc;
        byte[] byteArray11 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 4;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1746");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel6.bc = bufferedChannel18;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (byte) -1, (int) (byte) 10, serverConfiguration20, fileChannelProvider21);
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
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1747");
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
        journalChannel2.nextPrealloc = 100L;
        long long22 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 6;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(bookieFileChannel23);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1748");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) 8, 5, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1749");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        byte[] byteArray7 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1750");
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
        int int18 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel19 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fileChannel19);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1751");
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
        java.nio.channels.FileChannel fileChannel19 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel9.bc = bufferedChannel20;
        journalChannel9.nextPrealloc = 0L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 4L, (int) (byte) -1, (int) ' ', false, 100, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1752");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        java.nio.channels.FileChannel fileChannel9 = journalChannel6.fc;
        int int10 = journalChannel6.getFormatVersion();
        int int11 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel6.bc;
        int int13 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, 10L, 4, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(fileChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1753");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, 0L);
        long long10 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel9.bc = bufferedChannel11;
        long long13 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) (short) 100, (int) '#', (int) (short) 1, false, 6, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1754");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1755");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        byte[] byteArray9 = journalChannel6.magicWord;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) (byte) -1);
        byte[] byteArray13 = journalChannel12.magicWord;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        int int15 = journalChannel6.read(byteBuffer14);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, (long) (byte) 10, 100, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1756");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        long long17 = journalChannel2.nextPrealloc;
        int int18 = journalChannel2.fd;
        int int19 = journalChannel2.fd;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1757");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        int int6 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1758");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        int int20 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        java.lang.Class<?> wildcardClass22 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1759");
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
        int int18 = journalChannel7.formatVersion;
        journalChannel7.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel7.bc = bufferedChannel21;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel7.bc = bufferedChannel23;
        int int25 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) (byte) 0, 4, (long) (short) 100, serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1760");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1761");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        byte[] byteArray7 = journalChannel2.magicWord;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        java.nio.channels.FileChannel fileChannel13 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel10.bc = bufferedChannel14;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel18.channel;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        int int21 = journalChannel10.read(byteBuffer20);
        int int22 = journalChannel2.read(byteBuffer20);
        long long23 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1762");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
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
        java.nio.channels.FileChannel fileChannel23 = journalChannel12.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel12.configuration;
        java.nio.ByteBuffer byteBuffer25 = journalChannel12.zeros;
        int int26 = journalChannel2.read(byteBuffer25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = null;
        journalChannel2.bc = bufferedChannel27;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1763");
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
        int int14 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel15 = journalChannel2.fc;
        int int16 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        int int19 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1764");
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
        java.nio.ByteBuffer byteBuffer17 = journalChannel2.zeros;
        journalChannel2.close();
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
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1765");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        int int8 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1766");
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
        java.nio.ByteBuffer byteBuffer27 = journalChannel2.zeros;
        java.io.File file28 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file28, (long) 3);
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        journalChannel33.nextPrealloc = 10;
        journalChannel33.nextPrealloc = 0L;
        int int38 = journalChannel33.formatVersion;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = journalChannel41.bc;
        journalChannel41.close();
        java.nio.ByteBuffer byteBuffer44 = journalChannel41.zeros;
        int int45 = journalChannel33.read(byteBuffer44);
        java.io.File file46 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel48 = new org.apache.bookkeeper.bookie.JournalChannel(file46, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel49 = journalChannel48.channel;
        java.nio.ByteBuffer byteBuffer50 = journalChannel48.zeros;
        int int51 = journalChannel33.read(byteBuffer50);
        int int52 = journalChannel30.read(byteBuffer50);
        int int53 = journalChannel2.read(byteBuffer50);
        int int54 = journalChannel2.formatVersion;
        java.io.File file55 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel57 = new org.apache.bookkeeper.bookie.JournalChannel(file55, (long) 2);
        int int58 = journalChannel57.fd;
        java.nio.ByteBuffer byteBuffer59 = journalChannel57.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel60 = journalChannel57.channel;
        journalChannel57.nextPrealloc = 'a';
        long long63 = journalChannel57.nextPrealloc;
        int int64 = journalChannel57.fd;
        int int65 = journalChannel57.getFormatVersion();
        int int66 = journalChannel57.formatVersion;
        java.nio.ByteBuffer byteBuffer67 = journalChannel57.zeros;
        int int68 = journalChannel2.read(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(bookieFileChannel60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 97L + "'", long63 == 97L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 5 + "'", int65 == 5);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1767");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1768");
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
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1769");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1770");
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
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        journalChannel17.nextPrealloc = 10;
        java.io.File file20 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file20, (long) 2);
        int int23 = journalChannel22.fd;
        java.nio.ByteBuffer byteBuffer24 = journalChannel22.zeros;
        int int25 = journalChannel17.read(byteBuffer24);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel17.configuration;
        java.nio.channels.FileChannel fileChannel27 = journalChannel17.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = null;
        journalChannel17.bc = bufferedChannel28;
        int int30 = journalChannel17.getFormatVersion();
        byte[] byteArray31 = journalChannel17.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel17.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = journalChannel17.configuration;
        long long34 = journalChannel17.nextPrealloc;
        java.io.File file35 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel37 = new org.apache.bookkeeper.bookie.JournalChannel(file35, (long) 2);
        journalChannel37.nextPrealloc = 10;
        journalChannel37.nextPrealloc = 0L;
        java.io.File file42 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel44 = new org.apache.bookkeeper.bookie.JournalChannel(file42, (long) 2);
        journalChannel44.nextPrealloc = 10;
        byte[] byteArray47 = journalChannel44.magicWord;
        java.nio.ByteBuffer byteBuffer48 = journalChannel44.zeros;
        int int49 = journalChannel37.read(byteBuffer48);
        int int50 = journalChannel17.read(byteBuffer48);
        int int51 = journalChannel2.read(byteBuffer48);
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
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration26);
        org.junit.Assert.assertNotNull(fileChannel27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1771");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 512;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1772");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 6L, (int) (short) -1, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1773");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1774");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1775");
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
        java.nio.channels.FileChannel fileChannel16 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel6.bc = bufferedChannel17;
        int int19 = journalChannel6.getFormatVersion();
        java.nio.channels.FileChannel fileChannel20 = journalChannel6.fc;
        java.nio.channels.FileChannel fileChannel21 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) (-1), (int) (short) 10, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1776");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass15 = fileChannel14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1777");
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
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass15 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1778");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1779");
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
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1780");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        int int3 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        int int5 = journalChannel2.getFormatVersion();
        byte[] byteArray6 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1781");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) (byte) 1, (int) (byte) 1, (long) (byte) 100, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1782");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel7.bc = bufferedChannel17;
        int int19 = journalChannel7.formatVersion;
        int int20 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a', (long) 8, 3, 32L, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1783");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 3, (int) (short) 100, (int) (byte) 0, false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration12, fileChannelProvider13, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1784");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) (byte) 100, 0, (int) (byte) 0, false, 5, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1785");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1786");
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
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel19.configuration;
        int int21 = journalChannel19.formatVersion;
        java.nio.ByteBuffer byteBuffer22 = journalChannel19.zeros;
        int int23 = journalChannel2.read(byteBuffer22);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel24);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1787");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        int int20 = journalChannel2.formatVersion;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 3);
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        journalChannel26.nextPrealloc = 10;
        journalChannel26.nextPrealloc = 0L;
        int int31 = journalChannel26.formatVersion;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = journalChannel34.bc;
        journalChannel34.close();
        java.nio.ByteBuffer byteBuffer37 = journalChannel34.zeros;
        int int38 = journalChannel26.read(byteBuffer37);
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel42 = journalChannel41.channel;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        int int44 = journalChannel26.read(byteBuffer43);
        int int45 = journalChannel23.read(byteBuffer43);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = null;
        journalChannel23.bc = bufferedChannel46;
        java.nio.ByteBuffer byteBuffer48 = journalChannel23.zeros;
        int int49 = journalChannel2.read(byteBuffer48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1788");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        journalChannel21.nextPrealloc = 10;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        int int27 = journalChannel26.fd;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        int int29 = journalChannel21.read(byteBuffer28);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel21.configuration;
        java.nio.channels.FileChannel fileChannel31 = journalChannel21.fc;
        java.nio.channels.FileChannel fileChannel32 = journalChannel21.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration33 = journalChannel21.configuration;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        journalChannel36.nextPrealloc = 10;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        int int42 = journalChannel41.fd;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        int int44 = journalChannel36.read(byteBuffer43);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration45 = journalChannel36.configuration;
        java.nio.channels.FileChannel fileChannel46 = journalChannel36.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = null;
        journalChannel36.bc = bufferedChannel47;
        int int49 = journalChannel36.getFormatVersion();
        byte[] byteArray50 = journalChannel36.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = journalChannel36.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration52 = journalChannel36.configuration;
        long long53 = journalChannel36.nextPrealloc;
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        journalChannel56.nextPrealloc = 10;
        journalChannel56.nextPrealloc = 0L;
        java.io.File file61 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel63 = new org.apache.bookkeeper.bookie.JournalChannel(file61, (long) 2);
        journalChannel63.nextPrealloc = 10;
        byte[] byteArray66 = journalChannel63.magicWord;
        java.nio.ByteBuffer byteBuffer67 = journalChannel63.zeros;
        int int68 = journalChannel56.read(byteBuffer67);
        int int69 = journalChannel36.read(byteBuffer67);
        int int70 = journalChannel21.read(byteBuffer67);
        int int71 = journalChannel2.read(byteBuffer67);
        journalChannel2.close();
        int int73 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel74 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertNotNull(fileChannel31);
        org.junit.Assert.assertNotNull(fileChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration45);
        org.junit.Assert.assertNotNull(fileChannel46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(serverConfiguration52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel74);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1789");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel12.read(byteBuffer19);
        int int21 = journalChannel7.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) (-1), 0, 10L, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1790");
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
        int int14 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer17 = journalChannel2.zeros;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel19 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(fileChannel19);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1791");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        journalChannel2.close();
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1792");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        long long6 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1793");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        journalChannel7.nextPrealloc = 0L;
        long long12 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 5, (int) 'a', 32L, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1794");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel10.bc = bufferedChannel20;
        int int22 = journalChannel10.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 'a', 100, (int) (short) 0, false, 8, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1795");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) 2, (int) '#', serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1796");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        int int3 = journalChannel2.formatVersion;
        int int4 = journalChannel2.formatVersion;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel7.channel;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        journalChannel16.nextPrealloc = 0L;
        int int21 = journalChannel16.formatVersion;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel24.bc;
        journalChannel24.close();
        java.nio.ByteBuffer byteBuffer27 = journalChannel24.zeros;
        int int28 = journalChannel16.read(byteBuffer27);
        int int29 = journalChannel7.read(byteBuffer27);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = null;
        journalChannel7.bc = bufferedChannel30;
        java.nio.ByteBuffer byteBuffer32 = journalChannel7.zeros;
        int int33 = journalChannel2.read(byteBuffer32);
        int int34 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1797");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        int int12 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        int int14 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1798");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1799");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1800");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
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
        int int34 = journalChannel2.read(byteBuffer33);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = null;
        journalChannel2.bc = bufferedChannel35;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1801");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1802");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        int int8 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 0L;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1803");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        long long16 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1804");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) (byte) 1, (-1), serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel7);
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
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1805");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1806");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        journalChannel10.close();
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1807");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel9.bc;
        journalChannel9.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 10L, (int) (byte) 100, (int) (short) -1, true, 0, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1808");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        journalChannel9.nextPrealloc = 0L;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        byte[] byteArray19 = journalChannel16.magicWord;
        java.nio.ByteBuffer byteBuffer20 = journalChannel16.zeros;
        int int21 = journalChannel9.read(byteBuffer20);
        byte[] byteArray22 = journalChannel9.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, 0L, (int) 'a', 5, false, (int) (byte) -1, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1809");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        int int11 = journalChannel2.getFormatVersion();
        int int12 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass13 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1810");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.fd;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        int int10 = journalChannel7.getFormatVersion();
        java.nio.ByteBuffer byteBuffer11 = journalChannel7.zeros;
        int int12 = journalChannel7.fd;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        journalChannel15.nextPrealloc = 10;
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        int int21 = journalChannel20.fd;
        java.nio.ByteBuffer byteBuffer22 = journalChannel20.zeros;
        int int23 = journalChannel15.read(byteBuffer22);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel15.configuration;
        java.nio.channels.FileChannel fileChannel25 = journalChannel15.fc;
        java.nio.ByteBuffer byteBuffer26 = journalChannel15.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel15.configuration;
        java.io.File file28 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file28, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = journalChannel30.bc;
        journalChannel30.close();
        java.nio.ByteBuffer byteBuffer33 = journalChannel30.zeros;
        java.nio.ByteBuffer byteBuffer34 = journalChannel30.zeros;
        int int35 = journalChannel15.read(byteBuffer34);
        int int36 = journalChannel7.read(byteBuffer34);
        int int37 = journalChannel2.read(byteBuffer34);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1811");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer19 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
        int int22 = journalChannel2.fd;
        int int23 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1812");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        int int11 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel9.bc = bufferedChannel12;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, (long) (short) -1, (int) (short) 10, 0, true, (int) 'a', serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1813");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 6;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1814");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1815");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        int int12 = journalChannel10.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel10.bc = bufferedChannel13;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) 'a', (int) '#', 5, false, (int) '4', bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1816");
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
        journalChannel2.nextPrealloc = (byte) 1;
        journalChannel2.nextPrealloc = (byte) 0;
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
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1817");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1818");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1819");
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
        java.nio.ByteBuffer byteBuffer27 = journalChannel2.zeros;
        java.io.File file28 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file28, (long) 3);
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        journalChannel33.nextPrealloc = 10;
        journalChannel33.nextPrealloc = 0L;
        int int38 = journalChannel33.formatVersion;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = journalChannel41.bc;
        journalChannel41.close();
        java.nio.ByteBuffer byteBuffer44 = journalChannel41.zeros;
        int int45 = journalChannel33.read(byteBuffer44);
        java.io.File file46 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel48 = new org.apache.bookkeeper.bookie.JournalChannel(file46, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel49 = journalChannel48.channel;
        java.nio.ByteBuffer byteBuffer50 = journalChannel48.zeros;
        int int51 = journalChannel33.read(byteBuffer50);
        int int52 = journalChannel30.read(byteBuffer50);
        int int53 = journalChannel2.read(byteBuffer50);
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        journalChannel56.nextPrealloc = 10;
        journalChannel56.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel61 = journalChannel56.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = null;
        journalChannel56.bc = bufferedChannel62;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = null;
        journalChannel56.bc = bufferedChannel64;
        int int66 = journalChannel56.formatVersion;
        java.nio.ByteBuffer byteBuffer67 = journalChannel56.zeros;
        int int68 = journalChannel2.read(byteBuffer67);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel69 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration70 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel69);
        org.junit.Assert.assertNotNull(serverConfiguration70);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1820");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        byte[] byteArray15 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1821");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        journalChannel2.nextPrealloc = '#';
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1822");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1823");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1824");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        journalChannel10.close();
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel17.channel;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        journalChannel2.close();
        int int23 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1825");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) '4', 3, (long) (-1), serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1826");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        journalChannel10.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, (long) (short) 10, (int) ' ', 100, false, 0, bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1827");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, 10L, (int) '#', serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1828");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.channels.FileChannel fileChannel34 = journalChannel2.fc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration36 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 6;
        int int39 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = journalChannel2.read(byteBuffer40);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertNotNull(serverConfiguration36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1829");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        byte[] byteArray12 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel9.bc = bufferedChannel13;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel9.channel;
        java.nio.ByteBuffer byteBuffer16 = journalChannel9.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', 1048576L, 10, 5, true, 4, serverConfiguration17, fileChannelProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1830");
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
        byte[] byteArray18 = journalChannel2.magicWord;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1831");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        int int3 = journalChannel2.getFormatVersion();
        byte[] byteArray4 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1832");
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
        int int13 = journalChannel2.fd;
        int int14 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1833");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        byte[] byteArray7 = journalChannel2.magicWord;
        int int8 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1834");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        long long8 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = 0L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1835");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1836");
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
        int int19 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1837");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        byte[] byteArray13 = journalChannel10.magicWord;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) (byte) -1);
        byte[] byteArray17 = journalChannel16.magicWord;
        java.nio.ByteBuffer byteBuffer18 = journalChannel16.zeros;
        int int19 = journalChannel10.read(byteBuffer18);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, (long) (byte) 1, 5, 3, true, (int) (short) 100, bufferedChannelBuilder7, serverConfiguration20, fileChannelProvider21, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1838");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        byte[] byteArray7 = journalChannel2.magicWord;
        int int8 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1839");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1840");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        long long13 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1841");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 5, (int) (short) 10, (int) (short) 0, false, 6, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1842");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        int int10 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1843");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, 6L, (int) 'a', 2, false, (int) (byte) -1, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1844");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = '#';
        long long6 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1845");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        int int11 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel9.bc = bufferedChannel12;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) 4, 8, 0, true, (int) 'a', serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1846");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1847");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 3, (int) (short) 100, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1848");
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
        java.nio.ByteBuffer byteBuffer27 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel28 = journalChannel2.fc;
        journalChannel2.close();
        long long30 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(fileChannel28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1849");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.nextPrealloc = (short) 100;
        journalChannel2.nextPrealloc = 97L;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) (short) -1);
        java.nio.ByteBuffer byteBuffer12 = journalChannel11.zeros;
        int int13 = journalChannel2.read(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1850");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
        byte[] byteArray15 = journalChannel10.magicWord;
        long long16 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel10.bc;
        java.nio.channels.FileChannel fileChannel18 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 2, (int) (byte) -1, 5, true, 0, bufferedChannelBuilder7, serverConfiguration19, fileChannelProvider20, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1851");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 1;
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1852");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) -1);
        journalChannel10.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 6;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 6, (int) (byte) 0, (-1), false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1853");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        int int11 = journalChannel9.fd;
        int int12 = journalChannel9.getFormatVersion();
        journalChannel9.nextPrealloc = 3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', 100L, (int) (short) 10, 4, true, 1, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1854");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1855");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        java.nio.channels.FileChannel fileChannel20 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel10.bc = bufferedChannel21;
        int int23 = journalChannel10.getFormatVersion();
        java.nio.channels.FileChannel fileChannel24 = journalChannel10.fc;
        java.nio.channels.FileChannel fileChannel25 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) (short) 1, (int) (short) 10, 0, true, 0, bufferedChannelBuilder7, serverConfiguration28, fileChannelProvider29, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1856");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 100;
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1857");
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
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, 4L, (int) (short) 0, 97L, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1858");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        java.nio.channels.FileChannel fileChannel34 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 0L;
        int int37 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel38 = journalChannel2.fc;
        int int39 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1859");
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
        journalChannel2.nextPrealloc = (-1);
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        int int25 = journalChannel24.fd;
        java.nio.ByteBuffer byteBuffer26 = journalChannel24.zeros;
        int int27 = journalChannel19.read(byteBuffer26);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel19.configuration;
        java.nio.channels.FileChannel fileChannel29 = journalChannel19.fc;
        int int30 = journalChannel19.formatVersion;
        journalChannel19.nextPrealloc = (byte) 1;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 3);
        java.io.File file36 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel38 = new org.apache.bookkeeper.bookie.JournalChannel(file36, (long) 2);
        journalChannel38.nextPrealloc = 10;
        journalChannel38.nextPrealloc = 0L;
        int int43 = journalChannel38.formatVersion;
        java.io.File file44 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel46 = new org.apache.bookkeeper.bookie.JournalChannel(file44, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = journalChannel46.bc;
        journalChannel46.close();
        java.nio.ByteBuffer byteBuffer49 = journalChannel46.zeros;
        int int50 = journalChannel38.read(byteBuffer49);
        java.io.File file51 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel53 = new org.apache.bookkeeper.bookie.JournalChannel(file51, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel54 = journalChannel53.channel;
        java.nio.ByteBuffer byteBuffer55 = journalChannel53.zeros;
        int int56 = journalChannel38.read(byteBuffer55);
        int int57 = journalChannel35.read(byteBuffer55);
        java.nio.ByteBuffer byteBuffer58 = journalChannel35.zeros;
        int int59 = journalChannel19.read(byteBuffer58);
        int int60 = journalChannel2.read(byteBuffer58);
        int int61 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 6;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration28);
        org.junit.Assert.assertNotNull(fileChannel29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNull(bufferedChannel47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel54);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 512 + "'", int56 == 512);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(bufferedChannel64);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1860");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1861");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1862");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        journalChannel6.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.nextPrealloc = 6;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), (long) (short) 100, 512, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1863");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        journalChannel2.nextPrealloc = '4';
        int int8 = journalChannel2.fd;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        journalChannel11.nextPrealloc = 10;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        int int17 = journalChannel16.fd;
        java.nio.ByteBuffer byteBuffer18 = journalChannel16.zeros;
        int int19 = journalChannel11.read(byteBuffer18);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel11.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel11.configuration;
        java.nio.channels.FileChannel fileChannel22 = journalChannel11.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel11.bc;
        journalChannel11.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel11.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel26 = journalChannel11.channel;
        journalChannel11.close();
        java.nio.ByteBuffer byteBuffer28 = journalChannel11.zeros;
        int int29 = journalChannel2.read(byteBuffer28);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertNotNull(bookieFileChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1864");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        int int19 = journalChannel2.formatVersion;
        byte[] byteArray20 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(bookieFileChannel22);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1865");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel11.bc;
        byte[] byteArray13 = journalChannel11.magicWord;
        journalChannel11.nextPrealloc = (byte) -1;
        journalChannel11.nextPrealloc = (short) 100;
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        journalChannel20.nextPrealloc = 10;
        byte[] byteArray23 = journalChannel20.magicWord;
        java.nio.ByteBuffer byteBuffer24 = journalChannel20.zeros;
        java.nio.channels.FileChannel fileChannel25 = journalChannel20.fc;
        int int26 = journalChannel20.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel20.bc;
        java.nio.ByteBuffer byteBuffer28 = journalChannel20.zeros;
        int int29 = journalChannel11.read(byteBuffer28);
        int int30 = journalChannel2.read(byteBuffer28);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1866");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (short) 10);
        java.nio.channels.FileChannel fileChannel10 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel9.bc = bufferedChannel11;
        java.nio.ByteBuffer byteBuffer13 = journalChannel9.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1867");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        journalChannel7.close();
        java.nio.ByteBuffer byteBuffer10 = journalChannel7.zeros;
        byte[] byteArray11 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 0L, (int) 'a', 1048576L, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1868");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        int int7 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1869");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1870");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1871");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        byte[] byteArray10 = journalChannel2.magicWord;
        int int11 = journalChannel2.fd;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel14.bc;
        int int17 = journalChannel14.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel14.bc;
        long long19 = journalChannel14.nextPrealloc;
        java.nio.ByteBuffer byteBuffer20 = journalChannel14.zeros;
        int int21 = journalChannel2.read(byteBuffer20);
        int int22 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass23 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1872");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        journalChannel9.nextPrealloc = 0L;
        int int14 = journalChannel9.formatVersion;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel17.bc;
        journalChannel17.close();
        java.nio.ByteBuffer byteBuffer20 = journalChannel17.zeros;
        int int21 = journalChannel9.read(byteBuffer20);
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel25 = journalChannel24.channel;
        java.nio.ByteBuffer byteBuffer26 = journalChannel24.zeros;
        int int27 = journalChannel9.read(byteBuffer26);
        int int28 = journalChannel2.read(byteBuffer26);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel2.configuration;
        int int30 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = null;
        journalChannel2.bc = bufferedChannel31;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1873");
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
        int int13 = journalChannel2.formatVersion;
        int int14 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1874");
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
        long long15 = journalChannel2.nextPrealloc;
        byte[] byteArray16 = journalChannel2.magicWord;
        int int17 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1875");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        journalChannel2.nextPrealloc = 0;
        int int5 = journalChannel2.getFormatVersion();
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        java.nio.channels.FileChannel fileChannel10 = journalChannel8.fc;
        byte[] byteArray11 = journalChannel8.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel8.channel;
        java.nio.ByteBuffer byteBuffer13 = journalChannel8.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1876");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1877");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        journalChannel2.nextPrealloc = (-1L);
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.formatVersion;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1878");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        int int11 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1879");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.close();
        journalChannel2.close();
        journalChannel2.nextPrealloc = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1880");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNull(bufferedChannel19);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1881");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = ' ';
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1882");
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
        java.nio.channels.FileChannel fileChannel19 = journalChannel9.fc;
        int int20 = journalChannel9.formatVersion;
        journalChannel9.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel9.bc = bufferedChannel23;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = null;
        journalChannel9.bc = bufferedChannel25;
        int int27 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 2L, (long) '4', 3, 0, false, (int) (byte) 10, serverConfiguration28, fileChannelProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1883");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        int int16 = journalChannel2.fd;
        int int17 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(bufferedChannel18);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1884");
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
        java.nio.channels.FileChannel fileChannel16 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel6.bc = bufferedChannel17;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) '4', (int) (short) 0, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1885");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        int int9 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1886");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        byte[] byteArray8 = journalChannel7.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        journalChannel12.nextPrealloc = (byte) 1;
        long long17 = journalChannel12.nextPrealloc;
        java.nio.ByteBuffer byteBuffer18 = journalChannel12.zeros;
        int int19 = journalChannel7.read(byteBuffer18);
        long long20 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', 32L, (int) ' ', 100L, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1887");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        int int10 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1888");
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
        java.nio.channels.FileChannel fileChannel19 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel9.bc = bufferedChannel20;
        int int22 = journalChannel9.getFormatVersion();
        byte[] byteArray23 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel9.bc;
        journalChannel9.nextPrealloc = 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, 100L, 8, (int) (short) 10, false, (int) '4', serverConfiguration28, fileChannelProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1889");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        int int6 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1890");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1891");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        byte[] byteArray9 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel6.bc = bufferedChannel10;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel6.channel;
        java.nio.ByteBuffer byteBuffer13 = journalChannel6.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) (byte) 0, 10, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1892");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        int int3 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1893");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        byte[] byteArray9 = journalChannel6.magicWord;
        journalChannel6.nextPrealloc = 2;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel14.channel;
        journalChannel14.nextPrealloc = 'a';
        long long20 = journalChannel14.nextPrealloc;
        int int21 = journalChannel14.fd;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        journalChannel24.nextPrealloc = 10;
        byte[] byteArray27 = journalChannel24.magicWord;
        java.nio.ByteBuffer byteBuffer28 = journalChannel24.zeros;
        byte[] byteArray29 = journalChannel24.magicWord;
        java.io.File file30 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file30, (long) 2);
        int int33 = journalChannel32.fd;
        java.nio.ByteBuffer byteBuffer34 = journalChannel32.zeros;
        java.nio.channels.FileChannel fileChannel35 = journalChannel32.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = null;
        journalChannel32.bc = bufferedChannel36;
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel41 = journalChannel40.channel;
        java.nio.ByteBuffer byteBuffer42 = journalChannel40.zeros;
        int int43 = journalChannel32.read(byteBuffer42);
        int int44 = journalChannel24.read(byteBuffer42);
        int int45 = journalChannel14.read(byteBuffer42);
        int int46 = journalChannel6.read(byteBuffer42);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration47 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel49 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 1, 0, serverConfiguration47, fileChannelProvider48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(fileChannel35);
        org.junit.Assert.assertNotNull(bookieFileChannel41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration47);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1894");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        journalChannel7.close();
        java.nio.ByteBuffer byteBuffer10 = journalChannel7.zeros;
        byte[] byteArray11 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', 1048576L, (-1), (long) 100, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1895");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
        byte[] byteArray15 = journalChannel10.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, 1L, (int) (byte) 0, 10, true, (int) ' ', bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1896");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        journalChannel2.nextPrealloc = '#';
        byte[] byteArray5 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1897");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        long long15 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1898");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) (byte) 10, 100, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1899");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel9.bc = bufferedChannel21;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 0L, 6, (int) '#', false, (int) (short) 100, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1900");
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
        int int11 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 2;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1901");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        long long10 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, 10L, (int) (byte) 0, 0L, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1902");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.formatVersion;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        int int12 = journalChannel9.formatVersion;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel9.read(byteBuffer17);
        journalChannel9.close();
        long long20 = journalChannel9.nextPrealloc;
        journalChannel9.close();
        int int22 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer23 = journalChannel9.zeros;
        int int24 = journalChannel2.read(byteBuffer23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = null;
        journalChannel2.bc = bufferedChannel25;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1903");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        int int9 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1904");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1905");
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
        int int19 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        int int21 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1906");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        int int9 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1907");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        int int8 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1908");
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
        byte[] byteArray18 = journalChannel2.magicWord;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) '4');
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel26.bc;
        long long28 = journalChannel26.nextPrealloc;
        long long29 = journalChannel26.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel26.configuration;
        java.nio.ByteBuffer byteBuffer31 = journalChannel26.zeros;
        int int32 = journalChannel23.read(byteBuffer31);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = journalChannel2.read(byteBuffer31);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1909");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        int int10 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1910");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1911");
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
        int int25 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = '#';
        byte[] byteArray29 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1912");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        int int12 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        byte[] byteArray15 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1913");
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
        byte[] byteArray19 = journalChannel9.magicWord;
        long long20 = journalChannel9.nextPrealloc;
        int int21 = journalChannel9.fd;
        journalChannel9.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel9.bc = bufferedChannel23;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) ' ', (int) 'a', 512, false, 0, serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1914");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        int int33 = journalChannel2.read(byteBuffer30);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = null;
        journalChannel2.bc = bufferedChannel34;
        journalChannel2.nextPrealloc = 4L;
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 100);
        int int41 = journalChannel40.getFormatVersion();
        java.io.File file42 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel44 = new org.apache.bookkeeper.bookie.JournalChannel(file42, (long) 2);
        int int45 = journalChannel44.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = journalChannel44.bc;
        byte[] byteArray47 = journalChannel44.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = null;
        journalChannel44.bc = bufferedChannel48;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel50 = journalChannel44.channel;
        java.nio.ByteBuffer byteBuffer51 = journalChannel44.zeros;
        int int52 = journalChannel40.read(byteBuffer51);
        int int53 = journalChannel2.read(byteBuffer51);
        java.io.File file54 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel56 = new org.apache.bookkeeper.bookie.JournalChannel(file54, (long) 2);
        journalChannel56.nextPrealloc = 10;
        journalChannel56.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel61 = journalChannel56.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = null;
        journalChannel56.bc = bufferedChannel62;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = null;
        journalChannel56.bc = bufferedChannel64;
        int int66 = journalChannel56.formatVersion;
        java.nio.ByteBuffer byteBuffer67 = journalChannel56.zeros;
        int int68 = journalChannel2.read(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1915");
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
        journalChannel2.nextPrealloc = 4;
        long long39 = journalChannel2.nextPrealloc;
        int int40 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 4L + "'", long39 == 4L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1916");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (-1);
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1917");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1918");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1919");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1920");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        long long5 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        int int7 = journalChannel2.formatVersion;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1921");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.formatVersion;
        byte[] byteArray6 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1922");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel7.channel;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        journalChannel16.nextPrealloc = 0L;
        int int21 = journalChannel16.formatVersion;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel24.bc;
        journalChannel24.close();
        java.nio.ByteBuffer byteBuffer27 = journalChannel24.zeros;
        int int28 = journalChannel16.read(byteBuffer27);
        int int29 = journalChannel7.read(byteBuffer27);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = null;
        journalChannel7.bc = bufferedChannel30;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        journalChannel34.nextPrealloc = 10;
        int int37 = journalChannel34.getFormatVersion();
        java.nio.ByteBuffer byteBuffer38 = journalChannel34.zeros;
        int int39 = journalChannel7.read(byteBuffer38);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration40 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel42 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) (byte) 100, 0, 4L, serverConfiguration40, fileChannelProvider41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration40);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1923");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        int int8 = journalChannel6.fd;
        int int9 = journalChannel6.getFormatVersion();
        journalChannel6.nextPrealloc = 3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), (long) 0, (int) (short) 0, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1924");
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
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel2.configuration;
        journalChannel2.close();
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
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1925");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        int int18 = journalChannel2.fd;
        int int19 = journalChannel2.getFormatVersion();
        long long20 = journalChannel2.nextPrealloc;
        int int21 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1926");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        long long5 = journalChannel2.nextPrealloc;
        int int6 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1927");
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
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        int int14 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 512;
        journalChannel2.nextPrealloc = (byte) 1;
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1928");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 100L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        journalChannel10.nextPrealloc = 0L;
        long long15 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel10.bc = bufferedChannel16;
        java.nio.ByteBuffer byteBuffer18 = journalChannel10.zeros;
        int int19 = journalChannel2.read(byteBuffer18);
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1929");
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
        byte[] byteArray18 = journalChannel2.magicWord;
        journalChannel2.close();
        int int20 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1930");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bufferedChannel4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1931");
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
        int int29 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer30 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer31 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1932");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        int int7 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1933");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        long long11 = journalChannel2.nextPrealloc;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, 0L);
        journalChannel14.nextPrealloc = 0L;
        byte[] byteArray17 = journalChannel14.magicWord;
        java.nio.ByteBuffer byteBuffer18 = journalChannel14.zeros;
        int int19 = journalChannel2.read(byteBuffer18);
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1934");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.getBufferedChannel();
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
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1935");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        journalChannel14.nextPrealloc = (byte) 1;
        long long19 = journalChannel14.nextPrealloc;
        java.nio.ByteBuffer byteBuffer20 = journalChannel14.zeros;
        int int21 = journalChannel9.read(byteBuffer20);
        long long22 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 2L, (long) ' ', 512, (int) '#', true, (int) (short) -1, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1936");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        long long11 = journalChannel2.nextPrealloc;
        long long12 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        long long16 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1937");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        journalChannel9.nextPrealloc = (byte) 1;
        long long14 = journalChannel9.nextPrealloc;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel17.channel;
        journalChannel17.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel17.channel;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        journalChannel26.nextPrealloc = 10;
        journalChannel26.nextPrealloc = 0L;
        int int31 = journalChannel26.formatVersion;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = journalChannel34.bc;
        journalChannel34.close();
        java.nio.ByteBuffer byteBuffer37 = journalChannel34.zeros;
        int int38 = journalChannel26.read(byteBuffer37);
        int int39 = journalChannel17.read(byteBuffer37);
        int int40 = journalChannel9.read(byteBuffer37);
        int int41 = journalChannel2.read(byteBuffer37);
        byte[] byteArray42 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(bookieFileChannel23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1938");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1939");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        byte[] byteArray9 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1940");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        long long17 = journalChannel2.nextPrealloc;
        int int18 = journalChannel2.fd;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1941");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        int int4 = journalChannel2.fd;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1942");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, (long) (short) 100, (int) (byte) 100, serverConfiguration22, fileChannelProvider23);
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
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1943");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1944");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1945");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1946");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        int int20 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel10.bc;
        java.nio.ByteBuffer byteBuffer22 = journalChannel10.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) ' ', 5, 2, true, 1, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1947");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1948");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1949");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1950");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1951");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel10.channel;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        journalChannel19.nextPrealloc = 10;
        journalChannel19.nextPrealloc = 0L;
        int int24 = journalChannel19.formatVersion;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel27.bc;
        journalChannel27.close();
        java.nio.ByteBuffer byteBuffer30 = journalChannel27.zeros;
        int int31 = journalChannel19.read(byteBuffer30);
        int int32 = journalChannel10.read(byteBuffer30);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = null;
        journalChannel10.bc = bufferedChannel33;
        java.io.File file35 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel37 = new org.apache.bookkeeper.bookie.JournalChannel(file35, (long) 2);
        journalChannel37.nextPrealloc = 10;
        int int40 = journalChannel37.getFormatVersion();
        java.nio.ByteBuffer byteBuffer41 = journalChannel37.zeros;
        int int42 = journalChannel10.read(byteBuffer41);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration43 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel46 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) 100, 8, 1, false, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration43, fileChannelProvider44, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration43);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1952");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        journalChannel10.close();
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel17.channel;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        int int22 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel23);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1953");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1954");
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
        byte[] byteArray27 = journalChannel2.magicWord;
        byte[] byteArray28 = journalChannel2.magicWord;
        long long29 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1955");
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
        journalChannel2.nextPrealloc = (-1L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1956");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        int int3 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1957");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 4L;
        int int10 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1958");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1959");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel2.bc = bufferedChannel14;
        int int16 = journalChannel2.fd;
        long long17 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1960");
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
        int int17 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, 6L, 0, (long) 5, serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1961");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, 0L);
        long long7 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel6.bc = bufferedChannel8;
        long long10 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, 97L, (int) '4', serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1962");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        int int19 = journalChannel2.formatVersion;
        byte[] byteArray20 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel2.channel;
        byte[] byteArray22 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass23 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1963");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel6.bc = bufferedChannel7;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) 0, (int) (short) 1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1964");
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
        long long15 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1965");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel2.bc;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        int int28 = journalChannel27.formatVersion;
        journalChannel27.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer31 = journalChannel27.zeros;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) 2);
        int int35 = journalChannel34.fd;
        java.nio.ByteBuffer byteBuffer36 = journalChannel34.zeros;
        journalChannel34.nextPrealloc = (byte) 1;
        long long39 = journalChannel34.nextPrealloc;
        java.io.File file40 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel42 = new org.apache.bookkeeper.bookie.JournalChannel(file40, (long) 2);
        int int43 = journalChannel42.fd;
        java.nio.ByteBuffer byteBuffer44 = journalChannel42.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel45 = journalChannel42.channel;
        journalChannel42.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel48 = journalChannel42.channel;
        java.io.File file49 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel51 = new org.apache.bookkeeper.bookie.JournalChannel(file49, (long) 2);
        journalChannel51.nextPrealloc = 10;
        journalChannel51.nextPrealloc = 0L;
        int int56 = journalChannel51.formatVersion;
        java.io.File file57 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel59 = new org.apache.bookkeeper.bookie.JournalChannel(file57, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = journalChannel59.bc;
        journalChannel59.close();
        java.nio.ByteBuffer byteBuffer62 = journalChannel59.zeros;
        int int63 = journalChannel51.read(byteBuffer62);
        int int64 = journalChannel42.read(byteBuffer62);
        int int65 = journalChannel34.read(byteBuffer62);
        int int66 = journalChannel27.read(byteBuffer62);
        int int67 = journalChannel2.read(byteBuffer62);
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
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(bookieFileChannel45);
        org.junit.Assert.assertNotNull(bookieFileChannel48);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 512 + "'", int63 == 512);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1966");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        int int7 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1967");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        journalChannel7.nextPrealloc = 3;
        int int12 = journalChannel7.getFormatVersion();
        byte[] byteArray13 = journalChannel7.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) '#', (int) '#', 0L, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1968");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        int int11 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(6L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1969");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNull(bufferedChannel9);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1970");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        journalChannel2.close();
        byte[] byteArray6 = journalChannel2.magicWord;
        int int7 = journalChannel2.formatVersion;
        int int8 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1971");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1972");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1973");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        long long9 = journalChannel2.nextPrealloc;
        int int10 = journalChannel2.formatVersion;
        int int11 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1974");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, 0L, (int) (short) 100, (long) 0, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1975");
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
        journalChannel2.close();
        int int16 = journalChannel2.getFormatVersion();
        int int17 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass18 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1976");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        int int20 = journalChannel2.fd;
        long long21 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer22 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass23 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1977");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        int int7 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1978");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        journalChannel10.close();
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel17.channel;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.bc;
        journalChannel2.close();
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        journalChannel25.nextPrealloc = 10;
        java.io.File file28 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file28, (long) 2);
        int int31 = journalChannel30.fd;
        java.nio.ByteBuffer byteBuffer32 = journalChannel30.zeros;
        int int33 = journalChannel25.read(byteBuffer32);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration34 = journalChannel25.configuration;
        java.nio.channels.FileChannel fileChannel35 = journalChannel25.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = null;
        journalChannel25.bc = bufferedChannel36;
        int int38 = journalChannel25.getFormatVersion();
        byte[] byteArray39 = journalChannel25.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = journalChannel25.bc;
        journalChannel25.nextPrealloc = 1;
        java.io.File file43 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel45 = new org.apache.bookkeeper.bookie.JournalChannel(file43, (long) 2);
        int int46 = journalChannel45.fd;
        java.nio.ByteBuffer byteBuffer47 = journalChannel45.zeros;
        journalChannel45.nextPrealloc = (byte) 1;
        long long50 = journalChannel45.nextPrealloc;
        java.nio.ByteBuffer byteBuffer51 = journalChannel45.zeros;
        int int52 = journalChannel25.read(byteBuffer51);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = journalChannel2.read(byteBuffer51);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration34);
        org.junit.Assert.assertNotNull(fileChannel35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1979");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        long long11 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1980");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        long long10 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4L + "'", long10 == 4L);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1981");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        long long11 = journalChannel10.nextPrealloc;
        int int12 = journalChannel10.fd;
        int int13 = journalChannel10.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) 100, (int) (byte) 100, 0, false, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1982");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
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
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel27 = journalChannel26.channel;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        int int29 = journalChannel11.read(byteBuffer28);
        int int30 = journalChannel2.read(byteBuffer28);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1983");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        journalChannel8.nextPrealloc = 10;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        int int14 = journalChannel13.fd;
        java.nio.ByteBuffer byteBuffer15 = journalChannel13.zeros;
        int int16 = journalChannel8.read(byteBuffer15);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel8.configuration;
        int int18 = journalChannel8.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel8.bc;
        java.nio.ByteBuffer byteBuffer20 = journalChannel8.zeros;
        int int21 = journalChannel2.read(byteBuffer20);
        journalChannel2.nextPrealloc = 0L;
        int int24 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(bufferedChannel25);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1984");
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
        int int19 = journalChannel6.fd;
        journalChannel6.nextPrealloc = 10;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) ' ', 0, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1985");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        int int4 = journalChannel2.formatVersion;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1986");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 2;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        long long16 = journalChannel10.nextPrealloc;
        int int17 = journalChannel10.fd;
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        journalChannel20.nextPrealloc = 10;
        byte[] byteArray23 = journalChannel20.magicWord;
        java.nio.ByteBuffer byteBuffer24 = journalChannel20.zeros;
        byte[] byteArray25 = journalChannel20.magicWord;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        int int29 = journalChannel28.fd;
        java.nio.ByteBuffer byteBuffer30 = journalChannel28.zeros;
        java.nio.channels.FileChannel fileChannel31 = journalChannel28.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = null;
        journalChannel28.bc = bufferedChannel32;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel37 = journalChannel36.channel;
        java.nio.ByteBuffer byteBuffer38 = journalChannel36.zeros;
        int int39 = journalChannel28.read(byteBuffer38);
        int int40 = journalChannel20.read(byteBuffer38);
        int int41 = journalChannel10.read(byteBuffer38);
        int int42 = journalChannel2.read(byteBuffer38);
        int int43 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = null;
        journalChannel2.bc = bufferedChannel44;
        journalChannel2.nextPrealloc = (short) 10;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(fileChannel31);
        org.junit.Assert.assertNotNull(bookieFileChannel37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1987");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.nextPrealloc = (short) 100;
        journalChannel2.close();
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1988");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.fd;
        long long11 = journalChannel2.nextPrealloc;
        byte[] byteArray12 = journalChannel2.magicWord;
        long long13 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1989");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1990");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1991");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        journalChannel7.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel7.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel7.bc;
        int int13 = journalChannel7.getFormatVersion();
        byte[] byteArray14 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) 8, (int) (byte) 1, (long) 2, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1992");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        byte[] byteArray4 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (byte) -1;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, 0L);
        long long10 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel9.bc = bufferedChannel11;
        long long13 = journalChannel9.nextPrealloc;
        java.nio.ByteBuffer byteBuffer14 = journalChannel9.zeros;
        int int15 = journalChannel2.read(byteBuffer14);
        int int16 = journalChannel2.fd;
        byte[] byteArray17 = journalChannel2.magicWord;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1993");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) 0, (int) (byte) 1, serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1994");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        journalChannel6.nextPrealloc = 3;
        int int11 = journalChannel6.getFormatVersion();
        byte[] byteArray12 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, 0L, 3, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1995");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass16 = serverConfiguration15.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1996");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 10L;
        journalChannel2.nextPrealloc = (short) -1;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1997");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel10.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel10.bc = bufferedChannel20;
        int int22 = journalChannel10.formatVersion;
        int int23 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, 97L, (int) (byte) 100, 8, false, 5, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1998");
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
        int int14 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        byte[] byteArray18 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test1999");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.formatVersion;
        journalChannel11.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer15 = journalChannel11.zeros;
        int int16 = journalChannel7.read(byteBuffer15);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, 97L, 5, 1L, serverConfiguration17, fileChannelProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest3.test2000");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 2;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }
}
