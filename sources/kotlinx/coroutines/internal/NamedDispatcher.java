package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

@Metadata
public final class NamedDispatcher extends CoroutineDispatcher implements Delay {

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Delay f41860B;
    public final CoroutineDispatcher C;
    public final String D;

    public NamedDispatcher(CoroutineDispatcher coroutineDispatcher, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.f41860B = delay == null ? DefaultExecutorKt.a() : delay;
        this.C = coroutineDispatcher;
        this.D = str;
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f41860B.O(j2, runnable, coroutineContext);
    }

    public void f(long j2, CancellableContinuation cancellableContinuation) {
        this.f41860B.f(j2, cancellableContinuation);
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        this.C.o0(coroutineContext, runnable);
    }

    public void t0(CoroutineContext coroutineContext, Runnable runnable) {
        this.C.t0(coroutineContext, runnable);
    }

    public String toString() {
        return this.D;
    }

    public boolean w0(CoroutineContext coroutineContext) {
        return this.C.w0(coroutineContext);
    }
}
