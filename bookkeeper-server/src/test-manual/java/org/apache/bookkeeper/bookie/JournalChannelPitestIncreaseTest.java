package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.testutils.JournalTestHelper;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

import static org.mockito.Mockito.*;

public class JournalChannelPitestIncreaseTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testHeaderAlignment_V6_CheckPositionAtBuilderCreation_KillMutant() throws IOException {
        long logId = 10L;
        int targetVersion = 6; // V6 -> Deve scrivere 512 byte prima di creare il BufferedChannel

        // Mockiamo il Builder e il Canale risultante
        Journal.BufferedChannelBuilder mockBuilder = mock(Journal.BufferedChannelBuilder.class);
        BufferedChannel mockBc = mock(BufferedChannel.class);

        // Configuriamo il Mock per fare un controllo "LIVE" quando viene chiamato.
        when(mockBuilder.create(any(FileChannel.class), anyInt())).thenAnswer(invocation -> {
            // Recuperiamo il FileChannel che il JournalChannel sta passando al builder
            FileChannel fcPassed = invocation.getArgument(0);
            // Controlliamo la posizione fisica del cursore
            long positionAtCreation = fcPassed.position();
            // ASSERTION DENTRO IL MOCK
            // Se il codice è corretto: ha scritto 512 byte (Header + Padding).
            // Se il mutante è vivo: ha scritto solo 8 byte.
            if (positionAtCreation != 512) {
                // Questo messaggio farà fallire il test se il mutante è vivo
                throw new AssertionError(
                        String.format("Mutant detected! FileChannel position passed to builder was %d instead of 512.",
                                positionAtCreation));
            }
            return mockBc;
        });

        // Usiamo il Provider reale
        FileChannelProvider realProvider = JournalTestHelper.createRealProvider();
        ServerConfiguration conf = new ServerConfiguration();

        // ACTION
        // L'asserzione avviene implicitamente dentro il costruttore grazie al Mock configurato sopra
        try (JournalChannel jc = new JournalChannel(
                folder.getRoot(),
                logId,
                1024L,
                1024,
                512,
                false,
                targetVersion, // V6
                mockBuilder,   // Passiamo il nostro "Spy/Mock" builder
                conf,
                realProvider,
                null
        )) {
            // Non serve fare nulla qui, se il costruttore finisce senza AssertionErrors, il test è passato.
        }
    }
}


