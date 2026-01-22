package org.apache.bookkeeper.testutils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import lombok.Getter;
import org.apache.bookkeeper.bookie.BufferedChannel;
import org.apache.bookkeeper.bookie.Journal;

import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Implementazione stub del Builder per BufferedChannel.
 * Restituisce una versione "Pass-Through" del canale che scrive direttamente su disco.
 */
public class BufferedChannelBuilderStub implements Journal.BufferedChannelBuilder {

    // salvo l'istanza creata SOLO per poter controllare la posizione del file dopo
    private BufferedChannelStub createdChannel;

    @Override
    public BufferedChannel create(FileChannel fc, int capacity) throws IOException {
        this.createdChannel = new BufferedChannelStub(fc, capacity);
        return createdChannel;
    }

    public BufferedChannelStub getCreatedChannel() {
        return createdChannel;
    }

    /**
     * Stub di BufferedChannel (Fake Object Pattern).
     * * OBIETTIVO:
     * Eliminare completamente la logica di buffering, flush asincrono e gestione
     * dei ReferenceCount di Netty dai test.
     * * FUNZIONAMENTO:
     * Ogni operazione di write viene eseguita immediatamente sul FileChannel sottostante.
     * Questo garantisce che quando il metodo write ritorna, i dati siano già nel file system (o nella OS cache),
     * rendendo le asserzioni sui file (es. Files.readAllBytes) affidabili.
     */
    public static class BufferedChannelStub extends BufferedChannel {

        private final FileChannel fileChannel;

        public BufferedChannelStub(FileChannel fc, int capacity) throws IOException {
            // 1. Chiamiamo super() con un allocatore reale per evitare NullPointerException
            // nell'inizializzazione della classe padre.
            // Usiamo UnpooledByteBufAllocator.DEFAULT che è leggero.
            super(UnpooledByteBufAllocator.DEFAULT, fc, capacity);

            this.fileChannel = fc;
        }

        @Override
        public synchronized void write(ByteBuf src) throws IOException {
            // Legge i byte dal buffer Netty e li scrive direttamente nel FileChannel.
            // src.readBytes(...) trasferisce i dati e avanza l'indice di lettura del buffer.
            int length = src.readableBytes();
            src.readBytes(fileChannel, length);
        }

        @Override
        public synchronized int read(ByteBuf dest, long pos, int length) throws IOException {
            if (dest.writableBytes() < length) {
                throw new IllegalArgumentException("Destination buffer too small");
            }
            // Legge direttamente dal file alla posizione 'pos' per 'length' byte
            // E aggiorna automaticamente il writerIndex di 'dest'.
            return dest.writeBytes(fileChannel, pos, length);
        }

        @Override
        public synchronized void flush() {
            // No-op: I dati sono scritti in modalità write-through, non c'è nulla da flushare.
        }

        @Override
        public long forceWrite(boolean forceMetadata) throws IOException {
            // Eseguiamo il force reale. Questo è cruciale per i test che verificano
            // la durabilità o che interagiscono con il file system reale.
            fileChannel.force(forceMetadata);
            return fileChannel.position();
        }

        @Override
        public void flushAndForceWrite(boolean forceMetadata) throws IOException {
            // Flush è implicito, facciamo solo force.
            fileChannel.force(forceMetadata);
        }

        @Override
        public synchronized long position() {
            try {
                return fileChannel.position();
            } catch (IOException e) {
                throw new RuntimeException("Errore critico nello Stub: impossibile leggere position", e);
            }
        }

        @Override
        public long getFileChannelPosition() {
            return position();
        }

        @Override
        public synchronized void close() throws IOException {
            // Chiudiamo il canale
            fileChannel.close();

            // Chiamiamo super.close() per permettere alla classe padre
            // di rilasciare il buffer (writeBuffer) che ha allocato nel costruttore.
            // Questo evita leak di memoria diretta nei test.
            super.close();
        }

        @Override
        public synchronized void clear() {
            super.clear();
        }

        @Override
        public synchronized int getNumOfBytesInWriteBuffer() {
            return 0;
        }
    }
}