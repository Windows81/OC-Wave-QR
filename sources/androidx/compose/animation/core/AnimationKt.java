package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class AnimationKt {
    public static final DecayAnimation a(FloatDecayAnimationSpec floatDecayAnimationSpec, float f2, float f3) {
        return new DecayAnimation(DecayAnimationSpecKt.d(floatDecayAnimationSpec), VectorConvertersKt.i(FloatCompanionObject.f40896a), (Object) Float.valueOf(f2), (AnimationVector) AnimationVectorsKt.a(f3));
    }

    public static final TargetBasedAnimation b(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3) {
        return new TargetBasedAnimation(animationSpec, twoWayConverter, obj, obj2, (AnimationVector) twoWayConverter.a().invoke(obj3));
    }

    public static final long c(Animation animation) {
        return animation.b() / 1000000;
    }
}
