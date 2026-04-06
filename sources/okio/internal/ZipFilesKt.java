package okio.internal;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.BufferedSource;
import okio.FileMetadata;
import okio.Path;

@Metadata
public final class ZipFilesKt {
    public static final Map a(List list) {
        Path e2 = Path.Companion.e(Path.f43404A, "/", false, 1, (Object) null);
        Map l2 = MapsKt.l(TuplesKt.a(e2, new ZipEntry(e2, true, (String) null, 0, 0, 0, 0, (Long) null, 0, 508, (DefaultConstructorMarker) null)));
        for (ZipEntry zipEntry : CollectionsKt.D0(list, new ZipFilesKt$buildIndex$$inlined$sortedBy$1())) {
            if (((ZipEntry) l2.put(zipEntry.a(), zipEntry)) == null) {
                while (true) {
                    Path o2 = zipEntry.a().o();
                    if (o2 == null) {
                        break;
                    }
                    ZipEntry zipEntry2 = (ZipEntry) l2.get(o2);
                    if (zipEntry2 != null) {
                        zipEntry2.b().add(zipEntry.a());
                        break;
                    }
                    ZipEntry zipEntry3 = r4;
                    ZipEntry zipEntry4 = new ZipEntry(o2, true, (String) null, 0, 0, 0, 0, (Long) null, 0, 508, (DefaultConstructorMarker) null);
                    ZipEntry zipEntry5 = zipEntry3;
                    l2.put(o2, zipEntry5);
                    zipEntry5.b().add(zipEntry.a());
                    zipEntry = zipEntry5;
                }
            }
        }
        return l2;
    }

