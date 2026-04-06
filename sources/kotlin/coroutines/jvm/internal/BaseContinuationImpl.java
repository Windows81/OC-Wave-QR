package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class BaseContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f40734z;

    public BaseContinuationImpl(Continuation continuation) {
        this.f40734z = continuation;
    }

    public CoroutineStackFrame e() {
        Continuation continuation = this.f40734z;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public StackTraceElement p() {
        return DebugMetadataKt.d(this);
    }

    public final void q(Object obj) {
        Continuation continuation = this;
        while (true) {
            DebugProbesKt.b(continuation);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) continuation;
            Continuation continuation2 = baseContinuationImpl.f40734z;
            Intrinsics.f(continuation2);
            try {
                Object x2 = baseContinuationImpl.x(obj);
                if (x2 != IntrinsicsKt.f()) {
                    obj = Result.b(x2);
                    baseContinuationImpl.y();
                    if (continuation2 instanceof BaseContinuationImpl) {
                        continuation = continuation2;
                    } else {
                        continuation2.q(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.Companion companion = Result.f40519A;
                obj = Result.b(ResultKt.a(th));
            }
        }
    }

    public Continuation s(Object obj, Continuation continuation) {
        Intrinsics.i(continuation, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object p2 = p();
        if (p2 == null) {
            p2 = getClass().getName();
        }
        sb.append(p2);
        return sb.toString();
    }

    public final Continuation v() {
        return this.f40734z;
    }

    public abstract Object x(Object obj);

    public void y() {
    }
}
