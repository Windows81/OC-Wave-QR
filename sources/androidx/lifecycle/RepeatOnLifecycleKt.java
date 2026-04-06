package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class RepeatOnLifecycleKt {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return Unit.f40552a;
        } else {
            Object f2 = CoroutineScopeKt.f(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, (Continuation) null), continuation);
            return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
        }
    }
}
