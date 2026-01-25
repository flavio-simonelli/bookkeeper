package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JournalChannelTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2001");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        journalChannel10.close();
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        byte[] byteArray14 = journalChannel10.magicWord;
        long long15 = journalChannel10.nextPrealloc;
        java.nio.channels.FileChannel fileChannel16 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 4, (int) (short) -1, (int) 'a', false, (int) (byte) -1, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "1) test2001(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
// flaky "1) test2001(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2002");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        long long5 = journalChannel2.nextPrealloc;
        long long6 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2003");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, (long) (byte) 100, 4, (int) (byte) 100, true, 0, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2004");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 2);
// flaky "2) test2004(org.apache.bookkeeper.bookie.JournalChannelTest4)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2005");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 5, (int) (byte) 0, serverConfiguration18, fileChannelProvider19);
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
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2006");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, 97L, (int) (byte) 1, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2007");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2008");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2009");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) (byte) 1, (int) ' ', serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2010");
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
        java.lang.Class<?> wildcardClass19 = fileChannel18.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2011");
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
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2012");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) (short) 100, 100, (int) (byte) 0, false, (int) (short) 0, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2013");
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
        journalChannel2.nextPrealloc = 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        int int21 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2014");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
// flaky "3) test2014(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2015");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2016");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        int int13 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fileChannel14);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2017");
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
        java.nio.ByteBuffer byteBuffer73 = journalChannel2.zeros;
        journalChannel2.close();
        java.lang.Class<?> wildcardClass75 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2018");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        journalChannel7.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel7.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', 1048576L, 2, (long) '4', serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2019");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        long long19 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        int int21 = journalChannel2.getFormatVersion();
        int int22 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2020");
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
        java.lang.Class<?> wildcardClass74 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2021");
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
        java.io.File file27 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file27, (long) 2);
        journalChannel29.nextPrealloc = 10;
        int int32 = journalChannel29.getFormatVersion();
        java.nio.ByteBuffer byteBuffer33 = journalChannel29.zeros;
        int int34 = journalChannel2.read(byteBuffer33);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration35 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration35);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2022");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2023");
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
        int int20 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2024");
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
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2025");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.formatVersion;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        journalChannel10.nextPrealloc = (byte) 1;
        long long15 = journalChannel10.nextPrealloc;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        int int19 = journalChannel18.fd;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel18.channel;
        journalChannel18.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel18.channel;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        journalChannel27.nextPrealloc = 10;
        journalChannel27.nextPrealloc = 0L;
        int int32 = journalChannel27.formatVersion;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = journalChannel35.bc;
        journalChannel35.close();
        java.nio.ByteBuffer byteBuffer38 = journalChannel35.zeros;
        int int39 = journalChannel27.read(byteBuffer38);
        int int40 = journalChannel18.read(byteBuffer38);
        int int41 = journalChannel10.read(byteBuffer38);
        java.nio.ByteBuffer byteBuffer42 = journalChannel10.zeros;
        int int43 = journalChannel2.read(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(bookieFileChannel24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2026");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2027");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2028");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 4L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNull(bufferedChannel8);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2029");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1);
        int int3 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2030");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) (-1), (int) (byte) 0, serverConfiguration23, fileChannelProvider24);
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2031");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel2.bc = bufferedChannel20;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel22);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2032");
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
        int int19 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(fileChannel21);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2033");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 2;
        long long12 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2034");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        journalChannel9.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel9.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel9.bc = bufferedChannel15;
        int int17 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, 100L, (int) '#', (int) (short) -1, false, (int) (short) 10, serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2035");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        int int3 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
// flaky "4) test2035(org.apache.bookkeeper.bookie.JournalChannelTest4)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2036");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        int int3 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2037");
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
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
        long long19 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel2.bc = bufferedChannel20;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2038");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2039");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        int int10 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2040");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        journalChannel2.close();
        byte[] byteArray6 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass7 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2041");
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
        long long18 = journalChannel2.nextPrealloc;
        int int19 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2042");
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
        byte[] byteArray25 = journalChannel9.magicWord;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) (byte) 100, (int) 'a', (int) (short) 1, false, (int) ' ', serverConfiguration27, fileChannelProvider28);
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
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2043");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, 0L, 0, 4, true, (int) 'a', bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 2L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2044");
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
        byte[] byteArray22 = journalChannel6.magicWord;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) 3, 512, serverConfiguration24, fileChannelProvider25);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2045");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 6;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2046");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2047");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel24);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2048");
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
            journalChannel2.preAllocIfNeeded(100L);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2049");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2050");
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
        byte[] byteArray16 = journalChannel2.magicWord;
