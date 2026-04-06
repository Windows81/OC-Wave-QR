package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* renamed from: a  reason: collision with root package name */
    public final float f4196a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f4196a = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    public float a() {
        return 0.0f;
    }

    public float b(long j2, float f2, float f3) {
        long c2 = c(0.0f, f3);
        return ((AndroidFlingSpline.FlingResult.d(AndroidFlingSpline.f3731a.b(c2 > 0 ? ((float) j2) / ((float) c2) : 1.0f)) * f(f3)) / ((float) c2)) * 1.0E9f;
    }

    public long c(float f2, float f3) {
        return (long) (Math.exp(g(f3) / WindowInsetsConnection_androidKt.f4210c) * 1.0E9d);
    }

    public float d(float f2, float f3) {
        return f2 + f(f3);
    }

    public float e(long j2, float f2, float f3) {
        long c2 = c(0.0f, f3);
        return f2 + (f(f3) * AndroidFlingSpline.FlingResult.c(AndroidFlingSpline.f3731a.b(c2 > 0 ? ((float) j2) / ((float) c2) : 1.0f)));
    }

    public final float f(float f2) {
        return ((float) (((double) (WindowInsetsConnection_androidKt.f4208a * this.f4196a)) * Math.exp((WindowInsetsConnection_androidKt.f4209b / WindowInsetsConnection_androidKt.f4210c) * g(f2)))) * Math.signum(f2);
    }

    public final double g(float f2) {
        return AndroidFlingSpline.f3731a.a(f2, WindowInsetsConnection_androidKt.f4208a * this.f4196a);
    }
}
