package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.apache.bookkeeper.testutils.FileChannelTestBuilder;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

import static org.assertj.core.api.Assertions.assertThat;

public class BufferedChannelPitestIncreaseTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;

    @After
    public void tearDown() {
        try {
            if (bufferedChannel != null) {
                bufferedChannel.close();
            }
            if (fileChannel != null && fileChannel.isOpen()) {
                fileChannel.close();
            }
        } catch (Exception e) {
            System.err.println("Errore durante il teardown: " + e.getMessage());
        }
    }

    /**
     * Uccide il mutante: removed call to java/util/concurrent/atomic/AtomicLong::set
     * <p>
     * <strong>Perché il mutante sopravviveva:</strong>
     * Se inizializziamo sempre il FileChannel da zero (posizione 0), la rimozione della chiamata
     * {@code writeBufferStartPosition.set(position)} è invisibile, perché l'AtomicLong nasce già a 0.
     * <p>
     * <strong>Come lo uccidiamo:</strong>
     * Inizializziamo il canale a una posizione DIVERSA da 0 (es. 100).
     * Se il costruttore ignora la chiamata (mutante vivo), la posizione interna rimarrà 0.
     * Se il costruttore funziona (mutante morto), la posizione interna diventerà 100.
     */
    @Test
    public void testConstructorShouldInitializePositionFromFileChannelPosition() throws IOException {
        // --- SETUP ---
        File tempFile = folder.newFile("pitest-pos-" + System.nanoTime() + ".log");
        // Definiamo una posizione iniziale a 100
        long nonZeroPosition = 100L;
        // Creiamo il FileChannel, scriviamo dei dati e spostiamo il cursore a 100
        fileChannel = FileChannelTestBuilder.aFileChannel()
                .inReadWriteMode()
                .withContent(new byte[200]) // Contenuto sufficiente per spostarsi a 100
                .atPosition(nonZeroPosition)
                .build(tempFile.toPath());
        // --- ACTION ---
        bufferedChannel = new BufferedChannel(
                ByteBufAllocator.DEFAULT,
                fileChannel,
                50,
                50,
                0L
        );
        // --- VERIFY ---
        // Verifichiamo che la posizione interna sia sincronizzata con quella del file (100)
        // Se il mutante è attivo, questo metodo ritornerà 0 e il test fallirà.
        assertThat(bufferedChannel.getFileChannelPosition())
                .as("La writeBufferStartPosition deve essere inizializzata alla posizione corrente del FileChannel")
                .isEqualTo(nonZeroPosition);
    }

    /**
     * Uccide il mutante: removed call to java/util/concurrent/atomic/AtomicLong::set (riga 204)
     * <p>
     * <strong>Perché il mutante sopravviveva:</strong>
     * La rimozione dell'aggiornamento di {@code writeBufferStartPosition} dopo il flush non impedisce
     * la scrittura fisica su disco. Se i test controllano solo il contenuto del file, il test passa.
     * <p>
     * <strong>Come lo uccidiamo:</strong>
     * Scriviamo dei dati nel buffer e forziamo un flush.
     * Verifichiamo esplicitamente che il puntatore interno {@code writeBufferStartPosition} sia avanzato
     * per riflettere la nuova posizione del file.
     * <br>
     * Se il mutante è vivo, il puntatore rimarrà alla posizione iniziale (0).
     */
    @Test
    public void testFlushShouldUpdateWriteBufferStartPosition() throws IOException {
        // --- SETUP ---
        File tempFile = folder.newFile("pitest-flush-" + System.nanoTime() + ".log");
        // Creiamo un canale pulito a posizione 0
        fileChannel = FileChannelTestBuilder.aFileChannel()
                .inReadWriteMode()
                .build(tempFile.toPath());
        bufferedChannel = new BufferedChannel(
                ByteBufAllocator.DEFAULT,
                fileChannel,
                100,
                100,
                0L
        );
        // Dati da scrivere (5 byte)
        ByteBuf data = Unpooled.wrappedBuffer(new byte[]{1, 2, 3, 4, 5});
        // --- ACTION ---
        // Scriviamo nel buffer (questo NON aggiorna ancora writeBufferStartPosition, ma solo writerIndex)
        bufferedChannel.write(data);
        // Eseguiamo il flush. Questo scrive su disco e DOVREBBE aggiornare writeBufferStartPosition da 0 a 5.
        bufferedChannel.flush();
        // --- VERIFY ---
        // Verifichiamo che il puntatore interno sia avanzato di 5.
        assertThat(bufferedChannel.getFileChannelPosition())
                .as("Dopo il flush, writeBufferStartPosition deve avanzare per coincidere con la file position")
                .isEqualTo(5L);
    }

    /**
     * Uccide il mutante alla riga 271: Replaced integer subtraction with addition in (pos - readBufferStartPosition).
     * Perché sopravviveva: Se readBufferStartPosition è 0, pos - 0 == pos + 0.
     * Come lo uccidiamo: Forziamo il readBuffer a caricare dati da una posizione non nulla (es. 10).
     */
    @Test
    public void testReadShouldCalculateCorrectPositionInBufferWhenOffsetIsNonZero() throws IOException {
        File tempFile = folder.newFile("pitest-read-offset-final.log");

        // 1. Creiamo un file di 100 byte per avere ampio spazio di manovra
        byte[] content = new byte[100];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) i;
        }
        java.nio.file.Files.write(tempFile.toPath(), content);

        fileChannel = FileChannelTestBuilder.aFileChannel()
                .inReadWriteMode()
                .build(tempFile.toPath());

        // Usiamo capacità molto piccole per forzare gli errori di indice
        int readCap = 10;
        bufferedChannel = new BufferedChannel(
                ByteBufAllocator.DEFAULT,
                fileChannel,
                100,
                readCap, // Capacità 10
                0L
        );

        // Spostiamo la writeBufferStartPosition lontano
        fileChannel.position(90);
        bufferedChannel.write(Unpooled.wrappedBuffer(new byte[]{(byte)90}));
        bufferedChannel.flush();

        // 2. Carichiamo il readBuffer alla posizione 40
        // readBuffer conterrà i byte del file da 40 a 49.
        ByteBuf tempDest = Unpooled.buffer(1);
        bufferedChannel.read(tempDest, 40, 1);
        tempDest.release();

        // 3. Lettura Target alla posizione 42
        // Codice Corretto: 42 - 40 = 2  (Valore atteso: 42)
        // Codice Mutato:   42 + 40 = 82
        ByteBuf finalDest = Unpooled.buffer(1);

        // ACTION
        bufferedChannel.read(finalDest, 42, 1);

        // VERIFY
        // Se il mutante è vivo, cercherà l'indice 82 in un buffer di capacità 10.
        // Questo DEVE lanciare IndexOutOfBoundsException o leggere un dato casuale.
        assertThat(finalDest.readByte())
                .as("Il calcolo dell'indice nel buffer deve essere esatto (pos - start)")
                .isEqualTo((byte) 42);

        finalDest.release();
    }

    /**
     * Uccide il mutante: Changed conditional boundary (linea 234) (> 0 to >= 0)
     * <p>
     * <strong>Scenario:</strong> Il bound è 0 (disabilitato).
     * <strong>Comportamento corretto:</strong> Il blocco `if` viene saltato, `unpersistedBytes` non viene toccato.
     * <strong>Comportamento mutante:</strong> Il blocco `if` viene eseguito (perché 0 >= 0),
     * impostando `unpersistedBytes` al numero di byte nel buffer.
     * </p>
     */
    @Test
    public void testForceWriteWithBoundZeroRemainsZero() throws IOException {
        // --- SETUP ---
        File tempFile = folder.newFile("pitest-forcewrite-" + System.nanoTime() + ".log");
        fileChannel = FileChannelTestBuilder.aFileChannel()
                .inReadWriteMode()
                .build(tempFile.toPath());

        // Inizializziamo con bound 0 (disabilitato)
        bufferedChannel = new BufferedChannel(
                ByteBufAllocator.DEFAULT,
                fileChannel,
                100,
                0L
        );

        // --- ACTION ---
        // Scriviamo 10 byte nel buffer (senza flush automatico)
        ByteBuf src = Unpooled.buffer(10);
        src.writeBytes("0123456789".getBytes());
        bufferedChannel.write(src);

        // Assicuriamo che la pre-condizione sia rispettata (unpersistedBytes è 0 perché bound=0)
        assertThat(bufferedChannel.getUnpersistedBytes())
                .as("Pre-condizione: unpersistedBytes deve essere 0 con bound disabilitato")
                .isEqualTo(0L);

        // Chiamiamo forceWrite esplicitamente
        bufferedChannel.forceWrite(false);

        // --- VERIFY ---
        // Originale (> 0): Salta il blocco -> rimane 0.
        // Mutante (>= 0): Entra nel blocco -> imposta unpersistedBytes a src.readableBytes() (10).
        assertThat(bufferedChannel.getUnpersistedBytes())
                .as("Con unpersistedBytesBound=0, unpersistedBytes non deve mai essere aggiornato da forceWrite")
                .isEqualTo(0L);

        src.release();
    }
}