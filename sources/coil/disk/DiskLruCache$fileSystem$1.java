package coil.disk;

import kotlin.Metadata;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

@Metadata
public final class DiskLruCache$fileSystem$1 extends ForwardingFileSystem {
    public DiskLruCache$fileSystem$1(FileSystem fileSystem) {
        super(fileSystem);
    }

    public Sink s(Path path, boolean z2) {
        Path o2 = path.o();
        if (o2 != null) {
            d(o2);
        }
        return super.s(path, z2);
    }
}
