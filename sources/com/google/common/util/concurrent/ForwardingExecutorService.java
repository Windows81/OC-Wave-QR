package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingExecutorService extends ForwardingObject implements ExecutorService {
    /* renamed from: Q */
    public abstract ExecutorService M();

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return M().awaitTermination(j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        M().execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return M().invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return M().invokeAny(collection);
    }

    public boolean isShutdown() {
        return M().isShutdown();
    }

    public boolean isTerminated() {
        return M().isTerminated();
    }

    public void shutdown() {
        M().shutdown();
    }

    public List shutdownNow() {
        return M().shutdownNow();
    }

    public Future submit(Callable callable) {
        return M().submit(callable);
    }

    public List invokeAll(Collection collection, long j2, TimeUnit timeUnit) {
        return M().invokeAll(collection, j2, timeUnit);
    }

    public Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
        return M().invokeAny(collection, j2, timeUnit);
    }

    public Future submit(Runnable runnable) {
        return M().submit(runnable);
    }

    public Future submit(Runnable runnable, Object obj) {
        return M().submit(runnable, obj);
    }
}
