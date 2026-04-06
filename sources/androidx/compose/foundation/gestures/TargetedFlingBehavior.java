package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata
public interface TargetedFlingBehavior extends FlingBehavior {
    Object a(ScrollScope scrollScope, float f2, Continuation continuation) {
        return b(scrollScope, f2, TargetedFlingBehaviorKt.f3601a, continuation);
    }

    Object b(ScrollScope scrollScope, float f2, Function1 function1, Continuation continuation);
}
