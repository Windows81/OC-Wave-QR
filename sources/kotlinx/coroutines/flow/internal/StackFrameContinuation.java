package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

@Metadata
final class StackFrameContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext f41814A;

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f41815z;

    public StackFrameContinuation(Continuation continuation, CoroutineContext coroutineContext) {
        this.f41815z = continuation;
        this.f41814A = coroutineContext;
    }

    public CoroutineStackFrame e() {
        Continuation continuation = this.f41815z;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public CoroutineContext f() {
        return this.f41814A;
    }

    public StackTraceElement p() {
        return null;
    }

    public void q(Object obj) {
        this.f41815z.q(obj);
    }
}
