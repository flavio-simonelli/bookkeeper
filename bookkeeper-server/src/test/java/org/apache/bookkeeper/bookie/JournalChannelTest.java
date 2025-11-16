package org.apache.bookkeeper.bookie;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class JournalChannelTest {
    // Variabili per parametri e risultati attesi
    private final File journalDirectoryParam;
    private final long logIdParam;
    private final boolean ExceptionExpected;

    // Campi statici per accedere ai file da @Parameters e @AfterClass
    private static File emptyJournalDir;

    // Costruttore per inizializzare i parametri del test
    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters() {
        // creazione delle cartelle temporanee per i test
        emptyJournalDir = new File(System.getProperty("java.io.tmpdir"), "emptyJournalDir");
        emptyJournalDir.mkdir();
        File nonExistentDir = new File(System.getProperty("java.io.tmpdir"), "nonExistentDir");
        if (nonExistentDir.exists()) {
            nonExistentDir.delete();
        }

        return Arrays.asList(new Object[][] {
            // Test case 1: Cartella esistente e logId valido
            { emptyJournalDir, 1L, false },
            // Test case 2: Cartella non esistente
            {nonExistentDir, 1L, true },
            // Test case 3: Cartella esistente e logId negativo
            { emptyJournalDir, -1L, false },
        });
    }

    // Costruttore della classe di test
    public JournalChannelTest(File journalDirectoryParam, long logIdParam, boolean ExceptionExpected) {
        this.journalDirectoryParam = journalDirectoryParam;
        this.logIdParam = logIdParam;
        this.ExceptionExpected = ExceptionExpected;
    }

    // Metodi di Test
    @Test
    public void testJournalChannelInitializing() throws Exception {
        try {
            JournalChannel journalChannel = new JournalChannel(journalDirectoryParam, logIdParam);
            if (ExceptionExpected) {
                fail("Expected exception was not thrown");
            }
        } catch (IOException e) {
            if (!ExceptionExpected) {
                throw e; // Rilancia l'eccezione se non era prevista
            }
        }
    }

    // Pulizia dopo i test
    @AfterClass
    public static void cleanup() {
        if (emptyJournalDir != null && emptyJournalDir.exists()) {
            emptyJournalDir.delete();
        }
        // nonExistentDir non ha bisogno di pulizia,
        // dato che il test si aspetta che non esista.
    }
}
