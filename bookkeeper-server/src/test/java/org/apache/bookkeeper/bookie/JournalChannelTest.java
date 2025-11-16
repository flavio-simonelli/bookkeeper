package org.apache.bookkeeper.bookie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JournalChannelTest {
    private static File emptyJournalDir;

    private static File withFileJournalDir;
    private static File tempFile;

    private static File nonExistentDir;

    private static File notValidDir;

    @BeforeClass
    public static void setJorunalDir() {
        // Cartella esistente e vuota
        emptyJournalDir = new File(System.getProperty("java.io.tmpdir"), "emptyJournalDir");
        emptyJournalDir.mkdir();

        // Cartella esistente e non vuota
        withFileJournalDir = new File(System.getProperty("java.io.tmpdir"), "withFileJournalDir");
        withFileJournalDir.mkdir();
        tempFile = new File(withFileJournalDir, "1.log");
        try {
            tempFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Cartella non esistente
        nonExistentDir = new File(System.getProperty("java.io.tmpdir"), "nonExistentDir");
        if (nonExistentDir.exists()) {
            nonExistentDir.delete();
        }

        // Percorso non valido (file invece di cartella)
        notValidDir = new File(System.getProperty("java.io.tmpdir"), "notValidDir.txt");
        try {
            notValidDir.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testEmptyJournalDir() {
        try {
            JournalChannel journalChannel = new JournalChannel(emptyJournalDir, 1L, 1, );
        } catch (IOException e) {
            e.printStackTrace();
            fail("IOException non attesa per cartella vuota esistente: " + e.getMessage());
        }
        File expectedLogFile = new File(emptyJournalDir, "1.txn");
        //assertTrue("Il file di log non è stato creato nella cartella vuota.", expectedLogFile.exists());
        if (!expectedLogFile.exists()) {

            // Se il file non esiste, scopri cosa c'è nella cartella
            String filesFound = "Nessun file trovato.";
            File[] files = emptyJournalDir.listFiles();

            if (files != null && files.length > 0) {
                // Costruisci un elenco leggibile dei file trovati
                filesFound = Arrays.stream(files)
                        .map(File::getName) // Prendi solo i nomi
                        .collect(Collectors.joining(", ")); // Uniscili
            }

            // 3. Fai fallire il test con un messaggio UTILE
            fail("Il file '1.log' non è stato creato. " +
                    "Contenuto della cartella: [" + filesFound + "]");
        } else {
            if (emptyJournalDir.listFiles().length != 1) {
                fail("La cartella dovrebbe contenere esattamente un file, ma ne contiene: " + emptyJournalDir.listFiles().length);
            }
        }
    }

    @After
    public void cleanAfterTest() {
        if (emptyJournalDir.exists()) {
            for (File file : emptyJournalDir.listFiles()) {
                file.delete();
            }
        }
    }

    @AfterClass
    public static void cleanUp() {
        // Rimuovi i file e le cartelle create per i test
        if (tempFile.exists()) {
            tempFile.delete();
        }
        if (withFileJournalDir.exists()) {
            withFileJournalDir.delete();
        }
        if (emptyJournalDir.exists()) {
            for (File file : emptyJournalDir.listFiles()) {
                file.delete();
            }
            emptyJournalDir.delete();
        }
        if (notValidDir.exists()) {
            notValidDir.delete();
        }
    }

}
