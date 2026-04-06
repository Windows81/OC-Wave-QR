package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class DecayAnimationSpecKt {
    public static final float a(DecayAnimationSpec decayAnimationSpec, float f2, float f3) {
        return ((AnimationVector1D) decayAnimationSpec.a(VectorConvertersKt.i(FloatCompanionObject.f40896a)).d(AnimationVectorsKt.a(f2), AnimationVectorsKt.a(f3))).f();
    }

    public static final DecayAnimationSpec b(float f2, float f3) {
        return d(new FloatExponentialDecaySpec(f2, f3));
    }

    public static /* synthetic */ DecayAnimationSpec c(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.1f;
        }
        return b(f2, f3);
    }

    public static final DecayAnimationSpec d(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }
}
