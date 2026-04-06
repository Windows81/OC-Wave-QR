package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float a();

    long b(AnimationVector animationVector, AnimationVector animationVector2);

    AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2);

    AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2);

    AnimationVector e(long j2, AnimationVector animationVector, AnimationVector animationVector2);
}
