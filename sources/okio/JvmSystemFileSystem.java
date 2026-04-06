package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class JvmSystemFileSystem extends FileSystem {
    private final List u(Path path, boolean z2) {
        File z3 = path.z();
        String[] list = z3.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.f(str);
                arrayList.add(path.r(str));
            }
            CollectionsKt.z(arrayList);
            return arrayList;
        } else if (!z2) {
            return null;
        } else {
            if (!z3.exists()) {
                throw new FileNotFoundException("no such file: " + path);
            }
            throw new IOException("failed to list " + path);
        }
    }

    public Sink b(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        if (z2) {
            w(path);
        }
        return Okio.f(path.z(), true);
    }

    public void c(Path path, Path path2) {
        Intrinsics.i(path, "source");
        Intrinsics.i(path2, "target");
        if (!path.z().renameTo(path2.z())) {
            throw new IOException("failed to move " + path + " to " + path2);
        }
    }

    public void g(Path path, boolean z2) {
        Intrinsics.i(path, "dir");
        if (!path.z().mkdir()) {
            FileMetadata n2 = n(path);
            if (n2 == null || !n2.f()) {
                throw new IOException("failed to create directory: " + path);
            } else if (z2) {
                throw new IOException(path + " already exists.");
            }
        }
    }

    public void i(Path path, boolean z2) {
        Intrinsics.i(path, "path");
        if (!Thread.interrupted()) {
            File z3 = path.z();
            if (z3.delete()) {
                return;
            }
            if (z3.exists()) {
                throw new IOException("failed to delete " + path);
            } else if (z2) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }

    public List k(Path path) {
        Intrinsics.i(path, "dir");
        List u2 = u(path, true);
        Intrinsics.f(u2);
        return u2;
    }

    public List l(Path path) {
        Intrinsics.i(path, "dir");
        return u(path, false);
    }

    public FileMetadata n(Path path) {
        Intrinsics.i(path, "path");
        File z2 = path.z();
        boolean isFile = z2.isFile();
        boolean isDirectory = z2.isDirectory();
        long lastModified = z2.lastModified();
        long length = z2.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !z2.exists()) {
            return null;
        }
        return new FileMetadata(isFile, isDirectory, (Path) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, (Map) null, 128, (DefaultConstructorMarker) null);
    }

    public FileHandle o(Path path) {
        Intrinsics.i(path, "file");
        return new JvmFileHandle(false, new RandomAccessFile(path.z(), "r"));
    }

    public FileHandle q(Path path, boolean z2, boolean z3) {
        Intrinsics.i(path, "file");
        if (!z2 || !z3) {
            if (z2) {
                v(path);
            }
            if (z3) {
                w(path);
            }
            return new JvmFileHandle(true, new RandomAccessFile(path.z(), "rw"));
        }
        throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
    }

    public Sink s(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        if (z2) {
            v(path);
        }
        return Okio__JvmOkioKt.g(path.z(), false, 1, (Object) null);
    }

    public Source t(Path path) {
        Intrinsics.i(path, "file");
        return Okio.j(path.z());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    public final void v(Path path) {
        if (j(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    public final void w(Path path) {
        if (!j(path)) {
            throw new IOException(path + " doesn't exist.");
        }
    }
}
