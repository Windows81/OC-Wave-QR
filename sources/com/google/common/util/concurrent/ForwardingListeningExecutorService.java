package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService implements ListeningExecutorService {
    /* renamed from: R */
    public abstract ListeningExecutorService Q();

    public ListenableFuture submit(Callable callable) {
        return Q().submit(callable);
    }

    public ListenableFuture submit(Runnable runnable) {
        return Q().submit(runnable);
    }

    public ListenableFuture submit(Runnable runnable, Object obj) {
        return Q().submit(runnable, obj);
    }
}