// flaky "5) test2050(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2051");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        java.lang.Class<?> wildcardClass11 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2052");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2053");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel6.bc;
        long long8 = journalChannel6.nextPrealloc;
        long long9 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 10, 5, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2054");
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
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2055");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        journalChannel2.nextPrealloc = (-1L);
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2056");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        journalChannel2.nextPrealloc = (byte) 1;
        journalChannel2.close();
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2057");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2058");
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
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel13 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel2.bc = bufferedChannel14;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fileChannel13);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2059");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2060");
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
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2061");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        byte[] byteArray9 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass10 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2062");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(bufferedChannel30);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2063");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        byte[] byteArray12 = journalChannel9.magicWord;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) (byte) -1);
        byte[] byteArray16 = journalChannel15.magicWord;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel9.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) 512, 1, 6, true, 10, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2064");
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
        java.nio.ByteBuffer byteBuffer20 = journalChannel9.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, 0L, 2, (int) (short) 10, false, (int) (byte) 10, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2065");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2066");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 5);
        byte[] byteArray10 = journalChannel9.magicWord;
        int int11 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, 1048576L, (int) (byte) 0, (int) (byte) -1, true, (int) (short) 10, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2067");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) -1);
        byte[] byteArray11 = journalChannel10.magicWord;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) (byte) 10, 100, (int) '4', true, (int) '4', bufferedChannelBuilder7, serverConfiguration13, fileChannelProvider14, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2068");
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
        byte[] byteArray17 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2069");
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
        journalChannel7.close();
        java.nio.ByteBuffer byteBuffer19 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) (short) 10, (int) (byte) 0, 0L, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2070");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2071");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2072");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, 0L, (int) (byte) 0, (long) 3, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2073");
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
        byte[] byteArray15 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 35L;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2074");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2075");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        long long9 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel7.bc = bufferedChannel10;
        int int12 = journalChannel7.formatVersion;
        journalChannel7.nextPrealloc = (byte) 0;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) (byte) -1, (int) (byte) 1, 32L, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2076");
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
        int int21 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel2.channel;
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel22);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2077");
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
        java.nio.channels.FileChannel fileChannel17 = journalChannel6.fc;
        long long18 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) '#', (int) (byte) -1, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2078");
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
        journalChannel2.close();
        int int14 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2079");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2080");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        long long5 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        int int7 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2081");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2082");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2083");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2084");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass10 = byteBuffer9.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2085");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        journalChannel9.nextPrealloc = (byte) 1;
        long long14 = journalChannel9.nextPrealloc;
        java.nio.ByteBuffer byteBuffer15 = journalChannel9.zeros;
        int int16 = journalChannel2.read(byteBuffer15);
        int int17 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2086");
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
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2087");
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
        journalChannel2.nextPrealloc = 2;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        int int15 = journalChannel2.fd;
        long long16 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer17 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2088");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        long long8 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        int int10 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass12 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2089");
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
        int int19 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer21 = journalChannel2.zeros;
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2090");
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
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2091");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        journalChannel10.nextPrealloc = 0L;
        int int15 = journalChannel10.formatVersion;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel18.bc;
        journalChannel18.close();
        java.nio.ByteBuffer byteBuffer21 = journalChannel18.zeros;
        int int22 = journalChannel10.read(byteBuffer21);
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel26 = journalChannel25.channel;
        java.nio.ByteBuffer byteBuffer27 = journalChannel25.zeros;
        int int28 = journalChannel10.read(byteBuffer27);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', 97L, (int) (byte) 1, (int) (short) 0, false, (int) '#', bufferedChannelBuilder7, serverConfiguration30, fileChannelProvider31, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(serverConfiguration30);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2092");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) -1);
        byte[] byteArray11 = journalChannel10.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) (byte) -1, 2, 2, false, (int) (byte) 0, bufferedChannelBuilder7, serverConfiguration13, fileChannelProvider14, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2093");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration43 = journalChannel2.configuration;
        java.io.File file44 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel46 = new org.apache.bookkeeper.bookie.JournalChannel(file44, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration47 = journalChannel46.configuration;
        int int48 = journalChannel46.fd;
        java.nio.ByteBuffer byteBuffer49 = journalChannel46.zeros;
        int int50 = journalChannel2.read(byteBuffer49);
        java.nio.ByteBuffer byteBuffer51 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(serverConfiguration43);
        org.junit.Assert.assertNotNull(serverConfiguration47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertNotNull(byteBuffer51);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2094");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 3L;
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fileChannel9);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2095");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2096");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) 5, (int) (byte) 1, (int) '#', true, 512, serverConfiguration23, fileChannelProvider24);
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2097");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        int int7 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2098");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) (byte) 0, (int) ' ', (-1L), serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2099");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = (byte) 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        byte[] byteArray9 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2100");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        journalChannel2.close();
        long long10 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2101");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        long long9 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel7.bc = bufferedChannel10;
        int int12 = journalChannel7.formatVersion;
        journalChannel7.nextPrealloc = (byte) 0;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 32L, (int) '4', 1048576L, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2102");
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
        int int26 = journalChannel2.formatVersion;
        journalChannel2.close();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2103");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        int int9 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2104");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) (byte) -1);
        byte[] byteArray16 = journalChannel15.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel15.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel15.channel;
        journalChannel15.nextPrealloc = 8;
        journalChannel15.close();
        java.nio.ByteBuffer byteBuffer22 = journalChannel15.zeros;
        int int23 = journalChannel2.read(byteBuffer22);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel2.channel;
        int int25 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2105");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel2.bc = bufferedChannel21;
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
        org.junit.Assert.assertNull(bufferedChannel20);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2106");
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
        java.lang.Class<?> wildcardClass37 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2107");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) (-1), (int) (short) 100, serverConfiguration25, fileChannelProvider26);
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2108");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        int int12 = journalChannel2.formatVersion;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, 0L);
        journalChannel15.nextPrealloc = 0L;
        journalChannel15.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel15.bc;
        java.nio.ByteBuffer byteBuffer20 = journalChannel15.zeros;
        int int21 = journalChannel2.read(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2109");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2110");
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
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
        int int22 = journalChannel2.getFormatVersion();
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        int int26 = journalChannel25.fd;
        java.nio.ByteBuffer byteBuffer27 = journalChannel25.zeros;
        journalChannel25.nextPrealloc = (byte) 1;
        long long30 = journalChannel25.nextPrealloc;
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        int int34 = journalChannel33.fd;
        java.nio.ByteBuffer byteBuffer35 = journalChannel33.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel36 = journalChannel33.channel;
        journalChannel33.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel39 = journalChannel33.channel;
        java.io.File file40 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel42 = new org.apache.bookkeeper.bookie.JournalChannel(file40, (long) 2);
        journalChannel42.nextPrealloc = 10;
        journalChannel42.nextPrealloc = 0L;
        int int47 = journalChannel42.formatVersion;
        java.io.File file48 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel50 = new org.apache.bookkeeper.bookie.JournalChannel(file48, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = journalChannel50.bc;
        journalChannel50.close();
        java.nio.ByteBuffer byteBuffer53 = journalChannel50.zeros;
        int int54 = journalChannel42.read(byteBuffer53);
        int int55 = journalChannel33.read(byteBuffer53);
        int int56 = journalChannel25.read(byteBuffer53);
        java.nio.channels.FileChannel fileChannel57 = journalChannel25.fc;
        java.nio.ByteBuffer byteBuffer58 = journalChannel25.zeros;
        int int59 = journalChannel2.read(byteBuffer58);
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
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(bookieFileChannel36);
        org.junit.Assert.assertNotNull(bookieFileChannel39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 512 + "'", int54 == 512);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(fileChannel57);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2111");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 0L, (-1), serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2112");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        journalChannel7.nextPrealloc = 'a';
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        int int14 = journalChannel13.fd;
        int int15 = journalChannel13.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel13.channel;
        java.nio.ByteBuffer byteBuffer17 = journalChannel13.zeros;
        int int18 = journalChannel7.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (-1L), (int) (short) 10, (long) 4, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2113");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        journalChannel2.nextPrealloc = (short) 0;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2114");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = '4';
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2115");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        journalChannel10.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel10.channel;
        java.nio.channels.FileChannel fileChannel15 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) 8, 3, 8, true, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2116");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2117");
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
        java.nio.channels.FileChannel fileChannel21 = journalChannel10.fc;
        long long22 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) '4', 100, (int) (short) 0, true, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2118");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2119");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel9.bc = bufferedChannel10;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 10, (int) (byte) 100, (int) (byte) 1, true, 8, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2120");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2121");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        journalChannel6.nextPrealloc = 3;
        int int11 = journalChannel6.getFormatVersion();
        int int12 = journalChannel6.fd;
        int int13 = journalChannel6.fd;
        int int14 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, 0L, (int) '4', serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2122");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2123");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, 4L, 5, (int) '#', false, (int) (byte) -1, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 2L);
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
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2124");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        byte[] byteArray7 = journalChannel2.magicWord;
        int int8 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fileChannel9);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2125");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        long long10 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2126");
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
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        int int12 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2127");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.nextPrealloc = (short) 100;
        journalChannel2.nextPrealloc = 97L;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2128");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2129");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        int int19 = journalChannel18.fd;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        journalChannel18.nextPrealloc = (byte) 1;
        long long23 = journalChannel18.nextPrealloc;
        java.io.File file24 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file24, (long) 2);
        int int27 = journalChannel26.fd;
        java.nio.ByteBuffer byteBuffer28 = journalChannel26.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel29 = journalChannel26.channel;
        journalChannel26.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel32 = journalChannel26.channel;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        journalChannel35.nextPrealloc = 10;
        journalChannel35.nextPrealloc = 0L;
        int int40 = journalChannel35.formatVersion;
        java.io.File file41 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel43 = new org.apache.bookkeeper.bookie.JournalChannel(file41, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = journalChannel43.bc;
        journalChannel43.close();
        java.nio.ByteBuffer byteBuffer46 = journalChannel43.zeros;
        int int47 = journalChannel35.read(byteBuffer46);
        int int48 = journalChannel26.read(byteBuffer46);
        int int49 = journalChannel18.read(byteBuffer46);
        int int50 = journalChannel10.read(byteBuffer46);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration51 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel54 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), (long) '4', (int) (byte) 1, (int) 'a', false, 0, bufferedChannelBuilder7, serverConfiguration51, fileChannelProvider52, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(bookieFileChannel29);
        org.junit.Assert.assertNotNull(bookieFileChannel32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration51);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2130");
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
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel16.channel;
        java.nio.ByteBuffer byteBuffer18 = journalChannel16.zeros;
        int int19 = journalChannel2.read(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2131");
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
        java.nio.ByteBuffer byteBuffer52 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer54 = journalChannel2.zeros;
        long long55 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNull(bufferedChannel53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2132");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        journalChannel9.nextPrealloc = 3;
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
        java.io.File file29 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file29, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel32 = journalChannel31.channel;
        java.nio.ByteBuffer byteBuffer33 = journalChannel31.zeros;
        int int34 = journalChannel16.read(byteBuffer33);
        int int35 = journalChannel9.read(byteBuffer33);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration36 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel38 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 3L, 1, 6, true, (int) (short) -1, serverConfiguration36, fileChannelProvider37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration36);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2133");
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
        byte[] byteArray15 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel16);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2134");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        byte[] byteArray10 = journalChannel2.magicWord;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        journalChannel13.nextPrealloc = 10;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        int int19 = journalChannel18.fd;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        int int21 = journalChannel13.read(byteBuffer20);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel13.configuration;
        byte[] byteArray23 = journalChannel13.magicWord;
        long long24 = journalChannel13.nextPrealloc;
        int int25 = journalChannel13.getFormatVersion();
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        journalChannel28.nextPrealloc = 10;
        journalChannel28.nextPrealloc = 0L;
        int int33 = journalChannel28.formatVersion;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = journalChannel36.bc;
        journalChannel36.close();
        java.nio.ByteBuffer byteBuffer39 = journalChannel36.zeros;
        int int40 = journalChannel28.read(byteBuffer39);
        java.io.File file41 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel43 = new org.apache.bookkeeper.bookie.JournalChannel(file41, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel44 = journalChannel43.channel;
        java.nio.ByteBuffer byteBuffer45 = journalChannel43.zeros;
        int int46 = journalChannel28.read(byteBuffer45);
        int int47 = journalChannel13.read(byteBuffer45);
        int int48 = journalChannel2.read(byteBuffer45);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2135");
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
        java.nio.channels.FileChannel fileChannel15 = journalChannel2.fc;
        long long16 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2136");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
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
        java.nio.channels.FileChannel fileChannel22 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) '#', (int) (byte) 10, (int) '#', false, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2137");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '#');
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
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2138");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) (short) 1, 100, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2139");
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
        byte[] byteArray20 = journalChannel10.magicWord;
        long long21 = journalChannel10.nextPrealloc;
        int int22 = journalChannel10.fd;
        journalChannel10.nextPrealloc = (short) 1;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) 100, (int) (short) 0, (-1), true, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2140");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, 100L, 10, 5, false, (int) (byte) 1, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2141");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        int int12 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2142");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        int int8 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel6.bc = bufferedChannel9;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 2L, 4, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2143");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        byte[] byteArray7 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2144");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2145");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) 8, (int) (byte) 100, 0L, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2146");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel2.channel;
        byte[] byteArray23 = journalChannel2.magicWord;
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
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2147");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 10;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2148");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(fileChannel4);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2149");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        byte[] byteArray4 = journalChannel2.magicWord;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.fd;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2150");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, 100L, 4, serverConfiguration30, fileChannelProvider31);
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
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2151");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel25 = journalChannel2.channel;
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
        org.junit.Assert.assertNotNull(bookieFileChannel25);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2152");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        journalChannel2.close();
        byte[] byteArray6 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2153");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel49 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) 100, (-1), serverConfiguration47, fileChannelProvider48);
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2154");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2155");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 0, (int) '4', 0, true, (int) '#', bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2156");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, 0L, (int) (byte) 1, (int) (byte) 10, false, (int) (short) 10, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2157");
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
        journalChannel2.nextPrealloc = '4';
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
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2158");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        long long7 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2159");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        byte[] byteArray7 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2160");
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
        long long14 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2161");
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
        int int16 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2162");
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
        long long19 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2163");
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
        java.nio.channels.FileChannel fileChannel15 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2164");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 8);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2165");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2166");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.channels.FileChannel fileChannel9 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) 0, (int) (short) 100, (long) '4', serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fileChannel9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2167");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = ' ';
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
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 3);
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        journalChannel28.nextPrealloc = 10;
        journalChannel28.nextPrealloc = 0L;
        int int33 = journalChannel28.formatVersion;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = journalChannel36.bc;
        journalChannel36.close();
        java.nio.ByteBuffer byteBuffer39 = journalChannel36.zeros;
        int int40 = journalChannel28.read(byteBuffer39);
        java.io.File file41 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel43 = new org.apache.bookkeeper.bookie.JournalChannel(file41, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel44 = journalChannel43.channel;
        java.nio.ByteBuffer byteBuffer45 = journalChannel43.zeros;
        int int46 = journalChannel28.read(byteBuffer45);
        int int47 = journalChannel25.read(byteBuffer45);
        java.nio.ByteBuffer byteBuffer48 = journalChannel25.zeros;
        int int49 = journalChannel9.read(byteBuffer48);
        int int50 = journalChannel2.read(byteBuffer48);
        int int51 = journalChannel2.getFormatVersion();
        long long52 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteBuffer48);
