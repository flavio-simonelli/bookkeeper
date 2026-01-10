import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '4', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '4', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) 'a', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (-1), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) 'a', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) 'a', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) ' ', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '4', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) 'a', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) '4', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) '4', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (-1), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) ' ', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (-1), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) 'a', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (byte) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '4', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) ' ', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '#', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) 'a', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '#', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) ' ', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) ' ', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (-1), (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (-1), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) ' ', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '4', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) 'a', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) 'a', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) 'a', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) ' ', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = org.apache.bookkeeper.testutils.RandoopDataFactory.provideAllocator();
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocator0);
    }
}

