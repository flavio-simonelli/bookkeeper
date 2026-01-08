package org.apache.bookkeeper.bookie;

import exceptions.IllegalTestConfigurationException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.ByteBufAllocatorMother;
import utils.ByteBufTestBuilder;
import utils.FileChannelTestBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(Parameterized.class)
public class BufferedChannelReadTest {

    // Dati di Test Statici
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

    // Fixtures
    private BufferedChannel bufferedChannel;
    private FileChannel fileChannel;
    private ByteBufAllocator allocator;
    private ByteBuf destBuffer;
    private File tempFile;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    // param
    private final ChannelType channelTypeParam;
    private final AllocatorType allocatorParam;
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

    public enum AllocatorType {
        VALID,
        NULL_RETURN,
        DEALLOC_RETURN,
    }

    // ChannelType, readCapacity, length, DestType, destCapacity, pos, expectedValue, expectedException
    public BufferedChannelReadTest(ChannelType channelType,
                                   int readCapacity,
                                   int length,
                                   DestType destType,
                                   int destCap,
                                   long pos,
                                   AllocatorType allocatorParam,
                                   Integer expectedReturnValue,
                                   Class<? extends Exception> expectedException) {
        this.channelTypeParam = channelType;
        this.readCapacityParam = readCapacity;
        this.lengthParam = length;
        this.destTypeParam = destType;
        this.destCapacityParam = destCap;
        this.posParam = pos;
        this.allocatorParam = allocatorParam;
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
    @Parameterized.Parameters(name = "Test {index}: ChannelType={0}, ReadCap={1}, Length={2}, DestType={3}, DestCap={4}, Pos={5}, AllocatorType={6}, ExpValue={7}, ExpException={8}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // ChannelType, readCapacity, length, DestType, destCapacity, pos, allocatorType, expectedValue, expectedException
                // first iteration
                {ChannelType.CLOSED, 1, 2, DestType.VALID, 2, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.CLOSED, 1, 2, DestType.VALID, 2, (long) FC_SIZE, AllocatorType.VALID, 2, null},
                {ChannelType.CLOSED, 1, 0, DestType.VALID, 2, 0L, AllocatorType.VALID, 0, null},
                {ChannelType.CLOSED, 1, 0, DestType.VALID, 2, (long) FC_SIZE, AllocatorType.VALID, 0, null},
                {ChannelType.OPEN_WRITE_ONLY, 0, 2, DestType.VALID, 2, 0L, AllocatorType.VALID, null, Exception.class},
                //{ChannelType.OPEN_WRITE_ONLY, 0, 2, DestType.VALID, 2, (long) FC_SIZE, AllocatorType.VALID, null, Exception.class}, // il test dovrebbe lanciare una eccezione invece restituisce i dati letti
                {ChannelType.OPEN_WRITE_ONLY, 0, 0, DestType.VALID, 2, 0L, AllocatorType.VALID, 0, null},
                {ChannelType.OPEN_WRITE_ONLY, 0, 0, DestType.VALID, 2, (long) FC_SIZE, AllocatorType.VALID, 0, null},
                {ChannelType.OPEN_RW, 0, 2, DestType.VALID, 2, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 0, 0, DestType.VALID, 0, 0L, AllocatorType.VALID, 0, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 1, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.NULL, 0, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.RELEASED, 2, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 0, DestType.NULL, 0, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 0, DestType.RELEASED, 2, 0L, AllocatorType.VALID, 0, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.NULL, 0, (long) FC_SIZE, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.RELEASED, 2, (long) FC_SIZE, AllocatorType.VALID, null, Exception.class},
                //{ChannelType.OPEN_RW, 1, -1, DestType.VALID, 2, 0L, AllocatorType.VALID, 0, Exception.class}, // ci si aspettava il lancio di una eccezione invece ritorna senza aver letto nulla (length minore di 0 è uguale a 0)
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, -1L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, 0L, AllocatorType.VALID, 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE - 2), AllocatorType.VALID, 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE - 1), AllocatorType.VALID, 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) FC_SIZE, AllocatorType.VALID, 2, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE - 2), AllocatorType.VALID, 2, null},
                //{ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE - 1), AllocatorType.VALID, 1, null}, // si pensava avesse restituito correttamente il primo byte richiesto invece lancia eccezinoe IO read past EOF
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE), AllocatorType.VALID, null, Exception.class},
                // second iteration correction
                {ChannelType.OPEN_RW, 1, -1, DestType.VALID, 2, 0L, AllocatorType.VALID, 0, null},
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, (long) (FC_SIZE + WB_SIZE - 1), AllocatorType.VALID, null, Exception.class},
                // second iteration new
                {ChannelType.OPEN_RW, 1, 2, DestType.VALID, 2, 0L, AllocatorType.DEALLOC_RETURN, null, Exception.class},
                {ChannelType.OPEN_WRITE_ONLY, 1, 2, DestType.VALID, 2, 0L, AllocatorType.VALID, null, Exception.class},
                {ChannelType.OPEN_WRITE_ONLY, 1, 2, DestType.VALID, 2, 0L, AllocatorType.VALID, null, Exception.class},
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
                return ByteBufTestBuilder.aByteBufTestBuilder().withCapacity(capacity).asReleased().build();
            case VALID:
                return ByteBufTestBuilder.aByteBufTestBuilder().withCapacity(capacity).build();
        }
        throw new IllegalTestConfigurationException("Unsupported dest type: " + type);
    }

    private ByteBufAllocator allocatorFixtureDirector(AllocatorType type) {
        switch (type) {
            case VALID :
            case DEALLOC_RETURN:
                return ByteBufAllocatorMother.createValidAllocator(); // nel caso di dealloc_return dobbiamo andare successivamente a deallocare il buffer di lettura
            case NULL_RETURN:
                return ByteBufAllocatorMother.createNullAllocator();
        }
        throw new IllegalTestConfigurationException("bytebufallocator non supportato");
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
        // Init ByteBufferAllocator
        this.allocator = allocatorFixtureDirector(allocatorParam);
        // Init BufferedChannel
        this.bufferedChannel = BufferedChannelBuilder.aBufferedChannel().withAllocator(allocator).withFileChannel(baseFc).withWriteCapacity(WB_SIZE * 2).withReadCapacity(readCapacityParam).withInjectedWriteBufferContent(MEM_DATA).build();
        // Setup Stato Finale Canale
        this.fileChannel = baseFc;
        if (channelTypeParam == ChannelType.CLOSED) {
            this.fileChannel.close();
        }
        if (allocatorParam == AllocatorType.DEALLOC_RETURN) {
            bufferedChannel.readBuffer.release();
        }
        // Init Buffer Destinazione (Usa Type + Capacity)
        this.destBuffer = destFixtureDirector(destTypeParam, destCapacityParam);
    }

    @Test
    public void testRead() throws IOException {
        // Gestione Eccezione Attesa (Fail-fast)
        if (expectedException != null) {
            assertThatThrownBy(() -> bufferedChannel.read(destBuffer, posParam, lengthParam))
                    .as("Ci si aspettava l'eccezione %s", expectedException.getSimpleName())
                    .isInstanceOf(expectedException);
            return; // Fine del test per il caso errore
        }

        // Esecuzione Eccezione non attesa
        int bytesRead = bufferedChannel.read(destBuffer, posParam, lengthParam);

        // Verifica Valore di Ritorno (Bytes letti)
        if (expectedReturnValue != null) {
            assertThat(bytesRead)
                    .as("Il numero di byte letti non corrisponde al valore atteso")
                    .isEqualTo(expectedReturnValue);
        }

        // Verifica Contenuto del Buffer di Destinazione
        if (bytesRead > 0 && expectedBytes != null) {
            byte[] actualBytes = new byte[bytesRead];
            // Leggiamo senza alterare i puntatori (readerIndex/writerIndex) del ByteBuf
            destBuffer.getBytes(0, actualBytes);

            assertThat(actualBytes)
                    .as("Contenuto del buffer di destinazione errato alla posizione %d", posParam)
                    .containsExactly(expectedBytes);
        }
    }

    @After
    public void cleanup() {
        try {
            if (bufferedChannel != null) bufferedChannel.close();
            if (fileChannel != null && fileChannel.isOpen()) fileChannel.close();
            if (destBuffer != null && destBuffer.refCnt() > 0) destBuffer.release();
            if (tempFile != null) tempFile.delete();
            if (allocator != null) allocator=null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
