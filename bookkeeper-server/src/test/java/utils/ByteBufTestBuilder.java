package utils;

import exceptions.InvalidBuilderParameterException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

/**
 * Helper class per creare e configurare istanze di ByteBuf per i test.
 * Permette di definire contenuto, indici e stato di allocazione.
 */
public class ByteBufTestBuilder {

    // Parametri opzionali con valori di default null/safe
    private Integer capacity = null;
    private byte[] content = new byte[0];
    private Integer readerIndex = null;
    private Integer writerIndex = null;
    private boolean released = false;
    private boolean allowInvalidIndices = false;

    public static ByteBufTestBuilder aByteBufTestBuilder() {
        return new ByteBufTestBuilder();
    }

    /**
     * Imposta la capacità fissa del buffer.
     * Se null, verrà calcolata in base alla lunghezza del contenuto.
     */
    public ByteBufTestBuilder withCapacity(int capacity) {
        if (capacity < 0) {
            throw new InvalidBuilderParameterException(this.getClass(), "capacity", "La capacità non può essere negativa");
        }
        this.capacity = capacity;
        return this;
    }

    /**
     * Imposta il contenuto iniziale (sposta implicitamente il writeIndex,
     * a meno che writeIndex non venga sovrascritto esplicitamente).
     */
    public ByteBufTestBuilder withContent(String contentString) {
        if (contentString == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "content", "Il contenuto non può essere null");
        }
        this.content = contentString.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    public ByteBufTestBuilder withContent(byte[] contentBytes) {
        if (contentBytes == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "content", "Il contenuto non può essere null");
        }
        this.content = contentBytes;
        return this;
    }

    /**
     * Imposta manualmente il readerIndex. Default = 0.
     */
    public ByteBufTestBuilder withReaderIndex(int readerIndex) {
        this.readerIndex = readerIndex;
        return this;
    }

    /**
     * Imposta manualmente il writerIndex.
     * Se non specificato, sarà uguale alla fine del contenuto scritto.
     */
    public ByteBufTestBuilder withWriterIndex(int writerIndex) {
        this.writerIndex = writerIndex;
        return this;
    }

    /**
     * Se true, gli indici potranno essere invalidi e quindi non rispettare le regole di un bytebuffer
     */
    public ByteBufTestBuilder withInvalidIndices() {
        this.allowInvalidIndices = true;
        return this;
    }

    /**
     * Se true, il buffer verrà rilasciato (refCnt = 0) prima di essere restituito.
     */
    public ByteBufTestBuilder asReleased() {
        this.released = true;
        return this;
    }

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