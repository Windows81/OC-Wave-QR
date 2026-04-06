package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

final class PausableExecutorServiceImpl implements PausableExecutorService {

    /* renamed from: A  reason: collision with root package name */
    public final PausableExecutor f29830A;

    /* renamed from: z  reason: collision with root package name */
    public final ExecutorService f29831z;

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f29831z.awaitTermination(j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f29830A.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f29831z.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f29831z.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f29831z.isShutdown();
    }

    public boolean isTerminated() {
        return this.f29831z.isTerminated();
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
        return this.f29831z.invokeAll(collection, j2, timeUnit);
    }

    public Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f29831z.invokeAny(collection, j2, timeUnit);
    }

    public Future submit(Runnable runnable, Object obj) {
        return submit((Callable) new z(runnable, obj));
    }

    public Future submit(Runnable runnable) {
        return submit((Callable) new y(runnable));
    }
}
