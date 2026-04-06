package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Shapes {

    /* renamed from: a  reason: collision with root package name */
    public final CornerBasedShape f10986a;

    /* renamed from: b  reason: collision with root package name */
    public final CornerBasedShape f10987b;

    /* renamed from: c  reason: collision with root package name */
    public final CornerBasedShape f10988c;

    /* renamed from: d  reason: collision with root package name */
    public final CornerBasedShape f10989d;

    /* renamed from: e  reason: collision with root package name */
    public final CornerBasedShape f10990e;

    /* renamed from: f  reason: collision with root package name */
    public final CornerBasedShape f10991f;

    /* renamed from: g  reason: collision with root package name */
    public final CornerBasedShape f10992g;

    /* renamed from: h  reason: collision with root package name */
    public final CornerBasedShape f10993h;

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, CornerBasedShape cornerBasedShape6, CornerBasedShape cornerBasedShape7, CornerBasedShape cornerBasedShape8) {
        this.f10986a = cornerBasedShape;
        this.f10987b = cornerBasedShape2;
        this.f10988c = cornerBasedShape3;
        this.f10989d = cornerBasedShape4;
        this.f10990e = cornerBasedShape5;
        this.f10991f = cornerBasedShape6;
        this.f10992g = cornerBasedShape7;
        this.f10993h = cornerBasedShape8;
    }

    public final CornerBasedShape a() {
        return this.f10993h;
    }

    public final CornerBasedShape b() {
        return this.f10990e;
    }

    public final CornerBasedShape c() {
        return this.f10992g;
    }

    public final CornerBasedShape d() {
        return this.f10986a;
    }

    public final CornerBasedShape e() {
        return this.f10989d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.d(this.f10986a, shapes.f10986a) && Intrinsics.d(this.f10987b, shapes.f10987b) && Intrinsics.d(this.f10988c, shapes.f10988c) && Intrinsics.d(this.f10989d, shapes.f10989d) && Intrinsics.d(this.f10990e, shapes.f10990e) && Intrinsics.d(this.f10991f, shapes.f10991f) && Intrinsics.d(this.f10992g, shapes.f10992g) && Intrinsics.d(this.f10993h, shapes.f10993h);
    }

    public final CornerBasedShape f() {
        return this.f10991f;
    }

    public final CornerBasedShape g() {
        return this.f10988c;
    }

    public final CornerBasedShape h() {
        return this.f10987b;
    }

    public int hashCode() {
        return (((((((((((((this.f10986a.hashCode() * 31) + this.f10987b.hashCode()) * 31) + this.f10988c.hashCode()) * 31) + this.f10989d.hashCode()) * 31) + this.f10990e.hashCode()) * 31) + this.f10991f.hashCode()) * 31) + this.f10992g.hashCode()) * 31) + this.f10993h.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f10986a + ", small=" + this.f10987b + ", medium=" + this.f10988c + ", large=" + this.f10989d + ", largeIncreased=" + this.f10991f + ", extraLarge=" + this.f10990e + ", extralargeIncreased=" + this.f10992g + ", extraExtraLarge=" + this.f10993h + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Shapes(androidx.compose.foundation.shape.CornerBasedShape r4, androidx.compose.foundation.shape.CornerBasedShape r5, androidx.compose.foundation.shape.CornerBasedShape r6, androidx.compose.foundation.shape.CornerBasedShape r7, androidx.compose.foundation.shape.CornerBasedShape r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            androidx.compose.material3.ShapeDefaults r4 = androidx.compose.material3.ShapeDefaults.f10967a
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.e()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0014
            androidx.compose.material3.ShapeDefaults r5 = androidx.compose.material3.ShapeDefaults.f10967a
            androidx.compose.foundation.shape.CornerBasedShape r5 = r5.i()
        L_0x0014:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001f
            androidx.compose.material3.ShapeDefaults r5 = androidx.compose.material3.ShapeDefaults.f10967a
            androidx.compose.foundation.shape.CornerBasedShape r6 = r5.h()
        L_0x001f:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x002a
            androidx.compose.material3.ShapeDefaults r5 = androidx.compose.material3.ShapeDefaults.f10967a
            androidx.compose.foundation.shape.CornerBasedShape r7 = r5.f()
        L_0x002a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0035
            androidx.compose.material3.ShapeDefaults r5 = androidx.compose.material3.ShapeDefaults.f10967a
            androidx.compose.foundation.shape.CornerBasedShape r8 = r5.c()
        L_0x0035:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Shapes.<init>(androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Shapes(androidx.compose.foundation.shape.CornerBasedShape r11, androidx.compose.foundation.shape.CornerBasedShape r12, androidx.compose.foundation.shape.CornerBasedShape r13, androidx.compose.foundation.shape.CornerBasedShape r14, androidx.compose.foundation.shape.CornerBasedShape r15) {
        /*
            r10 = this;
            androidx.compose.material3.ShapeDefaults r0 = androidx.compose.material3.ShapeDefaults.f10967a
            androidx.compose.foundation.shape.CornerBasedShape r7 = r0.g()
            androidx.compose.foundation.shape.CornerBasedShape r8 = r0.d()
            androidx.compose.foundation.shape.CornerBasedShape r9 = r0.b()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Shapes.<init>(androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape):void");
    }
}
