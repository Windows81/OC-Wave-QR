package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FileMetadata {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43366a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f43367b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f43368c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f43369d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f43370e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f43371f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f43372g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f43373h;

    public FileMetadata(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map map) {
        Intrinsics.i(map, "extras");
        this.f43366a = z2;
        this.f43367b = z3;
        this.f43368c = path;
        this.f43369d = l2;
        this.f43370e = l3;
        this.f43371f = l4;
        this.f43372g = l5;
        this.f43373h = MapsKt.s(map);
    }

    public static /* synthetic */ FileMetadata b(FileMetadata fileMetadata, boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map map, int i2, Object obj) {
        FileMetadata fileMetadata2 = fileMetadata;
        int i3 = i2;
        return fileMetadata.a((i3 & 1) != 0 ? fileMetadata2.f43366a : z2, (i3 & 2) != 0 ? fileMetadata2.f43367b : z3, (i3 & 4) != 0 ? fileMetadata2.f43368c : path, (i3 & 8) != 0 ? fileMetadata2.f43369d : l2, (i3 & 16) != 0 ? fileMetadata2.f43370e : l3, (i3 & 32) != 0 ? fileMetadata2.f43371f : l4, (i3 & 64) != 0 ? fileMetadata2.f43372g : l5, (i3 & 128) != 0 ? fileMetadata2.f43373h : map);
    }

    public final FileMetadata a(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map map) {
        Map map2 = map;
        Intrinsics.i(map2, "extras");
        return new FileMetadata(z2, z3, path, l2, l3, l4, l5, map2);
    }

    public final Long c() {
        return this.f43371f;
    }

    public final Long d() {
        return this.f43369d;
    }

    public final Path e() {
        return this.f43368c;
    }

    public final boolean f() {
        return this.f43367b;
    }

    public final boolean g() {
        return this.f43366a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f43366a) {
            arrayList.add("isRegularFile");
        }
        if (this.f43367b) {
            arrayList.add("isDirectory");
        }
        if (this.f43369d != null) {
            arrayList.add("byteCount=" + this.f43369d);
        }
        if (this.f43370e != null) {
            arrayList.add("createdAt=" + this.f43370e);
        }
        if (this.f43371f != null) {
            arrayList.add("lastModifiedAt=" + this.f43371f);
        }
        if (this.f43372g != null) {
            arrayList.add("lastAccessedAt=" + this.f43372g);
        }
        if (!this.f43373h.isEmpty()) {
            arrayList.add("extras=" + this.f43373h);
        }
        return CollectionsKt.n0(arrayList, ", ", "FileMetadata(", ")", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FileMetadata(boolean r10, boolean r11, okio.Path r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r4
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            java.util.Map r0 = kotlin.collections.MapsKt.h()
            goto L_0x003f
        L_0x003d:
            r0 = r17
        L_0x003f:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.FileMetadata.<init>(boolean, boolean, okio.Path, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
