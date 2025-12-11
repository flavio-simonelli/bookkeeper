package org.apache.bookkeeper.bookie;

import exceptions.InvalidBuilderParameterException;
import io.netty.buffer.ByteBufAllocator;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class BufferedChannelBuilder {
    // parametri obbligatori
    private ByteBufAllocator allocator;
    private FileChannel fc;
    private Integer writeCapacity;

    // parametri facoltativi
    private Integer readCapacity;
    private long unpersistedBytesBound = 0;

    private byte[] injectedContent = null;
    private Long injectedWriteBufferStartPosition = null;
    private Long injectedUnpersistedBytes = null;
    private Long injectedGlobalPosition = null;

    public BufferedChannelBuilder withAllocator(ByteBufAllocator allocator) {
        this.allocator = allocator;
        return this;
    }

    public BufferedChannelBuilder withFileChannel(FileChannel fc) {
        this.fc = fc;
        return this;
    }

    public BufferedChannelBuilder withCapacity(int capacity) {
        this.writeCapacity = capacity;
        return this;
    }

    public BufferedChannelBuilder withReadCapacity(int readCapacity) {
        this.readCapacity = readCapacity;
        return this;
    }

    public BufferedChannelBuilder withUnpersistedBytesBound(long bound) {
        this.unpersistedBytesBound = bound;
        return this;
    }

    public BufferedChannelBuilder withInjectedWriteBufferContent(String contentString) {
        this.injectedContent = contentString.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    public BufferedChannelBuilder withInjectedWriteBufferContent(byte[] contentBytes) {
        this.injectedContent = contentBytes;
        return this;
    }

    public BufferedChannelBuilder withInjectedWriteBufferStartPosition(long position) {
        this.injectedWriteBufferStartPosition = position;
        return this;
    }

    public BufferedChannelBuilder withInjectedUnpersistedBytes(long bytes) {
        this.injectedUnpersistedBytes = bytes;
        return this;
    }

    public BufferedChannelBuilder withInjectedGlobalPosition(long position) {
        this.injectedGlobalPosition = position;
        return this;
    }

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
        if (injectedWriteBufferStartPosition != null) {
            bc.writeBufferStartPosition.set(injectedWriteBufferStartPosition);
        }

        // contenuto del buffer
        if (injectedContent != null) {
            bc.writeBuffer.writeBytes(injectedContent);
        }

        // bytes non persistiti
        if (injectedUnpersistedBytes != null) {
            bc.unpersistedBytes.set(injectedUnpersistedBytes);
        } else if (injectedContent != null) {
            bc.unpersistedBytes.set(injectedContent.length);
        }

        // posizione Globale (channel.position)
        // Se l'utente l'ha forzata, usiamo quella.
        // Altrimenti, calcoliamo noi in base a startPosition + bytes scritti nel buffer
        if (injectedGlobalPosition != null) {
            bc.position = injectedGlobalPosition;
        } else {
            // Logica automatica di convenienza: se ho iniettato dati, aggiorno la posizione
            long start = (injectedWriteBufferStartPosition != null) ? injectedWriteBufferStartPosition : bc.writeBufferStartPosition.get();
            int written = (injectedContent != null) ? injectedContent.length : 0;

            // Aggiorniamo la position solo se abbiamo toccato qualcosa, altrimenti lasciamo quella del costruttore (che prende da fc.position())
            if (injectedWriteBufferStartPosition != null || injectedContent != null) {
                bc.position = start + written;
            }
        }

        return bc;
    }
}
