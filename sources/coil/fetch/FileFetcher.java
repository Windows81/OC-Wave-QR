package coil.fetch;

import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import okio.FileSystem;
import okio.Path;

@Metadata
public final class FileFetcher implements Fetcher {

    /* renamed from: a  reason: collision with root package name */
    public final File f23444a;

    @Metadata
    public static final class Factory implements Fetcher.Factory<File> {
        /* renamed from: b */
        public Fetcher a(File file, Options options, ImageLoader imageLoader) {
            return new FileFetcher(file);
        }
    }

    public FileFetcher(File file) {
        this.f23444a = file;
    }

    public Object a(Continuation continuation) {
        return new SourceResult(ImageSources.d(Path.Companion.d(Path.f43404A, this.f23444a, false, 1, (Object) null), (FileSystem) null, (String) null, (Closeable) null, 14, (Object) null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.c(this.f23444a)), DataSource.DISK);
    }
}
