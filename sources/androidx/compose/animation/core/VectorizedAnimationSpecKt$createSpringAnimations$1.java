package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class VectorizedAnimationSpecKt$createSpringAnimations$1 implements Animations {

    /* renamed from: a  reason: collision with root package name */
    public final FloatSpringSpec[] f2813a;

    public VectorizedAnimationSpecKt$createSpringAnimations$1(AnimationVector animationVector, float f2, float f3) {
        int b2 = animationVector.b();
        FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[b2];
        for (int i2 = 0; i2 < b2; i2++) {
            floatSpringSpecArr[i2] = new FloatSpringSpec(f2, f3, animationVector.a(i2));
        }
        this.f2813a = floatSpringSpecArr;
    }

    /* renamed from: a */
    public FloatSpringSpec get(int i2) {
        return this.f2813a[i2];
    }
}
