package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextLayoutResultProxy {

    /* renamed from: a  reason: collision with root package name */
    public final TextLayoutResult f5978a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutCoordinates f5979b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutCoordinates f5980c;

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        this.f5978a = textLayoutResult;
        this.f5979b = layoutCoordinates;
        this.f5980c = layoutCoordinates2;
    }

    public static /* synthetic */ int e(TextLayoutResultProxy textLayoutResultProxy, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return textLayoutResultProxy.d(j2, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.f5979b
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0016
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.f5980c
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.J(r1, r0, r3, r4, r2)
            goto L_0x001c
        L_0x0016:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L_0x0024:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.b(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.a(long):long");
    }

    public final LayoutCoordinates b() {
        return this.f5980c;
    }

    public final LayoutCoordinates c() {
        return this.f5979b;
    }

    public final int d(long j2, boolean z2) {
        if (z2) {
            j2 = a(j2);
        }
        return this.f5978a.x(j(j2));
    }

    public final TextLayoutResult f() {
        return this.f5978a;
    }

    public final boolean g(long j2) {
        long j3 = j(a(j2));
        int r2 = this.f5978a.r(Float.intBitsToFloat((int) (4294967295L & j3)));
        int i2 = (int) (j3 >> 32);
        return Float.intBitsToFloat(i2) >= this.f5978a.s(r2) && Float.intBitsToFloat(i2) <= this.f5978a.t(r2);
    }

    public final void h(LayoutCoordinates layoutCoordinates) {
        this.f5980c = layoutCoordinates;
    }

    public final void i(LayoutCoordinates layoutCoordinates) {
        this.f5979b = layoutCoordinates;
    }

    public final long j(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f5979b;
        if (layoutCoordinates2 == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates3 = null;
        if (!layoutCoordinates2.b()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.f5980c) == null) {
            return j2;
        }
        if (layoutCoordinates.b()) {
            layoutCoordinates3 = layoutCoordinates;
        }
        return layoutCoordinates3 == null ? j2 : layoutCoordinates2.N(layoutCoordinates3, j2);
    }

    public final long k(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f5979b;
        if (layoutCoordinates2 == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates3 = null;
        if (!layoutCoordinates2.b()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.f5980c) == null) {
            return j2;
        }
        if (layoutCoordinates.b()) {
            layoutCoordinates3 = layoutCoordinates;
        }
        return layoutCoordinates3 == null ? j2 : layoutCoordinates3.N(layoutCoordinates2, j2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, (i2 & 2) != 0 ? null : layoutCoordinates, (i2 & 4) != 0 ? null : layoutCoordinates2);
    }
}
