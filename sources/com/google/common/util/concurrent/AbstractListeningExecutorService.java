package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

@ElementTypesAreNonnullByDefault
public abstract class AbstractListeningExecutorService extends AbstractExecutorService implements ListeningExecutorService {
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return TrustedListenableFutureTask.H(runnable, obj);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return TrustedListenableFutureTask.I(callable);
    }

    public ListenableFuture submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    public ListenableFuture submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    public ListenableFuture submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }
}
