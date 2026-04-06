package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T>, CoroutineStackFrame {
    public final FlowCollector C;
    public final CoroutineContext D;
    public final int E;
    public CoroutineContext F;
    public Continuation G;

    public SafeCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.f41806z, EmptyCoroutineContext.f40721z);
        this.C = flowCollector;
        this.D = coroutineContext;
        this.E = ((Number) coroutineContext.k(0, new a())).intValue();
    }

    public static final int C(int i2, CoroutineContext.Element element) {
        return i2 + 1;
    }

    public final void B(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof DownstreamExceptionContext) {
            E((DownstreamExceptionContext) coroutineContext2, obj);
        }
        SafeCollector_commonKt.b(this, coroutineContext);
    }

    public final Object D(Continuation continuation, Object obj) {
        CoroutineContext f2 = continuation.f();
        JobKt.i(f2);
        CoroutineContext coroutineContext = this.F;
        if (coroutineContext != f2) {
            B(f2, coroutineContext, obj);
            this.F = f2;
        }
        this.G = continuation;
        Function3 a2 = SafeCollectorKt.f41811a;
        FlowCollector flowCollector = this.C;
        Intrinsics.g(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object d2 = a2.d(flowCollector, obj, this);
        if (!Intrinsics.d(d2, IntrinsicsKt.f())) {
            this.G = null;
        }
        return d2;
    }

    public final void E(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(StringsKt.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.f41802A + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object c(Object obj, Continuation continuation) {
        try {
            Object D2 = D(continuation, obj);
            if (D2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return D2 == IntrinsicsKt.f() ? D2 : Unit.f40552a;
        } catch (Throwable th) {
            this.F = new DownstreamExceptionContext(th, continuation.f());
            throw th;
        }
    }

    public CoroutineStackFrame e() {
        Continuation continuation = this.G;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public CoroutineContext f() {
        CoroutineContext coroutineContext = this.F;
        return coroutineContext == null ? EmptyCoroutineContext.f40721z : coroutineContext;
    }

    public StackTraceElement p() {
        return null;
    }

    public Object x(Object obj) {
        Throwable e2 = Result.e(obj);
        if (e2 != null) {
            this.F = new DownstreamExceptionContext(e2, f());
        }
        Continuation continuation = this.G;
        if (continuation != null) {
            continuation.q(obj);
        }
        return IntrinsicsKt.f();
    }

    public void y() {
        super.y();
    }
}
