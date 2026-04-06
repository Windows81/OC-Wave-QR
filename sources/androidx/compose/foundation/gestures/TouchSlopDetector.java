package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TouchSlopDetector {

    /* renamed from: a  reason: collision with root package name */
    public final Orientation f3603a;

    /* renamed from: b  reason: collision with root package name */
    public long f3604b;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j2);
    }

    public final long a(PointerInputChange pointerInputChange, float f2) {
        long q2 = Offset.q(this.f3604b, Offset.p(pointerInputChange.h(), pointerInputChange.k()));
        this.f3604b = q2;
        return (this.f3603a == null ? Offset.k(q2) : Math.abs(d(q2))) >= f2 ? b(f2) : Offset.f15855b.b();
    }

    public final long b(float f2) {
        if (this.f3603a == null) {
            long j2 = this.f3604b;
            return Offset.p(this.f3604b, Offset.r(Offset.h(j2, Offset.k(j2)), f2));
        }
        float d2 = d(this.f3604b) - (Math.signum(d(this.f3604b)) * f2);
        float c2 = c(this.f3604b);
        if (this.f3603a == Orientation.Horizontal) {
            return Offset.e((((long) Float.floatToRawIntBits(d2)) << 32) | (((long) Float.floatToRawIntBits(c2)) & 4294967295L));
        }
        return Offset.e((((long) Float.floatToRawIntBits(c2)) << 32) | (((long) Float.floatToRawIntBits(d2)) & 4294967295L));
    }

    public final float c(long j2) {
        return Float.intBitsToFloat((int) (this.f3603a == Orientation.Horizontal ? j2 & 4294967295L : j2 >> 32));
    }

    public final float d(long j2) {
        return Float.intBitsToFloat((int) (this.f3603a == Orientation.Horizontal ? j2 >> 32 : j2 & 4294967295L));
    }

    public final void e() {
        this.f3604b = Offset.f15855b.c();
    }

    public TouchSlopDetector(Orientation orientation, long j2) {
        this.f3603a = orientation;
        this.f3604b = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : orientation, (i2 & 2) != 0 ? Offset.f15855b.c() : j2, (DefaultConstructorMarker) null);
    }
}
