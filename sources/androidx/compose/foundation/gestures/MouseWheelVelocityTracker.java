package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;

@Metadata
final class MouseWheelVelocityTracker {

    /* renamed from: a  reason: collision with root package name */
    public final VelocityTracker1D f3548a = new VelocityTracker1D(true);

    /* renamed from: b  reason: collision with root package name */
    public final VelocityTracker1D f3549b = new VelocityTracker1D(true);

    public final void a(long j2, long j3) {
        this.f3548a.a(j2, Float.intBitsToFloat((int) (j3 >> 32)));
        this.f3549b.a(j2, Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public final long b() {
        return VelocityKt.a(this.f3548a.d(Float.MAX_VALUE), this.f3549b.d(Float.MAX_VALUE));
    }
}
