package utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.mockito.stubbing.Answer;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Fornisce istanze di ByteBufAllocator configurate per vari scenari di test.
 */
public class ByteBufAllocatorMother {

    /**
     * Restituisce un Allocator valido e corretto.
     */
    public static ByteBufAllocator createValidAllocator() {
        return UnpooledByteBufAllocator.DEFAULT;
    }

    /**
     * Restituisce un Allocator valido ma non corretto.
     * Se viene richiesto un buffer ritorna sempre NULL.
     */
    public static ByteBufAllocator createNullAllocator() {
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);
        when(allocator.directBuffer(anyInt())).thenReturn(null); // esplicito per leggibilità ma non necessario
        return allocator;
    }

    /**
     * Restituisce un Allocator valido ma non corretto.
     * Se viene richiesto un buffer di N bytes, viene restituito un buffer di N-1 bytes.
     */
    public static ByteBufAllocator createUndersizedAllocator() {
        ByteBufAllocator allocator = mock(ByteBufAllocator.class);

        Answer<ByteBuf> undersizedAnswer = invocation -> {
            int reqCap = (Integer) invocation.getArguments()[0];

            // Se è richiesto <= 0, Netty lancia eccezione
            // Se è richiesto >= 1, ritorniamo N-1.
            return UnpooledByteBufAllocator.DEFAULT.buffer(reqCap-1);
        };

        when(allocator.directBuffer(anyInt())).thenAnswer(undersizedAnswer);

        return allocator;
    }

    /**
     * Restituisce un buffer che è già stato rilasciato e quindi deallocato dal Netty Pool (refCnt = 0).
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

        return allocator;
    }
}