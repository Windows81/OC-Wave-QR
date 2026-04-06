package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VectorizedAnimationSpecKt$createSpringAnimations$2 implements Animations {

    /* renamed from: a  reason: collision with root package name */
    public final FloatSpringSpec f2814a;

    public VectorizedAnimationSpecKt$createSpringAnimations$2(float f2, float f3) {
        this.f2814a = new FloatSpringSpec(f2, f3, 0.0f, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public FloatSpringSpec get(int i2) {
        return this.f2814a;
    }
}