// flaky "6) test2167(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2168");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 2L, 2, (int) (short) 1, false, 100, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2169");
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
        byte[] byteArray15 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        long long17 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2170");
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
        byte[] byteArray16 = journalChannel6.magicWord;
        long long17 = journalChannel6.nextPrealloc;
        int int18 = journalChannel6.fd;
        journalChannel6.nextPrealloc = (short) 1;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) 3, (int) (short) -1, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2171");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration64 = journalChannel2.configuration;
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
        org.junit.Assert.assertNotNull(serverConfiguration64);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2172");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        int int10 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2173");
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
        java.nio.channels.FileChannel fileChannel22 = journalChannel9.fc;
        int int23 = journalChannel9.fd;
        java.nio.channels.FileChannel fileChannel24 = journalChannel9.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) (byte) 0, (int) (short) -1, 10, false, 0, serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2174");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        byte[] byteArray10 = journalChannel7.magicWord;
        journalChannel7.nextPrealloc = 2;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel15.channel;
        journalChannel15.nextPrealloc = 'a';
        long long21 = journalChannel15.nextPrealloc;
        int int22 = journalChannel15.fd;
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        journalChannel25.nextPrealloc = 10;
        byte[] byteArray28 = journalChannel25.magicWord;
        java.nio.ByteBuffer byteBuffer29 = journalChannel25.zeros;
        byte[] byteArray30 = journalChannel25.magicWord;
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        int int34 = journalChannel33.fd;
        java.nio.ByteBuffer byteBuffer35 = journalChannel33.zeros;
        java.nio.channels.FileChannel fileChannel36 = journalChannel33.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = null;
        journalChannel33.bc = bufferedChannel37;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel42 = journalChannel41.channel;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        int int44 = journalChannel33.read(byteBuffer43);
        int int45 = journalChannel25.read(byteBuffer43);
        int int46 = journalChannel15.read(byteBuffer43);
        int int47 = journalChannel7.read(byteBuffer43);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration48 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel50 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, 0L, (int) (byte) 0, (long) 4, serverConfiguration48, fileChannelProvider49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(fileChannel36);
        org.junit.Assert.assertNotNull(bookieFileChannel42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration48);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2175");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration37 = journalChannel2.configuration;
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
        org.junit.Assert.assertNotNull(serverConfiguration37);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2176");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel10.configuration;
        java.nio.channels.FileChannel fileChannel21 = journalChannel10.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel10.bc;
        int int23 = journalChannel10.fd;
        journalChannel10.nextPrealloc = 10;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel26 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, 6L, 2, (int) (short) 0, true, 10, bufferedChannelBuilder7, serverConfiguration27, fileChannelProvider28, (java.lang.Long) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2177");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 0);
        int int7 = journalChannel6.getFormatVersion();
        int int8 = journalChannel6.fd;
        int int9 = journalChannel6.getFormatVersion();
        journalChannel6.close();
        java.nio.channels.FileChannel fileChannel11 = journalChannel6.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 0L, 4, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2178");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        int int10 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = (byte) -1;
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2179");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        int int12 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2180");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        byte[] byteArray10 = journalChannel7.magicWord;
        java.nio.ByteBuffer byteBuffer11 = journalChannel7.zeros;
        java.nio.channels.FileChannel fileChannel12 = journalChannel7.fc;
        journalChannel7.nextPrealloc = (short) 0;
        journalChannel7.close();
        long long16 = journalChannel7.nextPrealloc;
        long long17 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel7.bc = bufferedChannel18;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) (byte) 1, (int) '#', (long) (short) 0, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2181");
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
        java.nio.ByteBuffer byteBuffer22 = journalChannel2.zeros;
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
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2182");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.getFormatVersion();
        int int5 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2183");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        journalChannel2.nextPrealloc = 0;
        int int5 = journalChannel2.getFormatVersion();
        long long6 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2184");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2185");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3);
        java.io.File file3 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel5 = new org.apache.bookkeeper.bookie.JournalChannel(file3, (long) 2);
        journalChannel5.nextPrealloc = 10;
        journalChannel5.nextPrealloc = 0L;
        int int10 = journalChannel5.formatVersion;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel13.bc;
        journalChannel13.close();
        java.nio.ByteBuffer byteBuffer16 = journalChannel13.zeros;
        int int17 = journalChannel5.read(byteBuffer16);
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel20.channel;
        java.nio.ByteBuffer byteBuffer22 = journalChannel20.zeros;
        int int23 = journalChannel5.read(byteBuffer22);
        int int24 = journalChannel2.read(byteBuffer22);
        java.nio.ByteBuffer byteBuffer25 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = '4';
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2186");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel10.bc;
        long long25 = journalChannel10.nextPrealloc;
        journalChannel10.nextPrealloc = 1048576L;
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, 1048576L, (int) (byte) 1, (int) 'a', false, 1, bufferedChannelBuilder7, serverConfiguration29, fileChannelProvider30, (java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2187");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        journalChannel2.close();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2188");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        int int9 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2189");
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
        int int17 = journalChannel2.formatVersion;
        long long18 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2190");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        long long9 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(bufferedChannel10);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2191");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2192");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        long long8 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        int int10 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(6L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2193");
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
        int int20 = journalChannel2.fd;
        int int21 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2194");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.fd;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        byte[] byteArray10 = journalChannel7.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel7.bc = bufferedChannel11;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel7.channel;
        java.nio.ByteBuffer byteBuffer14 = journalChannel7.zeros;
        int int15 = journalChannel2.read(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2195");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.close();
        byte[] byteArray7 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2196");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 2L, (long) (short) 1, 512, 10, false, (int) 'a', bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 97L);
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
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2197");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.formatVersion;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2198");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        long long9 = journalChannel2.nextPrealloc;
        int int10 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass12 = serverConfiguration11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2199");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2200");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = (byte) 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2201");
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
        java.nio.ByteBuffer byteBuffer18 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel7.configuration;
        java.io.File file20 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file20, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel22.bc;
        journalChannel22.close();
        java.nio.ByteBuffer byteBuffer25 = journalChannel22.zeros;
        java.nio.ByteBuffer byteBuffer26 = journalChannel22.zeros;
        int int27 = journalChannel7.read(byteBuffer26);
        java.nio.channels.FileChannel fileChannel28 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) 1, 8, 0L, serverConfiguration29, fileChannelProvider30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(fileChannel28);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2202");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        int int10 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2203");
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
        int int27 = journalChannel2.fd;
        byte[] byteArray28 = journalChannel2.magicWord;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2204");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 10;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        int int13 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2205");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        long long19 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2206");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel12.channel;
        journalChannel12.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel12.channel;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        journalChannel21.nextPrealloc = 10;
        journalChannel21.nextPrealloc = 0L;
        int int26 = journalChannel21.formatVersion;
        java.io.File file27 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file27, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = journalChannel29.bc;
        journalChannel29.close();
        java.nio.ByteBuffer byteBuffer32 = journalChannel29.zeros;
        int int33 = journalChannel21.read(byteBuffer32);
        int int34 = journalChannel12.read(byteBuffer32);
        int int35 = journalChannel2.read(byteBuffer32);
        int int36 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2207");
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
        int int27 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2208");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        int int11 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2209");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        int int3 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2210");
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
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2211");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        java.nio.channels.FileChannel fileChannel9 = journalChannel6.fc;
        int int10 = journalChannel6.getFormatVersion();
        int int11 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel6.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel6.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (short) -1, (int) ' ', serverConfiguration15, fileChannelProvider16);
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
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2212");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2213");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2214");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        int int13 = journalChannel12.fd;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel12.channel;
        journalChannel12.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel12.channel;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        journalChannel21.nextPrealloc = 10;
        journalChannel21.nextPrealloc = 0L;
        int int26 = journalChannel21.formatVersion;
        java.io.File file27 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file27, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = journalChannel29.bc;
        journalChannel29.close();
        java.nio.ByteBuffer byteBuffer32 = journalChannel29.zeros;
        int int33 = journalChannel21.read(byteBuffer32);
        int int34 = journalChannel12.read(byteBuffer32);
        int int35 = journalChannel2.read(byteBuffer32);
        java.io.File file36 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel38 = new org.apache.bookkeeper.bookie.JournalChannel(file36, (long) 2);
        int int39 = journalChannel38.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = journalChannel38.bc;
        int int41 = journalChannel38.formatVersion;
        int int42 = journalChannel38.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = null;
        journalChannel38.bc = bufferedChannel43;
        java.io.File file45 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel47 = new org.apache.bookkeeper.bookie.JournalChannel(file45, (long) 2);
        journalChannel47.nextPrealloc = 10;
        journalChannel47.nextPrealloc = 0L;
        int int52 = journalChannel47.formatVersion;
        java.io.File file53 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel55 = new org.apache.bookkeeper.bookie.JournalChannel(file53, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = journalChannel55.bc;
        journalChannel55.close();
        java.nio.ByteBuffer byteBuffer58 = journalChannel55.zeros;
        int int59 = journalChannel47.read(byteBuffer58);
        java.io.File file60 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel62 = new org.apache.bookkeeper.bookie.JournalChannel(file60, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel63 = journalChannel62.channel;
        java.nio.ByteBuffer byteBuffer64 = journalChannel62.zeros;
        int int65 = journalChannel47.read(byteBuffer64);
        int int66 = journalChannel38.read(byteBuffer64);
        int int67 = journalChannel2.read(byteBuffer64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(bufferedChannel40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNull(bufferedChannel56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel63);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 512 + "'", int65 == 512);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2215");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) '#', 4, 512, true, 1, bufferedChannelBuilder7, serverConfiguration13, fileChannelProvider14, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2216");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2217");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (-1L), 1, serverConfiguration15, fileChannelProvider16);
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
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2218");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        byte[] byteArray8 = journalChannel7.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel7.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, 10L, (int) '4', 6L, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2219");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (byte) -1, 512, (-1), true, 2, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2220");
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
        int int21 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2221");
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
        journalChannel9.nextPrealloc = (-1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, 3L, 0, (int) ' ', false, 3, serverConfiguration24, fileChannelProvider25);
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
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2222");
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
        java.lang.Class<?> wildcardClass31 = byteBuffer28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2223");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        int int11 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2224");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.fd;
        int int8 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2225");
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
        java.lang.Class<?> wildcardClass20 = serverConfiguration19.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2226");
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
        java.lang.Class<?> wildcardClass12 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2227");
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
        int int15 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer18 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2228");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNull(bufferedChannel13);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2229");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, (long) ' ', 1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2230");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 8;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration6);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2231");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2232");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        journalChannel6.nextPrealloc = 3;
        byte[] byteArray11 = journalChannel6.magicWord;
        long long12 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel6.bc;
        java.nio.channels.FileChannel fileChannel14 = journalChannel6.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) (short) 100, (int) (short) 1, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2233");
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
        int int15 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        long long18 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2234");
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
        byte[] byteArray22 = journalChannel9.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) (short) 1, (int) (byte) 1, (int) (byte) 10, true, (int) (short) 0, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2235");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteBuffer3);
