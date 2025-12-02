package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.After;
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
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class BufferedChannelInitializingTest {
    // Variabili per parametri
    private final int writeCapacityParam;
    private final int readCapacityParam;
    private final long unpersistedBytesBoundParam = 0L; // default value non usato per questi test
    private final ChannelType  channelTypeParam;
    private final AllocatorType allocatorTypeParam;
    private FileChannel fileChannelParam;
    private ByteBufAllocator allocatorParam;
    // risultato atteso
    private final boolean exceptionExpected;
    // temporary folder per ogni test
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * Enum per definizione nei parametri di test del tipo di FileChannel
     */
    public enum ChannelType {
        OPEN_RW,      // Canale aperto lettura/scrittura
        WRITE_ONLY,       // Canale aperto solo in scrittura
        READ_ONLY,     // Canale aperto solo in lettura
        CLOSE,         // Canale chiuso
        NULL          // Canale null
    }

    /**
     * Enum per definizione nei parametri di test del tipo di ByteBufAllocator
     */
    public enum AllocatorType {
        CORRECT,      // Allocator corretto (Unpooled)
        NULL_RETURN,        // Allocator che ritorna null
        LESS_RETURN, // Allocator che ritorna un buffer di grandezza size-1
        NULL          // Allocator null
    }

    public BufferedChannelInitializingTest(int writeCapacity, int readCapacity, AllocatorType allocatorTypeParam, ChannelType channelTypeParam, boolean exceptionExpected) {
        this.writeCapacityParam = writeCapacity;
        this.readCapacityParam = readCapacity;
        this.channelTypeParam = channelTypeParam;
        this.allocatorTypeParam = allocatorTypeParam;
        this.exceptionExpected = exceptionExpected;
    }

    /**
     * Util per creare un FileChannel chiuso
     * @return il FileChannel chiuso
     * @throws IOException in caso di errori di I/O
     */
    private FileChannel createClosedFileChannel() throws IOException {
        File tempFile = folder.newFile("test_closed.txn");
        FileChannel fc = FileChannel.open(tempFile.toPath(), StandardOpenOption.READ, StandardOpenOption.WRITE);
        fc.close();
        return fc;
    }

    /**
     * Util per creare un FileChannel aperto in modalità READ/WRITE
     * @return il FileChannel aperto
     * @throws IOException in caso di errori di I/O
     */
    private FileChannel createRwFileChannel() throws IOException {
        // Crea un file vuoto nella cartella temporanea gestita dalla Rule
        File tempFile = folder.newFile("test_rw.txn");
        return FileChannel.open(tempFile.toPath(), StandardOpenOption.READ, StandardOpenOption.WRITE);
    }

    /**
     * Util per creare un FileChannel aperto in modalità READ
     * @return il FileChannel aperto
     * @throws IOException in caso di errori di I/O
     */
    private FileChannel createReadOnlyFileChannel() throws IOException {
        File tempFile = folder.newFile("test_ro.txn");
        return FileChannel.open(tempFile.toPath(), StandardOpenOption.READ);
    }

    /**
     * Util per creare un FileChannel aperto in modalità WRITE
     * @return il FileChannel aperto
     * @throws IOException in caso di errori di I/O
     */
    private FileChannel createWriteOnlyFileChannel() throws IOException {
        File tempFile = folder.newFile("test_wo.txn");
        return FileChannel.open(tempFile.toPath(), StandardOpenOption.WRITE);
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
    private static ByteBufAllocator createNullReturnByteBufAllocator() {
        // Simuliamo il comportamento di un allocator che restituisce null
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);
        when(allocator.buffer(anyInt())).thenReturn(null); // Esplicito ma verbose
        return allocator;
    }

    /**
     * Util per creare un ByteBufAllocator valido ma non corretto, ovvero che restitusice un ByteBuf non conforme alle richieste.
     * Ritorna un ByteBuf con capienza req-1 ma sempre al minimo 0
     * @return ByteBufAllocator non valido
     */
    private ByteBufAllocator createUndersizedAllocator() {
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);
        when(allocator.buffer(anyInt())).thenAnswer(invocation -> {
            int reqCap = (Integer) invocation.getArguments()[0];
            // Allochiamo realmente un buffer più piccolo di quanto richiesto per simulare il bug
            if (reqCap <= 1) {
                throw new IllegalArgumentException("Test setup error: Cannot create undersized buffer for capacity <= 1. Use a larger capacity for this test case.");
            }
            return UnpooledByteBufAllocator.DEFAULT.buffer(reqCap - 1);
        });
        return allocator;
    }


    @Parameterized.Parameters(name = "Test {index}: wCap={0}, rCap={1}, Alloc={2}, Channel={3} -> Expect={4}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // 0. writeCap=1, readCap=1, Alloc=Corretto, FC=RW -> OK
                {1, 1, AllocatorType.CORRECT, ChannelType.OPEN_RW, false},
                // 1. writeCap=1, readCap=0, Alloc=Corretto, FC=W -> OK
                {1, 0, AllocatorType.CORRECT, ChannelType.WRITE_ONLY, false},
                // 2. writeCap=0, readCap=1, Alloc=Corretto, FC=R -> OK
                {0, 1, AllocatorType.CORRECT, ChannelType.READ_ONLY, false},
                // 3. writeCap=-1, readCap=1, Alloc=Corretto, FC=RW -> Err Size
                {-1, 1, AllocatorType.CORRECT, ChannelType.OPEN_RW, true},
                // 4. writeCap=1, readCap=-1, Alloc=Corretto, FC=RW -> Err Size
                {1, -1, AllocatorType.CORRECT, ChannelType.OPEN_RW, true},
                // 5. writeCap=0, readCap=0, Alloc=Corretto, FC=RW -> Err Buffer Invalido
                //{0, 0, AllocatorType.CORRECT, ChannelType.OPEN_RW, true},
                // 6. writeCap=1, readCap=1, Alloc=Corretto, FC=R -> Err FC solo lettura
                //{1, 1, AllocatorType.CORRECT, ChannelType.READ_ONLY, true},
                // 7. writeCap=1, readCap=1, Alloc=Corretto, FC=W -> Err FC solo scrittura
                //{1, 1, AllocatorType.CORRECT, ChannelType.WRITE_ONLY, true},
                // 8. writeCap=1, readCap=1, Alloc=Corretto, FC=Chiuso -> Err Chiuso
                {1, 1, AllocatorType.CORRECT, ChannelType.CLOSE, true},
                // 9. writeCap=1, readCap=1, Alloc=NULL, FC=RW -> Err Allocator Null
                {1, 1, AllocatorType.NULL, ChannelType.OPEN_RW, true},
                // 10. writeCap=2, readCap=2, Alloc=Minore, FC=RW -> Err Buffer Size
                //{2, 2, AllocatorType.LESS_RETURN, ChannelType.OPEN_RW, true},
                // 11. writeCap=1, readCap=1, Alloc=RitornaNull, FC=RW -> Err Buffer Null
                //{1, 1, AllocatorType.NULL_RETURN, ChannelType.OPEN_RW, true}
        });
    }

    @Before
    public void setUp() throws IOException {
        // Istanziamo il FileChannel in base all'Enum
        switch (channelTypeParam) {
            case OPEN_RW:
                this.fileChannelParam = createRwFileChannel();
                break;
            case WRITE_ONLY:
                this.fileChannelParam = createWriteOnlyFileChannel();
                break;
            case READ_ONLY:
                this.fileChannelParam = createReadOnlyFileChannel();
                break;
            case CLOSE:
                this.fileChannelParam = createClosedFileChannel();
                break;
            case NULL:
                this.fileChannelParam = null;
                break;
        }
        // Istanziamo l'Allocator in base all'Enum
        switch (allocatorTypeParam) {
            case CORRECT:
                this.allocatorParam = createCorrectByteBufAllocator();
                break;
            case NULL_RETURN:
                this.allocatorParam = createNullReturnByteBufAllocator();
                break;
            case LESS_RETURN:
                this.allocatorParam = createUndersizedAllocator();
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

    @After
    public void cleanup() {
        if(fileChannelParam != null && fileChannelParam.isOpen()) {
            try {
                fileChannelParam.close();
            } catch (IOException e) {
            }
        }
    }










}
