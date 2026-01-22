package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.exceptions.InvalidBuilderParameterException;

import java.io.File;
import java.io.IOException;

public class JournalChannelBuilder {
    // default value
    private final static long START_OF_FILE = -12345;
    private final static int DEFAULT_FORMAT_VERSION = 5;
    private final static int DEFAULT_JOURNAL_ALIGN_SIZE = 512;

    // parametri obbligatori
    private File journalDirectory;
    private long logId;
    private int writeBufferSize;
    private long preAllocSize;
    private FileChannelProvider provider;
    private ServerConfiguration conf;

    // parametri opzionali
    private Long position = START_OF_FILE;  // default start of file
    private int journalAlignSize = DEFAULT_JOURNAL_ALIGN_SIZE; // default on constructor
    private int formatVersionToWrite = DEFAULT_FORMAT_VERSION; // default version on constructor
    private boolean fRemoveFromPageCache = false; // default on constructor
    private Journal.BufferedChannelBuilder bcBuilder = Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER; // default on constructor
    private Long toReplaceLogId = null; // default on constructor

    public static JournalChannelBuilder aJournalChannelBuilder() {
        return new JournalChannelBuilder();
    }

    public JournalChannelBuilder withJournalDirectory(File  journalDirectory) {
        this.journalDirectory = journalDirectory;
        return this;
    }

    public JournalChannelBuilder withLogId(long logId) {
        this.logId = logId;
        return this;
    }

    public JournalChannelBuilder withWriteBufferSize(int writeBufferSize) {
        this.writeBufferSize = writeBufferSize;
        return this;
    }

    public JournalChannelBuilder withPreAllocSize(long preAllocSize) {
        this.preAllocSize = preAllocSize;
        return this;
    }

    public JournalChannelBuilder withRemoveFromPageCache(boolean removeFromPageCache) {
        this.fRemoveFromPageCache = removeFromPageCache;
        return this;
    }

    public JournalChannelBuilder withProvider(FileChannelProvider provider) {
        this.provider = provider;
        return this;
    }

    public JournalChannelBuilder withConf(ServerConfiguration conf) {
        this.conf = conf;
        return this;
    }

    public JournalChannelBuilder withPosition(long position) {
        this.position = position;
        return this;
    }

    public JournalChannelBuilder withJournalAlignSize(int journalAlignSize) {
        this.journalAlignSize = journalAlignSize;
        return this;
    }

    public JournalChannelBuilder withFormatVersionToWrite(int formatVersionToWrite) {
        this.formatVersionToWrite = formatVersionToWrite;
        return this;
    }

    public JournalChannelBuilder withBufferedChannelBuilder(Journal.BufferedChannelBuilder bcBuilder) {
        this.bcBuilder = bcBuilder;
        return this;
    }

    public JournalChannelBuilder withToReplaceLogId(Long toReplaceLogId) {
        this.toReplaceLogId = toReplaceLogId;
        return this;
    }

    public JournalChannelBuilder withFRemoveFromPageCache(boolean fRemoveFromPageCache) {
        this.fRemoveFromPageCache = fRemoveFromPageCache;
        return this;
    }

    public JournalChannel build() throws IOException {
        // controllo se la configurazione dei parametri è permessa da uno dei costruttori pubblici
        if (position != START_OF_FILE && (journalAlignSize != DEFAULT_JOURNAL_ALIGN_SIZE || formatVersionToWrite != DEFAULT_FORMAT_VERSION || bcBuilder != Journal.BufferedChannelBuilder.DEFAULT_BCBUILDER || toReplaceLogId != null || fRemoveFromPageCache != false)) {
            throw new InvalidBuilderParameterException("Non sono disponibili costruttori che possano inizializzare la classe JournalChannel con questi parametri");
        }
        JournalChannel jc = null;
        // scelgo quale costruttore utilizzare in base alla definizione dei parametri
        if (position != START_OF_FILE) {
            jc = new JournalChannel(
                    journalDirectory,
                    logId,
                    preAllocSize,
                    writeBufferSize,
                    position,
                    conf,
                    provider
            );
        } else {
            jc = new JournalChannel(
                    journalDirectory,
                    logId,
                    preAllocSize,
                    writeBufferSize,
                    journalAlignSize,
                    fRemoveFromPageCache,
                    formatVersionToWrite,
                    bcBuilder,
                    conf,
                    provider,
                    toReplaceLogId
            );
        }
        return jc;
    }
}
