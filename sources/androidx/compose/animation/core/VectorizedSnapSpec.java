package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public final class VectorizedSnapSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2864a;

    public VectorizedSnapSpec(int i2) {
        this.f2864a = i2;
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return animationVector3;
    }

    public int d() {
        return this.f2864a;
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return j2 < ((long) d()) * 1000000 ? animationVector : animationVector2;
    }

    public int g() {
        return 0;
    }
}
