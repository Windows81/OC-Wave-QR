package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean a();

    long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3);

    AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3);

    AnimationVector e(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return c(b(animationVector, animationVector2, animationVector3), animationVector, animationVector2, animationVector3);
    }

    AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3);
}
