package org.apache.bookkeeper.bookie;

import exceptions.IllegalTestConfigurationException;
import io.netty.buffer.ByteBufAllocator;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.ByteBufAllocatorMother;
import utils.FileChannelTestBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertNotNull;

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
                {1, 1, AllocatorType.NULL, ChannelType.OPEN_RW, Exception.class},
                //{1, 1, AllocatorType.LESS_RETURN, ChannelType.OPEN_RW, Exception.class},
                //{1, 1, AllocatorType.NULL_RETURN, ChannelType.OPEN_RW, Exception.class},
                //{1, 1, AllocatorType.DEALLOC_RETURN, ChannelType.OPEN_RW, Exception.class},
                {1, 1, AllocatorType.VALID, ChannelType.CLOSE, Exception.class},
                {1, 1, AllocatorType.VALID, ChannelType.NULL, Exception.class},
                //{1, 1, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                //{1, 0, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                {0, 1, AllocatorType.VALID, ChannelType.READ_ONLY, null},
                {0, 0, AllocatorType.VALID, ChannelType.READ_ONLY, null},
                {0, -1, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                {-1, 0, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                {-1, -1, AllocatorType.VALID, ChannelType.READ_ONLY, Exception.class},
                //{1, 1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {1, 0, AllocatorType.VALID, ChannelType.WRITE_ONLY, null},
                //{0, 1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {0, 0, AllocatorType.VALID, ChannelType.WRITE_ONLY, null},
                {0, -1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {-1, 0, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {-1, -1, AllocatorType.VALID, ChannelType.WRITE_ONLY, Exception.class},
                {1, 1, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {1, 0, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {0, 1, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {0, 0, AllocatorType.VALID, ChannelType.OPEN_RW, null},
                {0, -1, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class},
                {-1, 0, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class},
                {-1, -1, AllocatorType.VALID, ChannelType.OPEN_RW, Exception.class},
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
            // Memorizziamo l'istanza per poterla chiudere dopo
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
            // Caso in cui tutto deve andare bene
            assertThatCode(initAction)
                    .as("Il costruttore ha lanciato un'eccezione non prevista")
                    .doesNotThrowAnyException();

            assertNotNull(bufferedChannel);
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
                // Silenzioso
            }
        }

        // la TemporaryFolder.delete() viene chiamata automaticamente dalla Rule di JUnit alla fine di ogni test.
    }










}
