package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

@Metadata
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements CoroutineStackFrame {
    public final Continuation C;

    public ScopeCoroutine(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, true, true);
        this.C = continuation;
    }

    public final boolean N0() {
        return true;
    }

    public final CoroutineStackFrame e() {
        Continuation continuation = this.C;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public void h0(Object obj) {
        DispatchedContinuationKt.b(IntrinsicsKt.c(this.C), CompletionStateKt.a(obj, this.C));
    }

    public final StackTraceElement p() {
        return null;
    }

    public void r1(Object obj) {
        Continuation continuation = this.C;
        continuation.q(CompletionStateKt.a(obj, continuation));
    }

    public void v1() {
    }
}
