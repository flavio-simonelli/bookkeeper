package org.apache.bookkeeper.testutils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.*;
import java.util.Arrays;

/**
 * Implementazione semplificata e in-memory di {@link FileChannel}.
 * <p>
 * Questa classe è progettata principalmente per l'uso in framework di test automatici (es. Randoop),
 * dove l'esecuzione di I/O reale su disco sarebbe proibitivamente lenta o dispendiosa in termini di risorse.
 * È specificamente ottimizzata per soddisfare i requisiti della classe
 * {@code org.apache.bookkeeper.bookie.BufferedChannel}.
 * </p>
 * <p>
 * <strong>Nota:</strong> Questa implementazione impone alcuni vincoli rispetto a un
 * vero {@code FileChannel}, come il supporto limitato per le modalità di accesso e il locking dei file.
 * </p>
 */
public class InMemoryFileChannel extends FileChannel {

    private static final int INITIAL_CAPACITY = 4096; // Capacità iniziale predefinita del buffer (4KB)

    private byte[] data; // L'array di supporto (backing array) per i dati del file
    private int size; // La dimensione attuale dei dati in byte
    private long position; // La posizione corrente del cursore all'interno del canale
    private boolean closed; // Flag che indica se il canale è chiuso

    public InMemoryFileChannel() {
        this.data = new byte[INITIAL_CAPACITY];
        this.size = 0;
        this.position = 0;
        this.closed = false;
    }

    /**
     * Assicura che il buffer interno abbia una capacità sufficiente per contenere la quantità di dati specificata.
     * Se necessario, il buffer viene espanso (raddoppiato) per soddisfare il nuovo requisito.
     *
     * @param minCapacity La capacità minima richiesta.
     */
    private void ensureCapacity(long minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = data.length;
            // Raddoppia finché non è sufficiente
            while (newCapacity < minCapacity) {
                newCapacity = newCapacity << 1; // Moltiplica per 2
                // Protezione contro overflow integer
                if (newCapacity < 0) {
                    newCapacity = Integer.MAX_VALUE;
                    break;
                }
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    @Override
    public int read(ByteBuffer dst) throws IOException {
        return readImpl(dst, this.position, true);
    }

    @Override
    public int read(ByteBuffer dst, long position) throws IOException {
        return readImpl(dst, position, false);
    }

    /**
     * Implementazione interna per la lettura dei dati in un buffer.
     *
     * @param dst             Il buffer di destinazione.
     * @param pos             La posizione da cui iniziare a leggere.
     * @param updateGlobalPos Indica se aggiornare il cursore di posizione globale del canale.
     * @return Il numero di byte letti, o -1 se viene raggiunta la fine dello stream.
     * @throws ClosedChannelException Se il canale è chiuso.
     */
    private int readImpl(ByteBuffer dst, long pos, boolean updateGlobalPos) throws IOException {
        if (closed) {
            throw new ClosedChannelException();
        }

        if (pos >= size) {
            return -1;
        }

        int available = (int) (size - pos);
        int toRead = Math.min(dst.remaining(), available);

        if (toRead <= 0) return 0;

        dst.put(data, (int) pos, toRead);

        if (updateGlobalPos) {
            this.position += toRead;
        }
        return toRead;
    }

    @Override
    public int write(ByteBuffer src) throws IOException {
        int written = writeImpl(src, this.position);
        this.position += written;
        return written;
    }

    @Override
    public int write(ByteBuffer src, long position) throws IOException {
        return writeImpl(src, position);
    }

    /**
     * Implementazione interna per la scrittura dei dati da un buffer.
     * Espande automaticamente lo storage interno se necessario.
     *
     * @param src Il buffer sorgente.
     * @param pos La posizione in cui iniziare a scrivere.
     * @return Il numero di byte scritti.
     * @throws ClosedChannelException Se il canale è chiuso.
     */
    private int writeImpl(ByteBuffer src, long pos) throws IOException {
        if (closed) {
            throw new ClosedChannelException();
        }
        int toWrite = src.remaining();
        if (toWrite <= 0) return 0;

        ensureCapacity(pos + toWrite);

        src.get(data, (int) pos, toWrite);

        if (pos + toWrite > size) {
            size = (int) (pos + toWrite);
        }

        return toWrite;
    }

    @Override
    public long position() throws IOException {
        if (closed) {
            throw new ClosedChannelException();
        }
        return position;
    }

    @Override
    public FileChannel position(long newPosition) throws IOException {
        if (closed) {
            throw new ClosedChannelException();
        }
        if (newPosition < 0) {
            throw new IllegalArgumentException("newPosition < 0");
        }
        this.position = newPosition;
        return this;
    }

    @Override
    public long size() throws IOException {
        if  (closed) {
            throw new ClosedChannelException();
        }
        return size;
    }

    /**
     * Forza la scrittura di eventuali aggiornamenti sul dispositivo di storage.
     * <p>
     * Poiché si tratta di un'implementazione in-memory, questo metodo è una no-op (nessuna operazione).
     * </p>
     *
     * @param metaData Se true, anche i metadati vengono forzati (ignorato in questa implementazione).
     */
    @Override
    public void force(boolean metaData) throws IOException {
        if (closed) {
            throw new ClosedChannelException();
        }
        //no-op
    }

    @Override
    public FileChannel truncate(long size) throws IOException {
        if (closed) {
            throw new ClosedChannelException();
        }
        if  (size < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        if (size < this.size) {
            this.size = (int) size;
        }
        if (position > size) {
            position = size;
        }
        return this;
    }

    @Override
    protected void implCloseChannel() throws IOException {
        this.closed = true;
    }

    // --- Operazioni non supportate (boilerplate) richiesti dalla classe astratta ---
    @Override
    public long write(ByteBuffer[] srcs, int offset, int length) throws IOException { throw new UnsupportedOperationException(); }

    @Override
    public long read(ByteBuffer[] dsts, int offset, int length) throws IOException { throw new UnsupportedOperationException(); }

    @Override
    public long transferTo(long position, long count, WritableByteChannel target) throws IOException { throw new UnsupportedOperationException(); }

    @Override
    public long transferFrom(ReadableByteChannel src, long position, long count) throws IOException { throw new UnsupportedOperationException(); }

    @Override
    public MappedByteBuffer map(MapMode mode, long position, long size) throws IOException { throw new UnsupportedOperationException(); }

    @Override
    public FileLock lock(long position, long size, boolean shared) throws IOException { throw new UnsupportedOperationException(); }

    @Override
    public FileLock tryLock(long position, long size, boolean shared) throws IOException { throw new UnsupportedOperationException(); }
}