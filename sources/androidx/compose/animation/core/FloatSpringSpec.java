package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FloatSpringSpec implements FloatAnimationSpec {

    /* renamed from: a  reason: collision with root package name */
    public final float f2570a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2571b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2572c;

    /* renamed from: d  reason: collision with root package name */
    public final SpringSimulation f2573d;

    public FloatSpringSpec(float f2, float f3, float f4) {
        this.f2570a = f2;
        this.f2571b = f3;
        this.f2572c = f4;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.c(f2);
        springSimulation.e(f3);
        this.f2573d = springSimulation;
    }

    public float b(long j2, float f2, float f3, float f4) {
        this.f2573d.d(f3);
        return Float.intBitsToFloat((int) (this.f2573d.f(f2, f4, j2 / 1000000) & 4294967295L));
    }

    public long c(float f2, float f3, float f4) {
        float b2 = this.f2573d.b();
        float a2 = this.f2573d.a();
        float f5 = f2 - f3;
        float f6 = this.f2572c;
        return SpringEstimationKt.b(b2, a2, f4 / f6, f5 / f6, 1.0f) * 1000000;
    }

    public float d(float f2, float f3, float f4) {
        return 0.0f;
    }

    public float e(long j2, float f2, float f3, float f4) {
        this.f2573d.d(f3);
        return Float.intBitsToFloat((int) (this.f2573d.f(f2, f4, j2 / 1000000) >> 32));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatSpringSpec(float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1500.0f : f3, (i2 & 4) != 0 ? 0.01f : f4);
    }
}
