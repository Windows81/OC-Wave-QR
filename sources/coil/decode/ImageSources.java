package coil.decode;

import android.content.Context;
import coil.decode.ImageSource;
import java.io.Closeable;
import kotlin.Metadata;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

@Metadata
public final class ImageSources {
    public static final ImageSource a(BufferedSource bufferedSource, Context context) {
        return new SourceImageSource(bufferedSource, new ImageSources$ImageSource$1(context), (ImageSource.Metadata) null);
    }

    public static final ImageSource b(BufferedSource bufferedSource, Context context, ImageSource.Metadata metadata) {
        return new SourceImageSource(bufferedSource, new ImageSources$ImageSource$2(context), metadata);
    }

    public static final ImageSource c(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        return new FileImageSource(path, fileSystem, str, closeable, (ImageSource.Metadata) null);
    }

    public static /* synthetic */ ImageSource d(Path path, FileSystem fileSystem, String str, Closeable closeable, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fileSystem = FileSystem.f43375b;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            closeable = null;
        }
        return c(path, fileSystem, str, closeable);
    }
}
