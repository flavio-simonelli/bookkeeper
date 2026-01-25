package org.apache.bookkeeper.bookie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JournalChannelTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0001");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.SECTOR_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0002");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.V6;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0003");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, 100L, 100, (int) 'a', true, (int) (byte) 1, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0004");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.V5;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0005");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.V4;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0006");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.V3;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0007");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) 'a', (int) (short) 10, 6, true, (int) (byte) 100, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0008");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, (long) 4, 0, (int) (short) 100, true, 512, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0009");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.VERSION_HEADER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0010");
        java.io.File file0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel.renameJournalFile(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Failed to rename file null to null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0011");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.V2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0012");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, 0L, (int) '#', (long) ' ', serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0013");
        long long0 = org.apache.bookkeeper.bookie.JournalChannel.MB;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1048576L + "'", long0 == 1048576L);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0014");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.MIN_COMPAT_JOURNAL_FORMAT_VERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0015");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.CURRENT_JOURNAL_FORMAT_VERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0016");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 0L, 100, 2, false, (int) (short) 100, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0017");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 5, (int) (short) 1, 100, false, (int) '#', bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0018");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, 0L, 1, 0, true, (int) (byte) 10, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0019");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.getBufferedChannel();
// flaky "1) test0019(org.apache.bookkeeper.bookie.JournalChannelTest0)":             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0020");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0021");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) 2, (int) (byte) 0, 0L, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0022");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0023");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) '4', (int) (short) 10, (int) (short) 0, true, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0024");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0025");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0026");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) 1, (int) (short) 1, 5, true, 6, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0027");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', 100L, (-1), (long) 100, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0028");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) ' ', (int) ' ', (int) ' ', true, (int) (short) 0, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0029");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.V1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0030");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) (short) 10, 10, (int) 'a', true, (int) (byte) 1, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0031");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) 0, 100, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0032");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0033");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) 4, (int) (short) 1, serverConfiguration16, fileChannelProvider17);
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0034");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
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
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0035");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) (byte) 100, (int) ' ', 0L, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0036");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
// flaky "2) test0036(org.apache.bookkeeper.bookie.JournalChannelTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "1) test0036(org.apache.bookkeeper.bookie.JournalChannelTest0)":         org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0037");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0038");
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
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0039");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        long long3 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass4 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0040");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0041");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) (-1), 3, serverConfiguration16, fileChannelProvider17);
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0042");
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
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0043");
        int int0 = org.apache.bookkeeper.bookie.JournalChannel.HEADER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0044");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        int int8 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0045");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0046");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0047");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, 1048576L, (int) (short) -1, 6, true, (int) ' ', bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0048");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        int int8 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0049");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0050");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) 100, (int) (byte) 100, 0, true, 4, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0051");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        long long3 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0052");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0053");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (-1L), 6, serverConfiguration16, fileChannelProvider17);
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0054");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0055");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, 97L, (int) '4', (int) (byte) 10, true, (int) (byte) 0, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0056");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0057");
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
        java.lang.Class<?> wildcardClass14 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0058");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 0, 512, serverConfiguration16, fileChannelProvider17);
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0059");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) (byte) -1, 6, 100, true, (int) (byte) 100, bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0060");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = null;
        journalChannel2.bc = bufferedChannel3;
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0061");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        long long7 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0062");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) 0, 0, serverConfiguration18, fileChannelProvider19);
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0063");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 0, (int) (short) 10, (-1L), serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0064");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0065");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0066");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0067");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0068");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) (short) 10, 512, (long) (short) 0, serverConfiguration20, fileChannelProvider21);
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0069");
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
        java.lang.Class<?> wildcardClass14 = fileChannel13.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0070");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0071");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) ' ', 3, (long) 0, serverConfiguration18, fileChannelProvider19);
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0072");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0073");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 1, (int) '4', 100, true, 6, serverConfiguration13, fileChannelProvider14);
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0074");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        java.io.File file12 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file12, (long) 2);
        int int15 = journalChannel14.fd;
        java.nio.ByteBuffer byteBuffer16 = journalChannel14.zeros;
        int int17 = journalChannel9.read(byteBuffer16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = journalChannel2.read(byteBuffer16);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0075");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass6 = byteBuffer5.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0076");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
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
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0077");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, 1048576L, 2, (long) (short) 100, serverConfiguration19, fileChannelProvider20);
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0078");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 2, 0, serverConfiguration18, fileChannelProvider19);
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0079");
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
            journalChannel2.forceWrite(false);
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0080");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (short) -1, 100, 0, false, (int) (short) 100, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0081");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0082");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) 'a', (int) (short) -1, (-1), true, (int) (byte) 1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0083");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (short) 0, (int) (short) 100, (int) '4', true, (int) '#', bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0084");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (-1L), (int) (byte) 1, serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0085");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, 10L, (int) (byte) 100, (long) (byte) 0, serverConfiguration20, fileChannelProvider21);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0086");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, 0L, (int) (short) -1, (int) (short) 10, false, (int) (short) 10, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0087");
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
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0088");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0089");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "3) test0089(org.apache.bookkeeper.bookie.JournalChannelTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0090");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0091");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass7 = serverConfiguration6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0092");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNull(bufferedChannel9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0093");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', 0L, 3, serverConfiguration18, fileChannelProvider19);
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0094");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass5 = fileChannel4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0095");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0096");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0097");
        java.io.File file0 = null;
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 2, (int) (byte) 10, (int) 'a', false, 3, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0098");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        java.lang.Class<?> wildcardClass4 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0099");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0100");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, 0L, (int) '#', (int) (short) 1, true, (int) (short) 0, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0101");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass4 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0102");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (-1L), (int) 'a', (int) (byte) 0, false, (int) (short) 0, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0103");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, 10L, (int) (short) 10, (int) (short) -1, false, (int) (short) 10, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0104");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, 97L, 0, (int) 'a', false, (int) (short) 10, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0105");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        int int9 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, 10L, (int) (short) -1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0106");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 10);
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
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0107");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) 6, 0, 3, true, 0, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0108");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        java.lang.Class<?> wildcardClass3 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0109");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 10, (int) (short) 0, (-1), false, 3, bufferedChannelBuilder7, serverConfiguration12, fileChannelProvider13, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0110");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0111");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) 8, 512, (int) (short) 0, false, 10, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0112");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) 5, 10, serverConfiguration20, fileChannelProvider21);
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
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0113");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) 2, (int) (byte) -1, (long) (byte) -1, serverConfiguration18, fileChannelProvider19);
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0114");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 0, 0, 6, false, (int) (byte) 1, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0115");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0116");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
// flaky "4) test0116(org.apache.bookkeeper.bookie.JournalChannelTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0117");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0118");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        long long3 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0119");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        java.nio.ByteBuffer byteBuffer12 = journalChannel10.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel13 = journalChannel10.channel;
        journalChannel10.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, 0L, (int) (short) -1, (int) (short) -1, true, (int) (byte) 100, bufferedChannelBuilder7, serverConfiguration16, fileChannelProvider17, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0120");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, 1048576L, 4, 1L, serverConfiguration22, fileChannelProvider23);
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0121");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0122");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (short) 1, (int) 'a', (long) (short) 0, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0123");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
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
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0124");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 5, (int) (short) 0, (int) (byte) 1, false, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0125");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass4 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0126");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0127");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a', (long) 5, 3, 0L, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0128");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) 1, (int) (short) 0, 10L, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0129");
        java.io.File file0 = null;
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (-1L), 5, (int) 'a', false, (-1), serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0130");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0131");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0132");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0133");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0134");
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
            journalChannel2.preAllocIfNeeded((long) (-1));
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
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0135");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, (long) 'a', (int) '4', (int) (short) 0, false, (int) '4', serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0136");
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
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0137");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 10, (int) (short) 100, 3, false, (int) (byte) 1, bufferedChannelBuilder7, serverConfiguration24, fileChannelProvider25, (java.lang.Long) 1L);
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0138");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) '#', (int) (byte) 0, serverConfiguration19, fileChannelProvider20);
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
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0139");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        int int5 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0140");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0141");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0142");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 8, (int) (short) 10, (int) (short) 100, true, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0143");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) (byte) -1, 0, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0144");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0145");
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
        java.lang.Class<?> wildcardClass14 = serverConfiguration13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0146");
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
        java.lang.Class<?> wildcardClass13 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0147");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) (short) 100, (int) (short) 100, (long) 10, serverConfiguration18, fileChannelProvider19);
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0148");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) 3, 100, serverConfiguration18, fileChannelProvider19);
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0149");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0150");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0151");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0152");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.getBufferedChannel();
// flaky "5) test0152(org.apache.bookkeeper.bookie.JournalChannelTest0)":             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0153");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0154");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0155");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) -1, (int) (byte) 0, 6, false, 10, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 97L);
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0156");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0157");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0158");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) 3, (int) 'a', 6, true, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0159");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0160");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0161");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0162");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) ' ', 1, 5, false, (int) 'a', bufferedChannelBuilder7, serverConfiguration20, fileChannelProvider21, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0163");
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
        java.lang.Class<?> wildcardClass15 = serverConfiguration14.getClass();
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0164");
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
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0165");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 100, 2, 2, true, (int) (short) 100, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0166");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) ' ', (int) (byte) 100, 1048576L, serverConfiguration19, fileChannelProvider20);
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0167");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) (byte) 0, 6, 6, false, (int) (short) 0, bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0168");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 0L, 512, (int) (byte) -1, false, 1, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(bufferedChannel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0169");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        int int10 = journalChannel7.formatVersion;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        int int14 = journalChannel13.fd;
        java.nio.ByteBuffer byteBuffer15 = journalChannel13.zeros;
        int int16 = journalChannel7.read(byteBuffer15);
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) ' ', 0, (long) 4, serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0170");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0171");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0172");
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
        journalChannel2.close();
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
        // The following exception was thrown during execution in test generation
        try {
            int int31 = journalChannel2.read(byteBuffer29);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0173");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        journalChannel9.nextPrealloc = (byte) 1;
        int int14 = journalChannel9.fd;
        byte[] byteArray15 = journalChannel9.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) (byte) 0, (-1), (int) '#', true, 3, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0174");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0175");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        byte[] byteArray5 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0176");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) '#', 2, 100, false, (int) 'a', bufferedChannelBuilder7, serverConfiguration20, fileChannelProvider21, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0177");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0178");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 2, (-1), (int) (short) -1, true, 5, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0179");
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
        java.lang.Class<?> wildcardClass13 = byteArray12.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0180");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel2.bc = bufferedChannel9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0181");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bookieFileChannel15);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0182");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0183");
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
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0184");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (byte) 1, (int) ' ', serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0185");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) (short) 1, (int) (short) 10, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0186");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) 100, (int) (short) 10, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0187");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 'a', 0, (int) (short) 10, false, 5, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0188");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        int int10 = journalChannel2.read(byteBuffer9);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel2.configuration;
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
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0189");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (-1), 4, 3, true, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0190");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (-1L), 8, 2, true, (-1), serverConfiguration25, fileChannelProvider26);
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
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0191");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.channels.FileChannel fileChannel4 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel4);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0192");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = journalChannel2.getBufferedChannel();
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0193");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0194");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0195");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) (byte) -1, 100, serverConfiguration16, fileChannelProvider17);
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0196");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0197");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        journalChannel9.nextPrealloc = 100;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) '#', (int) (byte) 100, (int) 'a', true, (int) 'a', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0198");
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
        java.nio.ByteBuffer byteBuffer15 = journalChannel2.zeros;
        java.lang.Class<?> wildcardClass16 = byteBuffer15.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0199");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), (long) '#', (-1), (int) (byte) 100, false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0200");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        int int10 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0201");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        journalChannel2.nextPrealloc = (-1L);
        int int5 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0202");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, 97L, (int) ' ', (long) 1, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0203");
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
        java.lang.Class<?> wildcardClass15 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0204");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.channels.FileChannel fileChannel8 = journalChannel2.fc;
        journalChannel2.close();
        java.io.File file10 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file10, (long) 2);
        journalChannel12.nextPrealloc = 10;
        journalChannel12.nextPrealloc = 0L;
        int int17 = journalChannel12.formatVersion;
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = journalChannel20.bc;
        journalChannel20.close();
        java.nio.ByteBuffer byteBuffer23 = journalChannel20.zeros;
        int int24 = journalChannel12.read(byteBuffer23);
        java.io.File file25 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file25, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel28 = journalChannel27.channel;
        java.nio.ByteBuffer byteBuffer29 = journalChannel27.zeros;
        int int30 = journalChannel12.read(byteBuffer29);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = journalChannel2.read(byteBuffer29);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(bookieFileChannel28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0205");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        int int7 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0206");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel9.channel;
        journalChannel9.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) 512, (int) ' ', 512, false, 4, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0207");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0208");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, 0L, (int) (byte) 10, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0209");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0210");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0211");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        int int7 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = (byte) 0;
        java.lang.Class<?> wildcardClass10 = journalChannel2.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0212");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0213");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, 10L, 5, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0214");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0215");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) 'a', (int) (byte) 0, 6, false, 5, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0216");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel2.bc = bufferedChannel8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0217");
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
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.getBufferedChannel();
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
        org.junit.Assert.assertNotNull(fileChannel17);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0218");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) (short) 100, (int) (short) 1, (int) '4', true, (int) '#', serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0219");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.getBufferedChannel();
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
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0220");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) (byte) 1, 0, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = journalChannel2.getBufferedChannel();
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0222");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0223");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        journalChannel2.nextPrealloc = 100;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0224");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) 5, 100, (int) (short) 100, true, (int) (byte) 100, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0225");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel9.channel;
        journalChannel9.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) 2, (int) (byte) -1, (int) (byte) 1, false, (int) (byte) 0, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0226");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) (short) 100, (int) (byte) 1, (int) 'a', true, (int) (byte) 1, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0227");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 'a', (int) (short) 0, (int) (byte) 1, false, 6, bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0228");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
        byte[] byteArray9 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0229");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0230");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (-1L), (int) (byte) -1, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0231");
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
        java.nio.channels.FileChannel fileChannel17 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass18 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(fileChannel17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0232");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0233");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(97L);
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0234");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a', (long) 4, (int) (short) 10, 512, false, (int) (short) -1, serverConfiguration20, fileChannelProvider21);
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
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0235");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0236");
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
        java.io.File file13 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file13, (long) 2);
        journalChannel15.nextPrealloc = 10;
        java.io.File file18 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file18, (long) 2);
        int int21 = journalChannel20.fd;
        java.nio.ByteBuffer byteBuffer22 = journalChannel20.zeros;
        int int23 = journalChannel15.read(byteBuffer22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = journalChannel2.read(byteBuffer22);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0237");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0238");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) ' ', (int) (byte) -1, 0, false, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0239");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 'a', 5, 5, true, (int) 'a', serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0240");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0241");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel9.bc;
        java.nio.ByteBuffer byteBuffer21 = journalChannel9.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, 97L, 1, (int) ' ', true, 100, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0242");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        long long11 = journalChannel9.nextPrealloc;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) (byte) -1, 1, 8, false, (int) (byte) 1, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0243");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0244");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 0, 6, (-1), false, 4, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0245");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) 4, (int) (short) 10, (int) (short) 10, false, 4, bufferedChannelBuilder7, serverConfiguration19, fileChannelProvider20, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0246");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(bufferedChannel9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0247");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 512, (int) '4', serverConfiguration18, fileChannelProvider19);
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
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0248");
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
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0249");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass8 = fileChannel7.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0250");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0251");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0252");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) '4', (int) (short) 10, (int) 'a', true, (int) (short) 1, serverConfiguration12, fileChannelProvider13);
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0253");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel7.bc;
        long long9 = journalChannel7.nextPrealloc;
        long long10 = journalChannel7.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, 1048576L, (int) (short) 1, 0L, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0254");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        journalChannel2.nextPrealloc = (-1L);
        int int5 = journalChannel2.fd;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0255");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) 2, (int) 'a', (int) (byte) 1, false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0256");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, 0L, (-1), (int) (byte) 1, false, 0, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0257");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) ' ', (int) (byte) 10, serverConfiguration18, fileChannelProvider19);
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0258");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        journalChannel2.nextPrealloc = (short) 0;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer11 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel2.bc = bufferedChannel12;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0259");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        int int5 = journalChannel2.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration6 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = null;
        journalChannel2.bc = bufferedChannel7;
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
        org.junit.Assert.assertNotNull(serverConfiguration6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0260");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, 100L, (int) ' ', 6, true, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration8, fileChannelProvider9, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0261");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        journalChannel6.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = null;
        journalChannel6.bc = bufferedChannel8;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 1, 0, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0262");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (short) 1);
        int int7 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) (short) -1, 0, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0263");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0264");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        journalChannel7.nextPrealloc = (byte) 1;
        int int12 = journalChannel7.fd;
        byte[] byteArray13 = journalChannel7.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) (short) 0, (int) (byte) -1, (long) 100, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0265");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) '#', 6, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0266");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        byte[] byteArray8 = journalChannel7.magicWord;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) 3, 5, (long) 8, serverConfiguration10, fileChannelProvider11);
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0267");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0268");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) (byte) -1);
        byte[] byteArray9 = journalChannel8.magicWord;
        java.nio.ByteBuffer byteBuffer10 = journalChannel8.zeros;
        int int11 = journalChannel2.read(byteBuffer10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0269");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 1048576L, 2, serverConfiguration18, fileChannelProvider19);
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0270");
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
        org.apache.bookkeeper.bookie.JournalChannel journalChannel41 = new org.apache.bookkeeper.bookie.JournalChannel(file39, (long) 2);
        int int42 = journalChannel41.fd;
        java.nio.ByteBuffer byteBuffer43 = journalChannel41.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel44 = journalChannel41.channel;
        journalChannel41.nextPrealloc = 'a';
        java.io.File file47 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel49 = new org.apache.bookkeeper.bookie.JournalChannel(file47, (long) 2);
        int int50 = journalChannel49.fd;
        java.nio.ByteBuffer byteBuffer51 = journalChannel49.zeros;
        journalChannel49.nextPrealloc = (byte) 1;
        long long54 = journalChannel49.nextPrealloc;
        java.io.File file55 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel57 = new org.apache.bookkeeper.bookie.JournalChannel(file55, (long) 2);
        int int58 = journalChannel57.fd;
        java.nio.ByteBuffer byteBuffer59 = journalChannel57.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel60 = journalChannel57.channel;
        journalChannel57.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel63 = journalChannel57.channel;
        java.io.File file64 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel66 = new org.apache.bookkeeper.bookie.JournalChannel(file64, (long) 2);
        journalChannel66.nextPrealloc = 10;
        journalChannel66.nextPrealloc = 0L;
        int int71 = journalChannel66.formatVersion;
        java.io.File file72 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel74 = new org.apache.bookkeeper.bookie.JournalChannel(file72, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel75 = journalChannel74.bc;
        journalChannel74.close();
        java.nio.ByteBuffer byteBuffer77 = journalChannel74.zeros;
        int int78 = journalChannel66.read(byteBuffer77);
        int int79 = journalChannel57.read(byteBuffer77);
        int int80 = journalChannel49.read(byteBuffer77);
        int int81 = journalChannel41.read(byteBuffer77);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = journalChannel2.read(byteBuffer77);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(bookieFileChannel44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(bookieFileChannel60);
        org.junit.Assert.assertNotNull(bookieFileChannel63);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
        org.junit.Assert.assertNull(bufferedChannel75);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 512 + "'", int78 == 512);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0271");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        journalChannel9.nextPrealloc = 0L;
        int int14 = journalChannel9.formatVersion;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) (byte) 100, (int) (byte) 10, 3, false, (int) 'a', serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0272");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) (byte) 1, (int) (byte) 10, 0L, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0273");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        journalChannel9.nextPrealloc = 0L;
        int int14 = journalChannel9.formatVersion;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) 2, (int) (short) 10, 1, true, 8, serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0274");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 1048576L, (int) (short) 10, serverConfiguration20, fileChannelProvider21);
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
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0275");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        long long8 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer9 = journalChannel2.zeros;
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
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0276");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10);
        java.nio.channels.FileChannel fileChannel3 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileChannel3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0277");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        int int5 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0278");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel12 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0279");
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
        journalChannel2.nextPrealloc = 1L;
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
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0280");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (byte) 10, 0, 0, true, (int) (short) 10, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0281");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) '4', 0, (long) (short) -1, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0282");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0283");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 1L, 3, (int) (short) 100, true, (-1), serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0284");
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
        long long19 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 0);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0285");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) (byte) 1, (int) 'a', (-1), false, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0286");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 10, (long) (short) 0, (int) (byte) 100, (int) (byte) 10, false, 1, serverConfiguration23, fileChannelProvider24);
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0287");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        long long4 = journalChannel2.nextPrealloc;
        java.lang.Class<?> wildcardClass5 = journalChannel2.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0288");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(bufferedChannel14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0289");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (short) 0, (int) (byte) 1, (int) (short) 100, false, (int) '#', bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0290");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        int int10 = journalChannel9.fd;
        java.nio.channels.FileChannel fileChannel11 = journalChannel9.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) 100, 4, (int) (byte) 1, true, (int) (byte) 1, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0291");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 1048576L, 8, 6, true, 100, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0292");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) 6, (int) ' ', 0, false, (int) (byte) -1, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0293");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = (short) -1;
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
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0294");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        int int8 = journalChannel2.formatVersion;
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
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0295");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        int int4 = journalChannel2.formatVersion;
        long long5 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0296");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) '#', 5, 0, false, 100, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0297");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 1);
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0298");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        java.nio.ByteBuffer byteBuffer8 = journalChannel6.zeros;
        java.io.File file9 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file9, (long) 2);
        int int12 = journalChannel11.fd;
        java.nio.ByteBuffer byteBuffer13 = journalChannel11.zeros;
        journalChannel11.nextPrealloc = (byte) 1;
        long long16 = journalChannel11.nextPrealloc;
        java.nio.ByteBuffer byteBuffer17 = journalChannel11.zeros;
        int int18 = journalChannel6.read(byteBuffer17);
        long long19 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 10L, 1, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0299");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0300");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel21 = journalChannel10.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) (byte) 100, (int) (byte) 0, (int) '#', false, (int) (short) 100, bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
        org.junit.Assert.assertNotNull(bookieFileChannel21);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0301");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (short) 1);
        int int8 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) (-1), (int) (short) -1, (-1L), serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0302");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0303");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        long long7 = journalChannel2.nextPrealloc;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.formatVersion;
        journalChannel10.nextPrealloc = 1;
        java.nio.ByteBuffer byteBuffer14 = journalChannel10.zeros;
        int int15 = journalChannel2.read(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0304");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel7.channel;
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) (short) 1, (int) '4', (long) (short) 10, serverConfiguration24, fileChannelProvider25);
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
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0305");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(bufferedChannel5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0306");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) '4', (int) (byte) 1, 0, false, (int) (byte) 100, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0307");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, 3L, (int) 'a', 0, false, (int) 'a', bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0308");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel6.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 1048576L, 10, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0309");
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
        byte[] byteArray17 = journalChannel2.magicWord;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0310");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0311");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        journalChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        java.io.File file6 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel8 = new org.apache.bookkeeper.bookie.JournalChannel(file6, (long) 2);
        journalChannel8.nextPrealloc = 10;
        byte[] byteArray11 = journalChannel8.magicWord;
        java.nio.ByteBuffer byteBuffer12 = journalChannel8.zeros;
        java.nio.channels.FileChannel fileChannel13 = journalChannel8.fc;
        journalChannel8.nextPrealloc = (short) 0;
        journalChannel8.close();
        java.nio.ByteBuffer byteBuffer17 = journalChannel8.zeros;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = journalChannel2.read(byteBuffer17);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0312");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.getBufferedChannel();
