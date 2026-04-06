package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public interface AnimationSpec<T> {
    VectorizedAnimationSpec a(TwoWayConverter twoWayConverter);
}
