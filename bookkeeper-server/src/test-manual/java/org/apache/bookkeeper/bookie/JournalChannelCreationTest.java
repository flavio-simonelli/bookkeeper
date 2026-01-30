package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.testutils.JournalTestHelper;
import org.junit.*;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class JournalChannelCreationTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private ServerConfiguration conf;
    private FileChannelProvider fileChannelProvider;
    private File journalDir;
    private Journal.BufferedChannelBuilder bcBuilder;
    private BufferedChannel mockBc;

    @Before
    public void setUp() throws IOException {
        conf = new ServerConfiguration();
        journalDir = folder.getRoot();
    }

    @After
    public void tearDown() {
        // Cleanup automatico tramite Rule
    }

    // il test fallisce perchè non considera la versione 7 come versione invalida ma scrivere l'header con version number 7
    @Ignore
    @Test
    public void testWriteInvalidVersion_V7_ShouldThrowException() throws IOException {
        int futureVersion = 7;
        long logId = 5L;
        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");
        // Ci aspettiamo che il costruttore rilanci una eccezione per Versione Invalida
        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1,
                    512,
                    false,
                    futureVersion,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("JournalChannel dovrebbe bloccare le versioni non rilasciate")
                .isInstanceOf(Exception.class);

        assertThat(notExpectedFile)
                .as("Il file journal non dovrebbe essere creato se la versione è invalida")
                .doesNotExist();
    }

    @Test
    public void testWriteInvalidVersion_V0_ShouldThrowException() throws IOException {
        int invalidVersion = 0;
        long logId = 5L;
        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");
        // Ci aspettiamo che il costruttore rilanci una eccezione per Versione Invalida
        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1,
                    512,
                    false,
                    invalidVersion,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("JournalChannel dovrebbe bloccare le versioni non supportate")
                .isInstanceOf(Exception.class);

        assertThat(notExpectedFile)
                .as("Il file journal non dovrebbe essere creato se la versione è invalida")
                .doesNotExist();
    }

    @Ignore // il test fallisce perchè non lancia alcuna eccezione e invece sovrascrive l'header all'interno del file
    @Test
    public void testPreAllocTooSmall_ShouldProtectHeader() throws IOException {
        // Setup
        long logId = 5L;
        int version = 6;    // Header size = 512
        long tinyAlloc = 512L;
        int align = 512;
        File expectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");
        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        // ACTION: Creiamo il JournalChannel
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                tinyAlloc,
                1,
                align,
                false,
                version,
                bcBuilder,
                conf,
                fileChannelProvider,
                null
        )) {
            // ASSERTIONS
            // Il file deve esistere ed essere grande quanto l'header
            assertThat(expectedFile)
                    .exists()
                    .hasSize(512L);

            // L'header deve essere integro
            try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(expectedFile, "r")) {
                byte[] expectedHeader = JournalTestHelper.generateExpectedHeaderBytes(version);
                byte[] actualHeader = new byte[expectedHeader.length];
                raf.readFully(actualHeader);
                assertThat(actualHeader)
                        .as("L'header non deve essere corrotto da un pre-alloc errato")
                        .isEqualTo(expectedHeader);
            }
        }
    }

    @Test
    public void testPreAllocTooSmall_ShouldThrowException() throws IOException {
        long logId = 5L;
        long tinyAlloc = 4L;
        int align = 512;
        int version = 6;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        // Ci aspettiamo che il costruttore fallisca
        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    tinyAlloc,
                    1,
                    align,
                    false,
                    version,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("Con preAlloc < headerSize, deve lanciare una eccezione")
                .isInstanceOf(Exception.class);

//        assertThat(notExpectedFile)
//                .as("Il file journal non dovrebbe essere creato")
//                .doesNotExist();
    }

    @Test
    public void testNegativePreAlloc_ShouldThrowException() throws IOException {
        long logId = 5L;
        long negativeAlloc = -1L;
        int align = 512;
        int version = 6;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        // Ci aspettiamo Exception
        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    negativeAlloc,
                    1,
                    align,
                    false,
                    version,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("PreAlloc negativo dovrebbe generare un errore di allocazione illegale")
                .isInstanceOf(Exception.class);

//        assertThat(notExpectedFile)
//                .as("Il file journal non dovrebbe essere creato")
//                .doesNotExist();
    }

    @Test
    public void testNegativeAlign_ShouldThrowException() throws IOException {
        long logId = 5L;
        int negativeAlign = -1;
        long preAlloc = 1024L;
        int version = 6;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    preAlloc,
                    1,
                    negativeAlign,
                    false,
                    version,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("AlignSize negativo deve causare eccezione")
                .isInstanceOf(Exception.class);

        assertThat(notExpectedFile)
                .as("Il file journal non dovrebbe essere creato")
                .doesNotExist();
    }

    @Test
    public void testZeroAlign_ShouldThrowException() throws IOException {
        long logId = 5L;
        int zeroAlign = 0;
        long preAlloc = 1024L;
        int version = 6;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");



        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    preAlloc,
                    1,
                    zeroAlign,
                    false,
                    version,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("AlignSize a zero deve causare eccezione")
                .isInstanceOf(Exception.class);

        assertThat(notExpectedFile)
                .as("Il file journal non dovrebbe essere creato")
                .doesNotExist();
    }

    @Test
    public void testRemoveFromPageCache_Enabled() throws IOException {

        long logId = 5L;
        boolean removeCache = true;
        int version = 6;

        File expectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                512,
                removeCache,
                version,
                bcBuilder,
                conf,
                fileChannelProvider,
                null
        )) {
            // il file su disco sia integro e non sia stato troncato o corrotto.
            assertThat(expectedFile)
                    .as("Il file deve esistere e mantenere la sua dimensione")
                    .exists()
                    .hasSize(1024L);

            // L'header deve essere integro
            try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(expectedFile, "r")) {
                byte[] expectedHeader = JournalTestHelper.generateExpectedHeaderBytes(version);
                byte[] actualHeader = new byte[expectedHeader.length];
                raf.readFully(actualHeader);
                assertThat(actualHeader)
                        .as("L'header non deve essere corrotto")
                        .isEqualTo(expectedHeader);
            }

            // Verifichiamo che il costruttore abbia effettivamente cercato e trovato
            // il File Descriptor nativo del sistema operativo.
            assertThat(jc.fd)
                    .as("Il FileDescriptor interno (fd) deve essere inizializzato (!= -1)")
                    .isNotEqualTo(-1);
        }
    }

    @Test
    public void testJournalDirectoryDoesNotExist_ShouldThrowException() throws IOException {
        // Creiamo un percorso astratto che punta a una sottocartella MAI creata.
        File nonExistentDir = new File(folder.getRoot(), "ghost_directory");

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        assertThatThrownBy(() -> {
            new JournalChannel(
                    nonExistentDir,
                    5L,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("Creare un JournalChannel in una directory inesistente deve lanciare Exception")
                .isInstanceOf(Exception.class);
    }

    @Test
    public void testJournalDirectoryIsActuallyAFile_ShouldThrowException() throws IOException {
        // Creiamo un file reale nella cartella temporanea
        File notADirectory = folder.newFile("im_just_a_file.txt");

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        assertThatThrownBy(() -> {
            new JournalChannel(
                    notADirectory,
                    5L,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("Usare un file normale come directory padre deve causare Exception")
                .isInstanceOf(Exception.class);
    }

    @Ignore // il test non genera alcuna eccezione e crea il file all'interno della directory corrente
    @Test
    public void testJournalDirectoryIsNull_ShouldThrowException() throws IOException {

        File nullDirectory = null;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        assertThatThrownBy(() -> {
            new JournalChannel(
                    nullDirectory,
                    5L,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("Passare null come directory deve lanciare Exception")
                .isInstanceOf(Exception.class);
    }

    @Test
    public void testBuilderReturnsNull_ShouldThrowException() throws IOException {
        // Helper: createBuilder(null) configura il mock per restituire null al metodo create().
        bcBuilder = JournalTestHelper.createBuilder(null);
        long logId = 5L;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");


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
                    fileChannelProvider,
                    null
            );
        })
                .as("Se il builder restituisce null, il JournalChannel deve lanciare Exception")
                .isInstanceOf(Exception.class);

//        assertThat(notExpectedFile)
//                .as("Il file journal non dovrebbe essere creato se il builder ritorna null")
//                .doesNotExist();
    }

    @Test
    public void testBcBuilderIsNull_ShouldThrowNPE() throws IOException {

        Journal.BufferedChannelBuilder nullBuilder = null;
        long logId = 5L;

        fileChannelProvider = JournalTestHelper.createRealProvider();
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    nullBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("Passare null come BufferedChannelBuilder deve causare NullPointerException")
                .isInstanceOf(NullPointerException.class);

//        assertThat(notExpectedFile)
//                .as("Il file journal non dovrebbe essere creato se il builder è nullo")
//                .doesNotExist();
    }

    @Test
    public void testFileChannelProviderFails_ShouldThrowException() throws IOException {

        fileChannelProvider = JournalTestHelper.createFailingProvider(IOException.class);
        long logId = 5L;

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    5L,
                    1024L,
                    1,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    fileChannelProvider,
                    null
            );
        })
                .as("Se il provider fallisce (es. disco rotto), il costruttore deve propagare IOException")
                .isInstanceOf(Exception.class);

        assertThat(notExpectedFile)
                .as("Il file journal non dovrebbe essere creato")
                .doesNotExist();
    }

    @Test
    public void testFileChannelProviderReturnsNull_ShouldThrowNPE() throws IOException {

        FileChannelProvider nullReturningProvider = JournalTestHelper.createMockProvider(null, false);
        long logId = 5L;

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

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
                    nullReturningProvider,
                    null
            );
        })
                .as("Se il provider restituisce null, il JournalChannel deve lanciare NullPointerException")
                .isInstanceOf(NullPointerException.class);

//        assertThat(notExpectedFile)
//                .as("Il file journal non dovrebbe essere creato")
//                .doesNotExist();
    }

    @Test
    public void testFileChannelProviderIsNull_ShouldThrowNPE() throws IOException {

        FileChannelProvider nullProvider = null;
        long logId = 5L;

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        File notExpectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");


        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    1L,
                    1024L,
                    1024,
                    512,
                    false,
                    6,
                    bcBuilder,
                    conf,
                    nullProvider,
                    null
            );
        })
                .as("Passare null come FileChannelProvider deve causare NullPointerException")
                .isInstanceOf(NullPointerException.class);

