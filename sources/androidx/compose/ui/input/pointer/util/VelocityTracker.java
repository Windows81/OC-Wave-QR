package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VelocityTracker {

    /* renamed from: a  reason: collision with root package name */
    public final VelocityTracker1D.Strategy f16961a;

    /* renamed from: b  reason: collision with root package name */
    public final VelocityTracker1D f16962b;

    /* renamed from: c  reason: collision with root package name */
    public final VelocityTracker1D f16963c;

    /* renamed from: d  reason: collision with root package name */
    public long f16964d;

    /* renamed from: e  reason: collision with root package name */
    public long f16965e;

    public VelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTrackerKt.h() ? VelocityTracker1D.Strategy.Impulse : VelocityTracker1D.Strategy.Lsq2;
        this.f16961a = strategy;
        this.f16962b = new VelocityTracker1D(false, strategy, 1, (DefaultConstructorMarker) null);
        this.f16963c = new VelocityTracker1D(false, strategy, 1, (DefaultConstructorMarker) null);
        this.f16964d = Offset.f15855b.c();
    }

    public final void a(long j2, long j3) {
        this.f16962b.a(j2, Float.intBitsToFloat((int) (j3 >> 32)));
        this.f16963c.a(j2, Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public final long b(long j2) {
        if (!(Velocity.h(j2) > 0.0f && Velocity.i(j2) > 0.0f)) {
            InlineClassHelperKt.c("maximumVelocity should be a positive value. You specified=" + Velocity.n(j2));
        }
        return VelocityKt.a(this.f16962b.d(Velocity.h(j2)), this.f16963c.d(Velocity.i(j2)));
    }

    public final long c() {
        return this.f16964d;
    }

    public final long d() {
        return this.f16965e;
    }

    public final void e() {
        this.f16962b.e();
        this.f16963c.e();
        this.f16965e = 0;
    }

    public final void f(long j2) {
        this.f16964d = j2;
    }

    public final void g(long j2) {
        this.f16965e = j2;
    }
}
