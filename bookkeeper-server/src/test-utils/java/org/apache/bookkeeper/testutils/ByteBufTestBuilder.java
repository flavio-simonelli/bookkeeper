package org.apache.bookkeeper.testutils;

import exceptions.InvalidBuilderParameterException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

/**
 * Helper class per la creazione fluente e configurabile di istanze {@link ByteBuf} per scopi di testing.
 * <p>
 * Questa classe implementa il pattern <strong>Builder</strong> e permette di definire in modo granulare
 * lo stato interno del buffer, inclusi il contenuto, la capacità e la posizione degli indici (<em>readerIndex</em> e <em>writerIndex</em>).
 * </p>
 * <p>
 * Una funzionalità chiave è la possibilità di generare buffer con stati <strong>invalidi</strong> (tramite {@code withInvalidIndices})
 * o già <strong>deallocati</strong> (tramite {@code asReleased}), utilizzando internamente Mockito Spy per
 * forzare comportamenti che l'implementazione standard di Netty impedirebbe lanciando eccezioni.
 * </p>
 */
public class ByteBufTestBuilder {

    // Parametri opzionali con valori di default null/safe
    private Integer capacity = null;
    private byte[] content = new byte[0];
    private Integer readerIndex = null;
    private Integer writerIndex = null;
    private boolean released = false;
    private boolean allowInvalidIndices = false;

    /**
     * Punto di ingresso statico per iniziare la catena di costruzione del builder.
     *
     * @return Una nuova istanza del builder.
     */
    public static ByteBufTestBuilder aByteBufTestBuilder() {
        return new ByteBufTestBuilder();
    }

    /**
     * Imposta la capacità fissa del buffer.
     * Se questo valore non viene specificato (null), la capacità verrà calcolata automaticamente
     * in base alla lunghezza del contenuto fornito.
     *
     * @param capacity La capacità in byte (deve essere >= 0).
     * @return L'istanza corrente del builder.
     * @throws InvalidBuilderParameterException Se la capacità è negativa.
     */
    public ByteBufTestBuilder withCapacity(int capacity) {
        if (capacity < 0) {
            throw new InvalidBuilderParameterException(this.getClass(), "capacity", "La capacità non può essere negativa");
        }
        this.capacity = capacity;
        return this;
    }

