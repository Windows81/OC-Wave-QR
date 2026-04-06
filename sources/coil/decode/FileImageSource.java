package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

@Metadata
public final class FileImageSource extends ImageSource {

    /* renamed from: A  reason: collision with root package name */
    public final FileSystem f23379A;

    /* renamed from: B  reason: collision with root package name */
    public final String f23380B;
    public final Closeable C;
    public final ImageSource.Metadata D;
    public boolean E;
    public BufferedSource F;

    /* renamed from: z  reason: collision with root package name */
    public final Path f23381z;

    public FileImageSource(Path path, FileSystem fileSystem, String str, Closeable closeable, ImageSource.Metadata metadata) {
        super((DefaultConstructorMarker) null);
        this.f23381z = path;
        this.f23379A = fileSystem;
        this.f23380B = str;
        this.C = closeable;
        this.D = metadata;
    }

    public ImageSource.Metadata a() {
        return this.D;
    }

    public synchronized BufferedSource b() {
        c();
        BufferedSource bufferedSource = this.F;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        BufferedSource d2 = Okio.d(f().t(this.f23381z));
        this.F = d2;
        return d2;
    }

    public final void c() {
        if (this.E) {
            throw new IllegalStateException("closed");
        }
    }

    public synchronized void close() {
        try {
            this.E = true;
            BufferedSource bufferedSource = this.F;
            if (bufferedSource != null) {
                Utils.d(bufferedSource);
            }
            Closeable closeable = this.C;
            if (closeable != null) {
                Utils.d(closeable);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final String d() {
        return this.f23380B;
    }

    public FileSystem f() {
        return this.f23379A;
    }
}
