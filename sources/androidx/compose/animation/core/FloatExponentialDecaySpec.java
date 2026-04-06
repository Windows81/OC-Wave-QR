package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {

    /* renamed from: a  reason: collision with root package name */
    public final float f2568a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2569b;

    public FloatExponentialDecaySpec(float f2, float f3) {
        this.f2568a = Math.max(1.0E-7f, Math.abs(f3));
        this.f2569b = Math.max(1.0E-4f, f2) * -4.2f;
    }

    public float a() {
        return this.f2568a;
    }

    public float b(long j2, float f2, float f3) {
        return f3 * ((float) Math.exp((double) ((((float) (j2 / 1000000)) / 1000.0f) * this.f2569b)));
    }

    public long c(float f2, float f3) {
        return ((long) ((((float) Math.log((double) (a() / Math.abs(f3)))) * 1000.0f) / this.f2569b)) * 1000000;
    }

    public float d(float f2, float f3) {
        if (Math.abs(f3) <= a()) {
            return f2;
        }
        double log = Math.log((double) Math.abs(a() / f3));
        float f4 = this.f2569b;
        return (f2 - (f3 / f4)) + ((f3 / f4) * ((float) Math.exp((((double) f4) * ((log / ((double) f4)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    public float e(long j2, float f2, float f3) {
        float f4 = this.f2569b;
        return (f2 - (f3 / f4)) + ((f3 / f4) * ((float) Math.exp((double) ((f4 * ((float) (j2 / 1000000))) / 1000.0f))));
    }
}