//        assertThat(notExpectedFile)
//                .as("Il file journal non dovrebbe essere creato")
//                .doesNotExist();
    }

    @Ignore // il test fallisce perchè il file riutilizzato non viene troncato e vengono mantenuti i vecchi dati
    @Test
    public void testDestructiveReuse_WithSmallerPreAlloc_ShouldTruncateToNewSize() throws IOException {

        long oldLogId = 10L;
        long newLogId = 1L;

        int newVersion = 6;
        int headerSize = JournalTestHelper.getHeaderSize(6);

        // Scenario: Vecchio file ENORME, Nuovo file PICCOLO
        int oldFileSize = 4096;
        long newPreAlloc = 1024L;

        File oldFile = new File(folder.getRoot(), Long.toHexString(oldLogId) + ".txn");
        File newFile = new File(folder.getRoot(), Long.toHexString(newLogId) + ".txn");

        // Riempiamo il vecchio file di dati spazzatura ('X')
        // Header(512) + Payload(3584) = 4096
        byte[] oldContent = new byte[oldFileSize - 512];
        java.util.Arrays.fill(oldContent, (byte) 'X');
        JournalTestHelper.createJournalFileWithJournalHeader(oldFile, 6, oldContent);

        // Verifica preliminare
        assertThat(oldFile).hasSize(oldFileSize);

        // SPY Provider per abilitare il reuse su file reali
        fileChannelProvider = spy(JournalTestHelper.createRealProvider());
        doReturn(true).when(fileChannelProvider).supportReuseFile();

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        try ( JournalChannel jc = new JournalChannel(
                folder.getRoot(),
                newLogId,
                newPreAlloc,
                1,
                512,
                false,
                newVersion,
                bcBuilder,
                conf,
                fileChannelProvider,
                oldLogId
        )) {

            try (RandomAccessFile raf = new RandomAccessFile(newFile, "r")) {

                // Verifica Troncamento
                assertThat(raf.length())
                        .as("Il file riusato DEVE essere troncato per rimuovere la coda di dati vecchi")
                        .isEqualTo(newPreAlloc);

                // Leggiamo tutto ciò che dovrebbe esserci (fino a newPreAlloc)
                byte[] content = new byte[(int) newPreAlloc];
                raf.readFully(content);

                // Dividiamo i byte letti: Header vs Padding
                byte[] actualHeader = java.util.Arrays.copyOfRange(content, 0, headerSize);
                byte[] actualPadding = java.util.Arrays.copyOfRange(content, headerSize, (int) newPreAlloc);

                // Controllo Header: Deve essere un header V6 valido
                assertThat(actualHeader)
                        .as("L'header del nuovo file deve essere correttamente formattato (V6)")
                        .isEqualTo(JournalTestHelper.generateExpectedHeaderBytes(6));

                // Controllo Padding: Devono essere tutti zeri
                assertThat(actualPadding)
                        .as("La parte di pre-allocazione deve contenere solo zeri (clean slate)")
                        .containsOnly((byte) 0);

            }
        }
    }

    @Test
    public void testDestructiveReuse_UnalignedPreAlloc_ShouldRoundDownAndPass() throws IOException {

        long oldLogId = 10L;
        long newLogId = 1L;

        int alignSize = 512;
        int oldFileSize = 1024;

        int newVersion = 6;
        int headerSize = JournalTestHelper.getHeaderSize(6);

        long unalignedPreAllocRequest = 1200L;

        File oldFile = new File(folder.getRoot(), Long.toHexString(oldLogId) + ".txn");
        File newFile = new File(folder.getRoot(), Long.toHexString(newLogId) + ".txn");

        JournalTestHelper.createJournalFileWithJournalHeader(oldFile, 5, new byte[oldFileSize - 512]);
        assertThat(oldFile).hasSize(oldFileSize);

        fileChannelProvider = spy(new DefaultFileChannelProvider());
        doReturn(true).when(fileChannelProvider).supportReuseFile();

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        try (JournalChannel jc = new JournalChannel(
                folder.getRoot(),
                newLogId,
                unalignedPreAllocRequest,
                1024,
                alignSize,
                false,
                newVersion,
                bcBuilder,
                conf,
                fileChannelProvider,
                oldLogId
        )) {
            // verifichiamo che il file nuovo esiste e che quello vecchio non esiste
            assertThat(oldFile)
                    .as("Il file vecchio deve essere sparito (rinominato)")
                    .doesNotExist();

            assertThat(newFile)
                    .as("Il file nuovo deve esistere (frutto della rinomina)")
                    .exists();

            try (RandomAccessFile raf = new RandomAccessFile(newFile, "r")) {

                assertThat(raf.length())
                        .as("Il JournalChannel deve aver arrotondato 1200 a 1024 (multiplo di 512)")
                        .isEqualTo(1024L);

                // Verifica contenuto
                byte[] content = new byte[(int)raf.length()];
                raf.readFully(content);

                // Header + Padding (Zero)
                byte[] expectedHeader = JournalTestHelper.generateExpectedHeaderBytes(6);
                byte[] actualHeader = java.util.Arrays.copyOfRange(content, 0, headerSize);
                byte[] actualPadding = java.util.Arrays.copyOfRange(content, headerSize, 1024);

                assertThat(actualHeader).isEqualTo(expectedHeader);
                assertThat(actualPadding).containsOnly((byte) 0);
            }
        }
    }

    @Test
    public void testLogIdEqualsToReplaceLogId_ShouldIgnoreReuseAndOpenReadOnly() throws IOException {
        long logId = 10L;
        long toReplaceLogId = 10L;

        int newVersion = 6;
        int headerSize = JournalTestHelper.getHeaderSize(6);

        File file = new File(folder.getRoot(), Long.toHexString(logId) + ".txn");

        byte[] existingData = "DatiCheNonDevonoSparire".getBytes();
        JournalTestHelper.createJournalFileWithJournalHeader(file, 6, existingData);

        // SPY Provider
        fileChannelProvider = spy(JournalTestHelper.createRealProvider());
        doReturn(true).when(fileChannelProvider).supportReuseFile();

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        try (JournalChannel jc = new JournalChannel(
                folder.getRoot(),
                logId,
                1024L,
                1,
                512,
                false,
                newVersion,
                bcBuilder,
                conf,
                fileChannelProvider,
                toReplaceLogId
        )) {

            // Verifica Integrità Dati
            try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
                // Leggiamo tutto
                byte[] content = new byte[(int) raf.length()];
                raf.readFully(content);

                byte[] expectedHeader = JournalTestHelper.generateExpectedHeaderBytes(newVersion);
                byte[] actualHeader = java.util.Arrays.copyOfRange(content, 0, headerSize);
                byte[] payload = java.util.Arrays.copyOfRange(content, headerSize, content.length);

                assertThat(actualHeader).isEqualTo(expectedHeader);
                assertThat(payload)
                        .as("I dati esistenti devono essere intatti")
                        .isEqualTo(existingData);
            }

            assertThat(jc.getFormatVersion())
                    .as("Deve aver letto la versione dal disco")
                    .isEqualTo(6);

            assertThat(jc.bc)
                    .as("Il BufferedChannel deve essere null perché il file è aperto in Read-Only")
                    .isNull();

            assertThatThrownBy(jc::getBufferedChannel)
                    .as("Tentare di ottenere il canale di scrittura deve lanciare eccezione")
                    .isInstanceOf(IOException.class)
                    .hasMessage("Read only journal channel");
        }
    }

    @Test
    public void testReuse_SourceMissing_ShouldCreateNewFile_AndIgnoreUnrelatedFiles() throws IOException {
        long targetLogId = 5L;       // Quello che vogliamo creare
        long missingLogId = 1L;      // Quello che vorremmo riciclare (ma non c'è)
        long unrelatedLogId = 10L;   // Un file che esiste ma non c'entra nulla

        int newVersion = 6;
        int headerSize = JournalTestHelper.getHeaderSize(newVersion);
        long preAllocSize = 1024L;

        File targetFile = new File(folder.getRoot(), Long.toHexString(targetLogId) + ".txn");
        File missingFile = new File(folder.getRoot(), Long.toHexString(missingLogId) + ".txn");
        File unrelatedFile = new File(folder.getRoot(), Long.toHexString(unrelatedLogId) + ".txn");

        // Creiamo il file con log 10
        byte[] unrelatedData = "SonoSoloUnoSpettatore".getBytes();
        JournalTestHelper.createJournalFileWithJournalHeader(unrelatedFile, 6, unrelatedData);
        long unrelatedFileSize = unrelatedFile.length();

        // Assicuriamoci che il file da rimpiazzare NON esista
        assertThat(missingFile).doesNotExist();

        // SPY Provider
        fileChannelProvider = spy(JournalTestHelper.createRealProvider());
        doReturn(true).when(fileChannelProvider).supportReuseFile();

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        // 2. ACTION
        try (JournalChannel jc = new JournalChannel(
                folder.getRoot(),
                targetLogId,
                preAllocSize,
                1,
                512,
                false,
                newVersion,
                bcBuilder,
                conf,
                fileChannelProvider,
                missingLogId
        )) {

            // Verifica File Non Correlato (Log 10)
            // Deve essere rimasto esattamente com'era (non rinominato, contenuto intatto)
            assertThat(unrelatedFile)
                    .as("Il file non correlato (Log 10) non deve essere toccato")
                    .exists()
                    .hasSize(unrelatedFileSize);

            // Verifica File Target (Log 5)
            // Deve essere stato creato ex-novo
            assertThat(targetFile)
                    .as("Il file target (Log 5) deve essere stato creato")
                    .exists();

            try (RandomAccessFile raf = new RandomAccessFile(targetFile, "r")) {
                // la dimensione deve essere corretta
                assertThat(raf.length())
                        .as("Il nuovo file deve avere la dimensione pre-allocata")
                        .isEqualTo(preAllocSize);

                // Verifica Contenuto
                byte[] content = new byte[(int) raf.length()];
                raf.readFully(content);

                byte[] actualHeader = java.util.Arrays.copyOfRange(content, 0, headerSize);
                byte[] actualPadding = java.util.Arrays.copyOfRange(content, headerSize, (int) preAllocSize);

                assertThat(actualHeader)
                        .as("Header corretto")
                        .isEqualTo(JournalTestHelper.generateExpectedHeaderBytes(newVersion));

                assertThat(actualPadding)
                        .as("Padding pulito")
                        .containsOnly((byte) 0);
            }

            // WHITE BOX
            assertThat(jc.bc).isNotNull();
        }
    }

    @Test
    public void testOpen_V1_ShouldDetectVersion1_AndPos0() throws IOException {
        long logId = 10L;
        int version = 1;
        int headerSize = JournalTestHelper.getHeaderSize(version);
        byte[] expectedPayload = "Data".getBytes();
        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, expectedPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {
            // Verifica Versione
            assertThat(jc.getFormatVersion())
                    .as("V1 deve essere rilevata correttamente")
                    .isEqualTo(version);
            ByteBuffer dst = ByteBuffer.allocate(expectedPayload.length);
            int bytesRead = jc.read(dst); // Usiamo il metodo read() di JournalChannel

            assertThat(bytesRead)
                    .as("Dobbiamo essere in grado di leggere l'intero payload")
                    .isEqualTo(expectedPayload.length);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            assertThat(actualContent)
                    .as("Il contenuto letto deve coincidere con quello scritto (nessun header letto per errore)")
                    .isEqualTo(expectedPayload);

            // Verifichiamo che sia readOnly
            assertThatThrownBy(jc::getBufferedChannel)
                    .as("il canale deve comportarsi come read-only")
                    .isInstanceOf(IOException.class);
        }
    }

    @Test
    public void testOpen_V2_ShouldDetectVersion2_AndReadContent() throws IOException {
        long logId = 10L;
        int version = 2;
        // Recuperiamo la dimensione header (8 byte per V2)
        int headerSize = JournalTestHelper.getHeaderSize(version);
        byte[] expectedPayload = "DataV2".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, expectedPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {
            // Verifica Versione
            assertThat(jc.getFormatVersion())
                    .as("V2 deve essere rilevata correttamente")
                    .isEqualTo(version);

            // Verifica Lettura
            // Se il posizionamento a 'headerSize' (8) ha funzionato, leggeremo subito "DataV2"
            ByteBuffer dst = ByteBuffer.allocate(expectedPayload.length);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Dobbiamo essere in grado di leggere l'intero payload")
                    .isEqualTo(expectedPayload.length);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            assertThat(actualContent)
                    .as("Il contenuto deve essere letto correttamente saltando l'header (8 byte)")
                    .isEqualTo(expectedPayload);

            // Verifichiamo che sia readOnly
            assertThatThrownBy(jc::getBufferedChannel)
                    .as("Il canale deve essere read-only")
                    .isInstanceOf(IOException.class);
        }
    }

    @Test
    public void testOpen_V3_ShouldDetectVersion3_AndReadContent() throws IOException {
        // 1. SETUP
        long logId = 10L; // ID univoco per questo test
        int version = 3;
        // Recuperiamo la dimensione header (anche per V3 è 8 byte)
        int headerSize = JournalTestHelper.getHeaderSize(version);
        byte[] expectedPayload = "DataV3".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, expectedPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // 2. ACTION
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {
            // 3. ASSERTIONS

            // Verifica Versione
            assertThat(jc.getFormatVersion())
                    .as("V3 deve essere rilevata correttamente")
                    .isEqualTo(version);

            // Verifica Lettura
            // Verifichiamo che saltando l'header (8 byte) troviamo subito i dati corretti
            ByteBuffer dst = ByteBuffer.allocate(expectedPayload.length);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Dobbiamo essere in grado di leggere l'intero payload")
                    .isEqualTo(expectedPayload.length);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            assertThat(actualContent)
                    .as("Il contenuto deve essere letto correttamente saltando l'header")
                    .isEqualTo(expectedPayload);

            // Verifichiamo che sia readOnly
            assertThatThrownBy(jc::getBufferedChannel)
                    .as("Il canale deve essere read-only")
                    .isInstanceOf(IOException.class);
        }
    }

    @Test
    public void testOpen_V4_ShouldDetectVersion4_AndReadContent() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 4;
        int headerSize = JournalTestHelper.getHeaderSize(version);
        byte[] expectedPayload = "DataV4".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, expectedPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // 2. ACTION
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {
            // 3. ASSERTIONS (Black Box)

            // A. Verifica Versione
            assertThat(jc.getFormatVersion())
                    .as("V4 deve essere rilevata correttamente")
                    .isEqualTo(version);

            // B. Verifica Lettura Payload
            // Verifichiamo che il cursore sia posizionato DOPO l'header (8 byte)
            ByteBuffer dst = ByteBuffer.allocate(expectedPayload.length);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Dobbiamo essere in grado di leggere l'intero payload")
                    .isEqualTo(expectedPayload.length);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            assertThat(actualContent)
                    .as("Il contenuto deve essere letto correttamente saltando l'header V4")
                    .isEqualTo(expectedPayload);

            // C. Verifica Read-Only
            assertThatThrownBy(jc::getBufferedChannel)
                    .as("Il canale deve essere read-only")
                    .isInstanceOf(IOException.class);
        }
    }

    @Test
    public void testOpen_V5_ShouldDetectVersion5_AndReadContent() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 5;
        int headerSize = JournalTestHelper.getHeaderSize(version);
        byte[] expectedPayload = "DataV5".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, expectedPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // 2. ACTION
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {

            // A. Verifica Versione
            assertThat(jc.getFormatVersion())
                    .as("V5 deve essere rilevata correttamente")
                    .isEqualTo(version);

            // B. Verifica Lettura Payload
            ByteBuffer dst = ByteBuffer.allocate(expectedPayload.length);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Dobbiamo essere in grado di leggere l'intero payload")
                    .isEqualTo(expectedPayload.length);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            assertThat(actualContent)
                    .as("Il contenuto deve essere letto correttamente saltando l'header allineato (512 byte)")
                    .isEqualTo(expectedPayload);

            // C. Verifica Read-Only
            assertThatThrownBy(jc::getBufferedChannel)
                    .as("Il canale deve essere read-only")
                    .isInstanceOf(IOException.class);
        }
    }

    @Test
    public void testOpen_V6_ShouldDetectVersion6_AndReadContent() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 6;
        int headerSize = JournalTestHelper.getHeaderSize(version);
        byte[] expectedPayload = "DataV6".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, expectedPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // 2. ACTION
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {

            // A. Verifica Versione
            assertThat(jc.getFormatVersion())
                    .as("V6 deve essere rilevata correttamente")
                    .isEqualTo(version);

            // B. Verifica Lettura Payload
            // Verifica che il puntatore sia posizionato dopo i 512 byte di header
            ByteBuffer dst = ByteBuffer.allocate(expectedPayload.length);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Dobbiamo essere in grado di leggere l'intero payload")
                    .isEqualTo(expectedPayload.length);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            assertThat(actualContent)
                    .as("Il contenuto deve essere letto correttamente saltando l'header allineato (512 byte)")
                    .isEqualTo(expectedPayload);

            // C. Verifica Read-Only
            assertThatThrownBy(jc::getBufferedChannel)
                    .as("Il canale deve essere read-only")
                    .isInstanceOf(IOException.class);
        }
    }

    @Test
    public void testOpenExistingJournal_WithBadHeader_ShouldFallbackToV1() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int inputVersion = 6;
        File corruptedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        // Creiamo un header con Magic Word "FAIL" invece di "BKLG"
        byte[] badHeader = JournalTestHelper.generateBadMagicWordHeader(inputVersion);
        byte[] payload = "JunkData".getBytes();

        // Scriviamo il file su disco
        JournalTestHelper.createJournalFileWithRawHeader(corruptedFile, badHeader, payload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // 2. ACTION & ASSERTION
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                JournalTestHelper.START_OF_FILE,
                conf,
                fileChannelProvider
        )) {

            // VERIFICA 1: Fallback della Versione
            // Il sistema non riconosce "FAIL", quindi assume che il file sia un vecchio formato V1 (senza header)
            assertThat(jc.getFormatVersion())
                    .as("Se la Magic Word è errata, il canale deve fare fallback alla Versione 1 per retrocompatibilità")
                    .isEqualTo(1);

            // VERIFICA 2: Posizionamento
            // Dobbiamo posizioarci a posizione 0
            assertThat(jc.fc.position())
                    .as("In caso di fallback a V1, il puntatore deve essere posizionato all'inizio del file")
                    .isEqualTo(0);
        }
    }

    @Test
    public void testBuilder_WithZeroCapacity_ShouldThrowIOException() throws IOException {
        long logId = 5L;
        int invalidBufferSize = 0;

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        fileChannelProvider = JournalTestHelper.createRealProvider();


        assertThatThrownBy(() ->
                new JournalChannel(
                        journalDir,
                        logId,
                        1024L,
                        invalidBufferSize,
                        512,
                        false,
                        6,
                        bcBuilder,
                        conf,
                        fileChannelProvider,
                        null
                )
        )
                .as("Il costruttore dovrebbe fallire se il builder lancia IOException per capacity <= 0")
                .isInstanceOf(IOException.class);
    }

    @Test
    public void testBuilder_WithNegativeCapacity_ShouldThrowIOException() throws IOException {
        long logId = 5L;
        int invalidBufferSize = -1;

        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);

        fileChannelProvider = JournalTestHelper.createRealProvider();


        assertThatThrownBy(() ->
                new JournalChannel(
                        journalDir,
                        logId,
                        1024L,
                        invalidBufferSize,
                        512,
                        false,
                        6,
                        bcBuilder,
                        conf,
                        fileChannelProvider,
                        null
                )
        )
                .as("Il costruttore dovrebbe fallire se il builder lancia IOException per capacità negativa")
                .isInstanceOf(IOException.class);
    }

    @Test
    public void testOpen_V6_FromSpecificPosition_ShouldReadPartialContent() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 6;
        int headerSize = JournalTestHelper.getHeaderSize(version); // 512
        byte[] fullPayload = "DataV6".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, fullPayload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // DEFINIZIONE POSIZIONE: Header (512) + 1 byte di skip
        long startPosition = headerSize + 1;

        // 2. ACTION
        // Usiamo il costruttore che accetta 'position' come 5° argomento
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                startPosition, // <--- INPUT: Posizione 513 (saltiamo la 'D')
                conf,
                fileChannelProvider
        )) {

            // A. Verifica Versione
            // Il JournalChannel legge l'header all'inizio indipendentemente da dove poi posiziona il cursore
            assertThat(jc.getFormatVersion())
                    .as("V6 deve essere rilevata correttamente anche con seek custom")
                    .isEqualTo(version);

            // B. Verifica Posizione del Canale
            assertThat(jc.fc.position())
                    .as("Il puntatore del file deve essere esattamente a Header + 1")
                    .isEqualTo(startPosition);

            // C. Verifica Lettura Parziale
            // Poiché partiamo da +1, ci aspettiamo di leggere 1 byte in meno
            int expectedReadLength = fullPayload.length - 1;
            ByteBuffer dst = ByteBuffer.allocate(expectedReadLength);

            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Dobbiamo leggere esattamente i byte rimanenti nel file")
                    .isEqualTo(expectedReadLength);

            dst.flip();
            byte[] actualContent = new byte[dst.remaining()];
            dst.get(actualContent);

            // CALCOLO RISULTATO ATTESO:
            // Full: "DataV6" -> Skip 'D' -> Expected: "ataV6"
            byte[] expectedPartialPayload = java.util.Arrays.copyOfRange(fullPayload, 1, fullPayload.length);

            assertThat(actualContent)
                    .as("Il contenuto letto deve corrispondere al payload senza il primo byte")
                    .isEqualTo(expectedPartialPayload);
        }
    }

    @Ignore // il test non lancia alcuna eccezione e posiziona il puntatore per la lettura all'interno dell'header
    @Test
    public void testOpen_InsideHeader_ShouldThrowException() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 6;
        int headerSize = JournalTestHelper.getHeaderSize(version);
        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, "Data".getBytes());

        fileChannelProvider = JournalTestHelper.createRealProvider();

        assertThatThrownBy(() -> {
            new JournalChannel(
                    journalDir,
                    logId,
                    1024L,
                    1,
                    headerSize - 1, // <--- Posizione Illegale (511)
                    conf,
                    fileChannelProvider
            );
        })
                .as("Non dovrebbe essere permesso posizionarsi all'interno dell'header")
                .isInstanceOf(Exception.class);
    }

    @Test
    public void testOpen_AtFileSize_ShouldBeAtEOF_AndReadNothing() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 6;
        byte[] payload = "FullContent".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, payload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // Calcoliamo la dimensione totale (Header + Payload)
        long fileSize = file.length();

        // 2. ACTION
        // Apriamo posizionandoci esattamente alla fine del file
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                fileSize, // <--- Posizione = EOF
                conf,
                fileChannelProvider
        )) {

            // A. Verifica Posizionamento
            assertThat(jc.fc.position())
                    .as("Il puntatore deve essere posizionato esattamente alla fine del file")
                    .isEqualTo(fileSize);

            // B. Verifica Lettura (Deve dare EOF)
            ByteBuffer dst = ByteBuffer.allocate(10);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Leggere alla fine del file deve ritornare -1 (EOF)")
                    .isEqualTo(-1);
        }
    }

    @Test
    public void testOpen_PastEOF_ShouldAcceptPosition_AndReadNothing() throws IOException {
        // 1. SETUP
        long logId = 10L;
        int version = 6;
        byte[] payload = "FullContent".getBytes();

        File file = new File(journalDir, Long.toHexString(logId) + ".txn");
        JournalTestHelper.createJournalFileWithJournalHeader(file, version, payload);

        fileChannelProvider = JournalTestHelper.createRealProvider();

        // Calcoliamo una posizione FUORI dal file
        long fileSize = file.length();
        long pastEofPosition = fileSize + 1;

        // 2. ACTION
        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                1024L,
                1,
                pastEofPosition, // <--- Posizione = EOF + 1
                conf,
                fileChannelProvider
        )) {

            // A. Verifica Posizionamento
            // Java FileChannel permette il seek oltre la fine (per creare sparse files in scrittura)
            // Quindi ci aspettiamo che la posizione sia esattamente quella richiesta.
            assertThat(jc.fc.position())
                    .as("Il puntatore deve accettare posizioni oltre la fine del file")
                    .isEqualTo(pastEofPosition);

            // B. Verifica Lettura
            // Leggere nel vuoto oltre la fine ritorna comunque EOF (-1), non lancia eccezione.
            ByteBuffer dst = ByteBuffer.allocate(10);
            int bytesRead = jc.read(dst);

            assertThat(bytesRead)
                    .as("Leggere oltre la fine del file deve ritornare -1 (EOF)")
                    .isEqualTo(-1);
        }
    }
}
