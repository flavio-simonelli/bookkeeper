package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

/**
 * Helper class per creare e configurare istanze di ByteBuf per i test.
 * Permette di definire contenuto, indici e stato di allocazione.
 */
public class ByteBufTestBuilder {

    private byte[] content = null;
    private final int capacity; // Default iniziale
    private int readerIndex = 0;
    private int writerIndex = 0;
    private boolean released = false;
    private boolean autoWriterIndex = false; // Flag per calcolare l'index in base al contenuto

    private ByteBufTestBuilder(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("La capacità non può essere negativa");
        }
        this.capacity = capacity;
    }

    public static ByteBufTestBuilder withCapacity(int capacity) {
        return new ByteBufTestBuilder(capacity);
    }

    public ByteBufTestBuilder withContent(byte[] content) {
        this.content = content;
        // Se inseriamo contenuto, spesso vogliamo che il writerIndex
        // sia alla fine del contenuto automaticamente
        this.autoWriterIndex = true;
        return this;
    }

    public ByteBufTestBuilder withContent(String contentString) {
        return withContent(contentString.getBytes(StandardCharsets.UTF_8));
    }

    public ByteBufTestBuilder withReaderIndex(int readerIndex) {
        this.readerIndex = readerIndex;
        return this;
    }

    public ByteBufTestBuilder withWriterIndex(int writerIndex) {
        this.writerIndex = writerIndex;
        this.autoWriterIndex = false; // Se lo setto a mano, disabilito l'auto
        return this;
    }

    /**
     * Marca il buffer come rilasciato (refCnt = 0).
     * Qualsiasi operazione successiva su questo buffer lancerà IllegalReferenceCountException.
     */
    public ByteBufTestBuilder released() {
        this.released = true;
        return this;
    }

    public ByteBuf getResult() {
        // controlliamo che il contenuto sia di dimensione minore o uguale della capacità
        if (content != null && content.length > capacity) {
            throw new IllegalArgumentException("Il contenuto richiesto nel buffer ha dimensione maggiore della capacità specificata");
        }

        // 2. Creazione del buffer (Heap buffer è standard per i test unitari)
        ByteBuf buf = Unpooled.buffer(capacity);

        // 3. Scrittura del contenuto (se presente)
        if (content != null) {
            buf.writeBytes(content);
        }

        // 4. Gestione Indici
        // Nota: writeBytes sposta automaticamente il writerIndex.
        // Se l'utente vuole un writerIndex specifico diverso dalla fine del contenuto:
        if (!autoWriterIndex) {
            // Controllo di sicurezza per evitare IndexOutOfBounds durante la costruzione
            if (writerIndex > buf.capacity()) {
                buf.capacity(writerIndex); // Espande se necessario
            }
            buf.writerIndex(writerIndex);
        }

        // Il readerIndex va settato dopo, perché non può essere > writerIndex
        buf.readerIndex(readerIndex);

        // 5. Simulazione deallocazione
        // Un buffer appena creato ha refCnt = 1. Per portarlo a 0 facciamo release.
        if (released) {
            buf.release();
        }

        return buf;
    }
}