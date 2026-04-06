package kotlin.io.path;

import java.nio.file.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class PathsKt__PathUtilsKt extends PathsKt__PathRecursiveFunctionsKt {
    public static final String j(Path path) {
        Intrinsics.i(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        kotlin.io.CloseableKt.a(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List k(java.nio.file.Path r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ all -> 0x001a }
            java.util.List r2 = kotlin.collections.CollectionsKt.M0(r1)     // Catch:{ all -> 0x001a }
            r0 = 0
            kotlin.io.CloseableKt.a(r1, r0)
            return r2
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.k(java.nio.file.Path, java.lang.String):java.util.List");
    }

    public static /* synthetic */ List l(Path path, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "*";
        }
        return k(path, str);
    }

    public static final Path m(Path path, Path path2) {
        Intrinsics.i(path, "<this>");
        Intrinsics.i(path2, "base");
        try {
            return PathRelativizer.f40847a.a(path, path2);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e2);
        }
    }
}
