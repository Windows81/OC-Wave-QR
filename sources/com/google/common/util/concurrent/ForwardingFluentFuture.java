package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
final class ForwardingFluentFuture<V> extends FluentFuture<V> {
    public final ListenableFuture G;

    public ForwardingFluentFuture(ListenableFuture listenableFuture) {
        this.G = (ListenableFuture) Preconditions.q(listenableFuture);
    }

    public void C(Runnable runnable, Executor executor) {
        this.G.C(runnable, executor);
    }

    public boolean cancel(boolean z2) {
        return this.G.cancel(z2);
    }

    public Object get() {
        return this.G.get();
    }

    public boolean isCancelled() {
        return this.G.isCancelled();
    }

    public boolean isDone() {
        return this.G.isDone();
    }

    public String toString() {
        return this.G.toString();
    }

    public Object get(long j2, TimeUnit timeUnit) {
        return this.G.get(j2, timeUnit);
    }
}
