import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) '#', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '#', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '#', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (-1), (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) 'a', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (-1), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (-1), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) '#', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '4', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '#', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '4', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) '4', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) 'a', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) ' ', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '4', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '#', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) ' ', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) 'a', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '#', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '4', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) 'a', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '4', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '#', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) 'a', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) 'a', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) ' ', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) ' ', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) 'a', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) ' ', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '#', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '#', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (-1), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (-1), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (-1), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) 'a', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) ' ', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (-1), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) ' ', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (-1), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '4', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '4', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '#', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) '#', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) 'a', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) ' ', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) 'a', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '#', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '4', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

