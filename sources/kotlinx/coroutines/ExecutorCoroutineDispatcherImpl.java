package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;

@Metadata
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    public final Executor C;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.C = executor;
        ConcurrentKt.a(J0());
    }

    public final void H0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        JobKt.c(coroutineContext, ExceptionsKt.a("The task was rejected", rejectedExecutionException));
    }

    public Executor J0() {
        return this.C;
    }

    public final ScheduledFuture L0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j2) {
        try {
            return scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            H0(coroutineContext, e2);
            return null;
        }
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        Executor J0 = J0();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = J0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) J0 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = L0(scheduledExecutorService, runnable, coroutineContext, j2);
        }
        return scheduledFuture != null ? new DisposableFutureHandle(scheduledFuture) : DefaultExecutor.H.O(j2, runnable, coroutineContext);
    }

    public void close() {
        Executor J0 = J0();
        ExecutorService executorService = J0 instanceof ExecutorService ? (ExecutorService) J0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).J0() == J0();
    }

    public void f(long j2, CancellableContinuation cancellableContinuation) {
        Executor J0 = J0();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = J0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) J0 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = L0(scheduledExecutorService, new ResumeUndispatchedRunnable(this, cancellableContinuation), cancellableContinuation.f(), j2);
        }
        if (scheduledFuture != null) {
            CancellableContinuationKt.c(cancellableContinuation, new CancelFutureOnCancel(scheduledFuture));
        } else {
            DefaultExecutor.H.f(j2, cancellableContinuation);
        }
    }

    public int hashCode() {
        return System.identityHashCode(J0());
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor J0 = J0();
            AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
            if (a2 != null) {
                runnable2 = a2.h(runnable);
                if (runnable2 == null) {
                }
                J0.execute(runnable2);
            }
            runnable2 = runnable;
            J0.execute(runnable2);
        } catch (RejectedExecutionException e2) {
            AbstractTimeSource a3 = AbstractTimeSourceKt.f41360a;
            if (a3 != null) {
                a3.e();
            }
            H0(coroutineContext, e2);
            Dispatchers.b().o0(coroutineContext, runnable);
        }
    }

    public String toString() {
        return J0().toString();
    }
}
