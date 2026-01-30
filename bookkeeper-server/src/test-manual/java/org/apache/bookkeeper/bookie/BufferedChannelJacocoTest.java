package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.bookkeeper.testutils.ByteBufAllocatorMother;
import org.apache.bookkeeper.testutils.FileChannelTestBuilder;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.mockito.stubbing.Answer;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * Test supplementari per {@link BufferedChannel} finalizzati a raggiungere il 100% di code coverage.
 * Questa classe mira specificamente agli "Edge Cases" e ai rami che non sono stati raggiunti
 * tramite i test parametrizzati standard.
 */
public class BufferedChannelJacocoTest {

    private static final byte[] DISK_DATA = new byte[]{1, 2, 3, 4};

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;
    private ByteBuf destBuffer;

    @Before
    public void setUp() throws IOException {
        File tempFile = folder.newFile("test-coverage-" + System.nanoTime() + ".log");

        // Inizializza un FileChannel con contenuto predefinito {1, 2, 3, 4}
        this.fileChannel = FileChannelTestBuilder.aFileChannel()
                .inReadWriteMode()
                .withContent(DISK_DATA)
                .build(tempFile.toPath());

        // Usa un buffer da 1 byte
        this.destBuffer = Unpooled.buffer(1);
    }

    @After
    public void tearDown() {
        try {
            if (bufferedChannel != null) {
                bufferedChannel.close();
            }
            if (fileChannel != null && fileChannel.isOpen()) {
                fileChannel.close();
            }
            if (destBuffer != null && destBuffer.refCnt() > 0) {
                destBuffer.release();
            }
            // Il tempFile viene gestito automaticamente dalla Rule TemporaryFolder
        } catch (Exception e) {
            System.err.println("Errore durante il teardown: " + e.getMessage());
        }
    }

    /**
     * Scenario:
     * - Il writeBuffer è NULL (Allocator null return).
     * - Stiamo leggendo ESATTAMENTE alla fine dei dati persistiti (EOF).
     */
    @Test
    public void testRead_WithNullWriteBuffer_AtEOF() throws IOException {
        // --- SETUP ---
        bufferedChannel = BufferedChannelBuilder.aBufferedChannel()
                .withAllocator(ByteBufAllocatorMother.createNullAllocator()) // Forza writeBuffer = null
                .withFileChannel(fileChannel)
                .withWriteCapacity(100)
                .withReadCapacity(100)
                .withInjectedWriteBufferStartPosition(DISK_DATA.length)
                .build();

        long posAtEOF = DISK_DATA.length; // Posizione 4

        // --- ACTION ---
        int bytesRead = bufferedChannel.read(destBuffer, posAtEOF, 1);

        // --- VERIFY ---
        assertThat(bytesRead)
                .as("Dovrebbe aver letto 0 byte (EOF) interrompendo il loop")
                .isEqualTo(0);
    }

    /**
     * Scenario:
     * - posizione di lettura minore della posizione del read buffer
     * - posizione della readBufferStartPosition + writeIndex
     */
    @Test
    public void shouldInvalidateReadBufferOnBackwardSeek() throws IOException {
        // --- SETUP ---
        bufferedChannel = BufferedChannelBuilder.aBufferedChannel()
                .withAllocator(ByteBufAllocatorMother.createNullAllocator())
                .withFileChannel(fileChannel)
                .withWriteCapacity(10)
                .withReadCapacity(2)
                .build();
        // Step 1: Leggi in avanti (a pos 3). Questo riempie il readBuffer partendo da 3.
        bufferedChannel.read(destBuffer, 3, 1);
        destBuffer.clear();
        // Step 2: Leggi all'indietro (a pos 0).
        // Controllo condizione: readBufferStartPosition (3) <= pos (0) è FALSO.
        // Deve forzare una rilettura dal disco.
        // --- ACTION ---
        int bytesRead = bufferedChannel.read(destBuffer, 0, 1);
        // --- VERIFY ---
        assertThat(bytesRead).isEqualTo(1);
        assertThat(destBuffer.readByte()).isEqualTo(DISK_DATA[0]);
    }

