package utils;

import exceptions.InvalidBuilderParameterException;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

/**
 * Builder pattern per la costruzione di un FileChannel
 */
public class FileChannelTestBuilder {
    // impostazioni di default
    private byte[] content = new byte[0];
    private long position = 0;
    private Set<StandardOpenOption> options = new HashSet<>();
    private boolean closed = false;

    public static FileChannelTestBuilder aFileChannel() {
        return new FileChannelTestBuilder();
    }

    public FileChannelTestBuilder withContent(String text) {
        if (text == null) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "content",
                    "il contenuto non può essere null"
            );
        }
        this.content = text.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    public FileChannelTestBuilder withContent(byte[] content) {
        if  (content == null) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "content",
                    "il contenuto non può essere null"
            );
        }
        this.content = content;
        return this;
    }

    public FileChannelTestBuilder atPosition(long position) {
        // controllo che la posizione sia >= 0
        if (position < 0) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "position",
                    "La posizione in un file channel reale non può essere impostata ad un numero negativo, usa mock/spy manualmente"
            );
        }
        this.position = position;
        return this;
    }

    public FileChannelTestBuilder withOption(StandardOpenOption option) {
        this.options.add(option);
        return this;
    }

    public FileChannelTestBuilder inReadMode() {
        this.options.clear();
        this.options.add(StandardOpenOption.READ);
        return this;
    }

    public FileChannelTestBuilder inWriteMode() {
        this.options.clear();
        this.options.add(StandardOpenOption.WRITE);
        this.options.add(StandardOpenOption.CREATE);
        return this;
    }

    public FileChannelTestBuilder inReadWriteMode() {
        this.options.clear();
        this.options.add(StandardOpenOption.READ);
        this.options.add(StandardOpenOption.WRITE);
        this.options.add(StandardOpenOption.CREATE);
        return this;
    }

    public FileChannelTestBuilder closed() {
        this.closed = true;
        return this;
    }

    public FileChannel build(Path targetFile) throws IOException {

        // controllo del path
        if (targetFile == null) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "targetFile",
                    "Il percorso del file di destinazione non può essere null"
            );
        }

        // controllo opzioni di apertura
        if (options.isEmpty()) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "options",
                    "non è stato selezionato alcuna opzione di apertura del file channel"
            );
        }

        // controllo Create New option e contenuto
        if (content.length > 0 && options.contains(StandardOpenOption.CREATE_NEW)) {
            throw new InvalidBuilderParameterException(
                    this.getClass(),
                    "options",
                    "Conflitto di configurazione: Non puoi pre-scrivere del contenuto e usare CREATE_NEW contemporaneamente."
            );
        }

        // Scriviamo il contenuto PRIMA di aprire il canale definitivo
        if (content.length > 0) {
            // Controllo che la cartella padre esista
            if (targetFile.getParent() != null) {
                Files.createDirectories(targetFile.getParent());
            }
            Files.write(targetFile, content);
        }

        // apertura del file channel
        FileChannel channel = FileChannel.open(targetFile, options.toArray(new StandardOpenOption[0]));

        // posizionamento dell'indice
        if (position != 0) {
            channel.position(position);
        }

        // chiudi il file channel se richiesto
        if (closed) {
            channel.close();
        }

        return channel;
    }

}