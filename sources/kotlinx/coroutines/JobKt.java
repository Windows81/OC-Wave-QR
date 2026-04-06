package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class JobKt {
    public static final CompletableJob a(Job job) {
        return JobKt__JobKt.a(job);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        JobKt__JobKt.c(coroutineContext, cancellationException);
    }

    public static final void d(Job job, String str, Throwable th) {
        JobKt__JobKt.d(job, str, th);
    }

    public static final Object g(Job job, Continuation continuation) {
        return JobKt__JobKt.g(job, continuation);
    }

    public static final DisposableHandle h(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.h(job, disposableHandle);
    }

    public static final void i(CoroutineContext coroutineContext) {
        JobKt__JobKt.i(coroutineContext);
    }

    public static final void j(Job job) {
        JobKt__JobKt.j(job);
    }

    public static final Job k(CoroutineContext coroutineContext) {
        return JobKt__JobKt.k(coroutineContext);
    }

    public static final DisposableHandle l(Job job, boolean z2, JobNode jobNode) {
        return JobKt__JobKt.l(job, z2, jobNode);
    }

    public static final boolean n(CoroutineContext coroutineContext) {
        return JobKt__JobKt.n(coroutineContext);
    }
}
