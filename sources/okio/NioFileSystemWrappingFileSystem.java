package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.path.PathsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Path;

@Metadata
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {

    /* renamed from: e  reason: collision with root package name */
    public final FileSystem f43398e;

    public Sink b(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        List c2 = CollectionsKt.c();
        c2.add(StandardOpenOption.APPEND);
        if (!z2) {
            c2.add(StandardOpenOption.CREATE);
        }
        List a2 = CollectionsKt.a(c2);
        Path z3 = z(path);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a2.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream newOutputStream = Files.newOutputStream(z3, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.h(newOutputStream, "newOutputStream(...)");
        return Okio.g(newOutputStream);
    }

    public void c(Path path, Path path2) {
        Intrinsics.i(path, "source");
        Intrinsics.i(path2, "target");
        try {
            Intrinsics.h(Files.move(z(path), z(path2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.f() == true) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(okio.Path r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            okio.FileMetadata r0 = r3.n(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.f()
            r2 = 1
            if (r0 != r2) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            if (r2 == 0) goto L_0x0031
            if (r5 != 0) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L_0x0031:
            java.nio.file.Path r5 = r3.z(r4)     // Catch:{ IOException -> 0x0047 }
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch:{ IOException -> 0x0047 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ IOException -> 0x0047 }
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch:{ IOException -> 0x0047 }
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch:{ IOException -> 0x0047 }
            java.lang.String r0 = "createDirectory(...)"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)     // Catch:{ IOException -> 0x0047 }
            return
        L_0x0047:
            r5 = move-exception
            if (r2 == 0) goto L_0x004b
            return
        L_0x004b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.NioFileSystemWrappingFileSystem.g(okio.Path, boolean):void");
    }

    public void i(Path path, boolean z2) {
        Intrinsics.i(path, "path");
        if (!Thread.interrupted()) {
            Path z3 = z(path);
            try {
                Files.delete(z3);
            } catch (NoSuchFileException unused) {
                if (z2) {
                    throw new FileNotFoundException("no such file: " + path);
                }
            } catch (IOException unused2) {
                if (Files.exists(z3, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw new IOException("failed to delete " + path);
                }
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
        return x(z(path));
    }

    public FileHandle o(Path path) {
        Intrinsics.i(path, "file");
        try {
            FileChannel open = FileChannel.open(z(path), new OpenOption[]{StandardOpenOption.READ});
            Intrinsics.f(open);
            return new NioFileSystemFileHandle(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public FileHandle q(Path path, boolean z2, boolean z3) {
        Intrinsics.i(path, "file");
        if (!z2 || !z3) {
            List c2 = CollectionsKt.c();
            c2.add(StandardOpenOption.READ);
            c2.add(StandardOpenOption.WRITE);
            if (z2) {
                c2.add(StandardOpenOption.CREATE_NEW);
            } else if (!z3) {
                c2.add(StandardOpenOption.CREATE);
            }
            List a2 = CollectionsKt.a(c2);
            try {
                Path z4 = z(path);
                StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a2.toArray(new StandardOpenOption[0]);
                FileChannel open = FileChannel.open(z4, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
                Intrinsics.f(open);
                return new NioFileSystemFileHandle(true, open);
            } catch (NoSuchFileException unused) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } else {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
    }

    public Sink s(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        List c2 = CollectionsKt.c();
        if (z2) {
            c2.add(StandardOpenOption.CREATE_NEW);
        }
        List a2 = CollectionsKt.a(c2);
        try {
            Path z3 = z(path);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a2.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream newOutputStream = Files.newOutputStream(z3, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.h(newOutputStream, "newOutputStream(...)");
            return Okio.g(newOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public Source t(Path path) {
        Intrinsics.i(path, "file");
        try {
            InputStream newInputStream = Files.newInputStream(z(path), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.h(newInputStream, "newInputStream(...)");
            return Okio.k(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public String toString() {
        String e2 = Reflection.b(this.f43398e.getClass()).e();
        Intrinsics.f(e2);
        return e2;
    }

    public final List u(Path path, boolean z2) {
        Path z3 = z(path);
        try {
            Iterable<Path> l2 = PathsKt.l(z3, (String) null, 1, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Path f2 : l2) {
                arrayList.add(Path.Companion.f(Path.f43404A, f2, false, 1, (Object) null));
            }
            CollectionsKt.z(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z2) {
                return null;
            }
            if (!Files.exists(z3, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException("no such file: " + path);
            }
            throw new IOException("failed to list " + path);
        }
    }

    public final java.nio.file.Path z(Path path) {
        java.nio.file.Path path2 = this.f43398e.getPath(path.toString(), new String[0]);
        Intrinsics.h(path2, "getPath(...)");
        return path2;
    }
}
