package coil.key;

import coil.request.Options;
import java.io.File;
import kotlin.Metadata;

@Metadata
public final class FileKeyer implements Keyer<File> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23479a;

    public FileKeyer(boolean z2) {
        this.f23479a = z2;
    }

    /* renamed from: b */
    public String a(File file, Options options) {
        if (!this.f23479a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
