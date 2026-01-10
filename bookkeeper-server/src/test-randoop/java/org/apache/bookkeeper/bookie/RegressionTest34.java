import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

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
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '4', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (-1), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) ' ', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) 'a', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '4', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) ' ', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) '4', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) 'a', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) '4', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '4', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) ' ', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '#', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) ' ', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) ' ', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) ' ', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '4', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) ' ', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (-1), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '4', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '4', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '4', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) 'a', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '#', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) '4', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) '#', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '#', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '4', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) 'a', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) 'a', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (byte) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) ' ', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) ' ', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) '#', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (-1), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) 'a', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) '#', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '#', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) '4', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (-1), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17265");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17266");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17267");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17268");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17269");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '4', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17270");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17271");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17272");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17273");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (-1), (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17274");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17275");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '#', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17276");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (-1), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17277");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '4', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17278");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '4', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17279");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17280");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17281");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17282");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17283");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) ' ', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17284");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17285");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '#', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17286");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17287");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) 'a', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17288");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17289");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17290");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17291");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17292");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17293");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17294");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) ' ', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17295");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17296");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17297");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17298");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17299");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17300");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17301");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17302");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17303");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17304");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '4', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17305");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17306");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17307");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17308");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17309");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17310");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17311");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '#', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17312");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17313");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17314");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17315");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17316");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17317");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17318");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17319");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17320");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17321");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17322");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17323");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17324");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17325");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17326");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17327");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17328");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17329");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17330");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17331");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17332");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17333");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17334");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17335");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) '#', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17336");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17337");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17338");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17339");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17340");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17341");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) '4', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17342");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17343");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17344");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17345");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17346");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17347");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17348");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17349");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17350");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17351");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17352");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17353");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17354");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17355");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17356");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17357");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17358");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17359");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17360");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17361");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17362");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17363");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17364");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17365");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17366");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17367");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) ' ', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17368");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17369");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17370");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17371");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17372");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17373");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17374");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17375");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17376");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17377");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17378");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17379");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17380");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17381");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17382");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17383");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17384");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17385");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '#', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17386");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17387");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17388");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17389");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17390");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17391");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17392");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17393");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17394");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (short) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17395");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '4', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17396");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17397");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17398");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17399");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17400");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17401");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17402");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17403");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (-1), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17404");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17405");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17406");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17407");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17408");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17409");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) 'a', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17410");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17411");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17412");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) '#', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17413");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17414");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17415");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17416");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17417");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17418");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17419");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17420");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17421");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17422");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17423");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) 'a', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17424");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17425");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17426");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17427");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17428");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17429");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17430");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) '4', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17431");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17432");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17433");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17434");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (-1), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17435");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17436");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17437");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (short) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17438");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (byte) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17439");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17440");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17441");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17442");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10, (int) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17443");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17444");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17445");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17446");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) '4', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17447");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17448");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17449");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17450");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1, (int) (short) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17451");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17452");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17453");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17454");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17455");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (short) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17456");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17457");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (byte) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17458");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1, (int) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17459");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100, (int) ' ', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17460");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) (byte) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17461");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) ' ', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17462");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (byte) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17463");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17464");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17465");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17466");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17467");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17468");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100, (int) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17469");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17470");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) (short) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17471");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (byte) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17472");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17473");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17474");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17475");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17476");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) ' ', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17477");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4', 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17478");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17479");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17480");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (short) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17481");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17482");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1, (int) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17483");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17484");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) '4', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17485");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (byte) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17486");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17487");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17488");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0, (int) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17489");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17490");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) '#', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17491");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a', (int) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17492");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17493");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10, (int) (short) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17494");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10, (int) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17495");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17496");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17497");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ', (int) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17498");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1), (int) (short) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17499");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#', (int) (byte) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17500");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1, (int) 'a', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