// flaky "7) test2235(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2236");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        journalChannel6.close();
        java.nio.channels.FileChannel fileChannel8 = journalChannel6.fc;
        java.nio.channels.FileChannel fileChannel9 = journalChannel6.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) (short) -1, 4, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(fileChannel9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2237");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', 10L, 100, (int) '#', false, (int) (byte) 1, serverConfiguration26, fileChannelProvider27);
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
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2238");
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
        int int15 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2239");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2240");
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
        int int17 = journalChannel2.formatVersion;
        int int18 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2241");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        byte[] byteArray7 = journalChannel2.magicWord;
        int int8 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass10 = fileChannel9.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fileChannel9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2242");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        journalChannel7.nextPrealloc = 'a';
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        int int14 = journalChannel13.fd;
        int int15 = journalChannel13.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel13.channel;
        java.nio.ByteBuffer byteBuffer17 = journalChannel13.zeros;
        int int18 = journalChannel7.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) '#', (int) (byte) 100, 1048576L, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2243");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2244");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, (long) (short) 0, 10, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2245");
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
        journalChannel2.nextPrealloc = 1048576L;
        int int20 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2246");
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
        java.nio.channels.FileChannel fileChannel37 = journalChannel2.fc;
        int int38 = journalChannel2.fd;
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
        org.junit.Assert.assertNotNull(fileChannel37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2247");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2248");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel9.bc;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        int int14 = journalChannel13.formatVersion;
        journalChannel13.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer17 = journalChannel13.zeros;
        int int18 = journalChannel9.read(byteBuffer17);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) 8, 6, 8, false, 10, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2249");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = ' ';
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
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 3);
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        journalChannel28.nextPrealloc = 10;
        journalChannel28.nextPrealloc = 0L;
        int int33 = journalChannel28.formatVersion;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = journalChannel36.bc;
        journalChannel36.close();
        java.nio.ByteBuffer byteBuffer39 = journalChannel36.zeros;
        int int40 = journalChannel28.read(byteBuffer39);
        java.io.File file41 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel43 = new org.apache.bookkeeper.bookie.JournalChannel(file41, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel44 = journalChannel43.channel;
        java.nio.ByteBuffer byteBuffer45 = journalChannel43.zeros;
        int int46 = journalChannel28.read(byteBuffer45);
        int int47 = journalChannel25.read(byteBuffer45);
        java.nio.ByteBuffer byteBuffer48 = journalChannel25.zeros;
        int int49 = journalChannel9.read(byteBuffer48);
        int int50 = journalChannel2.read(byteBuffer48);
        int int51 = journalChannel2.getFormatVersion();
        int int52 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2250");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(bufferedChannel13);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2251");
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
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        int int19 = journalChannel18.fd;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel18.channel;
        journalChannel18.nextPrealloc = 'a';
        long long24 = journalChannel18.nextPrealloc;
        int int25 = journalChannel18.fd;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        journalChannel28.nextPrealloc = 10;
        byte[] byteArray31 = journalChannel28.magicWord;
        java.nio.ByteBuffer byteBuffer32 = journalChannel28.zeros;
        byte[] byteArray33 = journalChannel28.magicWord;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        int int37 = journalChannel36.fd;
        java.nio.ByteBuffer byteBuffer38 = journalChannel36.zeros;
        java.nio.channels.FileChannel fileChannel39 = journalChannel36.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = null;
        journalChannel36.bc = bufferedChannel40;
        java.io.File file42 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel44 = new org.apache.bookkeeper.bookie.JournalChannel(file42, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel45 = journalChannel44.channel;
        java.nio.ByteBuffer byteBuffer46 = journalChannel44.zeros;
        int int47 = journalChannel36.read(byteBuffer46);
        int int48 = journalChannel28.read(byteBuffer46);
        int int49 = journalChannel18.read(byteBuffer46);
        int int50 = journalChannel2.read(byteBuffer46);
        int int51 = journalChannel2.fd;
        long long52 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(fileChannel39);
        org.junit.Assert.assertNotNull(bookieFileChannel45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2252");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
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
        java.nio.ByteBuffer byteBuffer21 = journalChannel10.zeros;
        int int22 = journalChannel2.read(byteBuffer21);
        java.nio.channels.FileChannel fileChannel23 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(fileChannel23);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2253");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 100L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        byte[] byteArray8 = journalChannel2.magicWord;
        byte[] byteArray9 = journalChannel2.magicWord;
        long long10 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2254");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        long long8 = journalChannel2.nextPrealloc;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1048576L + "'", long8 == 1048576L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2255");
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
        journalChannel2.close();
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
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2256");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        int int8 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2257");
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
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2258");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        long long12 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        int int15 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2259");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.formatVersion;
        java.nio.channels.FileChannel fileChannel11 = journalChannel9.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) (byte) 100, (int) (short) 0, 2, true, 0, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2260");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 0);
        int int8 = journalChannel7.getFormatVersion();
        int int9 = journalChannel7.fd;
        int int10 = journalChannel7.getFormatVersion();
        journalChannel7.close();
        java.nio.channels.FileChannel fileChannel12 = journalChannel7.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, 4L, (int) 'a', (long) 8, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2261");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        int int6 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2262");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 10;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2263");
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
        journalChannel2.nextPrealloc = 0L;
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
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2264");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (short) 1);
        int int10 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) 512, (int) (byte) -1, (int) (short) 100, true, (int) (short) -1, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2265");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, 2L);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) 100, (int) (byte) 1, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2266");
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
        journalChannel2.nextPrealloc = 0L;
        java.nio.ByteBuffer byteBuffer18 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2267");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        journalChannel9.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel13 = journalChannel9.fc;
        java.nio.channels.FileChannel fileChannel14 = journalChannel9.fc;
        int int15 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (byte) 0, 6, 0, false, 1, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2268");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2269");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) 4, (int) ' ', 4, true, 100, serverConfiguration27, fileChannelProvider28);
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
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2270");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2271");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        int int11 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(bufferedChannel12);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2272");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        int int10 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2273");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        int int6 = journalChannel2.fd;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2274");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        int int3 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2275");
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
        int int14 = journalChannel2.formatVersion;
        int int15 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        int int18 = journalChannel2.formatVersion;
        byte[] byteArray19 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2276");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        int int11 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2277");
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
        int int38 = journalChannel2.getFormatVersion();
        int int39 = journalChannel2.fd;
        int int40 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2278");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = 1048576L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2279");
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
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        journalChannel2.nextPrealloc = 0L;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2280");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2281");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.fd;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2282");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2283");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        journalChannel10.nextPrealloc = 0L;
        int int15 = journalChannel10.formatVersion;
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) 5, 1, 6, true, (int) '#', bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 2L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2284");
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
        java.nio.ByteBuffer byteBuffer53 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertNotNull(byteBuffer53);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2285");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2286");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        int int9 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        int int11 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2287");
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
        int int15 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2288");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 6L, (int) (short) 100, (long) (short) -1, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2289");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        byte[] byteArray7 = journalChannel2.magicWord;
        int int8 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2290");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2291");
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
        int int20 = journalChannel7.getFormatVersion();
        byte[] byteArray21 = journalChannel7.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel7.bc;
        journalChannel7.nextPrealloc = 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel7.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, 0L, 5, (long) '4', serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2292");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 10;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel10);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2293");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        int int7 = journalChannel2.getFormatVersion();
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) (short) -1);
        java.nio.ByteBuffer byteBuffer18 = journalChannel17.zeros;
        int int19 = journalChannel10.read(byteBuffer18);
        int int20 = journalChannel2.read(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2294");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(fileChannel9);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2295");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        int int3 = journalChannel2.getFormatVersion();
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel6.bc = bufferedChannel9;
        java.nio.ByteBuffer byteBuffer11 = journalChannel6.zeros;
        int int12 = journalChannel2.read(byteBuffer11);
        journalChannel2.nextPrealloc = ' ';
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2296");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) 2, 512, (int) 'a', true, 0, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 35L);
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
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2297");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2298");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2299");
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
        java.lang.Class<?> wildcardClass13 = byteBuffer12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2300");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2301");
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
        long long23 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) (short) 10, (int) (byte) 0, 8, false, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration24, fileChannelProvider25, (java.lang.Long) 1L);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2302");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.bc;
        int int12 = journalChannel2.fd;
        int int13 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2303");
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
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        int int19 = journalChannel17.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel17.channel;
        java.nio.ByteBuffer byteBuffer21 = journalChannel17.zeros;
        int int22 = journalChannel2.read(byteBuffer21);
        int int23 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2304");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2305");
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
        int int22 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (short) 0, (int) ' ', 1, true, (int) (byte) -1, serverConfiguration24, fileChannelProvider25);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2306");
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
        journalChannel2.close();
        int int38 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2307");
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
        java.nio.channels.FileChannel fileChannel19 = journalChannel2.fc;
        int int20 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2308");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.getFormatVersion();
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2309");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2310");
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
        int int15 = journalChannel2.fd;
        int int16 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(fileChannel17);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2311");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        int int9 = journalChannel7.getFormatVersion();
        java.nio.ByteBuffer byteBuffer10 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) (short) 10, 10, 3L, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2312");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration40 = journalChannel2.configuration;
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
        org.junit.Assert.assertNotNull(serverConfiguration40);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2313");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '#');
