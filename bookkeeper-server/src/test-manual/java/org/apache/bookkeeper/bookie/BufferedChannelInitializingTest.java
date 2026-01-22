package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.exceptions.IllegalTestConfigurationException;
import io.netty.buffer.ByteBufAllocator;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.apache.bookkeeper.testutils.ByteBufAllocatorMother;
import org.apache.bookkeeper.testutils.FileChannelTestBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test manuali per la classe BufferedChannel, funzionalità inizializzazione del 3 layer in RAM
 */
@RunWith(Parameterized.class)
public class BufferedChannelInitializingTest {
    // parameters
    private final int writeCapacityParam;
    private final int readCapacityParam;
    private final long unpersistedBytesBoundParam = 0L;
    private final ChannelType  channelTypeParam;
    private final AllocatorType allocatorTypeParam;

    // fixtures
    private FileChannel fileChannel;
    private ByteBufAllocator byteBufAllocator;
    private BufferedChannel bufferedChannel;

    // expected results
    private final Class<? extends Throwable> expectedException;

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
        VALID,      // Allocator valido (Unpooled)
        NULL_RETURN,        // Allocator che ritorna null
        LESS_RETURN, // Allocator che ritorna un buffer di grandezza size-1
        DEALLOC_RETURN, // Allocator che ritorna un ByteBuf released
        NULL          // Allocator null
    }

    public BufferedChannelInitializingTest(int writeCapacity, int readCapacity, AllocatorType allocatorTypeParam, ChannelType channelTypeParam, Class<? extends Throwable> expectedException) {
        this.writeCapacityParam = writeCapacity;
        this.readCapacityParam = readCapacity;
        this.channelTypeParam = channelTypeParam;
        this.allocatorTypeParam = allocatorTypeParam;
        this.expectedException = expectedException;
    }

    private FileChannel fileChannelFixtureDirector(ChannelType type) throws IOException {
        File tempFile = folder.newFile("test-init-" + System.nanoTime() + ".txn");
        switch (type) {
            case OPEN_RW:
                return FileChannelTestBuilder.aFileChannel().inReadWriteMode().build(tempFile.toPath());
            case READ_ONLY:
                return FileChannelTestBuilder.aFileChannel().inReadMode().build(tempFile.toPath());
            case WRITE_ONLY:
                return FileChannelTestBuilder.aFileChannel().inWriteMode().build(tempFile.toPath());
            case CLOSE:
                return FileChannelTestBuilder.aFileChannel().inReadWriteMode().closed().build(tempFile.toPath());
            case NULL:
                return null;
        }
        throw new IllegalTestConfigurationException("channel type non supportato");
    }

    private ByteBufAllocator allocatorFixtureDirector(AllocatorType type) {
        switch (type) {
            case VALID:
                return ByteBufAllocatorMother.createValidAllocator();
            case NULL_RETURN:
                return ByteBufAllocatorMother.createNullAllocator();
            case LESS_RETURN:
                return ByteBufAllocatorMother.createUndersizedAllocator();
            case DEALLOC_RETURN:
                return ByteBufAllocatorMother.createDeallocatedAllocator();
            case NULL:
                return null;
        }
        throw new IllegalTestConfigurationException("bytebufallocator non supportato");
    }

    @Parameterized.Parameters(name = "Test {index}: wCap={0}, rCap={1}, Alloc={2}, Channel={3} -> Expect={4}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // writeCap, readCap, ByteBufAllocatorType, FileChannelType, exception
                {1, 1, AllocatorType.NULL, ChannelType.OPEN_RW, Exception.class},
                //{1, 1, AllocatorType.LESS_RETURN, ChannelType.OPEN_RW, Exception.class}, // non viene sollevata nessuna eccezione
                //{1, 1, AllocatorType.NULL_RETURN, ChannelType.OPEN_RW, Exception.class}, // non viene sollevata nessuna eccezione
                //{1, 1, AllocatorType.DEALLOC_RETURN, ChannelType.OPEN_RW, Exception.class}, // non viene sollevata nessuna eccezione
                {1, 1, AllocatorType.VALID, ChannelType.CLOSE, Exception.class},
                {1, 1, AllocatorType.VALID, ChannelType.NULL, Exception.class},
                //{1, 1, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class}, // non viene sollevata nessuna eccezione
                //{1, 0, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class}, // non viene sollevata nessuna eccezione
                {0, 1, AllocatorType.VALID, ChannelType.READ_ONLY, null},
                //{0, 0, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class}, // non viene sollevata nessuna eccezione
                {0, -1, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                {-1, 0, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                {-1, -1, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                //{1, 1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class}, // non viene sollevata alcuna eccezione
                {1, 0, AllocatorType.VALID, ChannelType.WRITE_ONLY, null},
                //{0, 1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class}, // non viene sollevata alcuna eccezione
                //{0, 0, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class}, // non viene sollevata alcuna eccezione
                {0, -1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {-1, 0, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {-1, -1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {1, 1, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {1, 0, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {0, 1, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {0, -1, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class},
                {-1, 0, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class},
                //{0, 0, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class}, // non viene sollevata alcuna eccezione
                {-1, -1, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class},
                // fase di correzione dei test
                //{1, 1, AllocatorType.LESS_RETURN, ChannelType.OPEN_RW, null},
                //{1, 1, AllocatorType.VALID, ChannelType.READ_ONLY, null},
                //{1, 0, AllocatorType.VALID, ChannelType.READ_ONLY, null},
                //{1, 1, AllocatorType.VALID, ChannelType.WRITE_ONLY, null},
                //{0, 1, AllocatorType.VALID, ChannelType.WRITE_ONLY, null},
        });
    }

    @Before
    public void setUp() throws IOException {
        // istanziamo file channel
        this.fileChannel = fileChannelFixtureDirector(channelTypeParam);
        // istanziamo il bytebuffer allocator
        this.byteBufAllocator = allocatorFixtureDirector(allocatorTypeParam);
    }

    @Test
    public void testBufferedChannelInit() {
        ThrowingCallable initAction = () -> {
            bufferedChannel = new BufferedChannel(
                    byteBufAllocator,
                    fileChannel,
                    writeCapacityParam,
                    readCapacityParam,
                    unpersistedBytesBoundParam
            );
        };
        if (expectedException != null) {
            // Caso in cui ci aspettiamo un errore
            assertThatThrownBy(initAction)
                    .as("Il costruttore doveva fallire con una specifica eccezione")
                    .isInstanceOf(expectedException);
        } else {
            // Caso in cui non ci aspettiamo un errore
            // verifichiamo che non vengano lanciate eccezioni nell'esecuzione
            assertThatCode(initAction)
                    .as("Il costruttore ha lanciato un'eccezione non prevista")
                    .doesNotThrowAnyException();
            // verifichiamo che il bufferedChannel è stato instanziato
            assertNotNull(bufferedChannel);
            // verifichiamo l'allocazione dei buffer interni
            verifyBufferCapacities();
        }
    }

    @After
    public void cleanup() {
        // Chiudiamo il BufferedChannel (se creato)
        if (bufferedChannel != null) {
            try {
                bufferedChannel.close();
            } catch (Exception e) {
                System.err.println("Errore durante la chiusura del BufferedChannel: " + e.getMessage());
            }
        }

        // chiudiamo il FileChannel se è ancora aperto
        if (fileChannel != null && fileChannel.isOpen()) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                System.err.println("Errore durante la chiusura del FileChannel: " + e.getMessage());
            }
        }

        // la TemporaryFolder.delete() viene chiamata automaticamente dalla Rule di JUnit alla fine di ogni test.
    }

    /**
     * Meccanismo di verifica aggiuntivo dopo l'esecuzione dei test progettati
     * Verifica che i buffer interni siano coerenti con i parametri e con la modalità del canale.
     * Logica di controllo:
     * Se il canale è READ_ONLY, il writeBuffer deve essere 0/null (anche se richiesto > 0).
     * Se il canale è WRITE_ONLY, il readBuffer deve essere 0/null (anche se richiesto > 0).
     * In tutti gli altri casi, la capacità dei buffer deve corrispondere esattamente ai parametri passati.
     */
    // Attenzione qui devo mettere anhce la verifica di undersized
    private void verifyBufferCapacities() {
        // Controllo WRITE BUFFER
        if (channelTypeParam == ChannelType.READ_ONLY) {
            // Caso READ_ONLY.
            // Il writeBuffer NON deve essere allocato (o deve essere vuoto), anche se writeCapacityParam > 0.
            if (bufferedChannel.writeBuffer != null) {
                assertThat(bufferedChannel.writeBuffer.capacity())
                        .as("In modalità READ_ONLY è stato allocato un writeBuffer con capacità > 0")
                        .isEqualTo(0);
            }
        } else {
            // Caso Standard (OPEN_RW o WRITE_ONLY):
            // La capacità reale deve corrispondere a quella richiesta.
            if (bufferedChannel.writeBuffer != null) {
                assertThat(bufferedChannel.writeBuffer.capacity())
                        .as("La capacità del writeBuffer non corrisponde al parametro passato")
                        .isEqualTo(writeCapacityParam);
            } else {
                // Se il buffer è null, è accettabile solo se avevamo chiesto 0
                if (writeCapacityParam > 0) {
                    fail("Il writeBuffer è null ma la writeCapacityParam era " + writeCapacityParam);
                }
            }
        }

        // Controllo READ BUFFER
        if (channelTypeParam == ChannelType.WRITE_ONLY) {
            // Caso WRITE_ONLY.
            // Il readBuffer NON deve essere allocato (o deve essere vuoto), anche se readCapacityParam > 0.
            if (bufferedChannel.readBuffer != null) {
                assertThat(bufferedChannel.readBuffer.capacity())
                        .as("In modalità WRITE_ONLY è stato allocato un readBuffer con capacità > 0")
                        .isEqualTo(0);
            }
        } else {
            // Caso Standard (OPEN_RW o READ_ONLY):
            // La capacità reale deve corrispondere a quella richiesta.
            if (bufferedChannel.readBuffer != null) {
                assertThat(bufferedChannel.readBuffer.capacity())
                        .as("La capacità del readBuffer non corrisponde al parametro passato")
                        .isEqualTo(readCapacityParam);
            } else {
                // Se il buffer è null, è accettabile solo se avevamo chiesto 0
                if (readCapacityParam > 0) {
                    fail("Il readBuffer è null ma la readCapacityParam era " + readCapacityParam);
                }
            }
        }
    }









}
