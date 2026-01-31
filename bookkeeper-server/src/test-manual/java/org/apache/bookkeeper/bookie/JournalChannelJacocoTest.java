package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.testutils.JournalTestHelper;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class JournalChannelJacocoTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * TEST SCENARIO: Simulazione di una Race Condition (Conflitto di Concorrenza).
     * * Questo test riproduce lo scenario in cui due processi Bookie (o un processo zombie)
     * tentano di acquisire lo stesso Log ID quasi contemporaneamente.
     * * Il flusso simulato è:
     * 1. (Time-Of-Check) Il JournalChannel chiede al Provider se il file esiste:
     * Risposta: NO (simulato dal Mock).
     * 2. (Interferenza Esterna) Un altro processo crea silenziosamente il file su disco
     * mentre il JournalChannel sta elaborando la risposta precedente.
     * 3. (Time-Of-Use) Il JournalChannel tenta di eseguire `createNewFile()`:
     * Risultato: FALLIMENTO (il file esiste già fisicamente).
     * * OBIETTIVO: Verificare che il sistema rilevi questa anomalia (file apparso dal nulla)
     * e blocchi l'avvio lanciando un'eccezione, prevenendo potenziali corruzioni dati o
     * conflitti di scrittura.
     */
    @Test
    public void testConstructor_RaceCondition_FileAppearsSuddenly() throws IOException {
        // OBIETTIVO: Coprire il ramo "if (!fn.createNewFile())" che lancia l'IOException
        // con il messaggio "suddenly appeared".

        long logId = 10L;
        File journalDir = folder.getRoot();
        File phantomFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        // Creiamo il file su disco.
        // Questo farà sì che fn.createNewFile() ritorni FALSE (perché esiste già).
        boolean created = phantomFile.createNewFile();
        if (!created) {
            throw new IOException("Errore nel setup del test: impossibile creare il file fantasma");
        }

        // Configuriamo il Mock per far restituire che il file non esiste.
        BookieFileChannel mockBookieChannel = mock(BookieFileChannel.class);
        when(mockBookieChannel.fileExists(any(File.class))).thenReturn(false);
        // Configuriamo il getFileChannel
        when(mockBookieChannel.getFileChannel()).thenReturn(mock(java.nio.channels.FileChannel.class));
        // Mockiamo il Provider per restituire il nostro canale
        FileChannelProvider mockProvider = mock(FileChannelProvider.class);
        when(mockProvider.open(any(File.class), any(ServerConfiguration.class)))
                .thenReturn(mockBookieChannel);

        // Dipendenze
        ServerConfiguration conf = new ServerConfiguration();
        BufferedChannel mockBC = JournalTestHelper.createBufferedChannelStub(0L);
        Journal.BufferedChannelBuilder bcBuilder = JournalTestHelper.createBuilder(mockBC);

        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    mockProvider,
                    null
            );
        })
                .as("Deve lanciare IOException se createNewFile() fallisce dopo che fileExists() ha detto che il file mancava")
                .isInstanceOf(IOException.class);
    }

    /**
     * TEST SCENARIO: Riuso richiesto ma non supportato dal Provider.
     * * Questo test copre la condizione in cui `provider.supportReuseFile()` restituisce FALSE.
     * * Scenario:
     * 1. Esiste un vecchio file (Log 10).
     * 2. Creiamo un nuovo JournalChannel (Log 20) chiedendo di rimpiazzare il Log 10.
     * 3. MA il Provider è configurato per dire "Non supporto il riuso".
     * * Risultato Atteso:
     * - Il blocco di rinomina viene saltato.
     * - Il vecchio file (Log 10) rimane intatto al suo posto.
     * - Il nuovo file (Log 20) viene creato da zero (standard creation).
     */
    @Test
    public void testReuse_WhenProviderDoesNotSupportIt_ShouldSkipRenameAndCreateNewFile() throws IOException {
        // SETUP
        long oldLogId = 10L;
        long newLogId = 20L;

        File oldFile = new File(folder.getRoot(), Long.toHexString(oldLogId) + ".txn");
        File newFile = new File(folder.getRoot(), Long.toHexString(newLogId) + ".txn");

        // Creiamo il vecchio file con dei dati
        JournalTestHelper.createJournalFileWithJournalHeader(oldFile, 6, "DatiVecchi".getBytes());
        long oldFileSize = oldFile.length();

        // SPY
        // Usiamo uno Spy per mantenere la logica reale di I/O (open, read, write) ma sovrascrivere solo il flag di supporto.
        FileChannelProvider spyProvider = spy(new DefaultFileChannelProvider());
        // Forziamo il provider a dire "NO" al riuso.
        // Questo rende falsa la condizione a riga 164: (&& provider.supportReuseFile())
        doReturn(false).when(spyProvider).supportReuseFile();

        ServerConfiguration conf = new ServerConfiguration();
        BufferedChannel mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        Journal.BufferedChannelBuilder bcBuilder = JournalTestHelper.createBuilder(mockBc);

        // ACTION
        try (JournalChannel jc = new JournalChannel(
                folder.getRoot(),
                newLogId,
                1024L,
                1024,
                512,
                false,
                6,
                bcBuilder,
                conf,
                spyProvider, // Passiamo il provider che nega il supporto
                oldLogId     // Chiediamo comunque il riuso
        )) {

            // A. Verifica che il vecchio file NON sia stato toccato
            // Se il riuso fosse avvenuto, questo file non esisterebbe più (sarebbe stato rinominato).
            assertThat(oldFile)
                    .as("Il vecchio file deve rimanere intatto perché il riuso è disabilitato dal provider")
                    .exists()
                    .hasSize(oldFileSize);

            // B. Verifica che il nuovo file sia stato creato ex-novo
            assertThat(newFile)
                    .as("Il nuovo file deve essere stato creato indipendentemente")
                    .exists();

            // Verifica che sia un file corretto strutturalmente (Header + Padding standard)
            // e non contenga i dati del vecchio file.
            try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(newFile, "r")) {
                assertThat(raf.length()).isEqualTo(1024L); // PreAlloc Size
                raf.seek(512);
                byte[] buffer = new byte[512];
                raf.readFully(buffer);
                assertThat(buffer).containsOnly((byte) 0); // Solo zeri, niente "DatiVecchi"
            }
        }
    }

    /**
     * TEST SCENARIO: Branch Coverage (formatVersion < MIN_COMPAT_JOURNAL_FORMAT_VERSION).
     * * Il codice contiene: if (formatVersion < MIN_COMPAT_JOURNAL_FORMAT_VERSION || ...)
     * MIN_COMPAT è 1.
     * * Setup:
     * 1. Creiamo un file con Magic Word "BKLG" (corretta).
     * 2. Inseriamo versione 0.
     * 3. Ci aspettiamo IOException perché 0 < 1.
     */
    @Test
    public void testOpenExisting_VersionTooLow_ShouldThrowIOException() throws IOException {
        // 1. SETUP
        File journalDir = folder.getRoot();
        ServerConfiguration serverConfiguration = new ServerConfiguration();

        // Usiamo il Provider REALE perché stiamo scrivendo file veri su disco
        // e vogliamo che il JournalChannel li legga veramente.
        FileChannelProvider provider = JournalTestHelper.createRealProvider();

        // Mockiamo il builder (anche se in lettura non viene usato, è richiesto dal costruttore)
        BufferedChannel stubBc = JournalTestHelper.createBufferedChannelStub(0L);
        Journal.BufferedChannelBuilder bcBuilder = JournalTestHelper.createBuilder(stubBc);
        long logId = 100L;
        File journalFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        // costruzione header invalido (Versione 0)
        byte[] badHeader = JournalTestHelper.generateExpectedHeaderBytes(0);
        JournalTestHelper.createJournalFileWithRawHeader(journalFile, badHeader, "DummyPayload".getBytes());

        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    bcBuilder,
                    serverConfiguration,
                    provider,
                    null
            );
        })
                .as("Deve lanciare IOException se la versione letta (0) è inferiore al minimo supportato (1)")
                .isInstanceOf(IOException.class)
                .hasMessageContaining("Invalid journal version")
                .hasMessageContaining("got (0)"); // Verifica precisa del valore letto
    }

    /**
     * TEST SCENARIO: Branch Coverage (formatVersion > CURRENT_JOURNAL_FORMAT_VERSION).
     * * Il codice contiene: if (... || formatVersion > CURRENT_JOURNAL_FORMAT_VERSION)
     * CURRENT è 6.
     * * Setup:
     * 1. Creiamo un file con Magic Word "BKLG" (corretta).
     * 2. Inseriamo versione 99.
     * 3. Ci aspettiamo IOException perché 99 > 6.
     */
    @Test
    public void testOpenExisting_VersionTooHigh_ShouldThrowIOException() throws IOException {
        // 1. SETUP
        File journalDir = folder.getRoot();
        ServerConfiguration serverConfiguration = new ServerConfiguration();

        // Usiamo il Provider REALE perché stiamo scrivendo file veri su disco
        // e vogliamo che il JournalChannel li legga veramente.
        FileChannelProvider provider = JournalTestHelper.createRealProvider();

        // Mockiamo il builder (anche se in lettura non viene usato, è richiesto dal costruttore)
        BufferedChannel stubBc = JournalTestHelper.createBufferedChannelStub(0L);
        Journal.BufferedChannelBuilder bcBuilder = JournalTestHelper.createBuilder(stubBc);
        long logId = 100L;
        File journalFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        // costruzione header invalido (Versione 0)
        byte[] badHeader = JournalTestHelper.generateExpectedHeaderBytes(7);
        JournalTestHelper.createJournalFileWithRawHeader(journalFile, badHeader, "DummyPayload".getBytes());

        // 2. ACTION & ASSERTION
        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1024,
                    512,
                    false,
                    6,
                    bcBuilder,
                    serverConfiguration,
                    provider,
                    null
            );
        })
                .as("Deve lanciare IOException se la versione letta (7) è superiore al massimo supportato (6)")
                .isInstanceOf(IOException.class)
                .hasMessageContaining("Invalid journal version")
                .hasMessageContaining("got (7)");
    }

    /**
     * TEST SCENARIO: Eccezione durante il posizionamento (Seek).
     * * Obiettivo: Coprire il blocco catch(IOException e) che avvolge le chiamate a fc.position().
     * * Scenario:
     * 1. Il Provider restituisce un Mock del FileChannel.
     * 2. Simuliamo che il file esista (fileExists = true).
     * 3. Quando il costruttore prova a posizionarsi (fc.position), il Mock lancia un'eccezione.
     * * Risultato Atteso:
     * - L'eccezione viene catturata, loggata e rilanciata.
     */
    @Test
    public void testConstructor_WhenSeekFails_ShouldThrowIOException() throws IOException {
        // 1. SETUP DEL MOCK
        // Creiamo un FileChannel che fallisce quando si tenta di cambiare posizione
        java.nio.channels.FileChannel mockFc = mock(java.nio.channels.FileChannel.class);
        doThrow(new IOException("Simulated Disk Seek Failure")).when(mockFc).position(anyLong());

        // Configuriamo il BookieFileChannel per restituire il nostro FileChannel "rotto"
        // e per dire che il file ESISTE (altrimenti non entra nel ramo di lettura/seek)
        BookieFileChannel mockBookieChannel = mock(BookieFileChannel.class);
        when(mockBookieChannel.getFileChannel()).thenReturn(mockFc);
        when(mockBookieChannel.fileExists(any(File.class))).thenReturn(true);

        // Configuriamo il Provider per restituire il BookieFileChannel
        FileChannelProvider mockProvider = mock(FileChannelProvider.class);
        when(mockProvider.open(any(File.class), any(ServerConfiguration.class)))
                .thenReturn(mockBookieChannel);

        // Dipendenze accessorie
        ServerConfiguration conf = new ServerConfiguration();
        BufferedChannel mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        Journal.BufferedChannelBuilder bcBuilder = JournalTestHelper.createBuilder(mockBc);
        long logId = 500L;

        // 2. ACTION & ASSERTION
        assertThatThrownBy(() -> {
            new JournalChannel(
                    folder.getRoot(),
                    logId,
                    1024L,
                    1024,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    mockProvider, // Iniettiamo il provider mockato
                    null
            );
        })
                .as("Il costruttore deve rilanciare l'IOException generata durante il posizionamento (seek)")
                .isInstanceOf(IOException.class)
                .hasMessageContaining("Simulated Disk Seek Failure");

        // VERIFICA AGGIUNTIVA
        // Confermiamo che il codice abbia effettivamente tentato di fare il seek
        verify(mockFc, atLeastOnce()).position(anyLong());
    }
}
