package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: A  reason: collision with root package name */
    public static final Key f41377A = new Key((DefaultConstructorMarker) null);

    @Metadata
    public static final class Key extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final CoroutineDispatcher d(CoroutineContext.Element element) {
            if (element instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) element;
            }
            return null;
        }

        public Key() {
            super(ContinuationInterceptor.f40717v, new e());
        }
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.f40717v);
    }

    public static /* synthetic */ CoroutineDispatcher G0(CoroutineDispatcher coroutineDispatcher, int i2, String str, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                str = null;
            }
            return coroutineDispatcher.E0(i2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
    }

    public /* synthetic */ CoroutineDispatcher A0(int i2) {
        return E0(i2, (String) null);
    }

    public CoroutineDispatcher E0(int i2, String str) {
        LimitedDispatcherKt.a(i2);
        return new LimitedDispatcher(this, i2, str);
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.a(this, key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.b(this, key);
    }

    public final void l(Continuation continuation) {
        Intrinsics.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation) continuation).v();
    }

    public abstract void o0(CoroutineContext coroutineContext, Runnable runnable);

    public final Continuation r(Continuation continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public void t0(CoroutineContext coroutineContext, Runnable runnable) {
        DispatchedContinuationKt.c(this, coroutineContext, runnable);
    }

    public String toString() {
        return DebugStringsKt.a(this) + '@' + DebugStringsKt.b(this);
    }

    public boolean w0(CoroutineContext coroutineContext) {
        return true;
    }
}
