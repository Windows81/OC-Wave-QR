package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    @Metadata
    public static final class DefaultImpls {
    }

    long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return ((long) (d() + g())) * 1000000;
    }

    int d();

    int g();
}
