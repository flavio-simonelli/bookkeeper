package org.apache.bookkeeper.testutils;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class JournalHeaderMother {
    // constant
    private static final byte[] MAGIC_WORD = "BKLG".getBytes(StandardCharsets.UTF_8);
    private static final byte[] BAD_MAGIC_WORD = "BAD!".getBytes(StandardCharsets.UTF_8);

    private static final int HEADER_SIZE_LEGACY = 8;   // 4 byte magic + 4 byte version
    private static final int HEADER_SIZE_NEWER = 512; // Sector size
    private static final int HEADER_SIZE_BAD = 128;

    /**
     * Costruisce un header arbitrario.
     *
     * @param magicWord  La sequenza di byte iniziale (es. "BKLG" o "BAD!").
     * @param version    Il numero di versione (es. 3, 4, 5, 6, 99, -1).
     * @param totalSize  La dimensione finale del blocco header (es. 8 o 512).
     * Se totalSize > (magic.length + 4), il resto viene riempito di zeri (padding).
     * @return L'array di byte pronto per essere scritto su file.
     */
    private static byte[] buildHeader(byte[] magicWord, int version, int totalSize) {
        if (totalSize < magicWord.length + 4) {
            throw new IllegalArgumentException("La dimensione totale è troppo piccola per contenere MagicWord e Versione");
        }

        // ByteBuffer.allocate inizializza automaticamente i byte a 0, creando il padding.
        ByteBuffer bb = ByteBuffer.allocate(totalSize);

        bb.put(magicWord);   // Scrive la Magic Word
        bb.putInt(version);  // Scrive la Versione (Big Endian)

        return bb.array();
    }

    // ==========================================
    // HEADER VALIDI
    // ==========================================

    public static byte[] getExpectedHeaderV1() {
        // V1 non ha header
        return new byte[0];
    }

    // Per V2, V3, V4: Usa "BKLG", Versione X, Dimensione 8
    public static byte[] getExpectedHeaderV2() {
        return buildHeader(MAGIC_WORD, 2, HEADER_SIZE_LEGACY);
    }

    public static byte[] getExpectedHeaderV3() {
        return buildHeader(MAGIC_WORD, 3, HEADER_SIZE_LEGACY);
    }

    public static byte[] getExpectedHeaderV4() {
        return buildHeader(MAGIC_WORD, 4, HEADER_SIZE_LEGACY);
    }

    // Per V5, V6: Usa "BKLG", Versione X, Dimensione 512
    public static byte[] getExpectedHeaderV5() {
        return buildHeader(MAGIC_WORD, 5, HEADER_SIZE_NEWER);
    }

    public static byte[] getExpectedHeaderV6() {
        return buildHeader(MAGIC_WORD, 6, HEADER_SIZE_NEWER);
    }

    // ==========================================
    // HEADER INVALIDI sulla versione
    // ==========================================

    public static byte[] getInvalidHeaderFutureVersion() {
        // Magic OK, Versione 99, Dimensione standard 8
        return buildHeader(MAGIC_WORD, 99, HEADER_SIZE_LEGACY);
    }

    public static byte[] getInvalidHeaderZero() {
        return buildHeader(MAGIC_WORD, 0, HEADER_SIZE_LEGACY);
    }

    public static byte[] getInvalidHeaderNegative() {
        return buildHeader(MAGIC_WORD, -1, HEADER_SIZE_LEGACY);
    }

    // ==========================================
    // HEADER INVALIDI sulla MagicWorld
    // ==========================================

    /**
     * Magic Word errata. Il sistema farà fallback a V1.
     */
    public static byte[] getHeaderWithBadMagicWord() {
        return buildHeader(BAD_MAGIC_WORD, 6, HEADER_SIZE_LEGACY);
    }

    // ==========================================
    // HEADER INVALIDI sul padding
    // ==========================================

    /**
     * IL CASO "TRUNCATED PADDING" (V5/V6 senza zeri)
     * Magic OK, Versione 6 (che richiederebbe 512), ma tronchiamo il file a 128 byte.
     */
    public static byte[] getMalformedV6HeaderWithoutPadding() {
        return buildHeader(MAGIC_WORD, 6, HEADER_SIZE_BAD);
    }
}