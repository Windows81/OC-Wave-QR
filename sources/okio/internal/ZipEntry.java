package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

@Metadata
public final class ZipEntry {

    /* renamed from: a  reason: collision with root package name */
    public final Path f43488a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f43489b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43490c;

    /* renamed from: d  reason: collision with root package name */
    public final long f43491d;

    /* renamed from: e  reason: collision with root package name */
    public final long f43492e;

    /* renamed from: f  reason: collision with root package name */
    public final long f43493f;

    /* renamed from: g  reason: collision with root package name */
    public final int f43494g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f43495h;

    /* renamed from: i  reason: collision with root package name */
    public final long f43496i;

    /* renamed from: j  reason: collision with root package name */
    public final List f43497j;

    public ZipEntry(Path path, boolean z2, String str, long j2, long j3, long j4, int i2, Long l2, long j5) {
        Intrinsics.i(path, "canonicalPath");
        Intrinsics.i(str, "comment");
        this.f43488a = path;
        this.f43489b = z2;
        this.f43490c = str;
        this.f43491d = j2;
        this.f43492e = j3;
        this.f43493f = j4;
        this.f43494g = i2;
        this.f43495h = l2;
        this.f43496i = j5;
        this.f43497j = new ArrayList();
    }

    public final Path a() {
        return this.f43488a;
    }

    public final List b() {
        return this.f43497j;
    }

    public final long c() {
        return this.f43492e;
    }

    public final int d() {
        return this.f43494g;
    }

    public final Long e() {
        return this.f43495h;
    }

    public final long f() {
        return this.f43496i;
    }

    public final long g() {
        return this.f43493f;
    }

    public final boolean h() {
        return this.f43489b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ZipEntry(okio.Path r14, boolean r15, java.lang.String r16, long r17, long r19, long r21, int r23, java.lang.Long r24, long r25, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r13 = this;
            r0 = r27
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r15
        L_0x0009:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = ""
            goto L_0x0012
        L_0x0010:
            r2 = r16
        L_0x0012:
            r3 = r0 & 8
            r4 = -1
            if (r3 == 0) goto L_0x001a
            r6 = r4
            goto L_0x001c
        L_0x001a:
            r6 = r17
        L_0x001c:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0022
            r8 = r4
            goto L_0x0024
        L_0x0022:
            r8 = r19
        L_0x0024:
            r3 = r0 & 32
            if (r3 == 0) goto L_0x002a
            r10 = r4
            goto L_0x002c
        L_0x002a:
            r10 = r21
        L_0x002c:
            r3 = r0 & 64
            if (r3 == 0) goto L_0x0032
            r3 = -1
            goto L_0x0034
        L_0x0032:
            r3 = r23
        L_0x0034:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x003a
            r12 = 0
            goto L_0x003c
        L_0x003a:
            r12 = r24
        L_0x003c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r4 = r25
        L_0x0043:
            r15 = r13
            r16 = r14
            r17 = r1
            r18 = r2
            r19 = r6
            r21 = r8
            r23 = r10
            r25 = r3
            r26 = r12
            r27 = r4
            r15.<init>(r16, r17, r18, r19, r21, r23, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipEntry.<init>(okio.Path, boolean, java.lang.String, long, long, long, int, java.lang.Long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