    public static final Long b(int i2, int i3) {
        if (i3 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = gregorianCalendar;
        gregorianCalendar2.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i3 >> 11) & 31, (i3 >> 5) & 63, (i3 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public static final String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i2, CharsKt.a(16));
        Intrinsics.h(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10.close();
        r4 = r4 - ((long) 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r4 <= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r4 = okio.Okio.d(r3.C(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r4.c1() != 117853008) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r5 = r4.c1();
        r12 = r4.p1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r4.c1() != 1) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r5 != 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r5 = okio.Okio.d(r3.C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10 = r5.c1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r10 != 101075792) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r8 = j(r5, r8);
        r10 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        kotlin.io.CloseableKt.a(r5, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        throw new java.io.IOException("bad zip: expected " + c(101075792) + " but was " + c(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        kotlin.io.CloseableKt.a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ca, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r5 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        kotlin.io.CloseableKt.a(r4, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        kotlin.io.CloseableKt.a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r4 = new java.util.ArrayList();
        r5 = okio.Okio.d(r3.C(r8.a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r12 = r8.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        if (r6 >= r12) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fd, code lost:
        r10 = e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (r10.f() >= r8.a()) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
        if (((java.lang.Boolean) r2.invoke(r10)).booleanValue() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        r4.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0120, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
        r2 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        kotlin.io.CloseableKt.a(r5, (java.lang.Throwable) null);
        r4 = new okio.ZipFileSystem(r0, r1, a(r4), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013a, code lost:
        kotlin.io.CloseableKt.a(r3, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0140, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        kotlin.io.CloseableKt.a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0144, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r8 = f(r10);
        r9 = r10.M((long) r8.b());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final okio.ZipFileSystem d(okio.Path r18, okio.FileSystem r19, kotlin.jvm.functions.Function1 r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "zipPath"
            kotlin.jvm.internal.Intrinsics.i(r0, r3)
            java.lang.String r3 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            java.lang.String r3 = "predicate"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            okio.FileHandle r3 = r1.o(r0)
            long r4 = r3.A()     // Catch:{ all -> 0x00d9 }
            r6 = 22
            long r6 = (long) r6     // Catch:{ all -> 0x00d9 }
            long r4 = r4 - r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x015f
            r8 = 65536(0x10000, double:3.2379E-319)
            long r8 = r4 - r8
            long r8 = java.lang.Math.max(r8, r6)     // Catch:{ all -> 0x00d9 }
        L_0x0030:
            okio.Source r10 = r3.C(r4)     // Catch:{ all -> 0x00d9 }
            okio.BufferedSource r10 = okio.Okio.d(r10)     // Catch:{ all -> 0x00d9 }
            int r11 = r10.c1()     // Catch:{ all -> 0x0145 }
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r11 != r12) goto L_0x0147
            okio.internal.EocdRecord r8 = f(r10)     // Catch:{ all -> 0x0145 }
            int r9 = r8.b()     // Catch:{ all -> 0x0145 }
            long r11 = (long) r9     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = r10.M(r11)     // Catch:{ all -> 0x0145 }
            r10.close()     // Catch:{ all -> 0x00d9 }
            r10 = 20
            long r10 = (long) r10     // Catch:{ all -> 0x00d9 }
            long r4 = r4 - r10
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r11 = 0
            if (r10 <= 0) goto L_0x00e4
            okio.Source r4 = r3.C(r4)     // Catch:{ all -> 0x00d9 }
            okio.BufferedSource r4 = okio.Okio.d(r4)     // Catch:{ all -> 0x00d9 }
            int r5 = r4.c1()     // Catch:{ all -> 0x0097 }
            r10 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r5 != r10) goto L_0x00d3
            int r5 = r4.c1()     // Catch:{ all -> 0x0097 }
            long r12 = r4.p1()     // Catch:{ all -> 0x0097 }
            int r10 = r4.c1()     // Catch:{ all -> 0x0097 }
            r14 = 1
            if (r10 != r14) goto L_0x00cb
            if (r5 != 0) goto L_0x00cb
            okio.Source r5 = r3.C(r12)     // Catch:{ all -> 0x0097 }
            okio.BufferedSource r5 = okio.Okio.d(r5)     // Catch:{ all -> 0x0097 }
            int r10 = r5.c1()     // Catch:{ all -> 0x009a }
            r12 = 101075792(0x6064b50, float:2.525793E-35)
            if (r10 != r12) goto L_0x009d
            okio.internal.EocdRecord r8 = j(r5, r8)     // Catch:{ all -> 0x009a }
            kotlin.Unit r10 = kotlin.Unit.f40552a     // Catch:{ all -> 0x009a }
            kotlin.io.CloseableKt.a(r5, r11)     // Catch:{ all -> 0x0097 }
            goto L_0x00d3
        L_0x0097:
            r0 = move-exception
            r1 = r0
            goto L_0x00dd
        L_0x009a:
            r0 = move-exception
            r1 = r0
            goto L_0x00c4
        L_0x009d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r1.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "bad zip: expected "
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = c(r12)     // Catch:{ all -> 0x009a }
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = " but was "
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = c(r10)     // Catch:{ all -> 0x009a }
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009a }
            r0.<init>(r1)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x00c4:
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.a(r5, r1)     // Catch:{ all -> 0x0097 }
            throw r2     // Catch:{ all -> 0x0097 }
        L_0x00cb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "unsupported zip: spanned"
            r0.<init>(r1)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x00d3:
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0097 }
            kotlin.io.CloseableKt.a(r4, r11)     // Catch:{ all -> 0x00d9 }
            goto L_0x00e4
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            goto L_0x017a
        L_0x00dd:
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.a(r4, r1)     // Catch:{ all -> 0x00d9 }
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x00e4:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00d9 }
            r4.<init>()     // Catch:{ all -> 0x00d9 }
            long r12 = r8.a()     // Catch:{ all -> 0x00d9 }
            okio.Source r5 = r3.C(r12)     // Catch:{ all -> 0x00d9 }
            okio.BufferedSource r5 = okio.Okio.d(r5)     // Catch:{ all -> 0x00d9 }
            long r12 = r8.c()     // Catch:{ all -> 0x011d }
        L_0x00f9:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x012c
            okio.internal.ZipEntry r10 = e(r5)     // Catch:{ all -> 0x011d }
            long r14 = r10.f()     // Catch:{ all -> 0x011d }
            long r16 = r8.a()     // Catch:{ all -> 0x011d }
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0124
            java.lang.Object r14 = r2.invoke(r10)     // Catch:{ all -> 0x011d }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x011d }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x011d }
            if (r14 == 0) goto L_0x0120
            r4.add(r10)     // Catch:{ all -> 0x011d }
            goto L_0x0120
        L_0x011d:
            r0 = move-exception
            r1 = r0
            goto L_0x013e
        L_0x0120:
            r14 = 1
            long r6 = r6 + r14
            goto L_0x00f9
        L_0x0124:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011d }
            java.lang.String r1 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r1)     // Catch:{ all -> 0x011d }
            throw r0     // Catch:{ all -> 0x011d }
        L_0x012c:
            kotlin.Unit r2 = kotlin.Unit.f40552a     // Catch:{ all -> 0x011d }
            kotlin.io.CloseableKt.a(r5, r11)     // Catch:{ all -> 0x00d9 }
            java.util.Map r2 = a(r4)     // Catch:{ all -> 0x00d9 }
            okio.ZipFileSystem r4 = new okio.ZipFileSystem     // Catch:{ all -> 0x00d9 }
            r4.<init>(r0, r1, r2, r9)     // Catch:{ all -> 0x00d9 }
            kotlin.io.CloseableKt.a(r3, r11)
            return r4
        L_0x013e:
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.a(r5, r1)     // Catch:{ all -> 0x00d9 }
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x0145:
            r0 = move-exception
            goto L_0x015b
        L_0x0147:
            r10.close()     // Catch:{ all -> 0x00d9 }
            r10 = -1
            long r4 = r4 + r10
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0153
            goto L_0x0030
        L_0x0153:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x015b:
            r10.close()     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x015f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "not a zip: size="
            r1.append(r2)     // Catch:{ all -> 0x00d9 }
            long r4 = r3.A()     // Catch:{ all -> 0x00d9 }
            r1.append(r4)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x017a:
            throw r1     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.a(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipFilesKt.d(okio.Path, okio.FileSystem, kotlin.jvm.functions.Function1):okio.ZipFileSystem");
    }

    public static final ZipEntry e(BufferedSource bufferedSource) {
        BufferedSource bufferedSource2 = bufferedSource;
        Intrinsics.i(bufferedSource2, "<this>");
        int c1 = bufferedSource.c1();
        if (c1 == 33639248) {
            bufferedSource2.skip(4);
            short l1 = bufferedSource.l1();
            short s2 = l1 & 65535;
            if ((l1 & 1) == 0) {
                short l12 = bufferedSource.l1() & 65535;
                Long b2 = b(bufferedSource.l1() & 65535, bufferedSource.l1() & 65535);
                long c12 = ((long) bufferedSource.c1()) & 4294967295L;
                Ref.LongRef longRef = new Ref.LongRef();
                longRef.f40907z = ((long) bufferedSource.c1()) & 4294967295L;
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.f40907z = ((long) bufferedSource.c1()) & 4294967295L;
                short l13 = bufferedSource.l1() & 65535;
                short l14 = bufferedSource.l1() & 65535;
                bufferedSource2.skip(8);
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.f40907z = ((long) bufferedSource.c1()) & 4294967295L;
                String M = bufferedSource2.M((long) (bufferedSource.l1() & 65535));
                if (!StringsKt.V(M, 0, false, 2, (Object) null)) {
                    long j2 = longRef2.f40907z == 4294967295L ? (long) 8 : 0;
                    long j3 = longRef.f40907z == 4294967295L ? j2 + ((long) 8) : j2;
                    String str = M;
                    if (longRef3.f40907z == 4294967295L) {
                        j3 += (long) 8;
                    }
                    long j4 = j3;
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    long j5 = c12;
                    ZipFilesKt$readEntry$1 zipFilesKt$readEntry$1 = r0;
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    String str2 = str;
                    Ref.LongRef longRef4 = longRef3;
                    ZipFilesKt$readEntry$1 zipFilesKt$readEntry$12 = new ZipFilesKt$readEntry$1(booleanRef, j4, longRef2, bufferedSource, longRef, longRef3);
                    g(bufferedSource2, l13, zipFilesKt$readEntry$1);
                    if (j4 <= 0 || booleanRef2.f40901z) {
                        String str3 = str2;
                        return new ZipEntry(Path.Companion.e(Path.f43404A, "/", false, 1, (Object) null).r(str3), StringsKt.A(str3, "/", false, 2, (Object) null), bufferedSource2.M((long) l14), j5, longRef.f40907z, longRef2.f40907z, l12, b2, longRef4.f40907z);
                    }
                    throw new IOException("bad zip: zip64 extra required but absent");
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(s2));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(c1));
    }

    public static final EocdRecord f(BufferedSource bufferedSource) {
        short l1 = bufferedSource.l1() & 65535;
        short l12 = bufferedSource.l1() & 65535;
        long l13 = (long) (bufferedSource.l1() & 65535);
        if (l13 == ((long) (bufferedSource.l1() & 65535)) && l1 == 0 && l12 == 0) {
            bufferedSource.skip(4);
            return new EocdRecord(l13, 4294967295L & ((long) bufferedSource.c1()), bufferedSource.l1() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void g(BufferedSource bufferedSource, int i2, Function2 function2) {
        long j2 = (long) i2;
        while (j2 != 0) {
            if (j2 >= 4) {
                short l1 = bufferedSource.l1() & 65535;
                long l12 = ((long) bufferedSource.l1()) & 65535;
                long j3 = j2 - ((long) 4);
                if (j3 >= l12) {
                    bufferedSource.v1(l12);
                    long n0 = bufferedSource.s().n0();
                    function2.m(Integer.valueOf(l1), Long.valueOf(l12));
                    long n02 = (bufferedSource.s().n0() + l12) - n0;
                    int i3 = (n02 > 0 ? 1 : (n02 == 0 ? 0 : -1));
                    if (i3 >= 0) {
                        if (i3 > 0) {
                            bufferedSource.s().skip(n02);
                        }
                        j2 = j3 - l12;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + l1);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final FileMetadata h(BufferedSource bufferedSource, FileMetadata fileMetadata) {
        Intrinsics.i(bufferedSource, "<this>");
        Intrinsics.i(fileMetadata, "basicMetadata");
        FileMetadata i2 = i(bufferedSource, fileMetadata);
        Intrinsics.f(i2);
        return i2;
    }

    public static final FileMetadata i(BufferedSource bufferedSource, FileMetadata fileMetadata) {
        BufferedSource bufferedSource2 = bufferedSource;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = fileMetadata != null ? fileMetadata.c() : null;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int c1 = bufferedSource.c1();
        if (c1 == 67324752) {
            bufferedSource2.skip(2);
            short l1 = bufferedSource.l1();
            short s2 = l1 & 65535;
            if ((l1 & 1) == 0) {
                bufferedSource2.skip(18);
                short l12 = bufferedSource.l1() & 65535;
                bufferedSource2.skip(((long) bufferedSource.l1()) & 65535);
                if (fileMetadata == null) {
                    bufferedSource2.skip((long) l12);
                    return null;
                }
                g(bufferedSource2, l12, new ZipFilesKt$readOrSkipLocalHeader$1(bufferedSource2, objectRef, objectRef2, objectRef3));
                return new FileMetadata(fileMetadata.g(), fileMetadata.f(), (Path) null, fileMetadata.d(), (Long) objectRef3.f40908z, (Long) objectRef.f40908z, (Long) objectRef2.f40908z, (Map) null, 128, (DefaultConstructorMarker) null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(s2));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(c1));
    }

    public static final EocdRecord j(BufferedSource bufferedSource, EocdRecord eocdRecord) {
        bufferedSource.skip(12);
        int c1 = bufferedSource.c1();
        int c12 = bufferedSource.c1();
        long p1 = bufferedSource.p1();
        if (p1 == bufferedSource.p1() && c1 == 0 && c12 == 0) {
            bufferedSource.skip(8);
            return new EocdRecord(p1, bufferedSource.p1(), eocdRecord.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(BufferedSource bufferedSource) {
        Intrinsics.i(bufferedSource, "<this>");
        i(bufferedSource, (FileMetadata) null);
    }
}
