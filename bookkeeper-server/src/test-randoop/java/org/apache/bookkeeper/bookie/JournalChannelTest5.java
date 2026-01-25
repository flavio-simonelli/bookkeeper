package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JournalChannelTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2501");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2502");
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
        byte[] byteArray14 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2503");
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
        long long18 = journalChannel2.nextPrealloc;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) (byte) -1);
        byte[] byteArray22 = journalChannel21.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel21.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel21.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = journalChannel21.bc;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) 2);
        journalChannel28.nextPrealloc = 10;
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        int int34 = journalChannel33.fd;
        java.nio.ByteBuffer byteBuffer35 = journalChannel33.zeros;
        int int36 = journalChannel28.read(byteBuffer35);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration37 = journalChannel28.configuration;
        byte[] byteArray38 = journalChannel28.magicWord;
        long long39 = journalChannel28.nextPrealloc;
        int int40 = journalChannel28.getFormatVersion();
        java.nio.ByteBuffer byteBuffer41 = journalChannel28.zeros;
        int int42 = journalChannel21.read(byteBuffer41);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = journalChannel2.read(byteBuffer41);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
// flaky "1) test2503(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertNull(bufferedChannel25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2504");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2505");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel9.bc = bufferedChannel22;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = null;
        journalChannel9.bc = bufferedChannel24;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) (short) 10);
        byte[] byteArray29 = journalChannel28.magicWord;
        int int30 = journalChannel28.formatVersion;
        journalChannel28.nextPrealloc = ' ';
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        journalChannel35.nextPrealloc = 10;
        java.io.File file38 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel40 = new org.apache.bookkeeper.bookie.JournalChannel(file38, (long) 2);
        int int41 = journalChannel40.fd;
        java.nio.ByteBuffer byteBuffer42 = journalChannel40.zeros;
        int int43 = journalChannel35.read(byteBuffer42);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration44 = journalChannel35.configuration;
        java.nio.channels.FileChannel fileChannel45 = journalChannel35.fc;
        int int46 = journalChannel35.formatVersion;
        journalChannel35.nextPrealloc = (byte) 1;
        java.io.File file49 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel51 = new org.apache.bookkeeper.bookie.JournalChannel(file49, (long) 3);
        java.io.File file52 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel54 = new org.apache.bookkeeper.bookie.JournalChannel(file52, (long) 2);
        journalChannel54.nextPrealloc = 10;
        journalChannel54.nextPrealloc = 0L;
        int int59 = journalChannel54.formatVersion;
        java.io.File file60 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel62 = new org.apache.bookkeeper.bookie.JournalChannel(file60, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = journalChannel62.bc;
        journalChannel62.close();
        java.nio.ByteBuffer byteBuffer65 = journalChannel62.zeros;
        int int66 = journalChannel54.read(byteBuffer65);
        java.io.File file67 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel69 = new org.apache.bookkeeper.bookie.JournalChannel(file67, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel70 = journalChannel69.channel;
        java.nio.ByteBuffer byteBuffer71 = journalChannel69.zeros;
        int int72 = journalChannel54.read(byteBuffer71);
        int int73 = journalChannel51.read(byteBuffer71);
        java.nio.ByteBuffer byteBuffer74 = journalChannel51.zeros;
        int int75 = journalChannel35.read(byteBuffer74);
        int int76 = journalChannel28.read(byteBuffer74);
        int int77 = journalChannel9.read(byteBuffer74);
        int int78 = journalChannel2.read(byteBuffer74);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 512 + "'", int43 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration44);
        org.junit.Assert.assertNotNull(fileChannel45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 512 + "'", int66 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel70);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 512 + "'", int72 == 512);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteBuffer74);
// flaky "2) test2505(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 512 + "'", int75 == 512);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2506");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) '4', 5, (-1), true, 5, bufferedChannelBuilder7, serverConfiguration27, fileChannelProvider28, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2507");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass5 = fileChannel4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2508");
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
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2509");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.nextPrealloc = (short) 0;
        int int6 = journalChannel2.fd;
        int int7 = journalChannel2.getFormatVersion();
// flaky "3) test2509(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2510");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2511");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) (byte) -1);
        byte[] byteArray13 = journalChannel12.magicWord;
        java.nio.ByteBuffer byteBuffer14 = journalChannel12.zeros;
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        journalChannel17.nextPrealloc = (byte) 1;
        long long22 = journalChannel17.nextPrealloc;
        java.nio.ByteBuffer byteBuffer23 = journalChannel17.zeros;
        int int24 = journalChannel12.read(byteBuffer23);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel25 = journalChannel12.channel;
        int int26 = journalChannel12.formatVersion;
        int int27 = journalChannel12.fd;
        java.nio.channels.FileChannel fileChannel28 = journalChannel12.fc;
        java.nio.ByteBuffer byteBuffer29 = journalChannel12.zeros;
        int int30 = journalChannel2.read(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fileChannel28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2512");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2513");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 0);
        int int11 = journalChannel10.getFormatVersion();
        int int12 = journalChannel10.fd;
        int int13 = journalChannel10.getFormatVersion();
        journalChannel10.close();
        java.nio.channels.FileChannel fileChannel15 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 0L, (int) '4', (int) (short) 10, false, 0, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2514");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        int int13 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel10.bc = bufferedChannel15;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel17 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, 35L, 8, (int) '4', false, 4, bufferedChannelBuilder7, serverConfiguration18, fileChannelProvider19, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2515");
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
        journalChannel2.nextPrealloc = '#';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2516");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        int int11 = journalChannel2.formatVersion;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel14.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel14.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel14.bc;
        int int18 = journalChannel14.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel14.channel;
        long long20 = journalChannel14.nextPrealloc;
        java.nio.ByteBuffer byteBuffer21 = journalChannel14.zeros;
        int int22 = journalChannel2.read(byteBuffer21);
        java.nio.ByteBuffer byteBuffer23 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
