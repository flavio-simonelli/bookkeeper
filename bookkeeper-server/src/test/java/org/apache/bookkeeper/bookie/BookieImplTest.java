package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.discover.BookieServiceInfo;
import org.apache.bookkeeper.discover.RegistrationManager;
import org.apache.bookkeeper.meta.NullMetadataBookieDriver;
import org.apache.bookkeeper.stats.NullStatsLogger;
import org.apache.bookkeeper.util.DiskChecker;
import org.junit.Test;

import java.io.IOException;
import java.util.function.Supplier;

public class BookieImplTest {
    @Test
    public void testBookieResources() throws IOException, InterruptedException, BookieException {
        ServerConfiguration conf = new ServerConfiguration();
        conf.setLedgerDirNames(new String[]{"/tmp/ledger1", "/tmp/ledger2"});
        conf.setJournalDirName("/tmp/journal");
        conf.setMetadataServiceUri("zk+null://127.0.0.1/ledgers");
        conf.setDiskUsageWarnThreshold(0.90f);
        conf.setDiskUsageThreshold(0.95f);

        DiskChecker diskChecker = BookieResources.createDiskChecker(conf);
        NullStatsLogger statsLogger = NullStatsLogger.INSTANCE;

        LedgerDirsManager ledgerDirsManager = BookieResources.createLedgerDirsManager(conf, diskChecker, statsLogger);
        LedgerDirsManager indexDirsManager = BookieResources.createIndexDirsManager(conf, diskChecker, statsLogger, ledgerDirsManager);

        ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;
        RegistrationManager rm = new NullMetadataBookieDriver().createRegistrationManager();

        LedgerStorage ledgerStorage = BookieResources.createLedgerStorage(
                conf, null, ledgerDirsManager, indexDirsManager, statsLogger, allocator);

        Supplier<BookieServiceInfo> serviceInfo = () -> null;

        BookieImpl bookie = new BookieImpl(
                conf,
                rm,
                ledgerStorage,
                diskChecker,
                ledgerDirsManager,
                indexDirsManager,
                statsLogger,
                allocator,
                serviceInfo
        );

        bookie.start();
        assert bookie.isRunning();
    }
}
