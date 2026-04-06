package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* renamed from: a  reason: collision with root package name */
    public final FlingCalculator f2406a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f2406a = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.a(), density);
    }

    private final float f(float f2) {
        return this.f2406a.b(f2) * Math.signum(f2);
    }

    public float a() {
        return 0.0f;
    }

    public float b(long j2, float f2, float f3) {
        return this.f2406a.d(f3).b(j2 / 1000000);
    }

    public long c(float f2, float f3) {
        return this.f2406a.c(f3) * 1000000;
    }

    public float d(float f2, float f3) {
        return f2 + f(f3);
    }

    public float e(long j2, float f2, float f3) {
        return f2 + this.f2406a.d(f3).a(j2 / 1000000);
    }
}
