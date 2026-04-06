package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public interface DecayAnimationSpec<T> {
    VectorizedDecayAnimationSpec a(TwoWayConverter twoWayConverter);
}