    /**
     * Imposta il contenuto iniziale del buffer partendo da una stringa.
     * La stringa viene convertita in byte usando la codifica UTF-8.
     * Questo metodo influenza implicitamente il writerIndex, a meno che non venga sovrascritto manualmente.
     *
     * @param contentString La stringa da scrivere nel buffer.
     * @return L'istanza corrente del builder.
     * @throws InvalidBuilderParameterException Se il contenuto è null.
     */
    public ByteBufTestBuilder withContent(String contentString) {
        if (contentString == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "content", "Il contenuto non può essere null");
        }
        this.content = contentString.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    /**
     * Imposta il contenuto iniziale del buffer partendo da un array di byte.
     * Questo metodo influenza implicitamente il writerIndex, a meno che non venga sovrascritto manualmente.
     *
     * @param contentBytes L'array di byte da scrivere.
     * @return L'istanza corrente del builder.
     * @throws InvalidBuilderParameterException Se il contenuto è null.
     */
    public ByteBufTestBuilder withContent(byte[] contentBytes) {
        if (contentBytes == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "content", "Il contenuto non può essere null");
        }
        this.content = contentBytes;
        return this;
    }

    /**
     * Imposta manualmente l'indice di lettura (readerIndex).
     * Il valore di default se non specificato è 0.
     *
     * @param readerIndex L'indice di lettura desiderato.
     * @return L'istanza corrente del builder.
     */
    public ByteBufTestBuilder withReaderIndex(int readerIndex) {
        this.readerIndex = readerIndex;
        return this;
    }

    /**
     * Imposta manualmente l'indice di scrittura (writerIndex).
     * Se non specificato, questo valore corrisponderà alla fine del contenuto scritto.
     *
     * @param writerIndex L'indice di scrittura desiderato.
     * @return L'istanza corrente del builder.
     */
    public ByteBufTestBuilder withWriterIndex(int writerIndex) {
        this.writerIndex = writerIndex;
        return this;
    }

    /**
     * Abilita la configurazione di indici non validi che normalmente violerebbero le regole di integrità di Netty.
     * Quando abilitato, il buffer restituito sarà incapsulato in un Mockito Spy per forzare il ritorno
     * di valori illegali (es. readerIndex > writerIndex) senza sollevare eccezioni in fase di setup.
     *
     * @return L'istanza corrente del builder.
     */
    public ByteBufTestBuilder withInvalidIndices() {
        this.allowInvalidIndices = true;
        return this;
    }

    /**
     * Specifica che il buffer restituito deve essere già in stato "released" (refCnt = 0).
     *
     * @return L'istanza corrente del builder.
     */
    public ByteBufTestBuilder asReleased() {
        this.released = true;
        return this;
    }

    /**
     * Costruisce e restituisce l'istanza finale di ByteBuf configurata.
     * Esegue la validazione dei parametri (a meno che non siano permessi indici invalidi),
     * scrive il contenuto e applica gli indici richiesti.
     *
     * @return Un'istanza di ByteBuf (o uno Spy di ByteBuf se richiesti indici invalidi).
     * @throws InvalidBuilderParameterException Se la configurazione contiene incongruenze logiche (es. writerIndex > capacity) e il flag allowInvalidIndices è false.
     */
    public ByteBuf build() {

        // calcolo Capacità Finale
        int dataSize = content.length;
        int finalCapacity;

        if (this.capacity != null) {
            if (this.capacity < dataSize) {
                throw new InvalidBuilderParameterException(
                        this.getClass(),
                        "capacity",
                        String.format("La capacità (%d) è troppo piccola per contenere i dati forniti (%d)", capacity, dataSize)
                );
            }
            finalCapacity = this.capacity;
        } else {
            // se non specificata, usa la dimensione dei dati
            finalCapacity = dataSize;
        }

        // calcolo Indici Finali
        // se writerIndex non è specificato, si assume che sia alla fine dei dati scritti
        int finalWriterIndex = (this.writerIndex != null) ? this.writerIndex : dataSize;
        int finalReaderIndex = (this.readerIndex != null) ? this.readerIndex : 0;

        if (!allowInvalidIndices) {
            // validazione degli indici
            if (finalWriterIndex < 0) {
                throw new InvalidBuilderParameterException(this.getClass(), "writerIndex", "L'indice di scrittura non può essere negativo");
            }

            if (finalReaderIndex < 0) {
                throw new InvalidBuilderParameterException(this.getClass(), "readerIndex", "L'indice di lettura non può essere negativo");
            }

            if (finalWriterIndex > finalCapacity) {
                throw new InvalidBuilderParameterException(
                        this.getClass(),
                        "writerIndex",
                        String.format("Il writerIndex (%d) eccede la capacità (%d)", finalWriterIndex, finalCapacity)
                );
            }

            if (finalReaderIndex > finalWriterIndex) {
                throw new InvalidBuilderParameterException(
                        this.getClass(),
                        "readerIndex",
                        String.format("Il readerIndex (%d) non può superare il writerIndex (%d)", finalReaderIndex, finalWriterIndex)
                );
            }
        }

        // creiamo il buffer
        ByteBuf buffer = Unpooled.buffer(finalCapacity, finalCapacity);

        // scrittura contenuto
        if (dataSize > 0) {
            buffer.writeBytes(content);
        }

        // 3. Applicazione degli indici
        if (allowInvalidIndices) {
            // Se vogliamo indici invalidi, dobbiamo usare uno SPY
            buffer = spy(buffer);

            // Usiamo doReturn per evitare che lo spy chiami il metodo reale
            // che lancerebbe IndexOutOfBoundsException
            doReturn(finalReaderIndex).when(buffer).readerIndex();
            doReturn(finalWriterIndex).when(buffer).writerIndex();
        } else {
            // Comportamento standard
            buffer.setIndex(finalReaderIndex, finalWriterIndex);
        }

        // rilascio del buffer se richiesto
        if (released) {
            buffer.release();
        }

        return buffer;
    }
}