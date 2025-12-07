package org.apache.bookkeeper.bookie;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

/**
 * Helper class per gestire la creazione e configurazione di FileChannel per i test.
 */
public class FileChannelTestBuilder {
    private File targetFile;
    private byte[] content;
    private final Set<StandardOpenOption> options = new HashSet<>();
    private boolean closed = false;
    private long initialPosition = 0;

    private FileChannelTestBuilder(File file) {
        this.targetFile = file;
    }

    public static FileChannelTestBuilder onFile(File file) {
        return  new FileChannelTestBuilder(file);
    }

    public FileChannelTestBuilder withContent(byte[] content) {
        this.content = content;
        return this;
    }

    public FileChannelTestBuilder closed() {
        this.closed = true;
        return this;
    }

    public FileChannelTestBuilder readOnlyMode() {
        this.options.add(StandardOpenOption.READ);
        return this;
    }

    public FileChannelTestBuilder writeOnlyMode() {
        this.options.add(StandardOpenOption.WRITE);
        return this;
    }

    public FileChannelTestBuilder readWriteMode() {
        this.options.add(StandardOpenOption.WRITE);
        this.options.add(StandardOpenOption.READ);
        return this;
    }

    public FileChannelTestBuilder withInitialPosition(long initialPosition) {
        this.initialPosition = initialPosition;
        return this;
    }

    public FileChannel getResult() throws IOException {
        // controllo che sia stata specifica una opzione di apertura del canale
        if (options.isEmpty()) {
            throw new IllegalArgumentException("Configurazione incompleta: Devi specificare una modalità (es. readOnlyMode() o readWriteMode() o writeOnlyMode())");
        }
        if (targetFile == null) {
            throw new IllegalArgumentException("Nessun File specificato su cui creare il filechannel");
        }
        // Assicuriamoci che le directory padre esistano
        if (targetFile.getParentFile() != null) {
            targetFile.getParentFile().mkdirs();
        }
        Path path = this.targetFile.toPath();
        // creiamo il file se non esiste
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        // Scriviamo nel file il contenuto iniziale se presente
        if (content != null) {
            Files.write(path, content);
        }
        // Apriamo il canale
        FileChannel fc = FileChannel.open(path, options);
        // Spostiamo il cursore se richiesto della lettura
        if (initialPosition > 0) {
            fc.position(initialPosition);
        }
        // Chiudiamo il canale se richiesto
        if (closed) {
            fc.close();
        }
        return fc;
    }
}