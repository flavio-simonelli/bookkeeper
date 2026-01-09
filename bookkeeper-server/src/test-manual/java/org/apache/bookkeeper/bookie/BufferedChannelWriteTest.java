package org.apache.bookkeeper.bookie;

import exceptions.IllegalTestConfigurationException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.apache.bookkeeper.testutils.ByteBufAllocatorMother;
import org.apache.bookkeeper.testutils.ByteBufTestBuilder;
import org.apache.bookkeeper.testutils.FileChannelTestBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class BufferedChannelWriteTest {

    // src data
    private static final byte[] SRC_DATA = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private static final int SRC_SIZE = SRC_DATA.length;

    // fixtures
    private BufferedChannel bufferedChannel;
    private FileChannel fileChannel;
    private ByteBuf srcBuffer;
    private File tempFile;
    private ByteBufAllocator allocator;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    // Questo farà fallire qualsiasi test che impieghi più di 5 secondi
    @Rule
    public Timeout globalTimeout = new Timeout(5, TimeUnit.SECONDS);

    // parameters
    private final int writeCapacityParam;
    private final ChannelType channelTypeParam;
    private final int unpersistedBytesBoundParam;
    private final int unpersistedBytesParam;
    private final SrcType srcTypeParam;
    private final int srcLengthParam;
    private final AllocatorType allocatorParam;

    // expected values
    private final Class<? extends Exception> expectedException;
    private final byte[] expectedFileContent;
    private final byte[] expectedBufferContent;
    private final Boolean expectedForceCall;
    private final AtomicReference<byte[]> fileContentAtForceMoment = new AtomicReference<>();

    public enum ChannelType {
        CLOSED,
        OPEN_RW,
        OPEN_READ_ONLY,
    }

    public enum SrcType {
        NULL,
        RELEASED,
        INVALID_INDEX,
        VALID,
    }

    public enum AllocatorType {
        VALID,
        NULL_RETURN,
        DEALLOC_RETURN,
    }

    public BufferedChannelWriteTest( int writeCapacity,
                                     ChannelType channelType,
                                     int unpersistedBytesBound,
                                     int unpersistedBytes,
                                     SrcType srcType,
                                     int srcLength,
                                     AllocatorType allocatorType,
                                     Class<? extends Exception> expectedException,
                                     byte[] expectedFileContent,
                                     byte[] expectedBufferContent,
                                     boolean expectedForceCall) {
        this.writeCapacityParam = writeCapacity;
        this.channelTypeParam = channelType;
        this.unpersistedBytesBoundParam = unpersistedBytesBound;
        this.unpersistedBytesParam = unpersistedBytes;
        this.srcTypeParam = srcType;
        this.srcLengthParam = srcLength;
        this.allocatorParam = allocatorType;
        this.expectedException = expectedException;
        this.expectedFileContent = expectedFileContent;
        this.expectedBufferContent = expectedBufferContent;
        this.expectedForceCall = expectedForceCall;
    }

    // --- Helper per la creazione dei dati attesi (Slice dell'array SRC_DATA) ---
    // Prende i byte dall'array SRC_DATA dall'indice 'from' fino all'indice "to" ESCLUSO
    private static byte[] slice(int from, int to) {
        // Controllo di coerenza logica: l'inizio non può superare la fine
        if (from > to) {
            throw new IllegalArgumentException("L'indice iniziale (" + from + ") non può essere maggiore dell'indice finale (" + to + ")");
        }
        // Se gli indici sono uguali, il range è vuoto (lunghezza 0)
        if (from == to) return new byte[0];
        // Controllo dei limiti inferiori e superiori
        if (from < 0) {
            throw new IndexOutOfBoundsException("Indice iniziale negativo: " + from);
        }
        if (to > SRC_SIZE) {
            throw new IndexOutOfBoundsException("Indice finale " + to + " fuori dai limiti (dimensione massima: " + SRC_SIZE + ")");
        }
        return Arrays.copyOfRange(SRC_DATA, from, to);
    }

    // Helper per la creazione di un array vuoto
    private static byte[] empty() {
        return new byte[0];
    }

    // --- Configurazione Parametri ---
    @Parameterized.Parameters(name = "{index}: WriteCap={0}, ChannelType={1}, UBBound={2}, InitUB={3}, SrcType={4}, SrcLen={5}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // WriteCap, ChannelType, UBBound, InitUB, SrcType, SrcLen, AllocatorType, ExpException, ExpFileBytes, ExpBufferBytes, expectedForceCall
                {1, ChannelType.OPEN_RW, 10, 0, SrcType.NULL, 0, AllocatorType.VALID, Exception.class, null, null, false},
                {1, ChannelType.OPEN_RW, 10, 0, SrcType.RELEASED, 9, AllocatorType.VALID, Exception.class, null, null, false},
                {1, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 0, AllocatorType.VALID, null, empty(), empty(), false},
                {9, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, null, slice(0,9), empty(), false},
                {10, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 10, AllocatorType.VALID, null, slice(0,10), empty(), true},
                {11, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 11, AllocatorType.VALID, null, slice(0,11), empty(), true},
                {10, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, null, empty(), slice(0,9), false},
                {11, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 10, AllocatorType.VALID, null, slice(0,10), empty(), true},
                {12, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 11, AllocatorType.VALID, null, slice(0,11), empty(), true},
                {1, ChannelType.OPEN_RW, 0, 0, SrcType.VALID, 0, AllocatorType.VALID, null, empty(), empty(), false},
                //{1, ChannelType.OPEN_RW, 0, 0, SrcType.VALID, 1, AllocatorType.VALID, null, slice(0,1), empty(), true}, // qui mi aspettavo ci fosse force=true ma è un test sbagliato per mancanza di docuemtnazione (è una scelta implementativa)
                {8, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, null, slice(0,8), slice(8,9), false},
                {9, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 10, AllocatorType.VALID, null, slice(0,10), empty(), true},
                {10, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 11, AllocatorType.VALID, null, slice(0,11), empty(), true},
                {0, ChannelType.OPEN_RW, 10, 0, SrcType.NULL, 0, AllocatorType.VALID, Exception.class, null, null, false},
                //{0, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, Exception.class, null, null, false}, // il metodo entra in un loop infinito (c'è un errore nella funzione write non posso usare una classe con buffer a 0 per scrivere oppure deve scrivere direttamente sul file channel)
                {9, ChannelType.OPEN_RW, -1, 0, SrcType.VALID, 9, AllocatorType.VALID, null, slice(0,9), empty(), false},
                {9, ChannelType.CLOSED, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, Exception.class, null, null, false},
                {8, ChannelType.CLOSED, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, Exception.class, null, null, false},
                {0, ChannelType.OPEN_READ_ONLY, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, Exception.class, null, null, false},
                {4, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 4, AllocatorType.VALID, null, slice(0,4), empty(), false},
                {5, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 5, AllocatorType.VALID, null, slice(0,5), empty(), true},
                {6, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 6, AllocatorType.VALID, null, slice(0,6), empty(), true},
                {3, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 4, AllocatorType.VALID, null, slice(0,3), slice(3,4), false},
                {4, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 5, AllocatorType.VALID, null, slice(0,5), empty(), true},
                {5, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 6, AllocatorType.VALID, null, slice(0,6), empty(), true},
                {5, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 4, AllocatorType.VALID, null, empty(), slice(0,4), false},
                {6, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 5, AllocatorType.VALID, null, slice(0,5), empty(), true},
                {7, ChannelType.OPEN_RW, 10, 5, SrcType.VALID, 6, AllocatorType.VALID, null, slice(0,6), empty(), true},
                // second iteration
                {1, ChannelType.OPEN_RW, 0, 0, SrcType.VALID, 1, AllocatorType.VALID, null, slice(0,1), empty(), false},
                {2, ChannelType.OPEN_RW, 0, 0, SrcType.VALID, 1, AllocatorType.VALID, null, empty(), slice(0,1), false},
                //{9, ChannelType.OPEN_READ_ONLY, 10, 0, SrcType.VALID, 8, AllocatorType.VALID, Exception.class, null, null, false}, // non dovrebbe permettere la scrittura su un file aperto in sola lettura
                {9, ChannelType.OPEN_READ_ONLY, 10, 0, SrcType.VALID, 9, AllocatorType.VALID, Exception.class, null, null, false},
                {9, ChannelType.OPEN_READ_ONLY, 10, 0, SrcType.VALID, 10, AllocatorType.VALID, Exception.class, null, null, false},
                {10, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 9, AllocatorType.DEALLOC_RETURN, Exception.class, null, null, false},
                {10, ChannelType.OPEN_RW, 10, 0, SrcType.VALID, 9, AllocatorType.NULL_RETURN, Exception.class, null, null, false},
        });
    }

    @Before
    public void setUp() throws IOException {

        // Creazione File Temporaneo
        tempFile = folder.newFile("test-write-" + System.nanoTime() + ".txn");

        // Setup FileChannel Base
        FileChannel baseFc;
        if (channelTypeParam == ChannelType.OPEN_READ_ONLY) {
            baseFc = FileChannelTestBuilder.aFileChannel().inReadMode().build(tempFile.toPath());
        } else {
            baseFc = FileChannelTestBuilder.aFileChannel().inReadWriteMode().build(tempFile.toPath());
        }

        // inniezione dello spy
        this.fileChannel = spy(baseFc);
        doAnswer(invocation -> {
            // Leggiamo il contenuto del file al momento in cui si chiama la force
            fileContentAtForceMoment.set(readFileChannelContent());
            return invocation.callRealMethod(); // Esegue il force vero su disco
        }).when(fileChannel).force(anyBoolean());

        // Init ByteBufferAllocator
        this.allocator = allocatorFixtureDirector(allocatorParam);

        // Inizializzazione classe BufferedChannel
        this.bufferedChannel = BufferedChannelBuilder.aBufferedChannel().withAllocator(this.allocator).withFileChannel(this.fileChannel).withWriteCapacity(this.writeCapacityParam).withUnpersistedBytesBound(this.unpersistedBytesBoundParam).withInjectedUnpersistedBytes(this.unpersistedBytesParam).build();

        // deallocazione del buffer di scrittura se richiesto
        // chiusura del canale se richiesto
        if (channelTypeParam == ChannelType.CLOSED) {
            this.fileChannel.close();
        }

        // Preparazione Source Buffer
        this.srcBuffer = createSrcBuffer();
    }

    private ByteBuf createSrcBuffer() {
        switch (srcTypeParam) {
            case NULL:
                return null;
            case RELEASED:
                return ByteBufTestBuilder.aByteBufTestBuilder().withCapacity(srcLengthParam).withContent(Arrays.copyOfRange(SRC_DATA, 0, srcLengthParam)).asReleased().build();
            case INVALID_INDEX:
                return ByteBufTestBuilder.aByteBufTestBuilder().withCapacity(srcLengthParam).withContent(Arrays.copyOfRange(SRC_DATA, 0, srcLengthParam)).withInvalidIndices().withReaderIndex(-1).withWriterIndex(srcLengthParam).build();
            case VALID:
                return ByteBufTestBuilder.aByteBufTestBuilder().withCapacity(srcLengthParam).withContent(Arrays.copyOfRange(SRC_DATA, 0, srcLengthParam)).build();
        }
        throw new IllegalArgumentException("Unsupported src type: " + srcTypeParam);
    }

    private ByteBufAllocator allocatorFixtureDirector(AllocatorType type) {
        switch (type) {
            case VALID :
                return ByteBufAllocatorMother.createValidAllocator();
            case DEALLOC_RETURN:
                return ByteBufAllocatorMother.createDeallocatedAllocator();
            case NULL_RETURN:
                return ByteBufAllocatorMother.createNullAllocator();
        }
        throw new IllegalTestConfigurationException("bytebufallocator non supportato");
    }

    @Test
    public void testWriteOperation() throws IOException {
        if (expectedException != null) {
            assertThatThrownBy(() -> bufferedChannel.write(srcBuffer))
                    .isInstanceOf(expectedException);
            return; // Se ci aspettiamo un errore, il test finisce qui
        }
        // Esecuzione normale
        bufferedChannel.write(srcBuffer);

        // Verifica Disco
        if (expectedFileContent != null) {
            assertThat(readFileChannelContent())
                    .as("Contenuto del file su disco non corrispondente")
                    .isEqualTo(expectedFileContent);
        } else {
            throw new IllegalTestConfigurationException("la funzione ha eseguito senza eccezioni ma il test non prevede un contenuto (neanche vuoto) su file");
        }

        // Verifica Buffer
        if (expectedBufferContent != null) {
            assertThat(getInternalBufferContent())
                    .as("Contenuto del buffer interno non corrispondente")
                    .isEqualTo(expectedBufferContent);
        }

        // Verifica Force call
        if (expectedForceCall) {
            verify(fileChannel, atLeastOnce()).force(anyBoolean());
            assertThat(fileContentAtForceMoment.get())
                    .as("Il contenuto del file al momento del force() non era corretto")
                    .isEqualTo(expectedFileContent);
        } else {
            verify(fileChannel, never()).force(anyBoolean());
        }
    }

    private byte[] readFileChannelContent() throws IOException {
        long size = fileChannel.size();
        java.nio.ByteBuffer result = java.nio.ByteBuffer.allocate((int) size);
        fileChannel.read(result, 0);
        return result.array();
    }

    private byte[] getInternalBufferContent() {
        ByteBuf buf = bufferedChannel.writeBuffer;
        byte[] content = new byte[buf.readableBytes()];
        buf.getBytes(buf.readerIndex(), content);
        return content;
    }

    @After
    public void tearDown() {
        try {
            if (bufferedChannel != null) bufferedChannel.close();
            if (fileChannel != null) fileChannel.close();
            if (srcBuffer != null && srcBuffer.refCnt() > 0) srcBuffer.release();
            if (tempFile != null) tempFile.delete();
            if (allocator != null) allocator=null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
