//package org.apache.bookkeeper.testutils;
//
//public class StrictFileChannelProviderStub implements FileChannelProviderStub {
//
//    private boolean isClosed = false;
//    private final FileChannelProviderStub delegate; // Usiamo lo stub precedente per la logica reale
//
//    public void StrictFileChannelProvider(FileChannelProviderStub delegate) {
//        this.delegate = delegate;
//    }
//
//    // --- CHECK DI SICUREZZA ---
//    private void checkState() {
//        if (isClosed) {
//            throw new IllegalStateException("ERRORE GRAVE: Tentativo di usare il FileChannelProvider dopo che è stato chiuso!");
//        }
//    }
//
//    // --- METODI INTERFACCIA ---
//
//    @Override
//    public BookieFileChannel open(File file, ServerConfiguration configuration) throws IOException {
//        checkState(); // Controlla se siamo già chiusi
//        return delegate.open(file, configuration);
//    }
//
//    @Override
//    public boolean supportReuseFile() {
//        checkState();
//        return delegate.supportReuseFile();
//    }
//
//    @Override
//    public void notifyRename(File source, File target) {
//        checkState();
//        delegate.notifyRename(source, target);
//    }
//
//    @Override
//    public void close(BookieFileChannel bookieFileChannel) throws IOException {
//        // Nota: Questo metodo chiude il CANALE, non il PROVIDER.
//        // Questo è permesso anche se il provider è chiuso, ma per sicurezza controlliamo.
//        checkState();
//        delegate.close(bookieFileChannel);
//    }
//
//    @Override
//    public void close() {
//        // Qui sta la trappola: se JournalChannel chiama questo metodo,
//        // segniamo lo stato come chiuso.
//        this.isClosed = true;
//    }
//
//    // Helper per il test: verifica finale
//    public boolean isClosed() {
//        return isClosed;
//    }
//}