// flaky "8) test2313(org.apache.bookkeeper.bookie.JournalChannelTest4)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "2) test2313(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2314");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 100L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (short) -1, (int) (short) 100, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2315");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2316");
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
        int int22 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, (long) 2, (int) (byte) 0, (long) (short) 0, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2317");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 97L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2318");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        int int13 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2319");
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
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass16 = serverConfiguration15.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2320");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 3);
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        journalChannel10.nextPrealloc = 0L;
        int int15 = journalChannel10.formatVersion;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel18.bc;
        journalChannel18.close();
        java.nio.ByteBuffer byteBuffer21 = journalChannel18.zeros;
        int int22 = journalChannel10.read(byteBuffer21);
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel26 = journalChannel25.channel;
        java.nio.ByteBuffer byteBuffer27 = journalChannel25.zeros;
        int int28 = journalChannel10.read(byteBuffer27);
        int int29 = journalChannel7.read(byteBuffer27);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, 2L, 3, (long) (-1), serverConfiguration30, fileChannelProvider31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration30);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2321");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2322");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.fd;
        int int8 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2323");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel9.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel9.bc;
        long long24 = journalChannel9.nextPrealloc;
        journalChannel9.nextPrealloc = 1048576L;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 2L, (long) 4, 1, (int) (short) 0, false, 1, serverConfiguration28, fileChannelProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2324");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        journalChannel7.nextPrealloc = 3;
        byte[] byteArray12 = journalChannel7.magicWord;
        long long13 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel7.bc;
        java.nio.channels.FileChannel fileChannel15 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) (-1), (int) 'a', 6L, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2325");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        byte[] byteArray9 = journalChannel2.magicWord;
        int int10 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2326");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, 0L);
        journalChannel10.nextPrealloc = 0L;
        journalChannel10.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) (short) 1, 6, (int) (byte) 1, false, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2327");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1);
        int int3 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        java.nio.ByteBuffer byteBuffer10 = journalChannel8.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel8.channel;
        journalChannel8.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel8.channel;
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
        int int30 = journalChannel8.read(byteBuffer28);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = null;
        journalChannel8.bc = bufferedChannel31;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel33 = journalChannel8.channel;
        java.nio.ByteBuffer byteBuffer34 = journalChannel8.zeros;
        int int35 = journalChannel8.formatVersion;
        java.nio.ByteBuffer byteBuffer36 = journalChannel8.zeros;
        int int37 = journalChannel2.read(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2328");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2329");
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
        int int18 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2330");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2331");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        int int8 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2332");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2333");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel2.bc = bufferedChannel12;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2334");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = (short) -1;
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
        int int20 = journalChannel2.read(byteBuffer18);
        int int21 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2335");
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
        long long11 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(4L);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2336");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2337");
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
        int int17 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2338");
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
        java.nio.channels.FileChannel fileChannel37 = journalChannel2.fc;
        int int38 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertNotNull(fileChannel37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2339");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2340");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        journalChannel2.nextPrealloc = ' ';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel2.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2341");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel57);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2342");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = '4';
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2343");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel9.bc = bufferedChannel10;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, 10L, (int) (short) 10, 8, false, 100, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2344");
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
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel38 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration39 = journalChannel2.configuration;
        byte[] byteArray40 = journalChannel2.magicWord;
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
        org.junit.Assert.assertNotNull(bookieFileChannel38);
        org.junit.Assert.assertNotNull(serverConfiguration39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2345");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        int int8 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2346");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 5);
        byte[] byteArray10 = journalChannel9.magicWord;
        int int11 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) 8, 1, (int) (short) 0, false, 512, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2347");
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
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2348");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        int int10 = journalChannel2.getFormatVersion();
        int int11 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(bufferedChannel13);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2349");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 10;
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2350");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        long long3 = journalChannel2.nextPrealloc;
        long long4 = journalChannel2.nextPrealloc;
        long long5 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2351");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100);
        int int3 = journalChannel2.getFormatVersion();
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        byte[] byteArray9 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel6.bc = bufferedChannel10;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel6.channel;
        java.nio.ByteBuffer byteBuffer13 = journalChannel6.zeros;
        int int14 = journalChannel2.read(byteBuffer13);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2352");
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
        java.nio.ByteBuffer byteBuffer21 = journalChannel10.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) 1, 0, (int) (byte) -1, true, 0, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2353");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        journalChannel9.nextPrealloc = 3;
        int int14 = journalChannel9.getFormatVersion();
        int int15 = journalChannel9.fd;
        int int16 = journalChannel9.fd;
        int int17 = journalChannel9.fd;
        long long18 = journalChannel9.nextPrealloc;
        byte[] byteArray19 = journalChannel9.magicWord;
        long long20 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) '4', (int) (byte) 10, 3, false, 100, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2354");
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
        journalChannel2.close();
        int int35 = journalChannel2.fd;
        byte[] byteArray36 = journalChannel2.magicWord;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2355");
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
        int int14 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2356");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel7.channel;
        int int21 = journalChannel7.formatVersion;
        int int22 = journalChannel7.fd;
        java.nio.channels.FileChannel fileChannel23 = journalChannel7.fc;
        int int24 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 35L, 6, (long) 512, serverConfiguration25, fileChannelProvider26);
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
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2357");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(fileChannel18);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2358");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 512, 10, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2359");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = (byte) 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2360");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        long long6 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        int int10 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2361");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 3);
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        journalChannel14.nextPrealloc = 10;
        journalChannel14.nextPrealloc = 0L;
        int int19 = journalChannel14.formatVersion;
        java.io.File file20 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file20, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel22.bc;
        journalChannel22.close();
        java.nio.ByteBuffer byteBuffer25 = journalChannel22.zeros;
        int int26 = journalChannel14.read(byteBuffer25);
        java.io.File file27 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file27, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel30 = journalChannel29.channel;
        java.nio.ByteBuffer byteBuffer31 = journalChannel29.zeros;
        int int32 = journalChannel14.read(byteBuffer31);
        int int33 = journalChannel11.read(byteBuffer31);
        java.nio.ByteBuffer byteBuffer34 = journalChannel11.zeros;
        int int35 = journalChannel2.read(byteBuffer34);
        java.io.File file36 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel38 = new org.apache.bookkeeper.bookie.JournalChannel(file36, (long) 2);
        int int39 = journalChannel38.fd;
        java.nio.ByteBuffer byteBuffer40 = journalChannel38.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel41 = journalChannel38.channel;
        journalChannel38.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel44 = journalChannel38.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = null;
        journalChannel38.bc = bufferedChannel45;
        int int47 = journalChannel38.getFormatVersion();
        java.io.File file48 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel50 = new org.apache.bookkeeper.bookie.JournalChannel(file48, (long) 0);
        int int51 = journalChannel50.getFormatVersion();
        int int52 = journalChannel50.getFormatVersion();
        java.nio.ByteBuffer byteBuffer53 = journalChannel50.zeros;
        int int54 = journalChannel38.read(byteBuffer53);
        java.io.File file55 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel57 = new org.apache.bookkeeper.bookie.JournalChannel(file55, (long) 2);
        int int58 = journalChannel57.fd;
        java.nio.ByteBuffer byteBuffer59 = journalChannel57.zeros;
        java.nio.channels.FileChannel fileChannel60 = journalChannel57.fc;
        int int61 = journalChannel57.getFormatVersion();
        int int62 = journalChannel57.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = journalChannel57.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel64 = journalChannel57.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel65 = journalChannel57.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = null;
        journalChannel57.bc = bufferedChannel66;
        java.io.File file68 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel70 = new org.apache.bookkeeper.bookie.JournalChannel(file68, (long) (byte) -1);
        byte[] byteArray71 = journalChannel70.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel72 = journalChannel70.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel73 = journalChannel70.channel;
        journalChannel70.nextPrealloc = 8;
        journalChannel70.close();
        java.nio.ByteBuffer byteBuffer77 = journalChannel70.zeros;
        int int78 = journalChannel57.read(byteBuffer77);
        int int79 = journalChannel38.read(byteBuffer77);
        int int80 = journalChannel2.read(byteBuffer77);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(bookieFileChannel41);
        org.junit.Assert.assertNotNull(bookieFileChannel44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 512 + "'", int54 == 512);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(fileChannel60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(bookieFileChannel64);
        org.junit.Assert.assertNotNull(bookieFileChannel65);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel72);
        org.junit.Assert.assertNotNull(bookieFileChannel73);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 512 + "'", int78 == 512);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2362");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2363");
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
        byte[] byteArray19 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
        journalChannel2.close();
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
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2364");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        journalChannel9.close();
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        int int12 = journalChannel2.read(byteBuffer11);
        byte[] byteArray13 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2365");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        int int6 = journalChannel2.formatVersion;
        int int7 = journalChannel2.getFormatVersion();
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1048576L + "'", long8 == 1048576L);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2366");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        byte[] byteArray4 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2367");
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
        byte[] byteArray27 = journalChannel2.magicWord;
        journalChannel2.close();
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2368");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        long long4 = journalChannel2.nextPrealloc;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        journalChannel7.close();
        java.nio.ByteBuffer byteBuffer10 = journalChannel7.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        long long12 = journalChannel2.nextPrealloc;
        byte[] byteArray13 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2369");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel6.bc;
        journalChannel6.close();
        java.nio.ByteBuffer byteBuffer9 = journalChannel6.zeros;
        byte[] byteArray10 = journalChannel6.magicWord;
        long long11 = journalChannel6.nextPrealloc;
        java.nio.channels.FileChannel fileChannel12 = journalChannel6.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 6, (int) (byte) 10, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2370");
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
        long long14 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2371");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2372");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2373");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2374");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass5 = bookieFileChannel4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2375");
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
        java.nio.ByteBuffer byteBuffer17 = journalChannel6.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel21.bc;
        journalChannel21.close();
        java.nio.ByteBuffer byteBuffer24 = journalChannel21.zeros;
        java.nio.ByteBuffer byteBuffer25 = journalChannel21.zeros;
        int int26 = journalChannel6.read(byteBuffer25);
        java.nio.channels.FileChannel fileChannel27 = journalChannel6.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 2L, (long) 8, (int) (byte) 10, serverConfiguration28, fileChannelProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(fileChannel27);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2376");
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
        journalChannel2.close();
        long long13 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = 4;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2377");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        long long16 = journalChannel10.nextPrealloc;
        int int17 = journalChannel10.fd;
        int int18 = journalChannel10.getFormatVersion();
        int int19 = journalChannel10.formatVersion;
        java.io.File file20 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file20, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel22.configuration;
        journalChannel22.nextPrealloc = 1048576L;
        int int26 = journalChannel22.formatVersion;
        java.nio.ByteBuffer byteBuffer27 = journalChannel22.zeros;
        int int28 = journalChannel10.read(byteBuffer27);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 512, 512, (int) (short) 100, false, 5, bufferedChannelBuilder7, serverConfiguration29, fileChannelProvider30, (java.lang.Long) 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2378");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        journalChannel7.nextPrealloc = 3;
        byte[] byteArray12 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) (-1), 4, (long) (byte) 100, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2379");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        byte[] byteArray10 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2380");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        journalChannel6.nextPrealloc = 10;
        journalChannel6.nextPrealloc = 0L;
        int int11 = journalChannel6.formatVersion;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, (long) 8, (int) '#', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2381");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        long long4 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2382");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        journalChannel9.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel13 = journalChannel9.fc;
        java.nio.channels.FileChannel fileChannel14 = journalChannel9.fc;
        int int15 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        int int20 = journalChannel19.fd;
        java.nio.ByteBuffer byteBuffer21 = journalChannel19.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel19.channel;
        journalChannel19.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel25 = journalChannel19.channel;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        journalChannel28.nextPrealloc = 10;
        journalChannel28.nextPrealloc = 0L;
        int int33 = journalChannel28.formatVersion;
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = journalChannel36.bc;
        journalChannel36.close();
        java.nio.ByteBuffer byteBuffer39 = journalChannel36.zeros;
        int int40 = journalChannel28.read(byteBuffer39);
        int int41 = journalChannel19.read(byteBuffer39);
        int int42 = journalChannel9.read(byteBuffer39);
        int int43 = journalChannel2.read(byteBuffer39);
        java.io.File file44 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel46 = new org.apache.bookkeeper.bookie.JournalChannel(file44, (long) 2);
        int int47 = journalChannel46.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = journalChannel46.bc;
        int int49 = journalChannel46.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration50 = journalChannel46.configuration;
        java.nio.ByteBuffer byteBuffer51 = journalChannel46.zeros;
        int int52 = journalChannel2.read(byteBuffer51);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertNotNull(bookieFileChannel25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(bufferedChannel48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2383");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2384");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 8, (int) 'a', serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2385");
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
        int int30 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration31 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 512, (int) '4', (long) 0, serverConfiguration31, fileChannelProvider32);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration31);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2386");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 3L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNull(bufferedChannel11);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2387");
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
        int int21 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2388");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) (byte) 1, 6, 100, true, 0, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2389");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        long long9 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2390");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2391");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        int int8 = journalChannel2.formatVersion;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2392");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2393");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        long long8 = journalChannel2.nextPrealloc;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2394");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2395");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        int int11 = journalChannel2.formatVersion;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel14.configuration;
        journalChannel14.nextPrealloc = 1048576L;
        int int18 = journalChannel14.formatVersion;
        java.nio.ByteBuffer byteBuffer19 = journalChannel14.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer22 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2396");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2397");
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
        int int14 = journalChannel2.formatVersion;
        int int15 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertNull(bufferedChannel17);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2398");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
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
        java.nio.channels.FileChannel fileChannel21 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel10.configuration;
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration41 = journalChannel25.configuration;
        long long42 = journalChannel25.nextPrealloc;
        java.io.File file43 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel45 = new org.apache.bookkeeper.bookie.JournalChannel(file43, (long) 2);
        journalChannel45.nextPrealloc = 10;
        journalChannel45.nextPrealloc = 0L;
        java.io.File file50 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel52 = new org.apache.bookkeeper.bookie.JournalChannel(file50, (long) 2);
        journalChannel52.nextPrealloc = 10;
        byte[] byteArray55 = journalChannel52.magicWord;
        java.nio.ByteBuffer byteBuffer56 = journalChannel52.zeros;
        int int57 = journalChannel45.read(byteBuffer56);
        int int58 = journalChannel25.read(byteBuffer56);
        int int59 = journalChannel10.read(byteBuffer56);
        int int60 = journalChannel2.read(byteBuffer56);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = journalChannel2.bc;
        int int62 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration34);
        org.junit.Assert.assertNotNull(fileChannel35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(serverConfiguration41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 512 + "'", int57 == 512);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(bufferedChannel61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 5 + "'", int62 == 5);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2399");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, 1048576L, 4, (int) (byte) 0, false, 3, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 32L);
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2400");
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
        byte[] byteArray14 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2401");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 8;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2402");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 8;
        journalChannel2.close();
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.fd;
        java.nio.channels.FileChannel fileChannel13 = journalChannel11.fc;
        byte[] byteArray14 = journalChannel11.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel11.channel;
        java.nio.ByteBuffer byteBuffer16 = journalChannel11.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = journalChannel2.read(byteBuffer16);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2403");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        int int11 = journalChannel2.formatVersion;
        long long12 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        journalChannel2.nextPrealloc = 3;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2404");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', 1L, 0, (long) (short) -1, serverConfiguration12, fileChannelProvider13);
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
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2405");
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
        java.nio.channels.FileChannel fileChannel15 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(fileChannel15);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2406");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2407");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2408");
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
        byte[] byteArray35 = journalChannel2.magicWord;
        byte[] byteArray36 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass37 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2409");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2410");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2411");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = (byte) 100;
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2412");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        byte[] byteArray8 = journalChannel7.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) (byte) 0, (int) (short) 100, (long) (short) -1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2413");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        byte[] byteArray11 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2414");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        int int9 = journalChannel2.getFormatVersion();
        int int10 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2415");
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
        long long14 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        int int18 = journalChannel2.fd;
        byte[] byteArray19 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2416");
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
        long long23 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2417");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2418");
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
        journalChannel2.close();
        journalChannel2.nextPrealloc = (byte) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2419");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2420");
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
        int int35 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2421");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel2.bc = bufferedChannel12;
        journalChannel2.close();
        int int15 = journalChannel2.formatVersion;
        byte[] byteArray16 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2422");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (-1L), (int) '4', (int) (short) 10, true, (int) (short) -1, serverConfiguration23, fileChannelProvider24);
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
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2423");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        byte[] byteArray10 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel11);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2424");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 4L, (int) '#', (long) (byte) 100, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2425");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2426");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(fileChannel3);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2427");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.channels.FileChannel fileChannel8 = journalChannel6.fc;
        byte[] byteArray9 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel6.channel;
        journalChannel6.close();
        journalChannel6.nextPrealloc = 4L;
        java.nio.ByteBuffer byteBuffer14 = journalChannel6.zeros;
        int int15 = journalChannel2.read(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2428");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        int int4 = journalChannel2.formatVersion;
        journalChannel2.close();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2429");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        int int6 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2430");
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
        int int26 = journalChannel2.formatVersion;
        int int27 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2431");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        byte[] byteArray9 = journalChannel7.magicWord;
        journalChannel7.nextPrealloc = (byte) -1;
        journalChannel7.nextPrealloc = (short) 100;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        journalChannel16.nextPrealloc = 10;
        byte[] byteArray19 = journalChannel16.magicWord;
        java.nio.ByteBuffer byteBuffer20 = journalChannel16.zeros;
        java.nio.channels.FileChannel fileChannel21 = journalChannel16.fc;
        int int22 = journalChannel16.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel16.bc;
        java.nio.ByteBuffer byteBuffer24 = journalChannel16.zeros;
        int int25 = journalChannel7.read(byteBuffer24);
        java.nio.ByteBuffer byteBuffer26 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, 100L, (int) '#', 1L, serverConfiguration27, fileChannelProvider28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2432");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(fileChannel3);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2433");
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
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2434");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        journalChannel2.close();
        int int8 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2435");
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
        byte[] byteArray15 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2436");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        byte[] byteArray3 = journalChannel2.magicWord;
        int int4 = journalChannel2.formatVersion;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2437");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        journalChannel2.close();
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
// flaky "9) test2437(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
// flaky "3) test2437(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2438");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 0L;
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2439");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        journalChannel2.nextPrealloc = (byte) -1;
        byte[] byteArray12 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2440");
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
        journalChannel2.nextPrealloc = 35L;
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
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2441");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2442");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        int int3 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2443");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2444");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        int int9 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer12 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2445");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        byte[] byteArray9 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2446");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration4);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2447");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.nextPrealloc = 'a';
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        journalChannel15.nextPrealloc = (byte) 1;
        long long20 = journalChannel15.nextPrealloc;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        int int24 = journalChannel23.fd;
        java.nio.ByteBuffer byteBuffer25 = journalChannel23.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel26 = journalChannel23.channel;
        journalChannel23.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel29 = journalChannel23.channel;
        java.io.File file30 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file30, (long) 2);
        journalChannel32.nextPrealloc = 10;
        journalChannel32.nextPrealloc = 0L;
        int int37 = journalChannel32.formatVersion;
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = journalChannel40.bc;
        journalChannel40.close();
        java.nio.ByteBuffer byteBuffer43 = journalChannel40.zeros;
        int int44 = journalChannel32.read(byteBuffer43);
        int int45 = journalChannel23.read(byteBuffer43);
        int int46 = journalChannel15.read(byteBuffer43);
        int int47 = journalChannel7.read(byteBuffer43);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration48 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel50 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) 0, (-1), 1048576L, serverConfiguration48, fileChannelProvider49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(bookieFileChannel26);
        org.junit.Assert.assertNotNull(bookieFileChannel29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration48);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2448");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        int int17 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2449");
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
        int int19 = journalChannel7.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) (short) 10, (int) (short) 1, (long) (byte) 1, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2450");
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
        int int17 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (byte) 10;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2451");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2452");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2453");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        java.io.File file3 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel5 = new org.apache.bookkeeper.bookie.JournalChannel(file3, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel5.bc;
        long long7 = journalChannel5.nextPrealloc;
        long long8 = journalChannel5.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel5.configuration;
        java.nio.ByteBuffer byteBuffer10 = journalChannel5.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
