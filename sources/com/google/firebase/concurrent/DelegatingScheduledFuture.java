package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class DelegatingScheduledFuture<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {
    public final ScheduledFuture G;

    public interface Completer<T> {
        void a(Throwable th);

        void set(Object obj);
    }

    public interface Resolver<T> {
        ScheduledFuture a(Completer completer);
    }

    public DelegatingScheduledFuture(Resolver resolver) {
        this.G = resolver.a(new Completer<V>() {
            public void a(Throwable th) {
                boolean unused = DelegatingScheduledFuture.this.A(th);
            }

            public void set(Object obj) {
                boolean unused = DelegatingScheduledFuture.this.z(obj);
            }
        });
    }

    /* renamed from: G */
    public int compareTo(Delayed delayed) {
        return this.G.compareTo(delayed);
    }

    public void f() {
        this.G.cancel(D());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.G.getDelay(timeUnit);
    }
}
