package org.apache.bookkeeper.bookie;

import exceptions.InvalidBuilderParameterException;
import io.netty.buffer.ByteBufAllocator;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * Implementazione del pattern <strong>Builder</strong> per la creazione configurabile di istanze di {@code BufferedChannel}.
 * <p>
 * Questa classe è progettata per la creazione avanzata di <strong>Test Fixture</strong>. Oltre ai parametri standard
 * del costruttore, permette di "iniettare" uno stato interno specifico (es. contenuto del write buffer,
 * contatori di byte non persistiti, posizione logica), simulando scenari
 * complessi che sarebbero difficili da riprodurre utilizzando solo le API pubbliche.
 * </p>
 * <p>
 * Poiché accede a campi <em>package-private</em> o <em>protected</em> di {@code BufferedChannel}, questa classe
 * deve risiedere nello stesso package {@code org.apache.bookkeeper.bookie}.
 * </p>
 */
public class BufferedChannelBuilder {
    // parametri obbligatori
    private ByteBufAllocator allocator;
    private FileChannel fc;
    private Integer writeCapacity;

    // parametri facoltativi
    private Integer readCapacity;
    private long unpersistedBytesBound = 0;

    // parametri per iniezione di stato
    private byte[] injectedContent = null;
    private Long injectedWriteBufferStartPosition = null;
    private Long injectedUnpersistedBytes = null;
    private Long injectedGlobalPosition = null;

    /**
     * Factory method statico per iniziare la configurazione del builder.
     *
     * @return Una nuova istanza di BufferedChannelBuilder.
     */
    public static BufferedChannelBuilder aBufferedChannel() {
        return new BufferedChannelBuilder();
    }

    /**
     * Imposta l'allocatore di memoria (Obbligatorio).
     *
     * @param allocator L'istanza di ByteBufAllocator da utilizzare.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withAllocator(ByteBufAllocator allocator) {
        this.allocator = allocator;
        return this;
    }

    /**
     * Imposta il FileChannel sottostante (Obbligatorio).
     *
     * @param fc Il FileChannel su cui il BufferedChannel opererà.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withFileChannel(FileChannel fc) {
        this.fc = fc;
        return this;
    }

    /**
     * Imposta la capacità del buffer di scrittura (Obbligatorio).
     *
     * @param capacity Dimensione in byte del write buffer.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withWriteCapacity(int capacity) {
        this.writeCapacity = capacity;
        return this;
    }

    /**
     * Imposta la capacità del buffer di lettura (Facoltativo).
     * Se non specificato, verrà utilizzata la writeCapacity.
     *
     * @param readCapacity Dimensione in byte del read buffer.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withReadCapacity(int readCapacity) {
        this.readCapacity = readCapacity;
        return this;
    }

    /**
     * Imposta il limite di byte non persistiti prima di forzare un flush (Facoltativo).
     * Default è 0.
     *
     * @param bound Il numero massimo di byte non persistiti ammessi.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withUnpersistedBytesBound(long bound) {
        this.unpersistedBytesBound = bound;
        return this;
    }

    /**
     * Inietta contenuto testuale direttamente nel buffer di scrittura interno.
     * Simula una situazione in cui sono stati scritti dati ma non ancora flushati su disco.
     *
     * @param contentString Il contenuto da iniettare.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withInjectedWriteBufferContent(String contentString) {
        this.injectedContent = contentString.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    /**
     * Inietta contenuto binario direttamente nel buffer di scrittura interno.
     * Simula una situazione in cui sono stati scritti dati ma non ancora flushati su disco.
     *
     * @param contentBytes L'array di byte da iniettare.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withInjectedWriteBufferContent(byte[] contentBytes) {
        this.injectedContent = contentBytes;
        return this;
    }

    /**
     * Inietta forzatamente la posizione di inizio del buffer di scrittura (writeBufferStartPosition).
     * Determina dove il buffer corrente si colloca logicamente rispetto al file.
     *
     * @param position La posizione assoluta nel file.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withInjectedWriteBufferStartPosition(long position) {
        this.injectedWriteBufferStartPosition = position;
        return this;
    }

    /**
     * Sovrascrive il contatore interno dei byte non persistiti (unpersistedBytes).
     * Utile per testare la logica di flush forzato.
     *
     * @param bytes Il numero di byte da impostare come non persistiti.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withInjectedUnpersistedBytes(long bytes) {
        this.injectedUnpersistedBytes = bytes;
        return this;
    }

    /**
     * Inietta forzatamente la posizione globale corrente del canale (position).
     * Utile se si vuole disallineare il cursore rispetto alla logica standard (startPos + writtenBytes).
     *
     * @param position La posizione globale assoluta.
     * @return L'istanza corrente del builder.
     */
    public BufferedChannelBuilder withInjectedGlobalPosition(long position) {
        this.injectedGlobalPosition = position;
        return this;
    }

    /**
     * Costruisce l'istanza di BufferedChannel e applica le iniezioni di stato richieste.
     *
     * @return Un'istanza di BufferedChannel configurata e manipolata.
     * @throws IOException Se si verificano errori I/O.
     * @throws InvalidBuilderParameterException Se mancano parametri obbligatori o ci sono incoerenze (es. contenuto > capacità).
     */
    public BufferedChannel build() throws IOException {
        // validazione parametri obbligatori
        if (allocator == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "allocator", "ByteBufAllocator è obbligatorio");
        }
        if (fc == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "fileChannel", "FileChannel è obbligatorio");
        }
        if (writeCapacity == null) {
            throw new InvalidBuilderParameterException(this.getClass(), "capacity", "Capacity è obbligatoria");
        }

        // controllo coerenza capacità vs contenuto iniettato
        if (injectedContent != null && injectedContent.length > writeCapacity) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "capacity",
                    String.format("Contenuto iniettato (%d bytes) supera la capacità definita (%d)", injectedContent.length, writeCapacity)
            );
        }

        // costruzione dell'oggetto reale
        BufferedChannel bc;
        if (readCapacity != null) {
            bc = new BufferedChannel(allocator, fc, writeCapacity, this.readCapacity, this.unpersistedBytesBound);
        } else {
            bc = new BufferedChannel(allocator, fc, writeCapacity, unpersistedBytesBound);
        }

        // posizione di start del buffer
        long effectiveStartPosition;
        if (injectedWriteBufferStartPosition != null) {
            effectiveStartPosition = injectedWriteBufferStartPosition;
        } else {
            effectiveStartPosition = fc.size();
        }
        bc.writeBufferStartPosition.set(effectiveStartPosition);

        // contenuto del buffer
        int writtenBytes = 0;
        if (injectedContent != null) {
            bc.writeBuffer.writeBytes(injectedContent);
            writtenBytes = injectedContent.length;
        }

        // bytes non persistiti
        if (injectedUnpersistedBytes != null) {
            bc.unpersistedBytes.set(injectedUnpersistedBytes);
        } else if (injectedContent != null) {
            bc.unpersistedBytes.set(injectedContent.length);
        }

        // posizione Globale
        if (injectedGlobalPosition != null) {
            // L'utente ha forzato una posizione globale
            bc.position = injectedGlobalPosition;
        } else {
            // (Default): La posizione è alla fine di tutto (File + Buffer)
            // Logica: StartPosition (fine file) + Bytes scritti in RAM
            bc.position = effectiveStartPosition + writtenBytes;
        }

        return bc;
    }
}