// flaky "10) test2453(org.apache.bookkeeper.bookie.JournalChannelTest4)":         org.junit.Assert.assertNull(bufferedChannel12);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2454");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        long long8 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        int int10 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2455");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        int int13 = journalChannel2.fd;
        int int14 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2456");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel6.channel;
        java.nio.channels.FileChannel fileChannel11 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) 0, (int) ' ', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2457");
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
        int int17 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2458");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2459");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel2.bc = bufferedChannel21;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel2.channel;
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
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2460");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2461");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        int int9 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2462");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2463");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2464");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2465");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        long long10 = journalChannel9.nextPrealloc;
        int int11 = journalChannel9.fd;
        int int12 = journalChannel9.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 6L, (int) (short) 0, (int) '4', true, (-1), serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2466");
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
        journalChannel2.close();
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
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2467");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        int int9 = journalChannel2.getFormatVersion();
        byte[] byteArray10 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel11);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2468");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel2.channel;
        int int18 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2469");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2470");
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
        int int38 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer39 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(byteBuffer39);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2471");
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
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        long long15 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2472");
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
        long long29 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = (short) -1;
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2473");
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
        long long18 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2474");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2475");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel2.configuration;
        long long20 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2476");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel2.bc;
        int int28 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2477");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) 'a', (int) ' ', 5, false, (int) (byte) -1, serverConfiguration28, fileChannelProvider29);
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
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2478");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        int int11 = journalChannel2.formatVersion;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel14.configuration;
        journalChannel14.nextPrealloc = 1048576L;
        int int18 = journalChannel14.formatVersion;
        java.nio.ByteBuffer byteBuffer19 = journalChannel14.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel2.bc = bufferedChannel22;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2479");
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
        journalChannel2.close();
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
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2480");
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
        byte[] byteArray15 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2481");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        journalChannel10.nextPrealloc = 3;
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
        int int36 = journalChannel10.read(byteBuffer34);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration37 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) 10, 100, (int) ' ', true, 1, bufferedChannelBuilder7, serverConfiguration37, fileChannelProvider38, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration37);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2482");
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
        byte[] byteArray23 = journalChannel2.magicWord;
        long long24 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel25 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(fileChannel25);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2483");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        int int7 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (byte) 1;
        int int11 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2484");
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
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel14.channel;
        journalChannel14.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel14.channel;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        journalChannel23.nextPrealloc = 10;
        journalChannel23.nextPrealloc = 0L;
        int int28 = journalChannel23.formatVersion;
        java.io.File file29 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file29, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = journalChannel31.bc;
        journalChannel31.close();
        java.nio.ByteBuffer byteBuffer34 = journalChannel31.zeros;
        int int35 = journalChannel23.read(byteBuffer34);
        int int36 = journalChannel14.read(byteBuffer34);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = null;
        journalChannel14.bc = bufferedChannel37;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel39 = journalChannel14.channel;
        java.nio.ByteBuffer byteBuffer40 = journalChannel14.zeros;
        int int41 = journalChannel2.read(byteBuffer40);
        java.nio.ByteBuffer byteBuffer42 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(bookieFileChannel39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertNotNull(byteBuffer42);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2485");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel2.bc = bufferedChannel13;
        journalChannel2.nextPrealloc = (-1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2486");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        int int3 = journalChannel2.formatVersion;
        int int4 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2487");
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
        journalChannel2.nextPrealloc = 2;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(bufferedChannel14);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2488");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 6;
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6L + "'", long8 == 6L);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2489");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        journalChannel2.close();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2490");
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
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.bc;
        byte[] byteArray18 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2491");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = null;
        journalChannel2.bc = bufferedChannel29;
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
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2492");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.nextPrealloc = 'a';
        long long12 = journalChannel6.nextPrealloc;
        int int13 = journalChannel6.fd;
        int int14 = journalChannel6.getFormatVersion();
        int int15 = journalChannel6.formatVersion;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel18.configuration;
        journalChannel18.nextPrealloc = 1048576L;
        int int22 = journalChannel18.formatVersion;
        java.nio.ByteBuffer byteBuffer23 = journalChannel18.zeros;
        int int24 = journalChannel6.read(byteBuffer23);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) (byte) 1, (int) '#', serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2493");
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
        byte[] byteArray19 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel2.channel;
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
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bookieFileChannel23);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2494");
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
        byte[] byteArray14 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2495");
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
        journalChannel6.nextPrealloc = (-1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) 8, 5, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2496");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        journalChannel10.nextPrealloc = (byte) 1;
        long long15 = journalChannel10.nextPrealloc;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        int int19 = journalChannel18.fd;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel18.channel;
        journalChannel18.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel18.channel;
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        journalChannel27.nextPrealloc = 10;
        journalChannel27.nextPrealloc = 0L;
        int int32 = journalChannel27.formatVersion;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = journalChannel35.bc;
        journalChannel35.close();
        java.nio.ByteBuffer byteBuffer38 = journalChannel35.zeros;
        int int39 = journalChannel27.read(byteBuffer38);
        int int40 = journalChannel18.read(byteBuffer38);
        int int41 = journalChannel10.read(byteBuffer38);
        int int42 = journalChannel2.read(byteBuffer38);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration43 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(bookieFileChannel24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration43);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2497");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        int int3 = journalChannel2.formatVersion;
        int int4 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2498");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        long long6 = journalChannel2.nextPrealloc;
        int int7 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2499");
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
        long long14 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest4.test2500");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        long long9 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }
}
