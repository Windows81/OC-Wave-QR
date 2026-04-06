package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class AnimationStateKt {
    public static final AnimationState a(float f2, float f3, long j2, long j3, boolean z2) {
        return new AnimationState(VectorConvertersKt.i(FloatCompanionObject.f40896a), Float.valueOf(f2), AnimationVectorsKt.a(f3), j2, j3, z2);
    }

    public static final AnimationState b(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j2, long j3, boolean z2) {
        Object obj3 = obj2;
        return new AnimationState(twoWayConverter, obj, (AnimationVector) twoWayConverter.a().invoke(obj2), j2, j3, z2);
    }

    public static /* synthetic */ AnimationState c(float f2, float f3, long j2, long j3, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        long j4 = Long.MIN_VALUE;
        long j5 = (i2 & 4) != 0 ? Long.MIN_VALUE : j2;
        if ((i2 & 8) == 0) {
            j4 = j3;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return a(f2, f3, j5, j4, z2);
    }

    public static /* synthetic */ AnimationState d(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j2, long j3, boolean z2, int i2, Object obj3) {
        return b(twoWayConverter, obj, obj2, (i2 & 8) != 0 ? Long.MIN_VALUE : j2, (i2 & 16) != 0 ? Long.MIN_VALUE : j3, (i2 & 32) != 0 ? false : z2);
    }

    public static final AnimationState e(AnimationState animationState, float f2, float f3, long j2, long j3, boolean z2) {
        return new AnimationState(animationState.i(), Float.valueOf(f2), AnimationVectorsKt.a(f3), j2, j3, z2);
    }

    public static final AnimationState f(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2) {
        return new AnimationState(animationState.i(), obj, animationVector, j2, j3, z2);
    }

    public static /* synthetic */ AnimationState g(AnimationState animationState, float f2, float f3, long j2, long j3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((AnimationVector1D) animationState.t()).f();
        }
        float f4 = f3;
        if ((i2 & 4) != 0) {
            j2 = animationState.h();
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            j3 = animationState.g();
        }
        long j5 = j3;
        if ((i2 & 16) != 0) {
            z2 = animationState.u();
        }
        return e(animationState, f2, f4, j4, j5, z2);
    }

    public static /* synthetic */ AnimationState h(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i2 & 2) != 0) {
            animationVector = AnimationVectorsKt.e(animationState.t());
        }
        AnimationVector animationVector2 = animationVector;
        if ((i2 & 4) != 0) {
            j2 = animationState.h();
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            j3 = animationState.g();
        }
        long j5 = j3;
        if ((i2 & 16) != 0) {
            z2 = animationState.u();
        }
        return f(animationState, obj, animationVector2, j4, j5, z2);
    }

    public static final AnimationVector i(TwoWayConverter twoWayConverter, Object obj) {
        AnimationVector animationVector = (AnimationVector) twoWayConverter.a().invoke(obj);
        animationVector.d();
        return animationVector;
    }
}
