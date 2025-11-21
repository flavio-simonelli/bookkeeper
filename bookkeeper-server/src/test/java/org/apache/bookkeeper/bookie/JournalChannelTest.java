package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.conf.ServerConfiguration;
import org.junit.Before;

import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.nio.charset.StandardCharsets.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class JournalChannelTest {
    // Constants
    final byte[] magic_world = "BKLG".getBytes(UTF_8);
    // Mocks
    @Mock
    private Journal.BufferedChannelBuilder mockBufferedChannelBuilder;
    @Mock
    private BufferedChannel mockBufferedChannel;
    @Mock
    private FileChannelProvider mockFileChannelProvider;
    @Mock
    private BookieFileChannel mockBookieChannel;
    @Mock
    private FileChannel mockFileChannel;
    // Spy
    @Spy
    private ServerConfiguration spyConf;
    // Parameters
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();



    @Before
    public void setUp() {
        // Spy initialization
        spyConf = new ServerConfiguration();
    }

    /* Helper methods */

    /** Write header V1 on journal file
     */
    private void writeV1Header() {
    }

    /** Write header V2 on journal file
     * @param file the journal file
     * @throws IOException if an I/O error occurs
     */
    private void writeV2Header(File file) throws IOException {
        writeCompactHeader(file, 2);
    }

    /** Write header V3 on journal file
     * @param file the journal file
     * @throws IOException if an I/O error occurs
     */
    private void writeV3Header(File file) throws IOException {
        writeAlignedHeader(file, 3);
    }

    /** Write header V4 on journal file
     * @param file the journal file
     * @throws IOException if an I/O error occurs
     */
    private void writeV4Header(File file) throws IOException {
        writeCompactHeader(file, 4);
    }

    /** Write header V5 on journal file
     * @param file the journal file
     * @throws IOException if an I/O error occurs
     */
    private void writeV5Header(File file) throws IOException {
        writeAlignedHeader(file, 5);
    }

    /** Write header V6 on journal file
     * @param file the journal file
     * @throws IOException if an I/O error occurs
     */
    private void writeV6Header(File file) throws IOException {
        writeAlignedHeader(file, 6);
    }

    /**
     * Scrive l'header compatto: MagicWord (4 byte) + Version (4 byte)
     */
    private void writeCompactHeader(File file, int version) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             FileChannel fc = fos.getChannel()) {

            ByteBuffer bb = ByteBuffer.allocate(8);
            bb.put(magic_world);
            bb.putInt(version);
            bb.flip();

            fc.write(bb);
            fc.force(true);
        }
    }

    /**
     * Scrive l'header allineato: MagicWord (4) + Version (4) + Padding (504 zeri) = 512 byte
     */
    private void writeAlignedHeader(File file, int version) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             FileChannel fc = fos.getChannel()) {

            // 512 è la dimensione del settore definita in JournalChannel
            ByteBuffer bb = ByteBuffer.allocate(512);
            bb.put(magic_world);
            bb.putInt(version);
            // Il resto del buffer è già inizializzato a 0 (padding)

            bb.clear(); // Reset position per scrivere dall'inizio del buffer
            fc.write(bb);
            fc.force(true);
        }
    }

    /** Write a specific version header on journal file
     *
     * @param file the journal file
     * @param version the version to write in the header
     * @throws IOException if an I/O error occurs
     */
    private void writeHeader(File file, int version) throws IOException {
        switch (version) {
            case 1:
                writeV1Header();
                break;
            case 2:
                writeV2Header(file);
                break;
            case 3:
                writeV3Header(file);
                break;
            case 4:
                writeV4Header(file);
                break;
            case 5:
                writeV5Header(file);
                break;
            case 6:
                writeV6Header(file);
                break;
            default:
                throw new IllegalArgumentException("Unsupported version: " + version);
        }
    }

    /** Create an empty directory
     *
     * @return the created empty directory
     * @throws IOException if an I/O error occurs
     */
    private File createEmptyDir() throws IOException {
        return tempFolder.newFolder();
    }

    /** Create a journal file in a temporary folder
     *
     * @param logId the log id to use for the journal file name
     * @param version the version to write in the header
     * @return the created directory containing the journal file
     * @throws IOException if an I/O error occurs
     */
    private File createDirWithJournalFile(long logId, int version) throws IOException {
        File dir = createEmptyDir();

        // Definisci il file
        String filename = Long.toHexString(logId) + ".txn";
        File journalFile = new File(dir, filename);

        // Scrivi l'header corretto usando la tua funzione helper.
        writeHeader(journalFile, version);

        // Aggiungi (Append) dei dati fittizi dopo l'header
        try (FileOutputStream fos = new FileOutputStream(journalFile, true);
             FileChannel fc = fos.getChannel()) {

            byte[] fakeData = "TEST-DATA".getBytes();
            // Dimensione payload: LedgerId(8) + EntryId(8) + DataLen
            int entryPayloadSize = 8 + 8 + fakeData.length;

            // Allocazione: 4 byte per la lunghezza entry + il payload
            ByteBuffer buf = ByteBuffer.allocate(4 + entryPayloadSize);

            // --- Struttura Entry Tipica ---
            buf.putInt(entryPayloadSize); // Length Prefix
            buf.putLong(100L);      // Fake Ledger ID
            buf.putLong(1L);        // Fake Entry ID
            buf.put(fakeData);            // Dati

            buf.flip();
            fc.write(buf);
            fc.force(true);
        }

        return dir;
    }

    /** Get a path Directory that does not exist
     *
     * @return a File object representing a non-existent path
     */
    private File createNotExistingDirectory() {
        // Prende la root temporanea e aggiunge un nome finto. Non chiama newFolder/newFile.
        return new File(tempFolder.getRoot(), "ghost-dir-" + System.nanoTime());
    }

    /** Get a path that is not a directory (a file instead)
     *
     * @return a File object representing a file
     * @throws IOException if an I/O error occurs
     */
    private File createInvalidDirectory() throws IOException {
        return tempFolder.newFile("i-am-a-file-" + System.nanoTime());
    }
}
