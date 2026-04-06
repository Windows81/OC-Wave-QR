package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata
interface ApproachAnimation<T, V extends AnimationVector> {
    Object a(ScrollScope scrollScope, Object obj, Object obj2, Function1 function1, Continuation continuation);
}
