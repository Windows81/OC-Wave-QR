package okio;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import okio.internal.ResourceFileSystem;

@Metadata
public abstract class FileSystem {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f43374a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final FileSystem f43375b;

    /* renamed from: c  reason: collision with root package name */
    public static final Path f43376c;

    /* renamed from: d  reason: collision with root package name */
    public static final FileSystem f43377d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        FileSystem fileSystem;
        try {
            Class.forName("java.nio.file.Files");
            fileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            fileSystem = new JvmSystemFileSystem();
        }
        f43375b = fileSystem;
        Path.Companion companion = Path.f43404A;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.h(property, "getProperty(...)");
        f43376c = Path.Companion.e(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.h(classLoader, "getClassLoader(...)");
        f43377d = new ResourceFileSystem(classLoader, false, (FileSystem) null, 4, (DefaultConstructorMarker) null);
    }

    public final Sink a(Path path) {
        Intrinsics.i(path, "file");
        return b(path, false);
    }

    public abstract Sink b(Path path, boolean z2);

    public abstract void c(Path path, Path path2);

    public final void d(Path path) {
        Intrinsics.i(path, "dir");
        e(path, false);
    }

    public final void e(Path path, boolean z2) {
        Intrinsics.i(path, "dir");
        okio.internal.FileSystem.b(this, path, z2);
    }

    public final void f(Path path) {
        Intrinsics.i(path, "dir");
        g(path, false);
    }

    public abstract void g(Path path, boolean z2);

    public final void h(Path path) {
        Intrinsics.i(path, "path");
        i(path, false);
    }

    public abstract void i(Path path, boolean z2);

    public final boolean j(Path path) {
        Intrinsics.i(path, "path");
        return okio.internal.FileSystem.c(this, path);
    }

    public abstract List k(Path path);

    public abstract List l(Path path);

    public final FileMetadata m(Path path) {
        Intrinsics.i(path, "path");
        return okio.internal.FileSystem.d(this, path);
    }

    public abstract FileMetadata n(Path path);

    public abstract FileHandle o(Path path);

    public final FileHandle p(Path path) {
        Intrinsics.i(path, "file");
        return q(path, false, false);
    }

    public abstract FileHandle q(Path path, boolean z2, boolean z3);

    public final Sink r(Path path) {
        Intrinsics.i(path, "file");
        return s(path, false);
    }

    public abstract Sink s(Path path, boolean z2);

    public abstract Source t(Path path);
}
