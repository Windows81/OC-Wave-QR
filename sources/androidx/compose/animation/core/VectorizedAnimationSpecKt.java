package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class VectorizedAnimationSpecKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2810a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f2811b = new float[0];

    /* renamed from: c  reason: collision with root package name */
    public static final ArcSpline f2812c = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long e(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, long j2) {
        long d2 = j2 - ((long) vectorizedDurationBasedAnimationSpec.d());
        long g2 = (long) vectorizedDurationBasedAnimationSpec.g();
        if (d2 < 0) {
            d2 = 0;
        }
        return d2 > g2 ? g2 : d2;
    }

    public static final Animations f(AnimationVector animationVector, float f2, float f3) {
        return animationVector != null ? new VectorizedAnimationSpecKt$createSpringAnimations$1(animationVector, f2, f3) : new VectorizedAnimationSpecKt$createSpringAnimations$2(f2, f3);
    }

    public static final AnimationVector g(VectorizedAnimationSpec vectorizedAnimationSpec, long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return vectorizedAnimationSpec.f(j2 * 1000000, animationVector, animationVector2, animationVector3);
    }
}
