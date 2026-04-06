package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

@Metadata
public final class SourceImageSource extends ImageSource {

    /* renamed from: A  reason: collision with root package name */
    public boolean f23389A;

    /* renamed from: B  reason: collision with root package name */
    public BufferedSource f23390B;
    public Function0 C;
    public Path D;

    /* renamed from: z  reason: collision with root package name */
    public final ImageSource.Metadata f23391z;

    public SourceImageSource(BufferedSource bufferedSource, Function0 function0, ImageSource.Metadata metadata) {
        super((DefaultConstructorMarker) null);
        this.f23391z = metadata;
        this.f23390B = bufferedSource;
        this.C = function0;
    }

    private final void c() {
        if (this.f23389A) {
            throw new IllegalStateException("closed");
        }
    }

    public ImageSource.Metadata a() {
        return this.f23391z;
    }

    public synchronized BufferedSource b() {
        c();
        BufferedSource bufferedSource = this.f23390B;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem d2 = d();
        Path path = this.D;
        Intrinsics.f(path);
        BufferedSource d3 = Okio.d(d2.t(path));
        this.f23390B = d3;
        return d3;
    }

    public synchronized void close() {
        try {
            this.f23389A = true;
            BufferedSource bufferedSource = this.f23390B;
            if (bufferedSource != null) {
                Utils.d(bufferedSource);
            }
            Path path = this.D;
            if (path != null) {
                d().h(path);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public FileSystem d() {
        return FileSystem.f43375b;
    }
}