// flaky "6) test0312(org.apache.bookkeeper.bookie.JournalChannelTest0)":             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0313");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        long long3 = journalChannel2.nextPrealloc;
        int int4 = journalChannel2.fd;
        int int5 = journalChannel2.fd;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0314");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), (long) 'a', 8, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0315");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) (short) 100, 1, (int) '4', false, (int) '4', serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0316");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1, (long) (short) 100, 6, 0, true, (int) (byte) 1, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0317");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, 1048576L, (int) (short) 1, (int) (byte) -1, false, (int) (byte) 0, bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0318");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0319");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0320");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        int int5 = journalChannel2.getFormatVersion();
        int int6 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0321");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) -1);
        byte[] byteArray8 = journalChannel7.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel9 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) 8, (int) (short) -1, 1048576L, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel9);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0322");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = null;
        journalChannel2.bc = bufferedChannel5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0323");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0324");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (-1), 1048576L, 0, 2, false, (int) ' ', bufferedChannelBuilder7, serverConfiguration19, fileChannelProvider20, (java.lang.Long) 3L);
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0325");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) 10, (int) '4', (int) (byte) 10, true, 0, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 10L);
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0326");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        long long8 = journalChannel6.nextPrealloc;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (short) 10, (int) '4', serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0327");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0328");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) 100, (int) (short) 100, 10, false, (int) (short) 10, serverConfiguration12, fileChannelProvider13);
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0329");
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
        java.lang.Class<?> wildcardClass15 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0330");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 512);
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
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0331");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 0L, (int) (short) 100, (int) (short) 0, false, 100, bufferedChannelBuilder7, serverConfiguration19, fileChannelProvider20, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0332");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, 0L, (int) (byte) 1, serverConfiguration18, fileChannelProvider19);
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
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0333");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0334");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        int int5 = journalChannel2.getFormatVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0335");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0336");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        byte[] byteArray7 = journalChannel6.magicWord;
        long long8 = journalChannel6.nextPrealloc;
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) 5, 8, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0337");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel9.bc;
        long long11 = journalChannel9.nextPrealloc;
        long long12 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 8, (-1), 3, true, (int) 'a', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0338");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel20 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) 10, 0, 512, false, (int) 'a', serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(bookieFileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0339");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration23 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) 3, (int) (short) 1, serverConfiguration23, fileChannelProvider24);
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
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0340");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0341");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10, 10L, (int) (short) -1, serverConfiguration19, fileChannelProvider20);
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0342");
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
        long long19 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0343");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0344");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0345");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 1048576L;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(serverConfiguration5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0346");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = journalChannel2.configuration;
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        int int7 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(serverConfiguration4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0347");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 2);
        journalChannel9.nextPrealloc = 10;
        journalChannel9.nextPrealloc = 0L;
        int int14 = journalChannel9.formatVersion;
        journalChannel9.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration16 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) 3, 0, 2, true, (int) '4', serverConfiguration16, fileChannelProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration16);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0348");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        int int7 = journalChannel2.formatVersion;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass10 = serverConfiguration9.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0349");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel7.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) 'a', 0, (long) 10, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieFileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0350");
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
        int int16 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel6.bc;
        java.nio.ByteBuffer byteBuffer18 = journalChannel6.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) 0, 100, serverConfiguration19, fileChannelProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0351");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = journalChannel6.bc;
        int int9 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) '#', (int) (byte) 100, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(bufferedChannel8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0352");
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
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0353");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) -1);
        journalChannel6.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 8, (int) (short) 1, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0354");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 0, 6, (int) (byte) 10, true, (int) (byte) -1, bufferedChannelBuilder7, serverConfiguration17, fileChannelProvider18, (java.lang.Long) 1048576L);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0355");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = null;
        journalChannel2.bc = bufferedChannel10;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0356");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.close();
        java.nio.ByteBuffer byteBuffer5 = journalChannel2.zeros;
        byte[] byteArray6 = journalChannel2.magicWord;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = journalChannel2.read(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0357");
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
        journalChannel6.nextPrealloc = 0L;
        int int21 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, 0L, (int) (short) 10, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0358");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        long long3 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        long long6 = journalChannel2.nextPrealloc;
        byte[] byteArray7 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0359");
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
        journalChannel2.nextPrealloc = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0360");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel2.configuration;
        int int9 = journalChannel2.fd;
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
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0361");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0362");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 10);
        journalChannel7.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel7.bc = bufferedChannel9;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 4, 4, (long) '4', serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0363");
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
        java.nio.channels.FileChannel fileChannel20 = journalChannel9.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration21 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512, (long) 10, (int) (short) 10, 4, true, 100, serverConfiguration21, fileChannelProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertNotNull(serverConfiguration21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0364");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration19 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, 0L, (int) (short) 1, serverConfiguration19, fileChannelProvider20);
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
        org.junit.Assert.assertNotNull(serverConfiguration19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0365");
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
        java.nio.channels.FileChannel fileChannel20 = journalChannel9.fc;
        long long21 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 0, 3L, 6, (int) (byte) -1, true, 512, serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertNotNull(fileChannel19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0366");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, 0L, (int) (short) 10, 2, false, 5, serverConfiguration12, fileChannelProvider13);
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0367");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) (byte) 1, (int) (short) 1, (int) (short) 100, true, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0368");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        byte[] byteArray8 = journalChannel2.magicWord;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration9);
        org.junit.Assert.assertNull(bufferedChannel10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0369");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1048576L, (long) '#', 4, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0370");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) 100, 8, (long) 5, serverConfiguration19, fileChannelProvider20);
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0371");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) (short) 0, 5, 2, true, 100, bufferedChannelBuilder7, serverConfiguration20, fileChannelProvider21, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0372");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1, (long) 100, (int) 'a', (long) (byte) -1, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0373");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        journalChannel2.close();
        java.lang.Class<?> wildcardClass17 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0374");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0375");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        long long7 = journalChannel2.nextPrealloc;
        java.nio.ByteBuffer byteBuffer8 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        java.lang.Class<?> wildcardClass11 = fileChannel10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0376");
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
        java.nio.channels.FileChannel fileChannel14 = journalChannel2.fc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNull(bufferedChannel15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0377");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
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
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0378");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (short) 1);
        int int11 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (byte) 1, (int) (short) 1, (int) 'a', true, 100, bufferedChannelBuilder7, serverConfiguration12, fileChannelProvider13, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0379");
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
            journalChannel2.preAllocIfNeeded((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0380");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        int int4 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = null;
        journalChannel2.bc = bufferedChannel6;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel8 = journalChannel2.channel;
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(bookieFileChannel8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0381");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0382");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) -1);
        byte[] byteArray3 = journalChannel2.magicWord;
        long long4 = journalChannel2.nextPrealloc;
        journalChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0383");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel28 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass29 = bookieFileChannel28.getClass();
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
        org.junit.Assert.assertNotNull(bookieFileChannel28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0384");
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
        java.lang.Class<?> wildcardClass13 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0385");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 2);
        int int7 = journalChannel6.fd;
        java.nio.channels.FileChannel fileChannel8 = journalChannel6.fc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 3, (int) 'a', serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel8);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0386");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0387");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        byte[] byteArray5 = journalChannel2.magicWord;
        java.nio.ByteBuffer byteBuffer6 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel7 = journalChannel2.fc;
        int int8 = journalChannel2.formatVersion;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        int int10 = journalChannel2.formatVersion;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(fileChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0388");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel29 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (short) 0, 0, (int) (byte) 100, true, (int) (short) 1, bufferedChannelBuilder7, serverConfiguration26, fileChannelProvider27, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0389");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 10, (int) (short) 1, (int) (short) 1, false, (int) (short) 10, bufferedChannelBuilder7, serverConfiguration21, fileChannelProvider22, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0390");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0391");
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
        java.nio.channels.FileChannel fileChannel21 = journalChannel2.fc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(fileChannel21);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0392");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((-1L));
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0393");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bufferedChannel3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0394");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass6 = bookieFileChannel5.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0395");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) -1, (long) 4, 2, 0L, serverConfiguration19, fileChannelProvider20);
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0396");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, (long) (short) 0, 3, (int) '4', false, (int) '#', bufferedChannelBuilder7, serverConfiguration22, fileChannelProvider23, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0397");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0398");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        java.nio.ByteBuffer byteBuffer11 = journalChannel9.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) 0, (int) (short) -1, (int) 'a', false, 8, serverConfiguration12, fileChannelProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0399");
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
        int int28 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0400");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
        org.junit.Assert.assertNull(bufferedChannel18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0401");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        int int12 = journalChannel10.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = null;
        journalChannel10.bc = bufferedChannel13;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) 0, (int) (byte) 10, (int) (byte) 10, true, 8, bufferedChannelBuilder7, serverConfiguration15, fileChannelProvider16, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0402");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0403");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel28 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (long) 'a', 512, (int) '#', false, 3, bufferedChannelBuilder7, serverConfiguration25, fileChannelProvider26, (java.lang.Long) 100L);
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0404");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) (short) 100, 1, serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0405");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        journalChannel2.nextPrealloc = 10;
        journalChannel2.nextPrealloc = 0L;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0406");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        long long8 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.bc;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0407");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0408");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.close();
        int int5 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.forceWrite(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0409");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = null;
        journalChannel2.bc = bufferedChannel4;
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0410");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0411");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration10 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) ' ', (int) '#', 5, true, (int) (byte) -1, serverConfiguration10, fileChannelProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0412");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L);
        journalChannel2.nextPrealloc = 0L;
        journalChannel2.nextPrealloc = (short) 100;
        journalChannel2.nextPrealloc = 97L;
        int int9 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0413");
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
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0414");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        java.nio.ByteBuffer byteBuffer9 = journalChannel7.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel10 = journalChannel7.channel;
        journalChannel7.nextPrealloc = 'a';
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) 8, (int) '#', (long) 3, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(bookieFileChannel10);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0415");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L);
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel3 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass4 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(bookieFileChannel3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0416");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        journalChannel2.nextPrealloc = (byte) 1;
        int int7 = journalChannel2.fd;
        int int8 = journalChannel2.getFormatVersion();
        java.lang.Class<?> wildcardClass9 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0417");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration8 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) 2, (int) '#', (long) (byte) -1, serverConfiguration8, fileChannelProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0418");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel25 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (byte) 0, (int) (byte) 1, (int) (byte) 0, false, (int) (byte) 100, serverConfiguration23, fileChannelProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration23);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0419");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) (short) 1);
        int int8 = journalChannel7.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration9 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel11 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, 100L, (int) (byte) 100, (long) (short) 100, serverConfiguration9, fileChannelProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0420");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((-1L));
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0421");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        int int6 = journalChannel2.getFormatVersion();
        int int7 = journalChannel2.fd;
        journalChannel2.nextPrealloc = (short) 10;
        java.nio.channels.FileChannel fileChannel10 = journalChannel2.fc;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fileChannel10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0422");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 100, (long) (byte) -1, 2, 3, false, 3, serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0423");
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
        java.lang.Class<?> wildcardClass30 = byteBuffer28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0424");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel18 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 1L, (-1L), 4, serverConfiguration16, fileChannelProvider17);
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0425");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        journalChannel2.nextPrealloc = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0426");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2, 0L, (int) (byte) 0, 3, false, 3, serverConfiguration25, fileChannelProvider26);
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
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0427");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        journalChannel2.nextPrealloc = '4';
        java.lang.Class<?> wildcardClass8 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0428");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0429");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (short) 1);
        int int10 = journalChannel9.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 100, (long) '4', (int) '#', (int) '#', true, 6, serverConfiguration11, fileChannelProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0430");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration5 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3, (long) (short) 100, 512, (long) (byte) 10, serverConfiguration5, fileChannelProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0431");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0432");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, (long) 5, (int) (byte) 0, (long) 8, serverConfiguration22, fileChannelProvider23);
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
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0433");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0434");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        journalChannel2.nextPrealloc = 0;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0435");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        journalChannel7.nextPrealloc = 10;
        journalChannel7.nextPrealloc = 0L;
        int int12 = journalChannel7.formatVersion;
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, 100L, (int) '#', (long) 2, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0436");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) ' ', (int) '#', 1, true, (-1), bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0437");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        java.lang.Class<?> wildcardClass4 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0438");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
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
        java.nio.channels.FileChannel fileChannel42 = journalChannel10.fc;
        journalChannel10.nextPrealloc = 0L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration45 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel48 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 100, (long) 8, (-1), (int) 'a', false, 1, bufferedChannelBuilder7, serverConfiguration45, fileChannelProvider46, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fileChannel42);
        org.junit.Assert.assertNotNull(serverConfiguration45);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0439");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = null;
        journalChannel2.bc = bufferedChannel16;
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(fileChannel13);
        org.junit.Assert.assertNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0440");
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
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration25 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (byte) -1, 512, 6, false, 4, serverConfiguration25, fileChannelProvider26);
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
        org.junit.Assert.assertNotNull(serverConfiguration25);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0441");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) (byte) 0, 512, 1048576L, serverConfiguration21, fileChannelProvider22);
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0442");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        int int8 = journalChannel2.getFormatVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0443");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        journalChannel9.nextPrealloc = 100;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '#', (long) (short) 10, (int) ' ', (int) (byte) 10, false, 100, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0444");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5);
        int int3 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0445");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = journalChannel2.bc;
        int int6 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        long long8 = journalChannel2.nextPrealloc;
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
        org.junit.Assert.assertNotNull(bookieFileChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0446");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel7.bc;
        java.nio.ByteBuffer byteBuffer19 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, 0L, 10, (-1L), serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0447");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 6, (long) '4', 100, (int) (byte) 0, true, (int) (byte) -1, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0448");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) 8, (int) '#', 0, false, (int) (byte) 1, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0449");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, (long) (byte) 100, 5, (long) '#', serverConfiguration18, fileChannelProvider19);
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0450");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = journalChannel2.bc;
        journalChannel2.nextPrealloc = 3;
        byte[] byteArray7 = journalChannel2.magicWord;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0451");
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
        int int42 = journalChannel2.getFormatVersion();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0452");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded(1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0453");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) 2);
        int int11 = journalChannel10.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = journalChannel10.bc;
        int int13 = journalChannel10.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) 512, (int) (byte) 1, (int) (byte) -1, false, (int) '#', bufferedChannelBuilder7, serverConfiguration14, fileChannelProvider15, (java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(bufferedChannel12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0454");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) ' ', (long) (short) 0, (int) (byte) 10, 1L, serverConfiguration15, fileChannelProvider16);
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0455");
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
            journalChannel2.preAllocIfNeeded((long) 3);
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
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0456");
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
        int int15 = journalChannel2.formatVersion;
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0457");
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
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (short) 10);
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
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0458");
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
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0459");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration13);
        org.junit.Assert.assertNull(bufferedChannel16);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0460");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        java.nio.channels.FileChannel fileChannel5 = journalChannel2.fc;
        long long6 = journalChannel2.nextPrealloc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel7 = journalChannel2.channel;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(bookieFileChannel7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0461");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = journalChannel7.bc;
        java.nio.ByteBuffer byteBuffer19 = journalChannel7.zeros;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration20 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 6, (int) (byte) -1, (long) 8, serverConfiguration20, fileChannelProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(serverConfiguration20);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0462");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.nextPrealloc = 'a';
        long long8 = journalChannel2.nextPrealloc;
        int int9 = journalChannel2.fd;
        int int10 = journalChannel2.getFormatVersion();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.bc;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNull(bufferedChannel11);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0463");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel12 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (-1L), (long) 4, (int) '#', serverConfiguration10, fileChannelProvider11);
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0464");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel9.bc;
        long long11 = journalChannel9.nextPrealloc;
        long long12 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 10, (long) (-1), 100, 2, false, 512, serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0465");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel6.bc;
        long long8 = journalChannel6.nextPrealloc;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = null;
        journalChannel6.bc = bufferedChannel9;
        int int11 = journalChannel6.formatVersion;
        journalChannel6.nextPrealloc = (byte) 0;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration14 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel16 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, (long) 1, 3, serverConfiguration14, fileChannelProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0466");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0467");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 512);
        int int3 = journalChannel2.fd;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0468");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        journalChannel2.nextPrealloc = (byte) 100;
        org.junit.Assert.assertNull(bufferedChannel3);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0469");
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
        int int21 = journalChannel9.formatVersion;
        int int22 = journalChannel9.fd;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel23 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) '4', (int) 'a', (int) (short) -1, false, (int) 'a', serverConfiguration24, fileChannelProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(bookieFileChannel23);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0470");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) '#', (int) (short) 100, serverConfiguration18, fileChannelProvider19);
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0471");
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
        long long36 = journalChannel2.nextPrealloc;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0472");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel22 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 1, 0L, 1, 512, true, 100, bufferedChannelBuilder7, serverConfiguration19, fileChannelProvider20, (java.lang.Long) (-1L));
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0473");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = journalChannel2.bc;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel4 = journalChannel2.channel;
        java.lang.Class<?> wildcardClass5 = bookieFileChannel4.getClass();
        org.junit.Assert.assertNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bookieFileChannel4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0474");
        java.io.File file0 = null;
        java.io.File file5 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel7 = new org.apache.bookkeeper.bookie.JournalChannel(file5, (long) 2);
        int int8 = journalChannel7.fd;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = journalChannel7.bc;
        int int10 = journalChannel7.formatVersion;
        java.io.File file11 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel13 = new org.apache.bookkeeper.bookie.JournalChannel(file11, (long) 2);
        int int14 = journalChannel13.fd;
        java.nio.ByteBuffer byteBuffer15 = journalChannel13.zeros;
        int int16 = journalChannel7.read(byteBuffer15);
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration18 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 1, (long) 'a', 100, (long) '4', serverConfiguration18, fileChannelProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(bufferedChannel9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration18);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0475");
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = null;
        journalChannel2.bc = bufferedChannel12;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0476");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = journalChannel9.bc;
        long long11 = journalChannel9.nextPrealloc;
        long long12 = journalChannel9.nextPrealloc;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration13 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 'a', (long) (short) 10, 10, 6, false, (int) ' ', serverConfiguration13, fileChannelProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferedChannel10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(serverConfiguration13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0477");
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
        journalChannel6.nextPrealloc = 0L;
        int int21 = journalChannel6.formatVersion;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration22 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel24 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 5, (long) (-1), (int) ' ', serverConfiguration22, fileChannelProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration22);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0478");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) -1);
        journalChannel10.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel15 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) (-1), (int) (byte) 10, (int) (byte) 10, true, 8, bufferedChannelBuilder7, serverConfiguration12, fileChannelProvider13, (java.lang.Long) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0479");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        journalChannel2.nextPrealloc = 'a';
        java.nio.channels.FileChannel fileChannel6 = journalChannel2.fc;
        java.nio.ByteBuffer byteBuffer7 = journalChannel2.zeros;
        // The following exception was thrown during execution in test generation
        try {
            journalChannel2.preAllocIfNeeded((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fileChannel6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0480");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 10L, 0L, 0, 100, true, 4, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0481");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 2);
        int int3 = journalChannel2.fd;
        java.nio.ByteBuffer byteBuffer4 = journalChannel2.zeros;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel5 = journalChannel2.channel;
        journalChannel2.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel2.configuration;
        int int8 = journalChannel2.formatVersion;
        journalChannel2.nextPrealloc = 1048576L;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(bookieFileChannel5);
        org.junit.Assert.assertNotNull(serverConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0482");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel23 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 100L, (long) (-1), (int) (short) 0, serverConfiguration21, fileChannelProvider22);
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0483");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = ' ';
        java.lang.Class<?> wildcardClass6 = journalChannel2.getClass();
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0484");
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
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel22 = journalChannel7.channel;
        journalChannel7.close();
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration24 = journalChannel7.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8, (long) 4, 0, (-1L), serverConfiguration24, fileChannelProvider25);
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
        org.junit.Assert.assertNotNull(bookieFileChannel22);
        org.junit.Assert.assertNotNull(serverConfiguration24);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0485");
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
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
        org.junit.Assert.assertNotNull(bookieFileChannel17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0486");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder7 = null;
        java.io.File file8 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel10 = new org.apache.bookkeeper.bookie.JournalChannel(file8, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration11 = journalChannel10.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel14 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 4, 0L, 0, (int) (short) 1, true, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration11, fileChannelProvider12, (java.lang.Long) 1048576L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0487");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel27 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 97L, (long) 5, (int) (byte) 10, 6, true, (int) '4', bufferedChannelBuilder7, serverConfiguration24, fileChannelProvider25, (java.lang.Long) 0L);
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0488");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel20 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (-1L), 8, (long) (byte) 0, serverConfiguration18, fileChannelProvider19);
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0489");
        java.io.File file0 = null;
        java.io.File file7 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file7, (long) (byte) -1);
        byte[] byteArray10 = journalChannel9.magicWord;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel11 = journalChannel9.channel;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration12 = journalChannel9.configuration;
        journalChannel9.nextPrealloc = 1048576L;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration15 = journalChannel9.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel17 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 0L, (long) 8, (int) (short) 10, 1, true, 5, serverConfiguration15, fileChannelProvider16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
        org.junit.Assert.assertNotNull(bookieFileChannel11);
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(serverConfiguration15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0490");
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
        java.lang.Class<?> wildcardClass16 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(bufferedChannel13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0491");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel26 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) (short) -1, (int) (short) 10, 3, true, (int) (short) -1, bufferedChannelBuilder7, serverConfiguration23, fileChannelProvider24, (java.lang.Long) 97L);
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
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0492");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = journalChannel2.getBufferedChannel();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read only journal channel");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0493");
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
            org.apache.bookkeeper.bookie.JournalChannel journalChannel21 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (short) 0, (long) (short) 100, 1, (int) (short) 1, false, 512, serverConfiguration19, fileChannelProvider20);
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0494");
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
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel19 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) '4', (long) '#', (-1), (long) 5, serverConfiguration17, fileChannelProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(serverConfiguration16);
        org.junit.Assert.assertNotNull(serverConfiguration17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0495");
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
        org.junit.Assert.assertNotNull(serverConfiguration12);
        org.junit.Assert.assertNotNull(bookieFileChannel13);
        org.junit.Assert.assertNotNull(serverConfiguration14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0496");
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
        java.lang.Class<?> wildcardClass15 = journalChannel2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(bufferedChannel4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0497");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) (byte) 10);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration3 = journalChannel2.configuration;
        journalChannel2.nextPrealloc = 4;
        org.apache.bookkeeper.bookie.BookieFileChannel bookieFileChannel6 = journalChannel2.channel;
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = journalChannel2.bc;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bufferedChannel7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration3);
        org.junit.Assert.assertNotNull(bookieFileChannel6);
        org.junit.Assert.assertNull(bufferedChannel7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0498");
        java.io.File file0 = null;
        java.io.File file4 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file4, (long) 3);
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration7 = journalChannel6.configuration;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel9 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 0, (long) (byte) 1, 512, serverConfiguration7, fileChannelProvider8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverConfiguration7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0499");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.JournalChannel journalChannel2 = new org.apache.bookkeeper.bookie.JournalChannel(file0, (long) 8);
        byte[] byteArray3 = journalChannel2.magicWord;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 66, (byte) 75, (byte) 76, (byte) 71 });
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JournalChannelTest0.test0500");
        java.io.File file0 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration4 = null;
        org.apache.bookkeeper.bookie.FileChannelProvider fileChannelProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.JournalChannel journalChannel6 = new org.apache.bookkeeper.bookie.JournalChannel(file0, 3L, (long) 8, 2, serverConfiguration4, fileChannelProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
