package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import utils.InvalidTestConfigurationException;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class BufferedChannelReadParametrizedTest {
    // parameters
    private final byte[] fileData;
    private final byte[] writeBufferData;
    private final int destCap;
    private final int length;
    private final long pos;

    // expected
    private final Class<? extends Exception> expectedException;
    private final byte[] expectedBytes;
    private final int expectedReturnValue;

    // before
    private BufferedChannel sut;
    private FileChannel fileChannel;
    private ByteBuf dest;

    // utils
    static byte[] dataWriteBuffer = "abcdefghijklmnopqrstuvz".getBytes(StandardCharsets.UTF_8);
    static byte[] dataFileBuffer = "ABCDEFGHILJKLMNOPQRSTUVZ".getBytes(StandardCharsets.UTF_8);
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    public BufferedChannelReadParametrizedTest(byte[] fileData, byte[] writeBufferData, int destCap, int length, long pos, Class<? extends Exception> expectedException, byte[] expectedBytes, int expectedReturnValue) {
        this.fileData = fileData;
        this.writeBufferData = writeBufferData;
        this.destCap = destCap;
        this.length = length;
        this.pos = pos;
        this.expectedException = expectedException;
        this.expectedBytes = expectedBytes;
        this.expectedReturnValue = expectedReturnValue;
    }


    // Parametri dei casi di test
    @Parameterized.Parameters(name = "T{index}")
    public static Collection<Object[]> data() {

        List<Object[]> data = new ArrayList<Object[]>();
        // Test: fileDataQuantity, writeBufferDataQuantity, destCapacity, lengthReading, positionReading, expectedException, startIndex, endIndex
        //data.add(scenarioFallimento(10, 10, 5, -1, 0, Exception.class)); // fallisce perchè se chiedo una length negativa mi restituisce nulla senza dare errore
        data.add(scenarioFallimento(10, 10, 5, 5, -1, Exception.class));
        data.add(scenarioSuccesso(10, 10, 5, 5, 0));
        //data.add(scenarioFallimento(10, 10, 5, 0, -1, Exception.class)); // questo non lancia eccezione ma non chiedendo dati restituisce subito
        //data.add(scenarioFallimento(10, 10, 0, -1, 0, Exception.class)); // lunghezza negativa equivale a 0
        data.add(scenarioSuccesso(10, 10, 5, 0, 0));
        data.add(scenarioSuccesso(10, 10, 0, 0, 0));
        data.add(scenarioFallimento(10, 10, 0, 5, 0, Exception.class));
        data.add(scenarioSuccesso(10,10,5,5,0));
        data.add(scenarioFallimento(10,10,5,5,-1,Exception.class));
        data.add(scenarioSuccesso(10,10,5,5,5));
        data.add(scenarioSuccesso(10,10,5,5,9)); // fallisce perchè forse ho sbagliato io a mettere bene i file e il buffer
        data.add(scenarioSuccesso(10,10,5,5,15)); // non so cosa significa
        data.add(scenarioFallimento(10,10,5,5,19,Exception.class));
        data.add(scenarioFallimento(10,10,5,5,20,Exception.class));
        data.add(scenarioFallimento(10,0,5,5,20,Exception.class));
        data.add(scenarioSuccesso(10,0,5,5,0)); // credo di aver sbagliato a caricare i dati nel file
        data.add(scenarioSuccesso(10,0,5,5,5)); // non so cosa significa
        data.add(scenarioFallimento(10,0,5,5,9, Exception.class)); // eccezione posizione invalida
        data.add(scenarioFallimento(0,10,5,5,10, Exception.class)); // eccezione posizione invalida
        data.add(scenarioSuccesso(0,10,5,5,0));
        data.add(scenarioSuccesso(0,10,5,5,5));
        data.add(scenarioFallimento(0,10,5,5,9, Exception.class));
        data.add(scenarioFallimento(0,10,5,5,10,Exception.class));
        data.add(scenarioFallimento(0,0,5,5,-1, Exception.class));
        data.add(scenarioFallimento(0,0,5,5,0, Exception.class));
        data.add(scenarioFallimento(0,0,5,5,1, Exception.class));
        return data;
    }

    // Helper generatore di casi di test con successo
    private static Object[] scenarioSuccesso(int fileDataQuantity, int writeBufferDataQuantity, int destCapacity, int lengthReading, long positionReading) {
        // creiamo i buffer parametri
        byte[] writeBufferContent = Arrays.copyOf(dataWriteBuffer, writeBufferDataQuantity);
        byte[] fileBufferContent = Arrays.copyOf(dataFileBuffer, fileDataQuantity);
        // creiamo buffer per oracolo
        byte[] temp = new byte[writeBufferContent.length +  fileBufferContent.length];
        System.arraycopy(fileBufferContent, 0, temp, 0, fileBufferContent.length);
        System.arraycopy(writeBufferContent, 0, temp, fileBufferContent.length, writeBufferContent.length);
        // oracolo soluzione
        if ( positionReading > temp.length || positionReading < 0) {
            throw new InvalidTestConfigurationException(String.format(
                    "ERRORE NELLA SCRITTURA DEL TEST ('%s'): " +
                    "La posizione richiesta (%d) è oltre la dimensione totale dei buffer uniti (%d). " +
                    "Hai sbagliato i calcoli o dovresti usare 'scenarioFallimento'?",
                    destCapacity, positionReading, temp.length));
        }
        int returnValue = Math.min(lengthReading, temp.length - (int)positionReading);
        byte[] expectedBytes = new byte[returnValue];
        System.arraycopy(temp, (int)positionReading, expectedBytes, 0, returnValue);
        // ritorniamo gli oggetti che verranno passati al costruttore
        return new Object[] { fileBufferContent, writeBufferContent, destCapacity, lengthReading, positionReading, null, expectedBytes, returnValue};
    }

    //Helper generatore di casi di test con fallimento
    private static Object[] scenarioFallimento(int fileDataQuantity, int writeBufferDataQuantity, int destCapacity, int lengthReading, long positionReading, Class<? extends Exception> exClass) {
        // creiamo i buffer parametri
        byte[] writeBufferContent = Arrays.copyOf(dataWriteBuffer, writeBufferDataQuantity);
        byte[] fileBufferContent = Arrays.copyOf(dataFileBuffer, fileDataQuantity);
        // ritorniamo gli oggetti che verranno passati al costruttore
        return new Object[] { fileBufferContent, writeBufferContent, destCapacity, lengthReading, positionReading, exClass, null, -1};
    }

    @Before
    public void setUp() throws IOException {
        // creiamo il buffer di destinazione
        this.dest = ByteBufTestBuilder.withCapacity(destCap).getResult();
        // creiamo il FileChannel
        File file = new File(folder.getRoot().getAbsolutePath(), "prova.txn");
        this.fileChannel = FileChannelTestBuilder.onFile(file).readWriteMode().withContent(fileData).withInitialPosition(fileData.length).getResult();
        // creiamo il sut
        int DEFAULT_SIZE_WRITE_BUFFER = 1024;
        this.sut = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fileChannel, DEFAULT_SIZE_WRITE_BUFFER);
        // scriviamo manualmente nel buffer
        if (writeBufferData != null) {
            sut.writeBuffer.writeBytes(writeBufferData);
            sut.position += writeBufferData.length;
        }
    }

    @After
    public void tearDown() throws IOException {
        this.fileChannel.close();
        this.sut.close();
    }


    @Test
    public void testRead() {
        // --- GESTIONE ERRORI ATTESI ---
        if (expectedException != null) {
            try {
                // ACT
                sut.read(dest, pos, length);

                // Se non lancia eccezione, il test deve fallire
                fail("Test fallito: Doveva lanciare " + expectedException.getSimpleName());
            } catch (Exception e) {
                // ASSERT
                assertTrue(
                        "Tipo eccezione errato. Atteso: " + expectedException.getSimpleName() + ", Ricevuto: " + e.getClass().getSimpleName(),
                        expectedException.isInstance(e)
                );
            }
        }
        // --- GESTIONE SUCCESSO ---
        else {
            // ACT
            int actualReadCount = 0;
            try {
                actualReadCount = sut.read(dest, pos, length);
            } catch (IOException e) {
                fail("Test fallito: Non doveva fallire invece ha lanciato eccezione" + e.getClass().getSimpleName());
            }

            // ASSERT 1: Verifichiamo il valore di ritorno (numero di byte letti)
            Assert.assertEquals(
                    "Numero di byte letti errato",
                    expectedReturnValue,
                    actualReadCount
            );

            // ASSERT 2: Verifichiamo il contenuto
            // Importante: destBuffer potrebbe essere grande (es. 1024 byte), ma noi ne abbiamo letti solo 5.
            // Dobbiamo confrontare solo la porzione valida.
            byte[] actualBytesWritten = new byte[expectedReturnValue];
            dest.readBytes(actualBytesWritten);

            Assert.assertArrayEquals(
                    "Contenuto dei byte letto errato",
                    expectedBytes,
                    actualBytesWritten
            );
        }
    }



}
