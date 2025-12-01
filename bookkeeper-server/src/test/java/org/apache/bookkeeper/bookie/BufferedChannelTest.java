package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class BufferedChannelTest {
    // Variabili per parametri
    private final int writeCapacityParam;
    private final int readCapacityParam;
    private final long unpersistedBytesBoundParam;
    private FileChannel fileChannelParam;
    private ByteBufAllocator allocatorParam;
    // risultato atteso
    private final boolean exceptionExpected;
    // temporary folder per ogni test
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();
    // tipi di parametri
    private final ChannelType channelTypeParam;
    private final AllocatorType allocatorTypeParam;

    /**
     * Enum per definizione nei parametri di test del tipo di FileChannel
     */
    public enum ChannelType {
        OPEN_RW,      // Canale aperto lettura/scrittura
        CLOSED,       // Canale chiuso
        READ_ONLY,     // Canale sola lettura
        NULL          // Canale null
    }

    /**
     * Enum per definizione nei parametri di test del tipo di ByteBufAllocator
     */
    public enum AllocatorType {
        HEALTHY,      // Allocator corretto (Unpooled)
        BROKEN,        // Allocator che ritorna null
        NULL          // Allocator null
    }

    public BufferedChannelTest(int writeCapacity, int readCapacity, long unpersistedBytesBound, ChannelType channelTypeParam, AllocatorType allocatorTypeParam, boolean exceptionExpected) {
        this.writeCapacityParam = writeCapacity;
        this.readCapacityParam = readCapacity;
        this.unpersistedBytesBoundParam = unpersistedBytesBound;
        this.channelTypeParam = channelTypeParam;
        this.allocatorTypeParam = allocatorTypeParam;
        this.exceptionExpected = exceptionExpected;
    }

    /**
     * Util per creare un FileChannel chiuso
     * @param path il path del file associato al FileChannel
     * @return il FileChannel chiuso
     * @throws IOException in caso di errori di I/O
     */
    private static FileChannel createClosedFileChannel(Path path) throws IOException {
        // apriamo il canale al path specificato in modalità CREATE e WRITE
        FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        // lo chiudiamo
        fc.close();
        return fc;
    }

    /**
     * Util per creare un FileChannel aperto in modalità READ/WRITE
     * @param path il path del file associato al FileChannel
     * @return il FileChannel aperto
     * @throws IOException in caso di errori di I/O
     */
    private static FileChannel createWriteFileChannel(Path path) throws IOException {
        // apriamo il canale al path specificato in modalità CREATE, READ e WRITE
        return FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
    }

    /**
     * Util per creare un FileChannel aperto in modalità READ
     * @param path il path del file associato al FileChannel
     * @return il FileChannel aperto
     * @throws IOException in caso di errori di I/O
     */
    private static FileChannel createReadOnlyFileChannel(Path path) throws IOException {
        // apriamo il canale al path specificato in modalità CREATE e READ
        return FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ);
    }

    /**
     * Util per creare un ByteBufAllocator valido e corretto che restituisce un UnpooledByteBuf
     * Scelgo di utilizzare un UnpooledByteBuf per semplicità e per evitare problemi di gestione della memoria
     * @return ByteBufAllocator valido
     */
    private static ByteBufAllocator createCorrectByteBufAllocator() {
        return UnpooledByteBufAllocator.DEFAULT;
    }

    /**
     * Util per creare un ByteBufAllocator valido ma non corretto, ovvero che restituisca un ByteBuf non conforme alle richieste.
     * Nel caso del costruttore di BufferedChannel, che dalle funzionalità previste non utilizza un ByteBuf, un ByteBuf non valido e solamente un NULL.
     * @return ByteBufAllocator non valido
     */
    private static ByteBufAllocator createIncorrectByteBufAllocator() {
        // Simuliamo il comportamento di un allocator che restituisce null
        // questo è un comportamento di default di un mock che non ha metodi stub
        return mock(ByteBufAllocator.class);
    }


    @Parameterized.Parameters(name = "Test {index}: ExExpected={5}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Test case 1: Tutti i parametri validi
                { 512, 512, 100L, ChannelType.OPEN_RW, AllocatorType.HEALTHY, false },
                { 512, 512, 100L, ChannelType.CLOSED, AllocatorType.HEALTHY, true },
                //{ 512, 512, 100L, ChannelType.OPEN_RW, AllocatorType.BROKEN, true },
                { 512, 512, 100L, ChannelType.NULL, AllocatorType.HEALTHY, true },
                { 512, 512, 100L, ChannelType.OPEN_RW, AllocatorType.NULL, true },
                { 512, 512, 100L, ChannelType.READ_ONLY, AllocatorType.HEALTHY, false },
                { -1, 512, 100L, ChannelType.OPEN_RW, AllocatorType.HEALTHY, true },
                //{ 0, 512, 100L, ChannelType.OPEN_RW, AllocatorType.HEALTHY, true },
                //{ 512, 0, 100L, ChannelType.OPEN_RW, AllocatorType.HEALTHY, true },
                //{ 512, 512, -1L, ChannelType.OPEN_RW, AllocatorType.HEALTHY, true }
        });
    }

    @Before
    public void setUp() throws IOException {
        // Creiamo un file fisico univoco per questo test grazie alla Rule
        File file = tmpFolder.newFile("test_bc_" + System.nanoTime() + ".txn");
        Path path = file.toPath();
        // Istanziamo il FileChannel in base all'Enum
        switch (channelTypeParam) {
            case OPEN_RW:
                this.fileChannelParam = createWriteFileChannel(path);
                break;
            case CLOSED:
                this.fileChannelParam = createClosedFileChannel(path);
                break;
            case READ_ONLY:
                this.fileChannelParam = createReadOnlyFileChannel(path);
                break;
            case NULL:
                this.fileChannelParam = null;
                break;
        }
        // Istanziamo l'Allocator in base all'Enum
        switch (allocatorTypeParam) {
            case HEALTHY:
                this.allocatorParam = createCorrectByteBufAllocator();
                break;
            case BROKEN:
                this.allocatorParam = createIncorrectByteBufAllocator();
                break;
            case NULL:
                this.allocatorParam = null;
                break;
        }
    }

    @Test
    public void testBufferedChannelInit() {
        try {
            BufferedChannel channel = new BufferedChannel(
                    allocatorParam,
                    fileChannelParam,
                    writeCapacityParam,
                    readCapacityParam,
                    unpersistedBytesBoundParam
            );

            // Se arriviamo qui, il costruttore ha avuto successo.
            if (exceptionExpected) {
                fail("Il test doveva fallire ma il costruttore è riuscito con successo!");
            }

        } catch (Exception e) {
            // GESTIONE ECCEZIONI
            if (!exceptionExpected) {
                e.printStackTrace();
                fail("Eccezione inattesa: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }
            // Se exceptionExpected è true, il test passa (abbiamo catturato l'errore atteso)
        }
    }










}
