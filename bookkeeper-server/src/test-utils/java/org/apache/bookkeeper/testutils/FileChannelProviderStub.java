package org.apache.bookkeeper.testutils;

import lombok.Setter;
import org.apache.bookkeeper.bookie.BookieFileChannel;
import org.apache.bookkeeper.bookie.FileChannelProvider;
import org.apache.bookkeeper.conf.ServerConfiguration;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileChannelProviderStub implements FileChannelProvider {
    // configurazione
    @Setter
    private boolean supportReuseFile = false;
    private boolean isClose =  false;

    private void checkState() {
        if (isClose) {
            throw new IllegalStateException("ERRORE GRAVE: Tentativo di usare il FileChannelProvider dopo che è stato chiuso!");
        }
    }

    @Override
    public BookieFileChannel open(File file, ServerConfiguration configuration) throws IOException {
        checkState();
        return new LazyBookieFileChannel(file);
    }

    @Override
    public void close(BookieFileChannel bookieFileChannel) throws IOException {
        checkState();
        if ( bookieFileChannel != null ) {
            bookieFileChannel.close();
        }
    }

    @Override
    public void close() {
        this.isClose = true;
    }

    @Override
    public boolean supportReuseFile() {
        checkState();
        return this.supportReuseFile;
    }

    // inner class
    static class LazyBookieFileChannel implements BookieFileChannel {

        private final File file;
        private RandomAccessFile randomAccessFile;

        public LazyBookieFileChannel(File file) {
            this.file = file;
        }

        @Override
        public FileChannel getFileChannel() throws FileNotFoundException {
            if (randomAccessFile == null) {
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            return randomAccessFile.getChannel();
        }

        @Override
        public boolean fileExists(File file) {
            return file.exists();
        }

        @Override
        public FileDescriptor getFD() throws IOException {
            if (randomAccessFile == null) {
                throw new IOException("randomAccessFile is null, please initialize it by calling getFileChannel");
            }
            return randomAccessFile.getFD();
        }

        @Override
        public void close() throws IOException {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }
}
