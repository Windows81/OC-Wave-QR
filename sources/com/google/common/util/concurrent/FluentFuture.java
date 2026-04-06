package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class FluentFuture<V> extends GwtFluentFutureCatchingSpecialization<V> {

    public static abstract class TrustedFuture<V> extends FluentFuture<V> implements AbstractFuture.Trusted<V> {
        public final void C(Runnable runnable, Executor executor) {
            super.C(runnable, executor);
        }

        public final boolean cancel(boolean z2) {
            return super.cancel(z2);
        }

        public final Object get() {
            return super.get();
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final boolean isDone() {
            return super.isDone();
        }

        public final Object get(long j2, TimeUnit timeUnit) {
            return super.get(j2, timeUnit);
        }
    }

    public static FluentFuture G(ListenableFuture listenableFuture) {
        return listenableFuture instanceof FluentFuture ? (FluentFuture) listenableFuture : new ForwardingFluentFuture(listenableFuture);
    }
}
