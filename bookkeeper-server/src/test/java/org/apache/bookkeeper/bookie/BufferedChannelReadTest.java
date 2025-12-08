package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.util.IllegalReferenceCountException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;

public class BufferedChannelReadTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * Test: Passaggio di 'null' come buffer di destinazione.
     * Atteso: NullPointerException immediata.
     */
    @Test
    public void testBufferedChannelReadNullDest() throws IOException {
        File tempFile = folder.newFile("test_null.txn");

        try (
                FileChannel fc = FileChannelTestBuilder.onFile(tempFile)
                        .readWriteMode()
                        .withContent(new byte[]{'a'})
                        .getResult();
                BufferedChannel sut = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, 1024)
        ) {
            // ACT
            sut.read(null, 0, 1);

            // ASSERT FAILURE (Se arriva qui, non ha lanciato l'eccezione)
            Assert.fail("Il metodo doveva lanciare NullPointerException per destinazione null");

        } catch (NullPointerException e) {
            // SUCCESS: Eccezione attesa catturata
        }
    }

    /**
     * Test: Passaggio di un ByteBuf deallocato (rilasciato).
     * Nota: A seconda dell'implementazione di Netty, writableBytes() su un buffer rilasciato
     * può ritornare 0 (causando IllegalArgumentException dal nostro codice)
     * oppure lanciare IllegalReferenceCountException. Accettiamo entrambi.
     */
    @Test
    public void testBufferedChannelReadDeallocatedDest() throws IOException {
        File tempFile = folder.newFile("test_deallocated.txn");

        // Creiamo un buffer e lo deallochiamo subito
        ByteBuf dest = Unpooled.buffer(10);
        dest.release(); // refCnt = 0

        try (
                FileChannel fc = FileChannelTestBuilder.onFile(tempFile)
                        .readWriteMode()
                        .withContent(new byte[]{'a'})
                        .getResult();
                BufferedChannel sut = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, 1024)
        ) {
            // ACT
            sut.read(dest, 0, 1);

            Assert.fail("Il metodo doveva fallire per buffer deallocato o insufficiente");

        } catch (IllegalReferenceCountException e) {
            // SUCCESS: Netty ha bloccato l'accesso
        } catch (IllegalArgumentException e) {
            // SUCCESS: Il nostro controllo di capacità ha bloccato l'accesso
            // (perché il buffer rilasciato risultava avere 0 capacity)
            Assert.assertTrue(e.getMessage().contains("dest buffer remaining capacity is not enough"));
        }
    }

    /**
     * Test: Lettura con il FileChannel sottostante chiuso.
     * Atteso: ClosedChannelException (poiché BufferedChannel proverà a leggere dal file).
     */
    @Test
    public void testBufferedChannelReadClosedFileChannel() throws IOException {
        File tempFile = folder.newFile("test_closed.txn");

        // 1. Creiamo il canale e il SUT
        FileChannel fc = FileChannelTestBuilder.onFile(tempFile)
                .readWriteMode()
                .withContent(new byte[]{'a', 'b', 'c'})
                .getResult();

        // Nota: non usiamo il try-with-resources qui per 'sut' nel modo classico
        // perché dobbiamo chiudere il canale manualmente PRIMA dell'azione.
        BufferedChannel sut = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, 1024);
        ByteBuf dest = Unpooled.buffer(10);

        try {
            // 2. Chiudiamo esplicitamente il canale sottostante
            fc.close();

            // 3. ACT
            // Chiediamo di leggere dal file (offset 0). Poiché il buffer di scrittura è vuoto,
            // BufferedChannel delegherà al FileChannel.
            sut.read(dest, 0, 1);

            Assert.fail("Il metodo doveva lanciare ClosedChannelException");

        } catch (ClosedChannelException e) {
            // SUCCESS: Il canale sottostante era chiuso
        } catch (IOException e) {
            // Accettabile anche IOException generica, ma ClosedChannelException è più precisa
        } finally {
            // Cleanup manuale per sicurezza
            sut.close();
            dest.release();
        }
    }
}