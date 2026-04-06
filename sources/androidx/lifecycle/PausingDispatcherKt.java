package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class PausingDispatcherKt {
    public static final Object a(Lifecycle lifecycle, Function2 function2, Continuation continuation) {
        return d(lifecycle, Lifecycle.State.CREATED, function2, continuation);
    }

    public static final Object b(Lifecycle lifecycle, Function2 function2, Continuation continuation) {
        return d(lifecycle, Lifecycle.State.RESUMED, function2, continuation);
    }

    public static final Object c(Lifecycle lifecycle, Function2 function2, Continuation continuation) {
        return d(lifecycle, Lifecycle.State.STARTED, function2, continuation);
    }

    public static final Object d(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        return BuildersKt.g(Dispatchers.c().H0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, function2, (Continuation) null), continuation);
    }
}
