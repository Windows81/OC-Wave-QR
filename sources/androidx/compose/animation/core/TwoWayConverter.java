package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public interface TwoWayConverter<T, V extends AnimationVector> {
    Function1 a();

    Function1 b();
}
