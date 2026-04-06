package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okio.FileMetadata;
import okio.Path;

@Metadata
/* renamed from: okio.internal.-FileSystem  reason: invalid class name */
public final class FileSystem {
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        if (r0 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        if (r7 != 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        r6.addLast(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00eb, code lost:
        r7 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0126, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
        r7.removeLast();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6 A[Catch:{ all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0120 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(kotlin.sequences.SequenceScope r15, okio.FileSystem r16, kotlin.collections.ArrayDeque r17, okio.Path r18, boolean r19, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            r0 = r15
            r1 = r18
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof okio.internal.FileSystem$collectRecursively$1
            if (r4 == 0) goto L_0x001a
            r4 = r3
            okio.internal.-FileSystem$collectRecursively$1 r4 = (okio.internal.FileSystem$collectRecursively$1) r4
            int r5 = r4.K
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.K = r5
            goto L_0x001f
        L_0x001a:
            okio.internal.-FileSystem$collectRecursively$1 r4 = new okio.internal.-FileSystem$collectRecursively$1
            r4.<init>(r3)
        L_0x001f:
            java.lang.Object r3 = r4.J
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r6 = r4.K
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x007c
            if (r6 == r10) goto L_0x0060
            if (r6 == r9) goto L_0x0040
            if (r6 != r8) goto L_0x0038
            kotlin.ResultKt.b(r3)
            goto L_0x0146
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            boolean r0 = r4.I
            boolean r1 = r4.H
            java.lang.Object r2 = r4.G
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r4.F
            okio.Path r6 = (okio.Path) r6
            java.lang.Object r7 = r4.E
            kotlin.collections.ArrayDeque r7 = (kotlin.collections.ArrayDeque) r7
            java.lang.Object r10 = r4.D
            okio.FileSystem r10 = (okio.FileSystem) r10
            java.lang.Object r11 = r4.C
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.ResultKt.b(r3)     // Catch:{ all -> 0x005d }
            goto L_0x00f0
        L_0x005d:
            r0 = move-exception
            goto L_0x0128
        L_0x0060:
            boolean r0 = r4.I
            boolean r1 = r4.H
            java.lang.Object r2 = r4.F
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r6 = r4.E
            kotlin.collections.ArrayDeque r6 = (kotlin.collections.ArrayDeque) r6
            java.lang.Object r10 = r4.D
            okio.FileSystem r10 = (okio.FileSystem) r10
            java.lang.Object r11 = r4.C
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.ResultKt.b(r3)
            r14 = r2
            r2 = r0
            r0 = r1
            r1 = r14
            goto L_0x00a6
        L_0x007c:
            kotlin.ResultKt.b(r3)
            if (r2 != 0) goto L_0x009c
            r4.C = r0
            r3 = r16
            r4.D = r3
            r6 = r17
            r4.E = r6
            r4.F = r1
            r11 = r19
            r4.H = r11
            r4.I = r2
            r4.K = r10
            java.lang.Object r10 = r15.c(r1, r4)
            if (r10 != r5) goto L_0x00a2
            return r5
        L_0x009c:
            r3 = r16
            r6 = r17
            r11 = r19
        L_0x00a2:
            r10 = r3
            r14 = r11
            r11 = r0
            r0 = r14
        L_0x00a6:
            java.util.List r3 = r10.l(r1)
            if (r3 != 0) goto L_0x00b0
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L_0x00b0:
            r12 = r3
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0130
            r12 = r1
        L_0x00ba:
            if (r0 == 0) goto L_0x00da
            boolean r13 = r6.contains(r12)
            if (r13 != 0) goto L_0x00c3
            goto L_0x00da
        L_0x00c3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "symlink cycle at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00da:
            okio.Path r13 = e(r10, r12)
            if (r13 != 0) goto L_0x012c
            if (r0 != 0) goto L_0x00e4
            if (r7 != 0) goto L_0x0130
        L_0x00e4:
            r6.addLast(r12)
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0126 }
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        L_0x00f0:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0120
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x005d }
            okio.Path r3 = (okio.Path) r3     // Catch:{ all -> 0x005d }
            r4.C = r11     // Catch:{ all -> 0x005d }
            r4.D = r10     // Catch:{ all -> 0x005d }
            r4.E = r7     // Catch:{ all -> 0x005d }
            r4.F = r6     // Catch:{ all -> 0x005d }
            r4.G = r2     // Catch:{ all -> 0x005d }
            r4.H = r1     // Catch:{ all -> 0x005d }
            r4.I = r0     // Catch:{ all -> 0x005d }
            r4.K = r9     // Catch:{ all -> 0x005d }
            r15 = r11
            r16 = r10
            r17 = r7
            r18 = r3
            r19 = r1
            r20 = r0
            r21 = r4
            java.lang.Object r3 = a(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x005d }
            if (r3 != r5) goto L_0x00f0
            return r5
        L_0x0120:
            r7.removeLast()
            r2 = r0
            r1 = r6
            goto L_0x0130
        L_0x0126:
            r0 = move-exception
            r7 = r6
        L_0x0128:
            r7.removeLast()
            throw r0
        L_0x012c:
            int r7 = r7 + 1
            r12 = r13
            goto L_0x00ba
        L_0x0130:
            if (r2 == 0) goto L_0x0149
            r0 = 0
            r4.C = r0
            r4.D = r0
            r4.E = r0
            r4.F = r0
            r4.G = r0
            r4.K = r8
            java.lang.Object r0 = r11.c(r1, r4)
            if (r0 != r5) goto L_0x0146
            return r5
        L_0x0146:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x0149:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.a(kotlin.sequences.SequenceScope, okio.FileSystem, kotlin.collections.ArrayDeque, okio.Path, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(okio.FileSystem fileSystem, Path path, boolean z2) {
        Intrinsics.i(fileSystem, "<this>");
        Intrinsics.i(path, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        Path path2 = path;
        while (path2 != null && !fileSystem.j(path2)) {
            arrayDeque.addFirst(path2);
            path2 = path2.o();
        }
        if (!z2 || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                fileSystem.f((Path) it.next());
            }
            return;
        }
        throw new IOException(path + " already exists.");
    }

    public static final boolean c(okio.FileSystem fileSystem, Path path) {
        Intrinsics.i(fileSystem, "<this>");
        Intrinsics.i(path, "path");
        return fileSystem.n(path) != null;
    }

    public static final FileMetadata d(okio.FileSystem fileSystem, Path path) {
        Intrinsics.i(fileSystem, "<this>");
        Intrinsics.i(path, "path");
        FileMetadata n2 = fileSystem.n(path);
        if (n2 != null) {
            return n2;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path e(okio.FileSystem fileSystem, Path path) {
        Intrinsics.i(fileSystem, "<this>");
        Intrinsics.i(path, "path");
        Path e2 = fileSystem.m(path).e();
        if (e2 == null) {
            return null;
        }
        Path o2 = path.o();
        Intrinsics.f(o2);
        return o2.t(e2);
    }
}
