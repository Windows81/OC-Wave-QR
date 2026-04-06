package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public interface DurationBasedAnimationSpec<T> extends FiniteAnimationSpec<T> {
    VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter);
}
