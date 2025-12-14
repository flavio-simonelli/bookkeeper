package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.FileChannelTestBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BufferedChannelReadTest {

    // --- Dati di Test Statici (Oracle) ---
    // Simuliamo:
    // FileChannel (Disco): {1, 2, 3, 4}
    // WriteBuffer (Mem):   {5, 6, 7, 8}
    // Totale logico:       {1, 2, 3, 4, 5, 6, 7, 8}
    private static final byte[] DISK_DATA = new byte[]{1, 2, 3, 4};
    private static final byte[] MEM_DATA = new byte[]{5, 6, 7, 8};
    private static final int FC_SIZE = DISK_DATA.length;
    private static final int WB_SIZE = MEM_DATA.length;

    // Array "Virtuale" completo pre-calcolato per facilitare lo slicing nei parametri
    private static final byte[] VIRTUAL_DATA;
    static {
        VIRTUAL_DATA = new byte[FC_SIZE + WB_SIZE];
        System.arraycopy(DISK_DATA, 0, VIRTUAL_DATA, 0, FC_SIZE);
        System.arraycopy(MEM_DATA, 0, VIRTUAL_DATA, FC_SIZE, WB_SIZE);
    }

    // --- Fixtures ---
    private BufferedChannel bufferedChannel;
    private FileChannel fileChannel;
    private ByteBuf destBuffer;
    private File tempFile;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    // param
    private final ChannelType channelTypeParam;
    private final int readCapacityParam;
    private final int lengthParam;
    private final DestType destTypeParam;
    private final int destCapacityParam;
    private final long posParam;

    // expected
    private final Class<? extends Exception> expectedException;
    private final byte[] expectedBytes;
    private final Integer expectedReturnValue;

    public enum ChannelType {
        CLOSED,
        OPEN_RW,
        OPEN_WRITE_ONLY,
    }

    public enum DestType {
        NULL,
        RELEASED,
        VALID,
    }
    // ChannelType, readCapacity, length, DestType, destCapacity, pos, expectedValue, expectedException
    public BufferedChannelReadTest(ChannelType channelType,
                                   int readCapacity,
                                   int length,
                                   DestType destType,
                                   int destCap,
                                   long pos,
                                   Integer expectedReturnValue,
                                   Class<? extends Exception> expectedException) {
        this.channelTypeParam = channelType;
        this.readCapacityParam = readCapacity;
        this.lengthParam = length;
        this.destTypeParam = destType;
        this.destCapacityParam = destCap;
        this.posParam = pos;
        this.expectedReturnValue = expectedReturnValue;
        this.expectedException = expectedException;

        // Calcolo expectedBytes usando i parametri appena assegnati
        this.expectedBytes = expContent(pos, expectedReturnValue);
    }

    /**
     * Helper per calcolare il contenuto atteso (Oracle Logic)
     */
    private static byte[] expContent(long pos, Integer length) {
        if (length == null || length <= 0) return new byte[0];
        byte[] result = new byte[length];
        System.arraycopy(VIRTUAL_DATA, (int) pos, result, 0, length);
        return result;
    }

    // Parametri dei casi di test
    @Parameterized.Parameters(name = "Test {index}: ChannelType={0}, ReadCap={1}, Length={2}, DestType={3}, DestCap={4}, Pos={5}, ExpValue={6}, ExpException={7}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // ChannelType, readCapacity, length, DestType, destCapacity, pos, expectedValue, expectedException
                {ChannelType.CLOSED, 1, 2, DestType.VALID, 2, 0L, null, Exception.class},
                {ChannelType.CLOSED, 1, 2, DestType.VALID, 2, (long) FC_SIZE, null, Exception.class},
                {ChannelType.CLOSED, 1, 0, DestType.VALID, 2, 0L, 0, null},
                {ChannelType.CLOSED, 1, 0, DestType.VALID, 2, (long) FC_SIZE, 0, null},
                {ChannelType.OPEN_WRITE_ONLY, 0, 2, DestType.VALID, 2, 0L, null, Exception.class},
                {ChannelType.OPEN_WRITE_ONLY, 0, 2, DestType.VALID, 2, (long) FC_SIZE, null, Exception.class},
                {ChannelType.OPEN_WRITE_ONLY, 0, 0, DestType.VALID, 2, 0L, 0, null},
                {ChannelType.OPEN_WRITE_ONLY, 0, 0, DestType.VALID, 2, (long) FC_SIZE, 0, null},
                {ChannelType.OPEN_RW, 0, 2, DestType.VALID, 2, 0L, null, Exception.class},
                {ChannelType.OPEN_RW, 0, 0, DestType.VALID, 0, 0L, 0, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 1, 0L, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.NULL, 0, 0L, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.RELEASED, 2, 0L, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 0, DestType.NULL, 0, 0L, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 0, DestType.RELEASED, 2, 0L, 0, null},
                {ChannelType.OPEN_RW, 1, -1, DestType.VALID, 2, 0L, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, -1L, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, 0L, 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE - 2), 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) FC_SIZE, 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE - 2), 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE - 1), 1, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE + 1), null, Exception.class}
        });
    }

    /**
     * Costruisce il buffer combinando il TIPO (Enum) e la DIMENSIONE (int).
     */
    private ByteBuf destFixtureDirector(DestType type, int capacity) {
        switch (type) {
            case NULL:
                return null;
            case RELEASED:
                ByteBuf b = UnpooledByteBufAllocator.DEFAULT.buffer(capacity);
                b.release();
                return b;
            case VALID:
            default:
                return UnpooledByteBufAllocator.DEFAULT.buffer(capacity);
        }
    }

    @Before
    public void setUp() throws IOException {
        // Setup Disco
        tempFile = folder.newFile("test-read-" + System.nanoTime() + ".log");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(DISK_DATA);
        }
        // Setup FileChannel Base
        FileChannel baseFc;
        if (channelTypeParam == ChannelType.OPEN_WRITE_ONLY) {
            baseFc = FileChannelTestBuilder.aFileChannel().inWriteMode().withContent(DISK_DATA).build(tempFile.toPath());
        } else {
            baseFc = FileChannelTestBuilder.aFileChannel().inReadWriteMode().withContent(DISK_DATA).build(tempFile.toPath());
        }
        // Init BufferedChannel
        this.bufferedChannel = BufferedChannelBuilder.aBufferedChannel().withAllocator(UnpooledByteBufAllocator.DEFAULT).withFileChannel(baseFc).withWriteCapacity(WB_SIZE * 2).withReadCapacity(readCapacityParam).withInjectedWriteBufferContent(MEM_DATA).build();
        // Setup Stato Finale Canale
        this.fileChannel = baseFc;
        if (channelTypeParam == ChannelType.CLOSED) {
            this.fileChannel.close();
        }
        // Init Buffer Destinazione (Usa Type + Capacity)
        this.destBuffer = destFixtureDirector(destTypeParam, destCapacityParam);
    }

    @Test
    public void testRead() {
        try {
            // Esecuzione
            int bytesRead = bufferedChannel.read(destBuffer, posParam, lengthParam);

            // Verifica Assenza Eccezione
            if (expectedException != null) {
                fail("Ci si aspettava l'eccezione: " + expectedException.getSimpleName());
            }

            // Verifica Valore Ritorno
            if (expectedReturnValue != null) {
                assertEquals("Bytes letti errati", expectedReturnValue.intValue(), bytesRead);
            }

            // Verifica Contenuto Buffer
            if (bytesRead > 0 && expectedBytes != null) {
                byte[] actualBytes = new byte[bytesRead];
                // Leggiamo senza alterare i puntatori del ByteBuf
                destBuffer.getBytes(0, actualBytes);

                assertArrayEquals("Contenuto buffer errato alla pos " + posParam,
                        expectedBytes, actualBytes);
            }

        } catch (Throwable t) {
            // Verifica Eccezione Attesa
            if (expectedException == null) {
                t.printStackTrace();
                fail("Eccezione inattesa: " + t.getClass().getSimpleName() + " - " + t.getMessage());
            } else {
                if (!expectedException.isAssignableFrom(t.getClass())) {
                    fail("Eccezione errata. Attesa: " + expectedException.getSimpleName() +
                            ", Ottenuta: " + t.getClass().getSimpleName());
                }
            }
        }
    }

    @After
    public void cleanup() {
        try {
            if (bufferedChannel != null) try { bufferedChannel.close(); } catch(Exception ignored){}
            if (fileChannel != null && fileChannel.isOpen()) fileChannel.close();
            if (destBuffer != null && destBuffer.refCnt() > 0) destBuffer.release();
        } catch (Exception ignored) {}
    }

}
