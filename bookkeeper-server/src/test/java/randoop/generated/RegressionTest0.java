package randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 1, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) 'a', file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (short) 100, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList2 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.bookkeeper.bookie.CheckpointSource checkpointSource0 = org.apache.bookkeeper.bookie.CheckpointSource.DEFAULT;
        java.lang.Class<?> wildcardClass1 = checkpointSource0.getClass();
        org.junit.Assert.assertNotNull(checkpointSource0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal(0, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) '#', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) ' ', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 100, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal(100, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) ' ', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal(100, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) '4', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal(10, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal(0, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal(0, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) '4', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (byte) -1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 10, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (short) 1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.lang.Class<?> wildcardClass1 = bufferedChannelBuilder0.getClass();
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (short) 0, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) '#', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (short) 0, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (short) -1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) ' ', file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (short) -1, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 0, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (short) 10, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (short) -1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (byte) -1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (short) 1, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 0, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 100, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal(10, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (short) 10, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (short) 10, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (short) 100, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal(1, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal(10, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) (short) 0, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal(100, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (short) 1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) '4', file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) 'a', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 100, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder bufferedChannelBuilder0 = org.apache.bookkeeper.bookie.Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = bufferedChannelBuilder0.create(fileChannel1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannelBuilder0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (short) 100, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (byte) -1, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal(1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 10, file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((int) '#', file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((-1), file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal4 = new org.apache.bookkeeper.bookie.Journal((-1), file1, serverConfiguration2, ledgerDirsManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 0, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((-1), file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal(1, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal6 = new org.apache.bookkeeper.bookie.Journal((int) 'a', file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.io.File file1 = null;
        org.apache.bookkeeper.conf.ServerConfiguration serverConfiguration2 = null;
        org.apache.bookkeeper.bookie.LedgerDirsManager ledgerDirsManager3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger4 = null;
        io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
        org.apache.bookkeeper.bookie.JournalAliveListener journalAliveListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.Journal journal7 = new org.apache.bookkeeper.bookie.Journal((int) (byte) 10, file1, serverConfiguration2, ledgerDirsManager3, statsLogger4, byteBufAllocator5, journalAliveListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

