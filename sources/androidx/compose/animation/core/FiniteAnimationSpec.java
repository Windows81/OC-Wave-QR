package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public interface FiniteAnimationSpec<T> extends AnimationSpec<T> {
    VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter);
}
