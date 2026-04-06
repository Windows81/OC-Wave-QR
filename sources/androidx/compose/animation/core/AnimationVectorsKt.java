package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AnimationVectorsKt {
    public static final AnimationVector1D a(float f2) {
        return new AnimationVector1D(f2);
    }

    public static final AnimationVector2D b(float f2, float f3) {
        return new AnimationVector2D(f2, f3);
    }

    public static final AnimationVector3D c(float f2, float f3, float f4) {
        return new AnimationVector3D(f2, f3, f4);
    }

    public static final AnimationVector4D d(float f2, float f3, float f4, float f5) {
        return new AnimationVector4D(f2, f3, f4, f5);
    }

    public static final AnimationVector e(AnimationVector animationVector) {
        AnimationVector g2 = g(animationVector);
        int b2 = g2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            g2.e(i2, animationVector.a(i2));
        }
        return g2;
    }

    public static final void f(AnimationVector animationVector, AnimationVector animationVector2) {
        int b2 = animationVector.b();
        for (int i2 = 0; i2 < b2; i2++) {
            animationVector.e(i2, animationVector2.a(i2));
        }
    }

    public static final AnimationVector g(AnimationVector animationVector) {
        AnimationVector c2 = animationVector.c();
        Intrinsics.g(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c2;
    }
}
