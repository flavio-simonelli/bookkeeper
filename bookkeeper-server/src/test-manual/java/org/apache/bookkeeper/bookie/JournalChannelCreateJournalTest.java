package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.exceptions.IllegalTestConfigurationException;
import org.apache.bookkeeper.exceptions.InvalidBuilderParameterException;
import org.apache.bookkeeper.testutils.BufferedChannelBuilderStub;
import org.apache.bookkeeper.testutils.FileChannelProviderStub;
import org.apache.bookkeeper.testutils.JournalHeaderMother;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;

@Ignore
@RunWith(Parameterized.class)
public class JournalChannelCreateJournalTest {
    /**
    // param
    private final JournalDirType journalDirectoryTypeParam;
    private final long logIdParam;
    private final int writeBufferSizeParam;
    private final int journalAlignSizeParam;
    private final long preAllocSizeParam;
    private final int formatVersionToWriteParam;
    private long positionParam;
    private BufferedChannelBuilderType bufferedChannelBuilderTypeParam;
    private FileChannelProviderType fileChannelProviderTypeParam;

    // param Default
    private final ServerConfiguration serverConfiguration = new ServerConfiguration();
    private final boolean fRemoveFromPageCache = false;
    private final Long toReplaceLogID = null;

    //fixture
    private File journalDir;
    private BufferedChannelBuilderStub bufferedChannelBuilder;
    private FileChannelProvider  fileChannelProvider;

    // expected results
    private final Class<? extends Throwable> expectedException;

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    public JournalChannelCreateJournalTest(
            JournalDirType dirTypeParam,
            long lIdParam,
            int wbParam,
            int alignSizeParam,
            long preAllocParam,
            int versionParam,
            long posParam,
            BufferedChannelBuilderType bcBuilderParam,
            FileChannelProviderType fcProviderParam,
            Class<? extends Throwable> expectedException
    ) {
        this.journalDirectoryTypeParam = dirTypeParam;
        this.logIdParam = lIdParam;
        this.writeBufferSizeParam = wbParam;
        this.journalAlignSizeParam = alignSizeParam;
        this.preAllocSizeParam = preAllocParam;
        this.formatVersionToWriteParam = versionParam;
        this.positionParam = posParam;
        this.bufferedChannelBuilderTypeParam = bcBuilderParam;
        this.fileChannelProviderTypeParam = fcProviderParam;
        this.expectedException = expectedException;
    }

    public enum JournalDirType {
        EMPTY_DIR, // Directory valida ma vuota
        WITH_V6_DATA, // Directory con dentro un file 1.txn valido (V6)
        NON_EXISTENT_DIR, // Path che punta al nulla
        NOT_A_DIRECTORY, // Path che esiste, ma è un file (non una cartella)
        NULL
    }

    public enum BufferedChannelBuilderType {
        VALID,
        NULL_RETURN,
        NULL
    }

    public enum FileChannelProviderType {
        VALID,
        NULL_RETURN,
        CLOSED, // file channel provider implementa closable
        NULL
    }

    private FileChannelProvider fileChannelProviderFixtureDirector(FileChannelProviderType type) {
        switch(type) {
            case VALID:
                return new FileChannelProviderStub();
            case NULL_RETURN:
                // return null on all methods
                return mock(FileChannelProvider.class);
            case CLOSED:
                FileChannelProviderStub providerStub = new FileChannelProviderStub();
                providerStub.close();
                return providerStub;
            case NULL:
                return null;
        }
        throw new IllegalTestConfigurationException("Unsupported FileChannelProvider type: " + type);
    }

    private File journalDirectoryFixtureDirector(JournalDirType type) throws IOException {
        switch (type) {
            case EMPTY_DIR:
                // crea una nuova cartella vuota random nella temp dir
                return tempFolder.newFolder("empty_journal_" + System.nanoTime());
            case WITH_V6_DATA:
                // crea la cartella
                File dirWithData = tempFolder.newFolder("v6_journal_" + System.nanoTime());
                // crea il file "1.txn" (corrisponde a logId = 1)
                File logFile = new File(dirWithData, "1.txn");
                // scrive l'header V6
                byte[] v6Header = JournalHeaderMother.getExpectedHeaderV6();
                try (FileOutputStream fos = new FileOutputStream(logFile)) {
                    fos.write(v6Header);
                }
                return dirWithData;
            case NON_EXISTENT_DIR:
                // Restituisce un path che NON esiste fisicamente.
                // Usiamo tempFolder.getRoot() solo per avere un path base valido,
                // ma aggiungiamo un nome inventato senza fare .mkdir()
                return new File(tempFolder.getRoot(), "ghost_dir_" + System.nanoTime());
            case NOT_A_DIRECTORY:
                // file, non una cartella.
                return tempFolder.newFile("im_just_a_file_" + System.nanoTime());
            case NULL:
                return null;
        }
        throw new IllegalTestConfigurationException("Unsupported JournalDirectory type: " + type);
    }

    private BufferedChannelBuilderStub bufferedChannelBuilderFixtureDirector(BufferedChannelBuilderType type) {
        switch (type) {
            case VALID:
                // Restituisce lo stub che crea un BufferedChannel stabile senza buffer che scrive direttamente su disco
                return new BufferedChannelBuilderStub();
            case NULL_RETURN:
                return mock(BufferedChannelBuilderStub.class);
            case NULL:
                return null;
        }
        throw new IllegalTestConfigurationException("Unsupported BufferedChannelBuilder type: " + type);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, JournalDirType.WITH_V6_DATA, 5, 1, 10, 10, 6},
        });
    }

    @Before
    public void setUp() throws IOException {
        this.journalDir = journalDirectoryFixtureDirector(journalDirectoryTypeParam);
        this.fileChannelProvider = fileChannelProviderFixtureDirector(fileChannelProviderTypeParam);
        this.bufferedChannelBuilder = bufferedChannelBuilderFixtureDirector(bufferedChannelBuilderTypeParam);
    }

    @Test
    public void testJournalChannelCreation() throws Exception {
        // --- CASO 1: ECCEZIONE ATTESA ---
        if (expectedException != null) {
            assertThatThrownBy(() -> new JournalChannel(
                    journalDir,
                    logIdParam,
                    preAllocSizeParam,
                    writeBufferSizeParam,
                    journalAlignSizeParam,
                    positionParam,
                    fRemoveFromPageCache,
                    formatVersionToWriteParam,
                    bufferedChannelBuilder,
                    serverConfiguration,
                    fileChannelProvider,
                    toReplaceLogID
            ))
                    .as("Ci aspettavamo un fallimento con %s", expectedException.getSimpleName())
                    .isInstanceOf(expectedException);

            // Verifica extra opzionale per side-effects
            if (journalDir != null && (journalDirectoryTypeParam == JournalDirType.EMPTY_DIR || journalDirectoryTypeParam == JournalDirType.WITH_V6_DATA)) {
                File expectedFile = new File(journalDir, Long.toHexString(logIdParam) + ".txn");
                assertThat(expectedFile).doesNotExist();
            }

        } else {
            // --- CASO 2: HAPPY PATH ---
            try (JournalChannel jc = new JournalChannel(
                    journalDir,
                    logIdParam,
                    preAllocSizeParam,
                    writeBufferSizeParam,
                    journalAlignSizeParam,
                    fRemoveFromPageCache,
                    formatVersionToWriteParam,
                    bufferedChannelBuilder,
                    serverConfiguration,
                    fileChannelProvider,
                    toReplaceLogID
            )) {

                // --- ASSERZIONI ---
                assertThat(jc).isNotNull();

                // Verifica File
                File expectedFile = new File(journalDir, Long.toHexString(logIdParam) + ".txn");
                assertThat(expectedFile).exists();

                // Verifica Header
                verifyFileHeader(expectedFile, formatVersionToWriteParam);

                // Verifica Parametri Interni
                if (bufferedChannelBuilder != null && bufferedChannelBuilder.getCreatedChannel() != null) {

                }

                // Verifica preallocazione
                assertThat(expectedFile.length())
                        .isGreaterThanOrEqualTo(preAllocSizeParam);
            }
        }
    }

    @After
    public void tearDown() throws IOException {
        if (fileChannelProvider != null) {
            fileChannelProvider.close();
        }
    }

    /**
     * Helper method per verificare l'integrità dell'header del Journal.
     * Supporta qualsiasi versione definita in JournalHeaderMother.

    private void verifyFileHeader(File journalFile, int version) throws IOException {
        // determina quale array di byte ci aspettiamo
        byte[] expectedHeader;
        switch (version) {
            case 1:
                expectedHeader = JournalHeaderMother.getExpectedHeaderV1();
                break;
            case 2:
                expectedHeader = JournalHeaderMother.getExpectedHeaderV2();
                break;
            case 3:
                expectedHeader = JournalHeaderMother.getExpectedHeaderV3();
                break;
            case 4:
                expectedHeader = JournalHeaderMother.getExpectedHeaderV4();
                break;
            case 5:
                expectedHeader = JournalHeaderMother.getExpectedHeaderV5();
                break;
            case 6:
                expectedHeader = JournalHeaderMother.getExpectedHeaderV6();
                break;
            default:
                throw new IllegalTestConfigurationException("Test Helper: Versione header " + version + " non gestita o sconosciuta.");
        }

        // controllo esistenza file
        assertThat(journalFile)
                .as("Il file journal deve esistere per verificarne l'header")
                .exists()
                .isFile();

        // lettura del file
        byte[] fileContent = Files.readAllBytes(journalFile.toPath());

        // 4. Controllo dimensione minima
        // Se il file è più piccolo dell'header atteso, è sicuramente corrotto.
        assertThat(fileContent.length)
                .as("Il file su disco (len=%d) è troppo piccolo per contenere l'header V%d (len=%d)",
                        fileContent.length, version, expectedHeader.length)
                .isGreaterThanOrEqualTo(expectedHeader.length);

        // Prendiamo dal file solo i primi N byte, dove N è la lunghezza dell'header atteso.
        byte[] actualHeader = Arrays.copyOfRange(fileContent, 0, expectedHeader.length);

        assertThat(actualHeader)
                .as("Magic Bytes/Header su disco non corrispondono alla versione %d", version)
                .isEqualTo(expectedHeader);
    }


    private JournalChannel JorunalChannelbuild() throws IOException {
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
    */
}
