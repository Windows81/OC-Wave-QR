package okio;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import okio.internal.ZipEntry;

@Metadata
public final class ZipFileSystem extends FileSystem {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f43461i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final Path f43462j = Path.Companion.e(Path.f43404A, "/", false, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final Path f43463e;

    /* renamed from: f  reason: collision with root package name */
    public final FileSystem f43464f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f43465g;

    /* renamed from: h  reason: collision with root package name */
    public final String f43466h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ZipFileSystem(Path path, FileSystem fileSystem, Map map, String str) {
        Intrinsics.i(path, "zipPath");
        Intrinsics.i(fileSystem, "fileSystem");
        Intrinsics.i(map, "entries");
        this.f43463e = path;
        this.f43464f = fileSystem;
        this.f43465g = map;
        this.f43466h = str;
    }

    private final List v(Path path, boolean z2) {
        ZipEntry zipEntry = (ZipEntry) this.f43465g.get(u(path));
        if (zipEntry != null) {
            return CollectionsKt.M0(zipEntry.b());
        }
        if (!z2) {
            return null;
        }
        throw new IOException("not a directory: " + path);
    }

    public Sink b(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        throw new IOException("zip file systems are read-only");
    }

    public void c(Path path, Path path2) {
        Intrinsics.i(path, "source");
        Intrinsics.i(path2, "target");
        throw new IOException("zip file systems are read-only");
    }

    public void g(Path path, boolean z2) {
        Intrinsics.i(path, "dir");
        throw new IOException("zip file systems are read-only");
    }

    public void i(Path path, boolean z2) {
        Intrinsics.i(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    public List k(Path path) {
        Intrinsics.i(path, "dir");
        List v2 = v(path, true);
        Intrinsics.f(v2);
        return v2;
    }

    public List l(Path path) {
        Intrinsics.i(path, "dir");
        return v(path, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A[Catch:{ all -> 0x006e, all -> 0x0075, all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b A[SYNTHETIC, Splitter:B:36:0x008b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okio.FileMetadata n(okio.Path r14) {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            okio.Path r14 = r13.u(r14)
            java.util.Map r0 = r13.f43465g
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ZipEntry r14 = (okio.internal.ZipEntry) r14
            r0 = 0
            if (r14 != 0) goto L_0x0015
            return r0
        L_0x0015:
            okio.FileMetadata r12 = new okio.FileMetadata
            boolean r1 = r14.h()
            r2 = r1 ^ 1
            boolean r3 = r14.h()
            boolean r1 = r14.h()
            if (r1 == 0) goto L_0x0029
            r5 = r0
            goto L_0x0032
        L_0x0029:
            long r4 = r14.g()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r5 = r1
        L_0x0032:
            java.lang.Long r7 = r14.e()
            r10 = 128(0x80, float:1.794E-43)
            r11 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r14.f()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            return r12
        L_0x004c:
            okio.FileSystem r1 = r13.f43464f
            okio.Path r2 = r13.f43463e
            okio.FileHandle r1 = r1.o(r2)
            long r2 = r14.f()     // Catch:{ all -> 0x007a }
            okio.Source r14 = r1.C(r2)     // Catch:{ all -> 0x007a }
            okio.BufferedSource r14 = okio.Okio.d(r14)     // Catch:{ all -> 0x007a }
            okio.FileMetadata r2 = okio.internal.ZipFilesKt.h(r14, r12)     // Catch:{ all -> 0x006e }
            if (r14 == 0) goto L_0x006c
            r14.close()     // Catch:{ all -> 0x006a }
            goto L_0x006c
        L_0x006a:
            r14 = move-exception
            goto L_0x007e
        L_0x006c:
            r14 = r0
            goto L_0x007e
        L_0x006e:
            r2 = move-exception
            if (r14 == 0) goto L_0x007c
            r14.close()     // Catch:{ all -> 0x0075 }
            goto L_0x007c
        L_0x0075:
            r14 = move-exception
            kotlin.ExceptionsKt.a(r2, r14)     // Catch:{ all -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r14 = move-exception
            goto L_0x008c
        L_0x007c:
            r14 = r2
            r2 = r0
        L_0x007e:
            if (r14 != 0) goto L_0x008b
            kotlin.jvm.internal.Intrinsics.f(r2)     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0089 }
            goto L_0x0098
        L_0x0089:
            r0 = move-exception
            goto L_0x0098
        L_0x008b:
            throw r14     // Catch:{ all -> 0x007a }
        L_0x008c:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r14, r1)
        L_0x0096:
            r2 = r0
            r0 = r14
        L_0x0098:
            if (r0 != 0) goto L_0x009e
            kotlin.jvm.internal.Intrinsics.f(r2)
            return r2
        L_0x009e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.n(okio.Path):okio.FileMetadata");
    }

    public FileHandle o(Path path) {
        Intrinsics.i(path, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public FileHandle q(Path path, boolean z2, boolean z3) {
        Intrinsics.i(path, "file");
        throw new IOException("zip entries are not writable");
    }

    public Sink s(Path path, boolean z2) {
        Intrinsics.i(path, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okio.Source t(okio.Path r8) {
        /*
            r7 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            okio.Path r0 = r7.u(r8)
            java.util.Map r1 = r7.f43465g
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 == 0) goto L_0x0077
            okio.FileSystem r8 = r7.f43464f
            okio.Path r1 = r7.f43463e
            okio.FileHandle r8 = r8.o(r1)
            r1 = 0
            long r2 = r0.f()     // Catch:{ all -> 0x0030 }
            okio.Source r2 = r8.C(r2)     // Catch:{ all -> 0x0030 }
            okio.BufferedSource r2 = okio.Okio.d(r2)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x003e
            r8.close()     // Catch:{ all -> 0x002e }
            goto L_0x003e
        L_0x002e:
            r1 = move-exception
            goto L_0x003e
        L_0x0030:
            r2 = move-exception
            if (r8 == 0) goto L_0x003b
            r8.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r8 = move-exception
            kotlin.ExceptionsKt.a(r2, r8)
        L_0x003b:
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x003e:
            if (r1 != 0) goto L_0x0076
            kotlin.jvm.internal.Intrinsics.f(r2)
            okio.internal.ZipFilesKt.k(r2)
            int r8 = r0.d()
            r1 = 1
            if (r8 != 0) goto L_0x0057
            okio.internal.FixedLengthSource r8 = new okio.internal.FixedLengthSource
            long r3 = r0.g()
            r8.<init>(r2, r3, r1)
            goto L_0x0075
        L_0x0057:
            okio.InflaterSource r8 = new okio.InflaterSource
            okio.internal.FixedLengthSource r3 = new okio.internal.FixedLengthSource
            long r4 = r0.c()
            r3.<init>(r2, r4, r1)
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r1)
            r8.<init>((okio.Source) r3, (java.util.zip.Inflater) r2)
            okio.internal.FixedLengthSource r1 = new okio.internal.FixedLengthSource
            long r2 = r0.g()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L_0x0075:
            return r8
        L_0x0076:
            throw r1
        L_0x0077:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.t(okio.Path):okio.Source");
    }

    public final Path u(Path path) {
        return f43462j.x(path, true);
    }
}
