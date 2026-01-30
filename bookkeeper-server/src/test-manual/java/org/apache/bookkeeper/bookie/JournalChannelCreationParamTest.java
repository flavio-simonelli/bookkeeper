package org.apache.bookkeeper.bookie;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collection;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.testutils.JournalTestHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test Parametrizzati creazione JournalChannel.
 */
@RunWith(Parameterized.class)
public class JournalChannelCreationParamTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    // prameters
    private final int versionToWrite;
    private final long preAllocSize;
    private final int journalAlignSize;

    // fixture
    private ServerConfiguration conf;
    private FileChannelProvider provider;
    private Journal.BufferedChannelBuilder bcBuilder;
    private BufferedChannel mockBc;


    public JournalChannelCreationParamTest(int version, long preAlloc, int align) {
        this.versionToWrite = version;
        this.preAllocSize = preAlloc;
        this.journalAlignSize = align;
    }

    /**
     * Definizione dei Test Case (Boundary Analysis & Equivalence Partitioning).
     * * Schema Array: { Version, PreAlloc, Align }
     */
    @Parameters(name = "{index}: Ver={0}, Alloc={1}, Align={2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 6, 1024L, 512 },
                { 5, 1024L, 512 },
                { 4, 1024L, 512 },
                //{ 3, 1024L, 512 },  IO Invalid journal format to write
                //{ 2, 1024L, 512 },  IO Invalid journal format to write
                //{ 1, 1024L, 512 },  IO Invalid journal format to write
                { 6, 1025L, 512 },
        });
    }

    // Calcola la dimensione totale attesa del file.
    private long calculateExpectedTotalSize() {
        // Calcolo Payload (Logica Allineamento)
        long alignedPreAlloc = 0;
        if (preAllocSize > 0) {
            alignedPreAlloc = preAllocSize - (preAllocSize % journalAlignSize);
        }
        long headerSize = (versionToWrite < 5) ? 8 : 512;
        return Math.max(headerSize, alignedPreAlloc);
    }

    @Before
    public void setUp() throws IOException {
        conf = new ServerConfiguration();
        mockBc = JournalTestHelper.createBufferedChannelStub(0L);
        bcBuilder = JournalTestHelper.createBuilder(mockBc);
        provider = JournalTestHelper.createRealProvider();
    }

    @After
    public void tearDown() {
        // Cleanup gestito dalla Rule
    }

    @Test
    public void testJournalCreationLifecycle() throws IOException {
        long logId = 5L;
        File journalDir = folder.getRoot();
        File expectedFile = new File(journalDir, Long.toHexString(logId) + ".txn");

        try (JournalChannel jc = new JournalChannel(
                journalDir,
                logId,
                preAllocSize,
                1,
                journalAlignSize,
                false,
                versionToWrite,
                bcBuilder,
                conf,
                provider,
                null
        );) {

            // --- VERIFY ---
            // Verifica Esistenza File
            assertThat(expectedFile)
                    .as("Verifica esistenza file fisico %s", expectedFile.getName())
                    .exists()
                    .isFile();
            assertThat(jc.getFormatVersion())
                    .as("Verifica versione interna")
                    .isEqualTo(versionToWrite);

            // Leggiamo i byte grezzi per assicurarci che MagicWord e Versione siano corretti.
            try (RandomAccessFile raf = new RandomAccessFile(expectedFile, "r")) {

                // Verifica Header Binario
                byte[] expectedHeader = JournalTestHelper.generateExpectedHeaderBytes(versionToWrite);
                byte[] actualHeader = new byte[expectedHeader.length];
                raf.readFully(actualHeader);

                assertThat(actualHeader)
                        .as("Integrità binaria Header (MagicWord + Version + Padding)")
                        .isEqualTo(expectedHeader);

                // Verifica Dimensione Totale
                long totalExpectedSize = calculateExpectedTotalSize();
                long actualDiskSize = raf.length();

                assertThat(actualDiskSize)
                        .as("Verifica dimensione totale file PreAlloc allineata")
                        .isEqualTo(totalExpectedSize);
            }
        }
    }
}