// flaky "4) test2516(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
// flaky "1) test2516(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer21);
// flaky "1) test2516(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2517");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        int int4 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2518");
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
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 0);
        int int15 = journalChannel14.getFormatVersion();
        int int16 = journalChannel14.getFormatVersion();
        java.nio.ByteBuffer byteBuffer17 = journalChannel14.zeros;
        int int18 = journalChannel2.read(byteBuffer17);
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        int int22 = journalChannel21.fd;
        java.nio.ByteBuffer byteBuffer23 = journalChannel21.zeros;
        java.nio.channels.FileChannel fileChannel24 = journalChannel21.fc;
        int int25 = journalChannel21.getFormatVersion();
        int int26 = journalChannel21.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel21.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel28 = journalChannel21.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel29 = journalChannel21.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = null;
        journalChannel21.bc = bufferedChannel30;
        java.io.File file32 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file32, (long) (byte) -1);
        byte[] byteArray35 = journalChannel34.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel36 = journalChannel34.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel37 = journalChannel34.channel;
        journalChannel34.nextPrealloc = 8;
        journalChannel34.close();
        java.nio.ByteBuffer byteBuffer41 = journalChannel34.zeros;
        int int42 = journalChannel21.read(byteBuffer41);
        int int43 = journalChannel2.read(byteBuffer41);
        journalChannel2.nextPrealloc = 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(fileChannel24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(bookieFileChannel28);
        org.junit.Assert.assertNotNull(bookieFileChannel29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel36);
        org.junit.Assert.assertNotNull(bookieFileChannel37);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2519");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (byte) 1, 512, (int) (short) 100, true, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2520");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2521");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2522");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2523");
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
        journalChannel2.nextPrealloc = 1048576L;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel2.configuration;
        int int22 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2524");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2525");
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
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel16 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2526");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        int int10 = journalChannel9.fd;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        journalChannel13.nextPrealloc = 10;
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        int int19 = journalChannel18.fd;
        java.nio.ByteBuffer byteBuffer20 = journalChannel18.zeros;
        int int21 = journalChannel13.read(byteBuffer20);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel13.configuration;
        java.nio.channels.FileChannel fileChannel23 = journalChannel13.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = null;
        journalChannel13.bc = bufferedChannel24;
        int int26 = journalChannel13.getFormatVersion();
        byte[] byteArray27 = journalChannel13.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = journalChannel13.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel13.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = journalChannel13.bc;
        java.nio.ByteBuffer byteBuffer31 = journalChannel13.zeros;
        int int32 = journalChannel9.read(byteBuffer31);
        long long33 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration34 = journalChannel9.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration35 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel37 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) (short) -1, (int) (short) 0, 0, true, (int) (short) 1, serverConfiguration35, fileChannelProvider36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(serverConfiguration29);
        org.junit.Assert.assertNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration34);
        org.junit.Assert.assertNotNull(serverConfiguration35);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2527");
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
        journalChannel2.close();
        int int31 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2528");
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
        java.nio.channels.FileChannel fileChannel38 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(fileChannel38);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2529");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, 1L, (int) (short) 0, serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2530");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2531");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        journalChannel2.close();
        byte[] byteArray14 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 32L;
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2532");
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
        int int19 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2533");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) 1, (int) (short) 1, 2, true, (int) '#', bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2534");
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
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel2.bc = bufferedChannel22;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2535");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) 6, 100, 100, true, 8, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2536");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        journalChannel2.close();
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
// flaky "5) test2536(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2537");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, 1048576L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel9.bc = bufferedChannel10;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) 5, (int) (byte) 100, 0, false, 2, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2538");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        int int7 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel8);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2539");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2540");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2541");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel20 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(fileChannel20);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2542");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2543");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        journalChannel9.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel9.channel;
        java.nio.channels.FileChannel fileChannel14 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) 512, (int) (byte) 0, 8, false, 100, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2544");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        journalChannel2.close();
        journalChannel2.close();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2545");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2546");
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
        java.nio.ByteBuffer byteBuffer43 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteBuffer43);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2547");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        long long6 = journalChannel2.nextPrealloc;
        int int7 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        long long9 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2548");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = null;
        journalChannel2.bc = bufferedChannel19;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2549");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        int int6 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 5;
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fileChannel9);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2550");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2551");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        int int7 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2552");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        journalChannel2.nextPrealloc = '#';
        long long5 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = journalChannel2.read(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2553");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2554");
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
        byte[] byteArray22 = journalChannel2.magicWord;
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2555");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2556");
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
        java.lang.Class<?> wildcardClass12 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2557");
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
        int int23 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2558");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        int int11 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2559");
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
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2560");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = null;
        journalChannel2.bc = bufferedChannel15;
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
        org.junit.Assert.assertNull(bufferedChannel14);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2561");
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
        long long20 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2562");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 97L, (int) (byte) -1, (int) '4', false, 2, serverConfiguration28, fileChannelProvider29);
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2563");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 52L;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2564");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, 97L, 8, 1L, serverConfiguration16, fileChannelProvider17);
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
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2565");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2566");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        byte[] byteArray4 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (byte) -1;
        byte[] byteArray7 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 100);
// flaky "6) test2566(org.apache.bookkeeper.bookie.JournalChannelTest5)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "2) test2566(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2567");
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
        int int35 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2568");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel6.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel6.bc;
        int int12 = journalChannel6.getFormatVersion();
        byte[] byteArray13 = journalChannel6.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 4, 10, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2569");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        int int9 = journalChannel7.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel7.bc = bufferedChannel10;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, (long) (short) 1, (int) (byte) 100, (long) 6, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2570");
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
        journalChannel2.nextPrealloc = 100L;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2571");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        long long6 = journalChannel2.nextPrealloc;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2572");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel8);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2573");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1);
        long long3 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = 0L;
        int int6 = journalChannel2.getFormatVersion();
        byte[] byteArray7 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2574");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 10L;
        long long10 = journalChannel2.nextPrealloc;
        int int11 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2575");
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
        int int14 = journalChannel2.getFormatVersion();
        int int15 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2576");
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
        int int15 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2577");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        int int5 = journalChannel2.fd;
        int int6 = journalChannel2.fd;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        int int10 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2578");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2579");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2580");
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
        int int33 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration34 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel37 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 1048576L, (int) (short) 10, 3, true, (int) (byte) -1, bufferedChannelBuilder7, serverConfiguration34, fileChannelProvider35, (java.lang.Long) 10L);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration34);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2581");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel14 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel15 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel2.configuration;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel14);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2582");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 10L;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2583");
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
        byte[] byteArray16 = journalChannel2.magicWord;
        int int17 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2584");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        int int9 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass11 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2585");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        int int5 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2586");
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
        int int15 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2587");
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
        java.nio.channels.FileChannel fileChannel20 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(fileChannel20);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2588");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2589");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        long long11 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer12 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2590");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        int int11 = journalChannel9.formatVersion;
        int int12 = journalChannel9.fd;
        long long13 = journalChannel9.nextPrealloc;
        java.nio.ByteBuffer byteBuffer14 = journalChannel9.zeros;
        int int15 = journalChannel2.read(byteBuffer14);
        journalChannel2.nextPrealloc = (byte) 1;
        long long18 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2591");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (short) 1);
        int int8 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 52L, (long) (byte) 100, (int) (short) 1, (long) (short) 100, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2592");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = null;
        journalChannel2.bc = bufferedChannel19;
        int int21 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2593");
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
        byte[] byteArray39 = journalChannel2.magicWord;
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
        org.junit.Assert.assertNotNull(serverConfiguration36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2594");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2595");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        byte[] byteArray5 = journalChannel2.magicWord;
