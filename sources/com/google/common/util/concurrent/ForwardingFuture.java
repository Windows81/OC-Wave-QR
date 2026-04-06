package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {

        /* renamed from: z  reason: collision with root package name */
        public final Future f29495z;

        /* renamed from: Q */
        public final Future M() {
            return this.f29495z;
        }
    }

    /* renamed from: Q */
    public abstract Future M();

    public boolean cancel(boolean z2) {
        return M().cancel(z2);
    }

    public Object get() {
        return M().get();
    }

    public boolean isCancelled() {
        return M().isCancelled();
    }

    public boolean isDone() {
        return M().isDone();
    }

    public Object get(long j2, TimeUnit timeUnit) {
        return M().get(j2, timeUnit);
    }
}
