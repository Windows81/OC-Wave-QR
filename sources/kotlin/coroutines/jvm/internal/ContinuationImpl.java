package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ContinuationImpl extends BaseContinuationImpl {

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext f40736A;

    /* renamed from: B  reason: collision with root package name */
    public transient Continuation f40737B;

    public ContinuationImpl(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this.f40736A = coroutineContext;
    }

    public CoroutineContext f() {
        CoroutineContext coroutineContext = this.f40736A;
        Intrinsics.f(coroutineContext);
        return coroutineContext;
    }

    public void y() {
        Continuation continuation = this.f40737B;
        if (!(continuation == null || continuation == this)) {
            CoroutineContext.Element d2 = f().d(ContinuationInterceptor.f40717v);
            Intrinsics.f(d2);
            ((ContinuationInterceptor) d2).l(continuation);
        }
        this.f40737B = CompletedContinuation.f40735z;
    }

    public final Continuation z() {
        Continuation continuation = this.f40737B;
        if (continuation == null) {
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) f().d(ContinuationInterceptor.f40717v);
            if (continuationInterceptor == null || (continuation = continuationInterceptor.r(this)) == null) {
                continuation = this;
            }
            this.f40737B = continuation;
        }
        return continuation;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(Continuation continuation) {
        this(continuation, continuation != null ? continuation.f() : null);
    }
}