// flaky "7) test2595(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2596");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        int int20 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2597");
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
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2598");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 6, (-1), serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2599");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.formatVersion;
        journalChannel6.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer10 = journalChannel6.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2600");
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
        journalChannel2.close();
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
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2601");
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
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
        int int19 = journalChannel2.getFormatVersion();
        long long20 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2602");
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
        int int17 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer18 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2603");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        byte[] byteArray13 = journalChannel10.magicWord;
        journalChannel10.nextPrealloc = 2;
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
        int int50 = journalChannel10.read(byteBuffer46);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration51 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel54 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (short) -1, (int) ' ', 0, true, (int) (short) 0, bufferedChannelBuilder7, serverConfiguration51, fileChannelProvider52, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
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
        org.junit.Assert.assertNotNull(serverConfiguration51);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2604");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2605");
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
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 3);
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
        java.io.File file34 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel36 = new org.apache.bookkeeper.bookie.JournalChannel(file34, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel37 = journalChannel36.channel;
        java.nio.ByteBuffer byteBuffer38 = journalChannel36.zeros;
        int int39 = journalChannel21.read(byteBuffer38);
        int int40 = journalChannel18.read(byteBuffer38);
        java.nio.ByteBuffer byteBuffer41 = journalChannel18.zeros;
        int int42 = journalChannel2.read(byteBuffer41);
        java.nio.channels.FileChannel fileChannel43 = journalChannel2.fc;
        java.io.File file44 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel46 = new org.apache.bookkeeper.bookie.JournalChannel(file44, (long) 2);
        int int47 = journalChannel46.fd;
        java.nio.ByteBuffer byteBuffer48 = journalChannel46.zeros;
        journalChannel46.nextPrealloc = (byte) 1;
        long long51 = journalChannel46.nextPrealloc;
        java.io.File file52 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel54 = new org.apache.bookkeeper.bookie.JournalChannel(file52, (long) 2);
        int int55 = journalChannel54.fd;
        java.nio.ByteBuffer byteBuffer56 = journalChannel54.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel57 = journalChannel54.channel;
        journalChannel54.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel60 = journalChannel54.channel;
        java.io.File file61 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel63 = new org.apache.bookkeeper.bookie.JournalChannel(file61, (long) 2);
        journalChannel63.nextPrealloc = 10;
        journalChannel63.nextPrealloc = 0L;
        int int68 = journalChannel63.formatVersion;
        java.io.File file69 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel71 = new org.apache.bookkeeper.bookie.JournalChannel(file69, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel72 = journalChannel71.bc;
        journalChannel71.close();
        java.nio.ByteBuffer byteBuffer74 = journalChannel71.zeros;
        int int75 = journalChannel63.read(byteBuffer74);
        int int76 = journalChannel54.read(byteBuffer74);
        int int77 = journalChannel46.read(byteBuffer74);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel78 = null;
        journalChannel46.bc = bufferedChannel78;
        journalChannel46.nextPrealloc = 4L;
        java.io.File file82 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel84 = new org.apache.bookkeeper.bookie.JournalChannel(file82, (long) 100);
        int int85 = journalChannel84.getFormatVersion();
        java.io.File file86 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel88 = new org.apache.bookkeeper.bookie.JournalChannel(file86, (long) 2);
        int int89 = journalChannel88.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel90 = journalChannel88.bc;
        byte[] byteArray91 = journalChannel88.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel92 = null;
        journalChannel88.bc = bufferedChannel92;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel94 = journalChannel88.channel;
        java.nio.ByteBuffer byteBuffer95 = journalChannel88.zeros;
        int int96 = journalChannel84.read(byteBuffer95);
        int int97 = journalChannel46.read(byteBuffer95);
        int int98 = journalChannel2.read(byteBuffer95);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration99 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertNotNull(fileChannel43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(bookieFileChannel57);
        org.junit.Assert.assertNotNull(bookieFileChannel60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5 + "'", int68 == 5);
        org.junit.Assert.assertNull(bufferedChannel72);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 512 + "'", int75 == 512);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNull(bufferedChannel90);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel94);
        org.junit.Assert.assertNotNull(byteBuffer95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 512 + "'", int96 == 512);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration99);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2606");
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
        java.nio.channels.FileChannel fileChannel20 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(fileChannel20);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2607");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (-1L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2608");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        int int8 = journalChannel2.fd;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2609");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass10 = fileChannel9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(fileChannel9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2610");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        int int13 = journalChannel10.fd;
        byte[] byteArray14 = journalChannel10.magicWord;
        long long15 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 1, (int) (byte) 10, (int) '#', false, 8, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2611");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2612");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        journalChannel2.nextPrealloc = (-1L);
        int int5 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2613");
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
        java.nio.ByteBuffer byteBuffer14 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2614");
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
        long long20 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer21 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass22 = byteBuffer21.getClass();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2615");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.close();
        int int8 = journalChannel2.getFormatVersion();
        long long9 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2616");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = journalChannel2.read(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2617");
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
        int int13 = journalChannel2.getFormatVersion();
        byte[] byteArray14 = journalChannel2.magicWord;
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2618");
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
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel25 = journalChannel10.channel;
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel30 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 0L, (int) '4', (int) 'a', true, (int) (byte) -1, bufferedChannelBuilder7, serverConfiguration27, fileChannelProvider28, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration24);
        org.junit.Assert.assertNotNull(bookieFileChannel25);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2619");
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
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        journalChannel18.nextPrealloc = 10;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        int int24 = journalChannel23.fd;
        java.nio.ByteBuffer byteBuffer25 = journalChannel23.zeros;
        int int26 = journalChannel18.read(byteBuffer25);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel18.configuration;
        java.nio.channels.FileChannel fileChannel28 = journalChannel18.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = null;
        journalChannel18.bc = bufferedChannel29;
        int int31 = journalChannel18.getFormatVersion();
        java.nio.channels.FileChannel fileChannel32 = journalChannel18.fc;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration36 = journalChannel35.configuration;
        int int37 = journalChannel35.formatVersion;
        java.nio.ByteBuffer byteBuffer38 = journalChannel35.zeros;
        int int39 = journalChannel18.read(byteBuffer38);
        int int40 = journalChannel2.read(byteBuffer38);
        byte[] byteArray41 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNotNull(fileChannel28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(fileChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2620");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2621");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        byte[] byteArray8 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2622");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        int int9 = journalChannel7.fd;
        int int10 = journalChannel7.getFormatVersion();
        journalChannel7.nextPrealloc = 3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) -1, 5, (long) 'a', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2623");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (-1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2624");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2625");
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
        int int15 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2626");
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
        int int19 = journalChannel7.fd;
        journalChannel7.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel7.bc = bufferedChannel21;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 35L, (int) (byte) 100, (long) 100, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2627");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2628");
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
        int int15 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel16 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNull(bufferedChannel18);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2629");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        byte[] byteArray9 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2630");
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
            journalChannel2.preAllocIfNeeded((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2631");
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
        byte[] byteArray18 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2632");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2633");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2634");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2635");
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
        int int21 = journalChannel10.formatVersion;
        journalChannel10.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = null;
        journalChannel10.bc = bufferedChannel24;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = null;
        journalChannel10.bc = bufferedChannel26;
        int int28 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, 52L, (int) (byte) 100, 1, false, 2, bufferedChannelBuilder7, serverConfiguration29, fileChannelProvider30, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2636");
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
        long long12 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2637");
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
        int int17 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        byte[] byteArray19 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = null;
        journalChannel2.bc = bufferedChannel20;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel2.bc = bufferedChannel22;
        long long24 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2638");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L, 52L, 2, serverConfiguration16, fileChannelProvider17);
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2639");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
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
        java.nio.ByteBuffer byteBuffer23 = journalChannel12.zeros;
        int int24 = journalChannel2.read(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration21);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2640");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = null;
        journalChannel2.bc = bufferedChannel37;
        journalChannel2.close();
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
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2641");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2642");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel5);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2643");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel8.configuration;
        journalChannel8.close();
        java.nio.ByteBuffer byteBuffer11 = journalChannel8.zeros;
        int int12 = journalChannel2.read(byteBuffer11);
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        journalChannel2.close();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2644");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        byte[] byteArray9 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.formatVersion;
        journalChannel14.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer18 = journalChannel14.zeros;
        int int19 = journalChannel2.read(byteBuffer18);
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2645");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        int int10 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNull(bufferedChannel12);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2646");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        byte[] byteArray6 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2647");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel6.bc = bufferedChannel16;
        int int18 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) (short) 10, 3, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2648");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
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
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel25.bc;
        journalChannel25.close();
        java.nio.ByteBuffer byteBuffer28 = journalChannel25.zeros;
        java.nio.ByteBuffer byteBuffer29 = journalChannel25.zeros;
        int int30 = journalChannel10.read(byteBuffer29);
        int int31 = journalChannel2.read(byteBuffer29);
        int int32 = journalChannel2.fd;
        long long33 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2649");
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
        java.lang.Class<?> wildcardClass39 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2650");
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
        int int19 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(bufferedChannel20);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2651");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        long long7 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2652");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2653");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        int int12 = journalChannel9.fd;
        byte[] byteArray13 = journalChannel9.magicWord;
        long long14 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (byte) -1, (int) (short) -1, 0, true, (int) (short) 10, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2654");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) 'a', (int) (byte) 100, 2, true, 0, serverConfiguration21, fileChannelProvider22);
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2655");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 0);
        int int7 = journalChannel6.getFormatVersion();
        int int8 = journalChannel6.fd;
        int int9 = journalChannel6.getFormatVersion();
        journalChannel6.close();
        java.nio.channels.FileChannel fileChannel11 = journalChannel6.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 2L, 5, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2656");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2657");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), (-1L), 6, 32L, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2658");
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
        journalChannel2.nextPrealloc = 2;
        int int21 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2659");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2660");
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
        java.nio.channels.FileChannel fileChannel19 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel19);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2661");
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
        java.nio.ByteBuffer byteBuffer26 = journalChannel9.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, 4L, (int) (short) 10, 0, false, (int) (byte) -1, serverConfiguration27, fileChannelProvider28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(serverConfiguration27);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2662");
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
            journalChannel2.forceWrite(false);
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2663");
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
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        int int20 = journalChannel19.fd;
        java.nio.ByteBuffer byteBuffer21 = journalChannel19.zeros;
        int int22 = journalChannel19.fd;
        int int23 = journalChannel19.fd;
        java.nio.ByteBuffer byteBuffer24 = journalChannel19.zeros;
        int int25 = journalChannel2.read(byteBuffer24);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2664");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = null;
        journalChannel2.bc = bufferedChannel19;
        long long21 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2665");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2666");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        int int3 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        int int5 = journalChannel2.getFormatVersion();
        byte[] byteArray6 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass7 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2667");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 0);
        int int11 = journalChannel10.getFormatVersion();
        int int12 = journalChannel10.fd;
        int int13 = journalChannel10.getFormatVersion();
        journalChannel10.close();
        java.nio.channels.FileChannel fileChannel15 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) (byte) 0, 0, (-1), false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2668");
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
        journalChannel2.nextPrealloc = 'a';
        journalChannel2.nextPrealloc = 10;
        int int18 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2669");
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
        int int21 = journalChannel10.formatVersion;
        journalChannel10.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = null;
        journalChannel10.bc = bufferedChannel24;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = null;
        journalChannel10.bc = bufferedChannel26;
        int int28 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 512, (int) 'a', 6, false, (int) (short) 100, bufferedChannelBuilder7, serverConfiguration29, fileChannelProvider30, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2670");
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
        int int23 = journalChannel10.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel10.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, 10L, (int) '#', 0, false, (int) '4', bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2671");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        int int8 = journalChannel2.fd;
        journalChannel2.nextPrealloc = ' ';
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2672");
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
        int int20 = journalChannel2.formatVersion;
        byte[] byteArray21 = journalChannel2.magicWord;
        byte[] byteArray22 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel23);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2673");
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
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel10.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 4L, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2674");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, 0L);
        long long7 = journalChannel6.nextPrealloc;
        int int8 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 52L, 2, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2675");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2676");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel6.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel6.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel6.bc = bufferedChannel9;
        int int11 = journalChannel6.getFormatVersion();
        byte[] byteArray12 = journalChannel6.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, 0L, 2, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2677");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 32L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2678");
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
        int int37 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration38 = journalChannel2.configuration;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration38);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2679");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        int int5 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2680");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        int int6 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2681");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2682");
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
        int int16 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2683");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2684");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
        int int8 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2685");
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
        java.nio.channels.FileChannel fileChannel15 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(fileChannel15);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2686");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2687");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2688");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        byte[] byteArray4 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2689");
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
        long long17 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2690");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        int int6 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2691");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2692");
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
        int int19 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2693");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 1L, (int) '#', (long) (short) 100, serverConfiguration13, fileChannelProvider14);
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2694");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel2.configuration;
        byte[] byteArray18 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2695");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        long long9 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2696");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel49 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
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
        org.junit.Assert.assertNotNull(bookieFileChannel49);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2697");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        journalChannel9.nextPrealloc = (byte) 1;
        long long14 = journalChannel9.nextPrealloc;
        java.nio.channels.FileChannel fileChannel15 = journalChannel9.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel9.bc = bufferedChannel16;
        int int18 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 0L, 0, 6, false, (int) (byte) 10, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2698");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        int int8 = journalChannel2.getFormatVersion();
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2699");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2700");
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
        java.nio.channels.FileChannel fileChannel24 = journalChannel2.fc;
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
        org.junit.Assert.assertNotNull(fileChannel24);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2701");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2702");
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
        java.nio.channels.FileChannel fileChannel21 = journalChannel7.fc;
        java.nio.channels.FileChannel fileChannel22 = journalChannel7.fc;
        journalChannel7.nextPrealloc = (short) 1;
        byte[] byteArray25 = journalChannel7.magicWord;
        journalChannel7.nextPrealloc = 100;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel28 = journalChannel7.channel;
        java.nio.channels.FileChannel fileChannel29 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration30 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, (long) 512, (int) (byte) 10, 0L, serverConfiguration30, fileChannelProvider31);
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
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(fileChannel22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel28);
        org.junit.Assert.assertNotNull(fileChannel29);
        org.junit.Assert.assertNotNull(serverConfiguration30);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2703");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNull(bufferedChannel14);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2704");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel10.bc;
        long long12 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel10.bc = bufferedChannel13;
        int int15 = journalChannel10.formatVersion;
        int int16 = journalChannel10.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, 52L, (int) (byte) 0, (int) (byte) 1, false, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2705");
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
        java.lang.Class<?> wildcardClass18 = fileChannel17.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2706");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2707");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) 3, 2, (int) (short) 10, false, (int) ' ', bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2708");
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
        byte[] byteArray23 = journalChannel2.magicWord;
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2709");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2710");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 0L, (int) (short) -1, serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2711");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 35L, 512, (long) 0, serverConfiguration21, fileChannelProvider22);
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
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2712");
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
        int int17 = journalChannel2.fd;
        journalChannel2.close();
        long long19 = journalChannel2.nextPrealloc;
        byte[] byteArray20 = journalChannel2.magicWord;
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2713");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        int int16 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNull(bufferedChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2714");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 6, (int) (byte) 100, 3L, serverConfiguration20, fileChannelProvider21);
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
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2715");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.close();
        journalChannel2.nextPrealloc = 1;
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2716");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        int int11 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2717");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2718");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 35L);
        int int3 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2719");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2720");
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
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        journalChannel18.nextPrealloc = 10;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        int int24 = journalChannel23.fd;
        java.nio.ByteBuffer byteBuffer25 = journalChannel23.zeros;
        int int26 = journalChannel18.read(byteBuffer25);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel18.configuration;
        java.nio.channels.FileChannel fileChannel28 = journalChannel18.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = null;
        journalChannel18.bc = bufferedChannel29;
        int int31 = journalChannel18.getFormatVersion();
        java.nio.channels.FileChannel fileChannel32 = journalChannel18.fc;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration36 = journalChannel35.configuration;
        int int37 = journalChannel35.formatVersion;
        java.nio.ByteBuffer byteBuffer38 = journalChannel35.zeros;
        int int39 = journalChannel18.read(byteBuffer38);
        int int40 = journalChannel2.read(byteBuffer38);
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNotNull(fileChannel28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(fileChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2721");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 1048576L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 3);
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
        int int37 = journalChannel15.read(byteBuffer35);
        java.nio.ByteBuffer byteBuffer38 = journalChannel15.zeros;
        int int39 = journalChannel6.read(byteBuffer38);
        int int40 = journalChannel2.read(byteBuffer38);
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2722");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        java.nio.channels.FileChannel fileChannel12 = journalChannel9.fc;
        int int13 = journalChannel9.getFormatVersion();
        int int14 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel9.bc;
        int int16 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) (-1), (int) (short) 10, 5, true, (int) (short) 0, serverConfiguration17, fileChannelProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(bufferedChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2723");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2724");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) 8, (int) (byte) 0, 35L, serverConfiguration26, fileChannelProvider27);
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
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2725");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        journalChannel9.nextPrealloc = 3;
        int int14 = journalChannel9.getFormatVersion();
        byte[] byteArray15 = journalChannel9.magicWord;
        int int16 = journalChannel9.getFormatVersion();
        int int17 = journalChannel9.getFormatVersion();
        long long18 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (-1L), 0, (int) (short) 1, true, (int) '4', serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2726");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 10;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2727");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) ' ', (int) '4', (long) (short) 100, serverConfiguration19, fileChannelProvider20);
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
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2728");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        long long9 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel7.bc = bufferedChannel10;
        int int12 = journalChannel7.formatVersion;
        int int13 = journalChannel7.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) (byte) 100, 2, 0L, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2729");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        int int17 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2730");
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
        int int13 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(fileChannel14);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2731");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        journalChannel2.close();
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2732");
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
        java.nio.channels.FileChannel fileChannel22 = journalChannel2.fc;
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
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(fileChannel22);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2733");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 512;
        long long9 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 512L + "'", long9 == 512L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2734");
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
        java.io.File file20 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file20, (long) 2);
        int int23 = journalChannel22.fd;
        java.nio.ByteBuffer byteBuffer24 = journalChannel22.zeros;
        journalChannel22.nextPrealloc = (byte) 1;
        long long27 = journalChannel22.nextPrealloc;
        java.nio.ByteBuffer byteBuffer28 = journalChannel22.zeros;
        int int29 = journalChannel2.read(byteBuffer28);
        journalChannel2.nextPrealloc = (-1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2735");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        int int9 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2736");
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
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        journalChannel18.nextPrealloc = 10;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        int int24 = journalChannel23.fd;
        java.nio.ByteBuffer byteBuffer25 = journalChannel23.zeros;
        int int26 = journalChannel18.read(byteBuffer25);
        int int27 = journalChannel2.read(byteBuffer25);
        int int28 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2737");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.close();
        int int8 = journalChannel2.getFormatVersion();
        long long9 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2738");
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
        java.nio.ByteBuffer byteBuffer17 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2739");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        int int5 = journalChannel2.getFormatVersion();
        long long6 = journalChannel2.nextPrealloc;
        long long7 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2740");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        long long9 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2741");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        int int11 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2742");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        int int9 = journalChannel7.fd;
        int int10 = journalChannel7.getFormatVersion();
        journalChannel7.nextPrealloc = 3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, 4L, (int) (byte) 100, 97L, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2743");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel6.bc = bufferedChannel16;
        int int18 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 32L, 3, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2744");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        int int9 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel6.bc = bufferedChannel11;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 2, 3, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2745");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        byte[] byteArray9 = journalChannel2.magicWord;
        int int10 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2746");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2747");
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
        long long21 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = null;
        journalChannel9.bc = bufferedChannel22;
        journalChannel9.nextPrealloc = 1;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, 4L, 4, 3, true, (int) (short) 1, serverConfiguration26, fileChannelProvider27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2748");
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
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel2.configuration;
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
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2749");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, 1048576L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel10.bc = bufferedChannel11;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 5, (int) '#', (int) (short) 10, true, (int) (byte) 1, bufferedChannelBuilder7, serverConfiguration13, fileChannelProvider14, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2750");
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
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        int int20 = journalChannel19.fd;
        java.nio.ByteBuffer byteBuffer21 = journalChannel19.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel19.channel;
        journalChannel19.nextPrealloc = 'a';
        long long25 = journalChannel19.nextPrealloc;
        int int26 = journalChannel19.fd;
        int int27 = journalChannel19.getFormatVersion();
        int int28 = journalChannel19.formatVersion;
        java.nio.ByteBuffer byteBuffer29 = journalChannel19.zeros;
        int int30 = journalChannel2.read(byteBuffer29);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2751");
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
        int int13 = journalChannel2.fd;
        int int14 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2752");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        journalChannel2.close();
        int int4 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2753");
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
        long long18 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel2.configuration;
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2754");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2755");
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
        byte[] byteArray28 = journalChannel2.magicWord;
        int int29 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 10;
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2756");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        long long7 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2757");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 4;
        int int9 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2758");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2759");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        byte[] byteArray5 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2760");
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
        byte[] byteArray22 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2761");
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
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel16 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2762");
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
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2763");
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNull(bufferedChannel19);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2764");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        journalChannel14.nextPrealloc = 10;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        int int20 = journalChannel19.fd;
        java.nio.ByteBuffer byteBuffer21 = journalChannel19.zeros;
        int int22 = journalChannel14.read(byteBuffer21);
        int int23 = journalChannel9.read(byteBuffer21);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel9.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) (short) 1, 4, 1, true, (int) (byte) 0, serverConfiguration25, fileChannelProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2765");
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
        journalChannel2.nextPrealloc = 0;
        java.nio.ByteBuffer byteBuffer46 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(byteBuffer46);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2766");
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
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2767");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, 512L, 0, serverConfiguration18, fileChannelProvider19);
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
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2768");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 5);
        byte[] byteArray7 = journalChannel6.magicWord;
        int int8 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 52L, (-1L), (int) (byte) 100, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2769");
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
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2770");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        byte[] byteArray4 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel5);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2771");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        long long3 = journalChannel2.nextPrealloc;
        journalChannel2.nextPrealloc = (byte) 100;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2772");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        journalChannel9.nextPrealloc = 100;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 512L, 512, (-1), true, 100, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2773");
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
        long long27 = journalChannel2.nextPrealloc;
        byte[] byteArray28 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass29 = byteArray28.getClass();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2774");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel6.channel;
        journalChannel6.close();
        int int11 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, (long) 4, 512, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2775");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = (byte) 0;
        int int7 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2776");
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
        java.nio.ByteBuffer byteBuffer16 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2777");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        journalChannel9.nextPrealloc = 3;
        int int14 = journalChannel9.getFormatVersion();
        int int15 = journalChannel9.fd;
        int int16 = journalChannel9.fd;
        int int17 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, 0L, (int) (short) 10, (int) (short) 10, true, (int) '#', serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2778");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (-1), (int) '#', 35L, serverConfiguration23, fileChannelProvider24);
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
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2779");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L);
        long long3 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2780");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2781");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = journalChannel2.bc;
        int int32 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertNull(bufferedChannel31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2782");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2783");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2784");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        int int10 = journalChannel7.getFormatVersion();
        java.nio.ByteBuffer byteBuffer11 = journalChannel7.zeros;
        int int12 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) (short) 0, (int) (byte) 0, (long) ' ', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2785");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        byte[] byteArray6 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = (-1);
        int int9 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2786");
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
        java.nio.ByteBuffer byteBuffer75 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(byteBuffer75);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2787");
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
        journalChannel2.nextPrealloc = 10L;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2788");
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
        long long27 = journalChannel2.nextPrealloc;
        byte[] byteArray28 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2789");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, 0L);
        journalChannel6.nextPrealloc = 0L;
        journalChannel6.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel6.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (-1L), 6, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2790");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2791");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2792");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
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
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel18);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2793");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2794");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel9.bc;
        journalChannel9.nextPrealloc = 3;
        int int14 = journalChannel9.getFormatVersion();
        int int15 = journalChannel9.fd;
        int int16 = journalChannel9.fd;
        int int17 = journalChannel9.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 52L, (long) 6, 10, (int) (byte) 1, true, 1, serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2795");
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
        int int20 = journalChannel2.getFormatVersion();
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) (short) 10);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel24 = journalChannel23.channel;
        long long25 = journalChannel23.nextPrealloc;
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel28.configuration;
        journalChannel28.close();
        java.nio.ByteBuffer byteBuffer31 = journalChannel28.zeros;
        int int32 = journalChannel23.read(byteBuffer31);
        int int33 = journalChannel2.read(byteBuffer31);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2796");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        byte[] byteArray4 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
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
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
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
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2797");
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
        java.nio.channels.FileChannel fileChannel18 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(fileChannel18);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2798");
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
        int int17 = journalChannel2.getFormatVersion();
        int int18 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2799");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        int int9 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2800");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2801");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        journalChannel9.close();
        java.nio.channels.FileChannel fileChannel11 = journalChannel9.fc;
        java.nio.channels.FileChannel fileChannel12 = journalChannel9.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) (short) 10, (int) 'a', (int) ' ', true, (-1), serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2802");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        int int7 = journalChannel6.fd;
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel10.bc;
        java.nio.ByteBuffer byteBuffer28 = journalChannel10.zeros;
        int int29 = journalChannel6.read(byteBuffer28);
        long long30 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration31 = journalChannel6.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration32 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel34 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, 2L, (int) 'a', serverConfiguration32, fileChannelProvider33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
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
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration31);
        org.junit.Assert.assertNotNull(serverConfiguration32);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2803");
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
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2804");
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
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2805");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2806");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2807");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, 0L);
        journalChannel7.nextPrealloc = 0L;
        long long10 = journalChannel7.nextPrealloc;
        java.nio.channels.FileChannel fileChannel11 = journalChannel7.fc;
        int int12 = journalChannel7.formatVersion;
        int int13 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 4L, (long) (short) 1, (int) (short) -1, (long) (byte) 1, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2808");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        java.nio.channels.FileChannel fileChannel10 = journalChannel7.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel7.bc = bufferedChannel11;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel16 = journalChannel15.channel;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        int int18 = journalChannel7.read(byteBuffer17);
        java.nio.channels.FileChannel fileChannel19 = journalChannel7.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, 32L, 2, (long) 512, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2809");
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
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel18.configuration;
        int int20 = journalChannel18.getFormatVersion();
        java.nio.ByteBuffer byteBuffer21 = journalChannel18.zeros;
        int int22 = journalChannel2.read(byteBuffer21);
        java.nio.channels.FileChannel fileChannel23 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(fileChannel23);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2810");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, 3L, (int) (byte) -1, (long) (short) 100, serverConfiguration31, fileChannelProvider32);
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2811");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = null;
        journalChannel2.bc = bufferedChannel25;
        java.nio.ByteBuffer byteBuffer27 = journalChannel2.zeros;
        long long28 = journalChannel2.nextPrealloc;
        long long29 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2812");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        int int11 = journalChannel9.formatVersion;
        int int12 = journalChannel9.fd;
        long long13 = journalChannel9.nextPrealloc;
        java.nio.ByteBuffer byteBuffer14 = journalChannel9.zeros;
        int int15 = journalChannel2.read(byteBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2813");
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
        int int21 = journalChannel2.getFormatVersion();
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
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2814");
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
        long long19 = journalChannel2.nextPrealloc;
        int int20 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2815");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        long long7 = journalChannel2.nextPrealloc;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2816");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, 0L);
        long long8 = journalChannel7.nextPrealloc;
        int int9 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 1L, (int) (byte) 0, (long) (short) 1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2817");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        java.nio.ByteBuffer byteBuffer10 = journalChannel8.zeros;
        journalChannel8.nextPrealloc = (byte) 1;
        long long13 = journalChannel8.nextPrealloc;
        java.io.File file14 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file14, (long) 2);
        int int17 = journalChannel16.fd;
        java.nio.ByteBuffer byteBuffer18 = journalChannel16.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel16.channel;
        journalChannel16.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel16.channel;
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        journalChannel25.nextPrealloc = 10;
        journalChannel25.nextPrealloc = 0L;
        int int30 = journalChannel25.formatVersion;
        java.io.File file31 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file31, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = journalChannel33.bc;
        journalChannel33.close();
        java.nio.ByteBuffer byteBuffer36 = journalChannel33.zeros;
        int int37 = journalChannel25.read(byteBuffer36);
        int int38 = journalChannel16.read(byteBuffer36);
        int int39 = journalChannel8.read(byteBuffer36);
        java.nio.ByteBuffer byteBuffer40 = journalChannel8.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = journalChannel2.read(byteBuffer40);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteBuffer40);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2818");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, 1L, (-1), 100L, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2819");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2820");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        int int9 = journalChannel2.getFormatVersion();
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 0);
        int int13 = journalChannel12.getFormatVersion();
        int int14 = journalChannel12.getFormatVersion();
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.formatVersion;
        journalChannel17.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer21 = journalChannel17.zeros;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        int int25 = journalChannel24.fd;
        java.nio.ByteBuffer byteBuffer26 = journalChannel24.zeros;
        journalChannel24.nextPrealloc = (byte) 1;
        long long29 = journalChannel24.nextPrealloc;
        java.io.File file30 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file30, (long) 2);
        int int33 = journalChannel32.fd;
        java.nio.ByteBuffer byteBuffer34 = journalChannel32.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel35 = journalChannel32.channel;
        journalChannel32.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel38 = journalChannel32.channel;
        java.io.File file39 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        journalChannel41.nextPrealloc = 10;
        journalChannel41.nextPrealloc = 0L;
        int int46 = journalChannel41.formatVersion;
        java.io.File file47 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel49 = new org.apache.bookkeeper.bookie.JournalChannel(file47, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = journalChannel49.bc;
        journalChannel49.close();
        java.nio.ByteBuffer byteBuffer52 = journalChannel49.zeros;
        int int53 = journalChannel41.read(byteBuffer52);
        int int54 = journalChannel32.read(byteBuffer52);
        int int55 = journalChannel24.read(byteBuffer52);
        int int56 = journalChannel17.read(byteBuffer52);
        int int57 = journalChannel12.read(byteBuffer52);
        int int58 = journalChannel2.read(byteBuffer52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(bookieFileChannel35);
        org.junit.Assert.assertNotNull(bookieFileChannel38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNull(bufferedChannel50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 512 + "'", int53 == 512);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2821");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 8;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2822");
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
        journalChannel2.nextPrealloc = 4;
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
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2823");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) 3, 4, 100, false, 10, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2824");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        int int3 = journalChannel2.getFormatVersion();
        journalChannel2.nextPrealloc = 100L;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2825");
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
        long long11 = journalChannel2.nextPrealloc;
        long long12 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2826");
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
        int int21 = journalChannel2.formatVersion;
        int int22 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2827");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        int int10 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = null;
        journalChannel2.bc = bufferedChannel11;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2828");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        long long10 = journalChannel2.nextPrealloc;
        int int11 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2829");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        journalChannel2.nextPrealloc = 0;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2830");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        journalChannel2.close();
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2831");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        journalChannel2.close();
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.fd;
        int int9 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2832");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 10);
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
        org.junit.Assert.assertNull(bufferedChannel20);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2833");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2834");
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
        journalChannel10.nextPrealloc = 0L;
        int int25 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) 512, 2, (int) (byte) 1, false, 512, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2835");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2836");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.nextPrealloc = (short) 100;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2837");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass12 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2838");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) (short) 10, 3, serverConfiguration19, fileChannelProvider20);
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
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2839");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
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
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2840");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) 3, (int) (short) 1, 0, true, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 6L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2841");
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
        int int17 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2842");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel2.bc;
        journalChannel2.close();
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNull(bufferedChannel23);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2843");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        int int6 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2844");
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
            journalChannel2.preAllocIfNeeded((long) ' ');
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
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2845");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        journalChannel2.nextPrealloc = (-1L);
        int int5 = journalChannel2.fd;
        byte[] byteArray6 = journalChannel2.magicWord;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel9);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2846");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, 6L, (int) (byte) 1, (int) '4', false, 1, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2847");
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel23);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2848");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.fd;
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
        java.io.File file23 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file23, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel25.bc;
        journalChannel25.close();
        java.nio.ByteBuffer byteBuffer28 = journalChannel25.zeros;
        java.nio.ByteBuffer byteBuffer29 = journalChannel25.zeros;
        int int30 = journalChannel10.read(byteBuffer29);
        int int31 = journalChannel2.read(byteBuffer29);
        int int32 = journalChannel2.fd;
        byte[] byteArray33 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
        org.junit.Assert.assertNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2849");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        int int3 = journalChannel2.getFormatVersion();
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        journalChannel6.nextPrealloc = 1048576L;
        java.nio.ByteBuffer byteBuffer12 = journalChannel6.zeros;
        int int13 = journalChannel2.read(byteBuffer12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
// flaky "8) test2849(org.apache.bookkeeper.bookie.JournalChannelTest5)":         org.junit.Assert.assertNull(bufferedChannel14);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2850");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 2;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        journalChannel14.nextPrealloc = 10;
        java.io.File file17 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file17, (long) 2);
        int int20 = journalChannel19.fd;
        java.nio.ByteBuffer byteBuffer21 = journalChannel19.zeros;
        int int22 = journalChannel14.read(byteBuffer21);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel14.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = null;
        journalChannel14.bc = bufferedChannel24;
        int int26 = journalChannel14.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel14.configuration;
        java.nio.ByteBuffer byteBuffer28 = journalChannel14.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel29 = journalChannel14.channel;
        java.nio.ByteBuffer byteBuffer30 = journalChannel14.zeros;
        int int31 = journalChannel2.read(byteBuffer30);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(bookieFileChannel29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2851");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (-1L), (int) (byte) 1, (long) 0, serverConfiguration26, fileChannelProvider27);
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
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2852");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (short) 1, (int) (short) 0, serverConfiguration13, fileChannelProvider14);
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
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2853");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        int int11 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel12 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2854");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2855");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        journalChannel10.nextPrealloc = (byte) 1;
        long long15 = journalChannel10.nextPrealloc;
        java.nio.ByteBuffer byteBuffer16 = journalChannel10.zeros;
        java.nio.ByteBuffer byteBuffer17 = journalChannel10.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = journalChannel2.read(byteBuffer17);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2856");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2857");
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
        int int30 = journalChannel7.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration31 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel33 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (short) 10, 2, (long) 8, serverConfiguration31, fileChannelProvider32);
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
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2858");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        journalChannel10.nextPrealloc = 10;
        byte[] byteArray13 = journalChannel10.magicWord;
        java.nio.ByteBuffer byteBuffer14 = journalChannel10.zeros;
        java.nio.channels.FileChannel fileChannel15 = journalChannel10.fc;
        journalChannel10.nextPrealloc = (short) 0;
        journalChannel10.close();
        journalChannel10.nextPrealloc = (byte) 100;
        java.nio.ByteBuffer byteBuffer21 = journalChannel10.zeros;
        int int22 = journalChannel2.read(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2859");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        journalChannel2.close();
        long long9 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2860");
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
        byte[] byteArray26 = journalChannel10.magicWord;
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel31 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 0, (int) ' ', (int) (short) 10, false, (int) '#', bufferedChannelBuilder7, serverConfiguration28, fileChannelProvider29, (java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2861");
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
        int int11 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2862");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 100);
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
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2863");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel2.bc = bufferedChannel12;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2864");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = null;
        journalChannel2.bc = bufferedChannel23;
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2865");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNull(bufferedChannel8);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2866");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        journalChannel7.nextPrealloc = (byte) 1;
        long long12 = journalChannel7.nextPrealloc;
        java.nio.channels.FileChannel fileChannel13 = journalChannel7.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = null;
        journalChannel7.bc = bufferedChannel14;
        int int16 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration17 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) 1, (-1), (long) 0, serverConfiguration17, fileChannelProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2867");
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
        java.io.File file15 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file15, (long) 2);
        int int18 = journalChannel17.fd;
        java.nio.ByteBuffer byteBuffer19 = journalChannel17.zeros;
        int int20 = journalChannel2.read(byteBuffer19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = null;
        journalChannel2.bc = bufferedChannel21;
        int int23 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2868");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, 0L, 4, 2, false, (int) '#', bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2869");
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
        int int21 = journalChannel10.formatVersion;
        journalChannel10.nextPrealloc = (byte) 1;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = null;
        journalChannel10.bc = bufferedChannel24;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = null;
        journalChannel10.bc = bufferedChannel26;
        int int28 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 32L, 35L, (int) (short) 0, (int) (byte) 1, true, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration29, fileChannelProvider30, (java.lang.Long) 512L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration29);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2870");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = null;
        journalChannel2.bc = bufferedChannel61;
        int int63 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2871");
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
        long long17 = journalChannel2.nextPrealloc;
        byte[] byteArray18 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass19 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2872");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2873");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        int int6 = journalChannel2.formatVersion;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2874");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2875");
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
        int int21 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2876");
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
        int int17 = journalChannel2.fd;
        journalChannel2.close();
        long long19 = journalChannel2.nextPrealloc;
        int int20 = journalChannel2.formatVersion;
        int int21 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2877");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ');
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2878");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = null;
        journalChannel2.bc = bufferedChannel61;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration63 = journalChannel2.configuration;
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
        org.junit.Assert.assertNotNull(serverConfiguration63);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2879");
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
        long long19 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2880");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        long long15 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2881");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        int int8 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel6.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        journalChannel2.nextPrealloc = 3L;
        byte[] byteArray13 = journalChannel2.magicWord;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2882");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 6L, 512L, (int) (byte) -1, (int) (byte) 1, true, (int) 'a', bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2883");
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
        int int15 = journalChannel2.fd;
        int int16 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2884");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        int int7 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2885");
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
        int int25 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel26);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2886");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) 8, 8, 52L, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2887");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2888");
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
        int int22 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2889");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        java.io.File file3 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel5 = new org.apache.bookkeeper.bookie.JournalChannel(file3, (long) (byte) 10);
        long long6 = journalChannel5.nextPrealloc;
        int int7 = journalChannel5.fd;
        journalChannel5.close();
        java.nio.ByteBuffer byteBuffer9 = journalChannel5.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        journalChannel2.nextPrealloc = (byte) 1;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2890");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNull(bufferedChannel4);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2891");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2892");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        int int8 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel9 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fileChannel9);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2893");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel6.bc;
        int int17 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 52L, 1048576L, (int) (short) 10, serverConfiguration18, fileChannelProvider19);
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
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2894");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        int int9 = journalChannel7.fd;
        byte[] byteArray10 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 3, (int) (short) 10, (long) (short) 0, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2895");
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
        int int17 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2896");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel38 = journalChannel2.channel;
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
        org.junit.Assert.assertNotNull(bookieFileChannel38);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2897");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        int int12 = journalChannel10.fd;
        int int13 = journalChannel10.getFormatVersion();
        journalChannel10.nextPrealloc = 3;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 1048576L, 0, (int) (byte) 1, true, (-1), bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2898");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2899");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2900");
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
        int int23 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel2.bc;
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(bufferedChannel24);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2901");
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
        journalChannel2.close();
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
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2902");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2903");
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
        int int25 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2904");
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
        java.nio.channels.FileChannel fileChannel23 = journalChannel10.fc;
        int int24 = journalChannel10.fd;
        java.nio.channels.FileChannel fileChannel25 = journalChannel10.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, 2L, (int) '4', (int) (byte) 0, true, 6, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2905");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 2;
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2906");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass26 = journalChannel2.getClass();
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
        org.junit.Assert.assertNotNull(serverConfiguration25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2907");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        int int7 = journalChannel2.fd;
        int int8 = journalChannel2.formatVersion;
        int int9 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2908");
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
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2909");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1));
        journalChannel2.nextPrealloc = '#';
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2910");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        int int11 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel9.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel9.bc = bufferedChannel13;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 512L, 35L, (int) ' ', (int) (short) -1, false, 512, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2911");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 52L);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2912");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        journalChannel2.nextPrealloc = (short) 0;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2913");
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
        int int16 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2914");
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
        byte[] byteArray17 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2915");
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
        int int13 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2916");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2917");
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
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2918");
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
        int int22 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2919");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = journalChannel7.bc;
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration26 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 6, (-1), 1L, serverConfiguration26, fileChannelProvider27);
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
        org.junit.Assert.assertNotNull(serverConfiguration23);
        org.junit.Assert.assertNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(serverConfiguration26);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2920");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2921");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2922");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        int int7 = journalChannel2.getFormatVersion();
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, 0L);
        long long11 = journalChannel10.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel10.bc = bufferedChannel12;
        long long14 = journalChannel10.nextPrealloc;
        java.nio.ByteBuffer byteBuffer15 = journalChannel10.zeros;
        int int16 = journalChannel2.read(byteBuffer15);
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNull(bufferedChannel6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2923");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration28 = journalChannel2.configuration;
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
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(serverConfiguration28);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2924");
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
        int int40 = journalChannel2.getFormatVersion();
        int int41 = journalChannel2.fd;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2925");
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
        journalChannel10.close();
        java.nio.ByteBuffer byteBuffer22 = journalChannel10.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, 0L, 1, (int) (byte) 100, false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2926");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2927");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1);
        java.nio.ByteBuffer byteBuffer3 = journalChannel2.zeros;
        long long4 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2928");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2929");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.formatVersion;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2930");
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
        long long17 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2931");
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
        java.nio.ByteBuffer byteBuffer18 = journalChannel2.zeros;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2932");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel6.bc = bufferedChannel9;
        int int11 = journalChannel6.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, 6L, 0, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2933");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.junit.Assert.assertNull(bufferedChannel5);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2934");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration4);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2935");
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
        long long13 = journalChannel2.nextPrealloc;
        int int14 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2936");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0);
        int int3 = journalChannel2.getFormatVersion();
        int int4 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        journalChannel2.close();
        journalChannel2.close();
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 0);
        int int11 = journalChannel10.getFormatVersion();
        int int12 = journalChannel10.getFormatVersion();
        java.nio.ByteBuffer byteBuffer13 = journalChannel10.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = journalChannel2.read(byteBuffer13);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2937");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L);
        int int3 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2938");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2939");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        long long4 = journalChannel2.nextPrealloc;
        int int5 = journalChannel2.formatVersion;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        int int9 = journalChannel8.fd;
        java.nio.ByteBuffer byteBuffer10 = journalChannel8.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel8.channel;
        journalChannel8.nextPrealloc = 'a';
        long long14 = journalChannel8.nextPrealloc;
        int int15 = journalChannel8.fd;
        int int16 = journalChannel8.getFormatVersion();
        int int17 = journalChannel8.formatVersion;
        java.nio.ByteBuffer byteBuffer18 = journalChannel8.zeros;
        int int19 = journalChannel2.read(byteBuffer18);
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2940");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = null;
        journalChannel2.bc = bufferedChannel43;
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
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2941");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer20 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2942");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.bc;
        byte[] byteArray9 = journalChannel2.magicWord;
        int int10 = journalChannel2.getFormatVersion();
        long long11 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2943");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        int int4 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        long long7 = journalChannel2.nextPrealloc;
        byte[] byteArray8 = journalChannel2.magicWord;
        long long9 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2944");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, 97L, 100, (long) (byte) -1, serverConfiguration12, fileChannelProvider13);
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
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2945");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2946");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        journalChannel2.nextPrealloc = '4';
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2947");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 35L;
        java.nio.ByteBuffer byteBuffer10 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2948");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, 4L, 0, (long) (short) 10, serverConfiguration20, fileChannelProvider21);
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
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2949");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel35 = journalChannel2.channel;
        java.nio.ByteBuffer byteBuffer36 = journalChannel2.zeros;
        int int37 = journalChannel2.fd;
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
        org.junit.Assert.assertNotNull(bookieFileChannel35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2950");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2951");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = null;
        journalChannel2.bc = bufferedChannel17;
        java.io.File file19 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file19, (long) 2);
        int int22 = journalChannel21.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = journalChannel21.bc;
        byte[] byteArray24 = journalChannel21.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = null;
        journalChannel21.bc = bufferedChannel25;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel27 = journalChannel21.channel;
        java.nio.ByteBuffer byteBuffer28 = journalChannel21.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = journalChannel2.read(byteBuffer28);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel27);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2952");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNull(bufferedChannel6);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2953");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.close();
        long long6 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2954");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0);
        long long3 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2955");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel19 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass20 = bookieFileChannel19.getClass();
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
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2956");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2957");
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
        int int24 = journalChannel2.fd;
        int int25 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2958");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        journalChannel2.nextPrealloc = '4';
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2959");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        journalChannel2.nextPrealloc = 512;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fileChannel6);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2960");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass4 = fileChannel3.getClass();
        org.junit.Assert.assertNotNull(fileChannel3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2961");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        journalChannel2.nextPrealloc = 3L;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2962");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel37);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2963");
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
        byte[] byteArray20 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2964");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel6.bc;
        int int17 = journalChannel6.getFormatVersion();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, 10L, (int) 'a', serverConfiguration18, fileChannelProvider19);
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
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2965");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 1, (int) (byte) 1, 5, false, 4, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2966");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (short) 1;
        long long8 = journalChannel2.nextPrealloc;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2967");
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
        java.io.File file26 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file26, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration29 = journalChannel28.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel30 = journalChannel28.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = journalChannel28.bc;
        int int32 = journalChannel28.getFormatVersion();
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 'a');
        int int36 = journalChannel35.getFormatVersion();
        java.io.File file37 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel39 = new org.apache.bookkeeper.bookie.JournalChannel(file37, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel40 = journalChannel39.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration41 = journalChannel39.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = null;
        journalChannel39.bc = bufferedChannel42;
        java.nio.ByteBuffer byteBuffer44 = journalChannel39.zeros;
        int int45 = journalChannel35.read(byteBuffer44);
        int int46 = journalChannel28.read(byteBuffer44);
        int int47 = journalChannel2.read(byteBuffer44);
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
        org.junit.Assert.assertNotNull(serverConfiguration29);
        org.junit.Assert.assertNotNull(bookieFileChannel30);
        org.junit.Assert.assertNull(bufferedChannel31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel40);
        org.junit.Assert.assertNotNull(serverConfiguration41);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2968");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel22);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2969");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        journalChannel2.close();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2970");
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
        java.nio.channels.FileChannel fileChannel20 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel19);
        org.junit.Assert.assertNotNull(fileChannel20);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2971");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2972");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4');
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2973");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        byte[] byteArray7 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2974");
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
        int int20 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fileChannel21);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2975");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2976");
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
        byte[] byteArray16 = journalChannel2.magicWord;
        int int17 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2977");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
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
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2978");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2979");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = ' ';
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2980");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        byte[] byteArray5 = journalChannel2.magicWord;
        int int6 = journalChannel2.fd;
        journalChannel2.close();
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2981");
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
        byte[] byteArray17 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2982");
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
        int int22 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2983");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        int int10 = journalChannel2.getFormatVersion();
        java.nio.channels.FileChannel fileChannel11 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fileChannel11);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2984");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 512L, (long) (short) 10, 2, 10L, serverConfiguration23, fileChannelProvider24);
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
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2985");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        journalChannel7.nextPrealloc = 4;
        java.nio.channels.FileChannel fileChannel11 = journalChannel7.fc;
        long long12 = journalChannel7.nextPrealloc;
        journalChannel7.nextPrealloc = (short) 100;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, 35L, 8, (long) (byte) 10, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4L + "'", long12 == 4L);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2986");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        journalChannel2.close();
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = null;
        journalChannel12.bc = bufferedChannel35;
        java.io.File file37 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel39 = new org.apache.bookkeeper.bookie.JournalChannel(file37, (long) 2);
        journalChannel39.nextPrealloc = 10;
        int int42 = journalChannel39.getFormatVersion();
        java.nio.ByteBuffer byteBuffer43 = journalChannel39.zeros;
        int int44 = journalChannel12.read(byteBuffer43);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = journalChannel2.read(byteBuffer43);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2987");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        journalChannel9.nextPrealloc = 100L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 35L, (int) (byte) 100, (int) (short) 100, false, 2, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2988");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        int int5 = journalChannel2.getFormatVersion();
        journalChannel2.close();
        journalChannel2.nextPrealloc = 6;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2989");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.getFormatVersion();
        byte[] byteArray8 = journalChannel2.magicWord;
        int int9 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2990");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
        long long5 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2991");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2992");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#');
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2993");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        int int12 = journalChannel2.getFormatVersion();
        java.nio.ByteBuffer byteBuffer13 = journalChannel2.zeros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2994");
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
        java.io.File file16 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file16, (long) 2);
        journalChannel18.nextPrealloc = 10;
        java.io.File file21 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file21, (long) 2);
        int int24 = journalChannel23.fd;
        java.nio.ByteBuffer byteBuffer25 = journalChannel23.zeros;
        int int26 = journalChannel18.read(byteBuffer25);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration27 = journalChannel18.configuration;
        java.nio.channels.FileChannel fileChannel28 = journalChannel18.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = null;
        journalChannel18.bc = bufferedChannel29;
        int int31 = journalChannel18.getFormatVersion();
        java.nio.channels.FileChannel fileChannel32 = journalChannel18.fc;
        java.io.File file33 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel35 = new org.apache.bookkeeper.bookie.JournalChannel(file33, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration36 = journalChannel35.configuration;
        int int37 = journalChannel35.formatVersion;
        java.nio.ByteBuffer byteBuffer38 = journalChannel35.zeros;
        int int39 = journalChannel18.read(byteBuffer38);
        int int40 = journalChannel2.read(byteBuffer38);
        java.lang.Class<?> wildcardClass41 = byteBuffer38.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration27);
        org.junit.Assert.assertNotNull(fileChannel28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(fileChannel32);
        org.junit.Assert.assertNotNull(serverConfiguration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2995");
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
        byte[] byteArray28 = journalChannel2.magicWord;
        int int29 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2996");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        long long17 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNull(bufferedChannel16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2997");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.close();
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        journalChannel7.nextPrealloc = (byte) 1;
        long long12 = journalChannel7.nextPrealloc;
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        int int16 = journalChannel15.fd;
        java.nio.ByteBuffer byteBuffer17 = journalChannel15.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel18 = journalChannel15.channel;
        journalChannel15.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel15.channel;
        java.io.File file22 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file22, (long) 2);
        journalChannel24.nextPrealloc = 10;
        journalChannel24.nextPrealloc = 0L;
        int int29 = journalChannel24.formatVersion;
        java.io.File file30 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel32 = new org.apache.bookkeeper.bookie.JournalChannel(file30, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = journalChannel32.bc;
        journalChannel32.close();
        java.nio.ByteBuffer byteBuffer35 = journalChannel32.zeros;
        int int36 = journalChannel24.read(byteBuffer35);
        int int37 = journalChannel15.read(byteBuffer35);
        int int38 = journalChannel7.read(byteBuffer35);
        java.nio.channels.FileChannel fileChannel39 = journalChannel7.fc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel40 = journalChannel7.channel;
        java.nio.ByteBuffer byteBuffer41 = journalChannel7.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = journalChannel2.read(byteBuffer41);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(bookieFileChannel18);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fileChannel39);
        org.junit.Assert.assertNotNull(bookieFileChannel40);
        org.junit.Assert.assertNotNull(byteBuffer41);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2998");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.junit.Assert.assertNotNull(fileChannel3);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test2999");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(6L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest5.test3000");
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
        long long16 = journalChannel2.nextPrealloc;
        byte[] byteArray17 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = null;
        journalChannel2.bc = bufferedChannel18;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }
}
