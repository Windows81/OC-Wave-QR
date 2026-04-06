package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PointerInputEventData {

    /* renamed from: a  reason: collision with root package name */
    public final long f16896a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16897b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16898c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16899d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16900e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16901f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16902g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16903h;

    /* renamed from: i  reason: collision with root package name */
    public final List f16904i;

    /* renamed from: j  reason: collision with root package name */
    public final long f16905j;

    /* renamed from: k  reason: collision with root package name */
    public final long f16906k;

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List list, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, z2, f2, i2, z3, list, j6, j7);
    }

    public final boolean a() {
        return this.f16903h;
    }

    public final boolean b() {
        return this.f16900e;
    }

    public final List c() {
        return this.f16904i;
    }

    public final long d() {
        return this.f16896a;
    }

    public final long e() {
        return this.f16906k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.c(this.f16896a, pointerInputEventData.f16896a) && this.f16897b == pointerInputEventData.f16897b && Offset.j(this.f16898c, pointerInputEventData.f16898c) && Offset.j(this.f16899d, pointerInputEventData.f16899d) && this.f16900e == pointerInputEventData.f16900e && Float.compare(this.f16901f, pointerInputEventData.f16901f) == 0 && PointerType.h(this.f16902g, pointerInputEventData.f16902g) && this.f16903h == pointerInputEventData.f16903h && Intrinsics.d(this.f16904i, pointerInputEventData.f16904i) && Offset.j(this.f16905j, pointerInputEventData.f16905j) && Offset.j(this.f16906k, pointerInputEventData.f16906k);
    }

    public final long f() {
        return this.f16899d;
    }

    public final long g() {
        return this.f16898c;
    }

    public final float h() {
        return this.f16901f;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.d(this.f16896a) * 31) + Long.hashCode(this.f16897b)) * 31) + Offset.o(this.f16898c)) * 31) + Offset.o(this.f16899d)) * 31) + Boolean.hashCode(this.f16900e)) * 31) + Float.hashCode(this.f16901f)) * 31) + PointerType.i(this.f16902g)) * 31) + Boolean.hashCode(this.f16903h)) * 31) + this.f16904i.hashCode()) * 31) + Offset.o(this.f16905j)) * 31) + Offset.o(this.f16906k);
    }

    public final long i() {
        return this.f16905j;
    }

    public final int j() {
        return this.f16902g;
    }

    public final long k() {
        return this.f16897b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + PointerId.e(this.f16896a) + ", uptime=" + this.f16897b + ", positionOnScreen=" + Offset.s(this.f16898c) + ", position=" + Offset.s(this.f16899d) + ", down=" + this.f16900e + ", pressure=" + this.f16901f + ", type=" + PointerType.j(this.f16902g) + ", activeHover=" + this.f16903h + ", historical=" + this.f16904i + ", scrollDelta=" + Offset.s(this.f16905j) + ", originalEventPosition=" + Offset.s(this.f16906k) + ')';
    }

    public PointerInputEventData(long j2, long j3, long j4, long j5, boolean z2, float f2, int i2, boolean z3, List list, long j6, long j7) {
        this.f16896a = j2;
        this.f16897b = j3;
        this.f16898c = j4;
        this.f16899d = j5;
        this.f16900e = z2;
        this.f16901f = f2;
        this.f16902g = i2;
        this.f16903h = z3;
        this.f16904i = list;
        this.f16905j = j6;
        this.f16906k = j7;
    }
}
