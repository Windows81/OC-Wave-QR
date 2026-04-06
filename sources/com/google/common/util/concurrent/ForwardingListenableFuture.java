package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {

        /* renamed from: z  reason: collision with root package name */
        public final ListenableFuture f29496z;

        public SimpleForwardingListenableFuture(ListenableFuture listenableFuture) {
            this.f29496z = (ListenableFuture) Preconditions.q(listenableFuture);
        }

        /* renamed from: R */
        public final ListenableFuture Q() {
            return this.f29496z;
        }
    }

    public void C(Runnable runnable, Executor executor) {
        Q().C(runnable, executor);
    }

    /* renamed from: R */
    public abstract ListenableFuture Q();
}
