package androidx.compose.foundation.gestures;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List f3424a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f3425b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3426c;

    public DefaultDraggableAnchors(List list, float[] fArr) {
        this.f3424a = list;
        this.f3425b = fArr;
        list.size();
        int length = fArr.length;
        this.f3426c = fArr.length;
    }

    public Object a(float f2, boolean z2) {
        float[] fArr = this.f3425b;
        int length = fArr.length;
        int i2 = -1;
        int i3 = 0;
        float f3 = Float.POSITIVE_INFINITY;
        int i4 = 0;
        while (i3 < length) {
            float f4 = fArr[i3];
            int i5 = i4 + 1;
            float f5 = z2 ? f4 - f2 : f2 - f4;
            if (f5 < 0.0f) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if (f5 <= f3) {
                i2 = i4;
                f3 = f5;
            }
            i3++;
            i4 = i5;
        }
        return this.f3424a.get(i2);
    }

    public Object b(float f2) {
        float[] fArr = this.f3425b;
        int length = fArr.length;
        int i2 = -1;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i4 + 1;
            float abs = Math.abs(f2 - fArr[i3]);
            if (abs <= f3) {
                i2 = i4;
                f3 = abs;
            }
            i3++;
            i4 = i5;
        }
        return this.f3424a.get(i2);
    }

    public float c(Object obj) {
        int indexOf = this.f3424a.indexOf(obj);
        float[] fArr = this.f3425b;
        return (indexOf < 0 || indexOf > ArraysKt.j0(fArr)) ? ((Number) AnchoredDraggableKt.f3329b.invoke(Integer.valueOf(indexOf))).floatValue() : fArr[indexOf];
    }

    public boolean d(Object obj) {
        return this.f3424a.indexOf(obj) != -1;
    }

    public float e() {
        Float P0 = ArraysKt.P0(this.f3425b);
        if (P0 != null) {
            return P0.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        return Intrinsics.d(this.f3424a, defaultDraggableAnchors.f3424a) && Arrays.equals(this.f3425b, defaultDraggableAnchors.f3425b) && h() == defaultDraggableAnchors.h();
    }

    public float f() {
        Float N0 = ArraysKt.N0(this.f3425b);
        if (N0 != null) {
            return N0.floatValue();
        }
        return Float.NaN;
    }

    public Object g(int i2) {
        return CollectionsKt.h0(this.f3424a, i2);
    }

    public int h() {
        return this.f3426c;
    }

    public int hashCode() {
        return (((this.f3424a.hashCode() * 31) + Arrays.hashCode(this.f3425b)) * 31) + h();
    }

    public float i(int i2) {
        float[] fArr = this.f3425b;
        return (i2 < 0 || i2 > ArraysKt.j0(fArr)) ? ((Number) AnchoredDraggableKt.f3329b.invoke(Integer.valueOf(i2))).floatValue() : fArr[i2];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DraggableAnchors(anchors={");
        int h2 = h();
        for (int i2 = 0; i2 < h2; i2++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g(i2));
            sb2.append('=');
            sb2.append(i(i2));
            sb.append(sb2.toString());
            if (i2 < h() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        String sb3 = sb.toString();
        Intrinsics.h(sb3, "toString(...)");
        return sb3;
    }
}