    /**
     * Copre: metodo forceWrite(), ramo 'else' implicito di "if (unpersistedBytesBound > 0)".
     * Quando unpersistedBytesBound è 0, il blocco synchronized viene saltato,
     * ma fileChannel.force() può essere comunque chiamato esplicitamente essendo un metodo pubblico.
     */
    @Test
    public void shouldExecuteForceOnChannelWhenUnpersistedBytesBoundIsZero() throws IOException {
        // Crea uno spy per verificare l'interazione con il FileChannel sottostante
        FileChannel spyFileChannel = spy(fileChannel);
        bufferedChannel = BufferedChannelBuilder.aBufferedChannel()
                .withAllocator(ByteBufAllocatorMother.createValidAllocator())
                .withFileChannel(spyFileChannel)
                .withWriteCapacity(100)
                .withUnpersistedBytesBound(0)
                .build();
        boolean forceMetadata = false;
        // --- ACTION ---
        bufferedChannel.forceWrite(forceMetadata);
        // Assert
        // Verifica che il metodo force del canale sottostante sia stato chiamato
        verify(spyFileChannel, times(1)).force(forceMetadata);
    }

    /**
     * Copre: metodo flush(), ciclo do-while (Riga: while(toWrite.hasRemaining())).
     * <p>
     * Simula uno scenario di "scrittura parziale" (Partial Write) utilizzando un Mock.
     * Normalmente il FileChannel scrive tutto il buffer in una volta sola. Qui costringiamo
     * il mock a scrivere i dati in due passaggi distinti, obbligando il ciclo while a ripetersi.
     */
    @Test
    public void shouldLoopInFlushWhenFileChannelDoesPartialWrites() throws IOException {
        // 1. Creiamo un Mock del FileChannel invece di usarne uno reale
        FileChannel mockFileChannel = mock(FileChannel.class);

        // 2. Setup del BufferedChannel con il Mock
        bufferedChannel = BufferedChannelBuilder.aBufferedChannel()
                .withAllocator(ByteBufAllocatorMother.createValidAllocator())
                .withFileChannel(mockFileChannel)
                .withWriteCapacity(10) // Capacità sufficiente
                .build();

        // 3. Scriviamo dei dati nel buffer interno (es. 5 byte)
        byte[] dataToWrite = {1, 2, 3, 4, 5};
        bufferedChannel.write(Unpooled.wrappedBuffer(dataToWrite));

        // 4. Configuriamo il comportamento del Mock per simulare la scrittura parziale.
        // Immaginiamo che il buffer abbia 5 byte.
        // - Prima chiamata: scrive 2 byte, ne restano 3. Il loop continua.
        // - Seconda chiamata: scrive i restanti 3 byte. Il loop finisce.
        doAnswer((Answer<Integer>) invocation -> {
            ByteBuffer buf = invocation.getArgument(0);
            if (buf.remaining() == 5) {
                // Primo passaggio: consuma 2 byte (simula avanzamento cursore OS)
                buf.position(buf.position() + 2);
                return 2; // Ritorna byte scritti
            } else if (buf.remaining() == 3) {
                // Secondo passaggio: consuma il resto
                buf.position(buf.position() + 3);
                return 3;
            }
            return 0;
        }).when(mockFileChannel).write(any(ByteBuffer.class));

        // Act
        // Chiamiamo flush(). Internamente chiamerà mockFileChannel.write() dentro il ciclo do-while.
        bufferedChannel.flush();

        // Assert
        // Verifichiamo che la write sia stata chiamata ALMENO 2 volte.
        // Questo dimostra che il ciclo "while(toWrite.hasRemaining())" è stato vero almeno una volta.
        verify(mockFileChannel, times(2)).write(any(ByteBuffer.class));
    }
}