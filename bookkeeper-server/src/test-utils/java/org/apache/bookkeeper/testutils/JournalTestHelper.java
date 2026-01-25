package org.apache.bookkeeper.testutils;

import org.apache.bookkeeper.bookie.*;
import org.apache.bookkeeper.conf.ServerConfiguration;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JournalTestHelper {

    private static final byte[] MAGIC_WORD = "BKLG".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    public static final int START_OF_FILE = -12345;
    private static final int SECTOR_SIZE = 512;
    private static final int VERSION_HEADER_SIZE = 8; // Magic(4) + Version(4)

    /**
     * Crea un Mock di BufferedChannel configurato (Stub).
     * * @param positionToReturn La posizione che il canale deve simulare di avere.
     * @return Un mock di BufferedChannel "sicuro".
     */
    public static BufferedChannel createBufferedChannelStub(long initialPosition) throws IOException {
        BufferedChannel bc = mock(BufferedChannel.class);
        // Simulazione stato: ritorna la posizione richiesta
        when(bc.position()).thenReturn(initialPosition);
        // Simulazione azione: forceWrite ritorna la posizione corrente
        when(bc.forceWrite(anyBoolean())).thenReturn(initialPosition);
        return bc;
    }

    /**
     * Crea un Mock di BufferedChannelBuilder.
     * * @param channelToReturn Il canale che il builder deve restituire quando viene chiamato create().
     * @return Un builder mockato.
     */
    public static Journal.BufferedChannelBuilder createBuilder(BufferedChannel mockToReturn) throws IOException {
        Journal.BufferedChannelBuilder builder = mock(Journal.BufferedChannelBuilder.class);
        when(builder.create(any(FileChannel.class), anyInt())).thenAnswer(invocation -> {
            // L'argomento 0 è il FileChannel, l'argomento 1 è la capacity (int)
            int capacity = invocation.getArgument(1);
            if (capacity <= 0) {
                // Simuliamo il comportamento reale o desiderato in caso di configurazione errata
                throw new IOException("Capacity must be strict positive. Received: " + capacity);
            }
            // Se la validazione passa, restituiamo il mock previsto
            return mockToReturn;
        });
        return builder;
    }

    /**
     * Restituisce l'implementazione REALE di FileChannelProvider.
     */
    public static FileChannelProvider createRealProvider() {
        return new DefaultFileChannelProvider();
    }

    /**
     * Crea un Mock di FileChannelProvider configurato per restituire un
     * Mock di BookieFileChannel, che a sua volta restituisce il FileChannel desiderato.
     * * @param channelToReturn Il FileChannel finale (o null).
     * @return Il provider mockato.
     */
    public static FileChannelProvider createMockProvider(FileChannel channelToReturn, boolean fileExistsReturn) throws IOException {
        // Mockiamo il Provider
        FileChannelProvider provider = mock(FileChannelProvider.class);
        // Mockiamo l'oggetto intermedio BookieFileChannel
        BookieFileChannel bookieChannel = mock(BookieFileChannel.class);
        // Configuriamo il BookieFileChannel per restituire il nostro FileChannel finale
        when(bookieChannel.getFileChannel()).thenReturn(channelToReturn);
        // Configuriamo il BookieFileChannel per restituire fileExistsReturn
        when(bookieChannel.fileExists(any(File.class))).thenReturn(fileExistsReturn);
        // Configuriamo il riuso
        when(provider.supportReuseFile()).thenReturn(true);
        // Configuriamo il Provider per restituire il BookieFileChannel mockato
        when(provider.open(any(File.class), any(ServerConfiguration.class)))
                .thenReturn(bookieChannel);
        return provider;
    }

    /**
     * Crea un Mock di FileChannelProvider che LANCIA un'eccezione all'apertura.
     * Per simulare errori di I/O nel provider.
     */
    public static FileChannelProvider createFailingProvider(Class<? extends Throwable> exceptionClass) throws IOException {
        FileChannelProvider provider = mock(FileChannelProvider.class);
        when(provider.open(any(File.class), any(ServerConfiguration.class)))
                .thenThrow(exceptionClass);
        return provider;
    }

    /**
     * Restituisce la dimensione in byte dell'header per una data versione.
     */
    public static int getHeaderSize(int version) {
        // V1 (Legacy): Nessun header
        if (version == 1) {
            return 0;
        }
        // V4 o inferiore: Header Compatto (Magic + Version = 8 byte)
        // V5 o superiore: Header Allineato al Settore (512 byte)
        return (version < 5) ? VERSION_HEADER_SIZE : SECTOR_SIZE;
    }

    /**
     * Genera l'array di byte esatto che ci aspettiamo di trovare nell'header
     * per una determinata versione.
     * Serve come "Oracolo" per verificare la correttezza della scrittura.
     */
    public static byte[] generateExpectedHeaderBytes(int version) {
        int size = getHeaderSize(version);

        if (size == 0) {
            return new byte[0];
        }

        ByteBuffer bb = ByteBuffer.allocate(size);
        bb.put(MAGIC_WORD);
        bb.putInt(version);
        // Il resto è padding automatico (zeri) fino a 'size'
        return bb.array();
    }

    /**
     * Genera un Header "Corrotto" (Bad Magic Word).
     * Mantiene la struttura corretta (lunghezza, versione) ma cambia la firma.
     */
    public static byte[] generateBadMagicWordHeader(int version) {
        int size = getHeaderSize(version);
        if (size == 0) return new byte[0]; // Impossibile corrompere un header che non esiste (V1)

        ByteBuffer bb = ByteBuffer.allocate(size);
        // INIEZIONE ERRORE: Scriviamo "FAIL" invece di "BKLG"
        bb.put("FAIL".getBytes(java.nio.charset.StandardCharsets.UTF_8));
        bb.putInt(version);

        return bb.array();
    }

    /**
     * CORE METHOD: Scrive byte crudi (raw) su disco.
     * Agnostico rispetto al contenuto: accetta header corretti, corrotti o nulli.
     */
    public static void createJournalFileWithRawHeader(File file, byte[] rawHeader, byte[] content) throws IOException {
        try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(file, "rw")) {
            // 1. Scriviamo l'header passato (qualunque esso sia)
            if (rawHeader != null && rawHeader.length > 0) {
                raf.write(rawHeader);
            }
            // 2. Scriviamo il contenuto (payload)
            if (content != null && content.length > 0) {
                raf.write(content);
            }
        }
    }

    /**
     * WRAPPER: Scrive un Journal File corretto e standard.
     * Usa generateExpectedHeaderBytes + createJournalFileWithRawHeader.
     */
    public static void createJournalFileWithJournalHeader(File file, int version, byte[] content) throws IOException {
        byte[] validHeader = generateExpectedHeaderBytes(version);
        createJournalFileWithRawHeader(file, validHeader, content);
    }

    /**
     * WRAPPER: Scrive un Journal File con versione futura (es. 7).
     */
    public static void writeFutureVersion(File file) throws IOException {
        // Riutilizza semplicemente il wrapper standard con un ID alto
        createJournalFileWithJournalHeader(file, 7, "FutureContent".getBytes());
    }
}