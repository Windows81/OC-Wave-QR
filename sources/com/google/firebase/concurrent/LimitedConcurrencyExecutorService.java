package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

final class LimitedConcurrencyExecutorService extends LimitedConcurrencyExecutor implements ExecutorService {
    public final ExecutorService C;

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.C.awaitTermination(j2, timeUnit);
    }

    public List invokeAll(Collection collection) {
        return this.C.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.C.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.C.isShutdown();
    }

    public boolean isTerminated() {
        return this.C.isTerminated();
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    public List invokeAll(Collection collection, long j2, TimeUnit timeUnit) {
        return this.C.invokeAll(collection, j2, timeUnit);
    }

    public Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
        return this.C.invokeAny(collection, j2, timeUnit);
    }

    public Future submit(Runnable runnable, Object obj) {
        return submit((Callable) new x(runnable, obj));
    }

    public Future submit(Runnable runnable) {
        return submit((Callable) new w(runnable));
    }
}
