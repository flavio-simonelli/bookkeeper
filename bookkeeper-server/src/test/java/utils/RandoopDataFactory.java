package utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Factory class per la generazione di dati e risorse di test per Randoop.
 * <p>
 * Questa classe fornisce metodi statici per creare istanze pre-configurate di
 * {@link FileChannel} (in-memory) e {@link ByteBuf} di Netty.
 * Randoop utilizza questi metodi per iniettare dipendenze valide durante la
 * generazione automatica dei test di regressione.
 * </p>
 */
public class RandoopDataFactory {

    /**
     * Fornisce a Randoop un'istanza di {@link FileChannel} in-memory pre-popolata con i dati specificati.
     * Utile per testare scenari di lettura da un canale che contiene già informazioni.
     *
     * @param data I dati sotto forma di stringa da scrivere inizialmente nel canale.
     * @return Un {@code FileChannel} (istanza di {@link InMemoryFileChannel}) contenente i dati convertiti in byte.
     * @throws IOException Se si verifica un errore durante la creazione del file channel e la scrittura dei dati.
     */
    public static FileChannel provideInMemFileChannelWithData(String data) throws IOException {
        InMemoryFileChannel fc = new InMemoryFileChannel();
        byte[] dataBytes = data.getBytes();
        if (fc.write(ByteBuffer.wrap(dataBytes)) != dataBytes.length) {
            throw new IOException("Failed to write bytes to file");
        }
        fc.position(0);
        return fc;
    }

    /**
     * Fornisce un'istanza vuota di {@link InMemoryFileChannel}.
     * Utilizzato da Randoop per inizializzare test che richiedono un canale pulito (size 0).
     *
     * @return Un nuovo {@code FileChannel} in-memory vuoto.
     */
    public static FileChannel provideEmptyInMemFileChannel() {
        return new InMemoryFileChannel();
    }

    /**
     * Fornisce un {@link ByteBufAllocator} predefinito.
     * In questo caso, viene restituito l'allocatore unpooled di default di Netty.
     *
     * @return L'istanza di {@link UnpooledByteBufAllocator#DEFAULT}.
     */
    public static ByteBufAllocator provideAllocator() {
        return UnpooledByteBufAllocator.DEFAULT;
    }

    /**
     * Fornisce un {@link ByteBuf} di Netty pre-riempito con dati di test.
     * Utile per simulare operazioni in cui è necessario un buffer sorgente con contenuto valido.
     *
     * @return Un buffer contenente la stringa "Dati di test per BufferedChannel".
     */
    public static ByteBuf provideDataBuffer() {
        byte[] content = "Dati di test per BufferedChannel".getBytes();
        return Unpooled.copiedBuffer(content);
    }

    /**
     * Fornisce un {@link ByteBuf} di Netty vuoto con una capacità standard.
     *
     * @return Un buffer vuoto (capacity 1024) pronto per la scrittura.
     */
    public static ByteBuf provideEmptyBuffer() {
        return Unpooled.buffer(1024);
    }
}
