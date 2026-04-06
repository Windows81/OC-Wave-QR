package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    @Metadata
    public static final class DefaultImpls {
    }

    float b(long j2, float f2, float f3, float f4);

    long c(float f2, float f3, float f4);

    float d(float f2, float f3, float f4) {
        return b(c(f2, f3, f4), f2, f3, f4);
    }

    float e(long j2, float f2, float f3, float f4);

    VectorizedFloatAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedFloatAnimationSpec(this);
    }
}
