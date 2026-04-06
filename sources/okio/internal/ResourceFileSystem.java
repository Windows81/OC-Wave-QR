package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;

@Metadata
public final class ResourceFileSystem extends FileSystem {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f43481h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final Path f43482i = Path.Companion.e(Path.f43404A, "/", false, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final ClassLoader f43483e;

    /* renamed from: f  reason: collision with root package name */
    public final FileSystem f43484f;

    /* renamed from: g  reason: collision with root package name */
    public final Lazy f43485g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Path b() {
            return ResourceFileSystem.f43482i;
        }

        public final boolean c(Path path) {
            return !StringsKt.z(path.l(), ".class", true);
        }

        public final Path d(Path path, Path path2) {
            Intrinsics.i(path, "<this>");
            Intrinsics.i(path2, "base");
            return b().r(StringsKt.J(StringsKt.D0(path.toString(), path2.toString()), '\\', '/', false, 4, (Object) null));
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z2, FileSystem fileSystem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z2, (i2 & 4) != 0 ? FileSystem.f43375b : fileSystem);
    }

    private final Path y(Path path) {
        return f43482i.x(path, true);
    }

    public final List A(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.h(resources, "getResources(...)");
        ArrayList<T> list = Collections.list(resources);
        Intrinsics.h(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            Intrinsics.f(t2);
            Pair B2 = B(t2);
            if (B2 != null) {
                arrayList.add(B2);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.h(resources2, "getResources(...)");
        ArrayList<T> list2 = Collections.list(resources2);
        Intrinsics.h(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : list2) {
            Intrinsics.f(t3);
            Pair C = C(t3);
            if (C != null) {
                arrayList2.add(C);
            }
        }
        return CollectionsKt.x0(arrayList, arrayList2);
    }

    public final Pair B(URL url) {
        if (!Intrinsics.d(url.getProtocol(), "file")) {
            return null;
        }
        return TuplesKt.a(this.f43484f, Path.Companion.d(Path.f43404A, new File(url.toURI()), false, 1, (Object) null));
    }

    public final Pair C(URL url) {
        int q0;
        String url2 = url.toString();
        Intrinsics.h(url2, "toString(...)");
        if (!StringsKt.Q(url2, "jar:file:", false, 2, (Object) null) || (q0 = StringsKt.q0(url2, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.f43404A;
        String substring = url2.substring(4, q0);
        Intrinsics.h(substring, "substring(...)");
        return TuplesKt.a(ZipFilesKt.d(Path.Companion.d(companion, new File(URI.create(substring)), false, 1, (Object) null), this.f43484f, ResourceFileSystem$toJarRoot$zip$1.f43487z), f43482i);
    }

    public final String D(Path path) {
        return y(path).p(f43482i).toString();
    }

    public Sink b(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        throw new IOException(this + " is read-only");
    }

    public void c(Path path, Path path2) {
        Intrinsics.i(path, "source");
        Intrinsics.i(path2, "target");
        throw new IOException(this + " is read-only");
    }

    public void g(Path path, boolean z2) {
        Intrinsics.i(path, "dir");
        throw new IOException(this + " is read-only");
    }

    public void i(Path path, boolean z2) {
        Intrinsics.i(path, "path");
        throw new IOException(this + " is read-only");
    }

    public List k(Path path) {
        Intrinsics.i(path, "dir");
        String D = D(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (Pair pair : z()) {
            FileSystem fileSystem = (FileSystem) pair.a();
            Path path2 = (Path) pair.b();
            try {
                ArrayList<Path> arrayList = new ArrayList<>();
                for (Object next : fileSystem.k(path2.r(D))) {
                    if (f43481h.c((Path) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
                for (Path d2 : arrayList) {
                    arrayList2.add(f43481h.d(d2, path2));
                }
                CollectionsKt.B(linkedHashSet, arrayList2);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return CollectionsKt.M0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public List l(Path path) {
        Intrinsics.i(path, "dir");
        String D = D(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = z().iterator();
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            Path path2 = (Path) pair.b();
            List l2 = ((FileSystem) pair.a()).l(path2.r(D));
            if (l2 != null) {
                ArrayList<Path> arrayList2 = new ArrayList<>();
                for (Object next : l2) {
                    if (f43481h.c((Path) next)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
                for (Path d2 : arrayList2) {
                    arrayList3.add(f43481h.d(d2, path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt.B(linkedHashSet, arrayList);
                z2 = true;
            }
        }
        if (z2) {
            return CollectionsKt.M0(linkedHashSet);
        }
        return null;
    }

    public FileMetadata n(Path path) {
        Intrinsics.i(path, "path");
        if (!f43481h.c(path)) {
            return null;
        }
        String D = D(path);
        for (Pair pair : z()) {
            FileMetadata n2 = ((FileSystem) pair.a()).n(((Path) pair.b()).r(D));
            if (n2 != null) {
                return n2;
            }
        }
        return null;
    }

    public FileHandle o(Path path) {
        Intrinsics.i(path, "file");
        if (f43481h.c(path)) {
            String D = D(path);
            for (Pair pair : z()) {
                try {
                    return ((FileSystem) pair.a()).o(((Path) pair.b()).r(D));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + path);
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public FileHandle q(Path path, boolean z2, boolean z3) {
        Intrinsics.i(path, "file");
        throw new IOException("resources are not writable");
    }

    public Sink s(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        throw new IOException(this + " is read-only");
    }

    public Source t(Path path) {
        Source k2;
        Intrinsics.i(path, "file");
        if (f43481h.c(path)) {
            Path path2 = f43482i;
            InputStream resourceAsStream = this.f43483e.getResourceAsStream(Path.y(path2, path, false, 2, (Object) null).p(path2).toString());
            if (resourceAsStream != null && (k2 = Okio.k(resourceAsStream)) != null) {
                return k2;
            }
            throw new FileNotFoundException("file not found: " + path);
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public final List z() {
        return (List) this.f43485g.getValue();
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z2, FileSystem fileSystem) {
        Intrinsics.i(classLoader, "classLoader");
        Intrinsics.i(fileSystem, "systemFileSystem");
        this.f43483e = classLoader;
        this.f43484f = fileSystem;
        this.f43485g = LazyKt.b(new ResourceFileSystem$roots$2(this));
        if (z2) {
            z().size();
        }
    }
}
