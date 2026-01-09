package org.apache.bookkeeper.testutils;

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
 * Implementazione del pattern <strong>Builder</strong> per la creazione configurabile di istanze di {@link FileChannel}.
 * <p>
 * Questa classe è pensata per semplificare la fase di "Arrange" negli unit test e integration test,
 * permettendo di creare file reali su disco, popolarli con dati e ottenere un canale aperto
 * con una sintassi fluente e leggibile.
 * </p>
 * <p>
 * Esempio di utilizzo:
 * <pre>
 * FileChannel channel = FileChannelTestBuilder.aFileChannel()
 * .withContent("Hello World")
 * .inReadMode()
 * .atPosition(5)
 * .build(tempPath);
 * </pre>
 * </p>
 */
public class FileChannelTestBuilder {
    // --- Impostazioni di default ---
    private byte[] content = new byte[0];
    private long position = 0;
    private Set<StandardOpenOption> options = new HashSet<>();
    private boolean closed = false;

    /**
     * Entry point statico per iniziare la costruzione del FileChannel.
     *
     * @return Una nuova istanza del builder.
     */
    public static FileChannelTestBuilder aFileChannel() {
        return new FileChannelTestBuilder();
    }

    /**
     * Definisce il contenuto testuale iniziale del file.
     * Il testo verrà convertito in byte utilizzando la codifica UTF-8.
     *
     * @param text La stringa da scrivere nel file.
     * @return L'istanza corrente del builder (Fluent API).
     * @throws InvalidBuilderParameterException Se il testo è null.
     */
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

    /**
     * Definisce il contenuto binario iniziale del file.
     *
     * @param content L'array di byte da scrivere nel file.
     * @return L'istanza corrente del builder (Fluent API).
     * @throws InvalidBuilderParameterException Se l'array è null.
     */
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

    /**
     * Imposta la posizione iniziale del cursore del FileChannel.
     *
     * @param position La posizione (offset) in byte.
     * @return L'istanza corrente del builder.
     * @throws InvalidBuilderParameterException Se la posizione è negativa.
     */
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

    /**
     * Aggiunge una singola opzione di apertura personalizzata (es. {@code DSYNC}, {@code SPARSE}).
     *
     * @param option L'opzione {@link StandardOpenOption} da aggiungere.
     * @return L'istanza corrente del builder.
     */
    public FileChannelTestBuilder withOption(StandardOpenOption option) {
        this.options.add(option);
        return this;
    }

    /**
     * Configura il canale in modalità sola lettura (READ).
     * NB: Rimuove eventuali altre opzioni precedentemente impostate.
     *
     * @return L'istanza corrente del builder.
     */
    public FileChannelTestBuilder inReadMode() {
        this.options.clear();
        this.options.add(StandardOpenOption.READ);
        return this;
    }

    /**
     * Configura il canale in modalità scrittura(WRITE + CREATE).
     * NB: Rimuove eventuali altre opzioni precedentemente impostate.
     *
     * @return L'istanza corrente del builder.
     */
    public FileChannelTestBuilder inWriteMode() {
        this.options.clear();
        this.options.add(StandardOpenOption.WRITE);
        this.options.add(StandardOpenOption.CREATE);
        return this;
    }

    /**
     * Configura il canale in modalità lettura e scrittura (READ + WRITE + CREATE).
     * NB: Rimuove eventuali altre opzioni precedentemente impostate.
     *
     * @return L'istanza corrente del builder.
     */
    public FileChannelTestBuilder inReadWriteMode() {
        this.options.clear();
        this.options.add(StandardOpenOption.READ);
        this.options.add(StandardOpenOption.WRITE);
        this.options.add(StandardOpenOption.CREATE);
        return this;
    }

    /**
     * Specifica che il canale restituito dovrà essere già chiuso.
     *
     * @return L'istanza corrente del builder.
     */
    public FileChannelTestBuilder closed() {
        this.closed = true;
        return this;
    }

    /**
     * Costruisce e restituisce l'istanza di {@link FileChannel} basata sulla configurazione accumulata.
     *
     * @param targetFile Il percorso del file su disco da utilizzare come supporto.
     * @return Un'istanza configurata di {@link FileChannel}.
     * @throws IOException Se si verifica un errore di I/O durante la creazione o scrittura del file.
     * @throws InvalidBuilderParameterException Se la configurazione è invalida.
     */
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