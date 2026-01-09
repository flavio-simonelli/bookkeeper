package org.apache.bookkeeper.testutils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.mockito.stubbing.Answer;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Implementazione del pattern <strong>Object Mother</strong> per {@link ByteBufAllocator}.
 * <p>
 * Questa classe factory fornisce istanze di allocatori pre-configurate (anche tramite l'utilizzo di Mockito)
 * per simulare vari scenari limite, inclusi casi di successo ("happy path") e casi di fallimento
 * (es. allocazioni insufficienti, puntatori nulli, buffer deallocati).
 * </p>
 */
public class ByteBufAllocatorMother {

    /**
     * Restituisce un'istanza reale e funzionante di {@link ByteBufAllocator}.
     * Utilizza l'implementazione Unpooled di default di Netty.
     * Da utilizzare per i test funzionali standard dove non sono attesi errori di allocazione.
     *
     * @return Un {@code ByteBufAllocator} valido.
     */
    public static ByteBufAllocator createValidAllocator() {
        return UnpooledByteBufAllocator.DEFAULT;
    }

    /**
     * Restituisce un allocatore Mock configurato per fallire silenziosamente.
     * Ogni richiesta di allocazione di un buffer (heap o direct) restituirà {@code null}.
     * Utile per testare la robustezza del codice in caso di fallimento totale dell'allocatore
     * o per verificare la gestione delle {@code NullPointerException}.
     *
     * @return Un allocatore mock che restituisce sempre {@code null}.
     */
    public static ByteBufAllocator createNullAllocator() {
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);
        when(allocator.directBuffer(anyInt())).thenReturn(null); // esplicito per leggibilità ma non necessario
        when(allocator.buffer(anyInt())).thenReturn(null); // esplicito per leggibilità ma non necessario
        return allocator;
    }

    /**
     * Restituisce un allocatore difettoso che simula un errore di calcolo dimensionale ("off-by-one").
     * Se viene richiesto un buffer di capacità {@code N}, questo allocatore ne restituirà uno di capacità {@code N-1}.
     * Questo scenario è critico per verificare che il codice sotto test controlli effettivamente
     * la capacità del buffer ricevuto (o gestisca correttamente i {@code IndexOutOfBoundsException}).
     *
     * @return Un allocatore mock che restituisce buffer sottodimensionati.
     */
    public static ByteBufAllocator createUndersizedAllocator() {
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);
        Answer<ByteBuf> undersizedAnswer = invocation -> {
            int reqCap = (Integer) invocation.getArguments()[0];

            /*
             * Logica di simulazione errore:
             * - Se reqCap <= 0: lasciamo che Netty sollevi eccezione (comportamento standard).
             * - Se reqCap >= 1: allochiamo un buffer reale ma con size ridotta (reqCap - 1).
             */
            return UnpooledByteBufAllocator.DEFAULT.buffer(reqCap-1);
        };

        when(allocator.directBuffer(anyInt())).thenAnswer(undersizedAnswer);
        when(allocator.buffer(anyInt())).thenAnswer(undersizedAnswer);

        return allocator;
    }

    /**
     * Restituisce un allocatore che fornisce buffer già marcati come rilasciati (deallocati).
     * Il {@link ByteBuf} restituito avrà un reference count pari a 0.
     * Qualsiasi tentativo di utilizzo di questo buffer da parte del codice sotto test dovrebbe
     * scatenare una {@link io.netty.util.IllegalReferenceCountException}.
     *
     * @return Un allocatore mock che restituisce buffer "zombie" (già rilasciati).
     */
    public static ByteBufAllocator createDeallocatedAllocator() {
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);

        Answer<ByteBuf> deallocAnswer = invocation -> {
            int reqCap = (Integer) invocation.getArguments()[0];
            ByteBuf buf = UnpooledByteBufAllocator.DEFAULT.buffer(reqCap);
            buf.release(); // rilascio del buffer
            return buf;
        };

        when(allocator.directBuffer(anyInt())).thenAnswer(deallocAnswer);
        when(allocator.buffer(anyInt())).thenAnswer(deallocAnswer);

        return allocator;
    }
}