package okio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public abstract class ForwardingFileSystem extends FileSystem {

    /* renamed from: e  reason: collision with root package name */
    public final FileSystem f43378e;

    public ForwardingFileSystem(FileSystem fileSystem) {
        Intrinsics.i(fileSystem, "delegate");
        this.f43378e = fileSystem;
    }

    public Sink b(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        return this.f43378e.b(u(path, "appendingSink", "file"), z2);
    }

    public void c(Path path, Path path2) {
        Intrinsics.i(path, "source");
        Intrinsics.i(path2, "target");
        this.f43378e.c(u(path, "atomicMove", "source"), u(path2, "atomicMove", "target"));
    }

    public void g(Path path, boolean z2) {
        Intrinsics.i(path, "dir");
        this.f43378e.g(u(path, "createDirectory", "dir"), z2);
    }

    public void i(Path path, boolean z2) {
        Intrinsics.i(path, "path");
        this.f43378e.i(u(path, "delete", "path"), z2);
    }

    public List k(Path path) {
        Intrinsics.i(path, "dir");
        Path u2 = u(path, "list", "dir");
        ArrayList arrayList = new ArrayList();
        for (Path v2 : this.f43378e.k(u2)) {
            arrayList.add(v(v2, "list"));
        }
        CollectionsKt.z(arrayList);
        return arrayList;
    }

    public List l(Path path) {
        Intrinsics.i(path, "dir");
        List<Path> l2 = this.f43378e.l(u(path, "listOrNull", "dir"));
        if (l2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Path v2 : l2) {
            arrayList.add(v(v2, "listOrNull"));
        }
        CollectionsKt.z(arrayList);
        return arrayList;
    }

    public FileMetadata n(Path path) {
        Intrinsics.i(path, "path");
        FileMetadata n2 = this.f43378e.n(u(path, "metadataOrNull", "path"));
        if (n2 == null) {
            return null;
        }
        return n2.e() == null ? n2 : FileMetadata.b(n2, false, false, v(n2.e(), "metadataOrNull"), (Long) null, (Long) null, (Long) null, (Long) null, (Map) null, 251, (Object) null);
    }

    public FileHandle o(Path path) {
        Intrinsics.i(path, "file");
        return this.f43378e.o(u(path, "openReadOnly", "file"));
    }

    public FileHandle q(Path path, boolean z2, boolean z3) {
        Intrinsics.i(path, "file");
        return this.f43378e.q(u(path, "openReadWrite", "file"), z2, z3);
    }

    public Sink s(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        return this.f43378e.s(u(path, "sink", "file"), z2);
    }

    public Source t(Path path) {
        Intrinsics.i(path, "file");
        return this.f43378e.t(u(path, "source", "file"));
    }

    public String toString() {
        return Reflection.b(getClass()).e() + '(' + this.f43378e + ')';
    }

    public Path u(Path path, String str, String str2) {
        Intrinsics.i(path, "path");
        Intrinsics.i(str, "functionName");
        Intrinsics.i(str2, "parameterName");
        return path;
    }

    public Path v(Path path, String str) {
        Intrinsics.i(path, "path");
        Intrinsics.i(str, "functionName");
        return path;
    }
}
