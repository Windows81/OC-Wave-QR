package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

@ElementTypesAreNonnullByDefault
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {
    public volatile InterruptibleTask G;

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {

        /* renamed from: B  reason: collision with root package name */
        public final AsyncCallable f29607B;
        public final /* synthetic */ TrustedListenableFutureTask C;

        public void a(Throwable th) {
            this.C.D(th);
        }

        public final boolean d() {
            return this.C.isDone();
        }

        public String f() {
            return this.f29607B.toString();
        }

        /* renamed from: h */
        public void b(ListenableFuture listenableFuture) {
            this.C.E(listenableFuture);
        }

        /* renamed from: i */
        public ListenableFuture e() {
            return (ListenableFuture) Preconditions.s(this.f29607B.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f29607B);
        }
    }

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {

        /* renamed from: B  reason: collision with root package name */
        public final Callable f29608B;

        public TrustedFutureInterruptibleTask(Callable callable) {
            this.f29608B = (Callable) Preconditions.q(callable);
        }

        public void a(Throwable th) {
            TrustedListenableFutureTask.this.D(th);
        }

        public void b(Object obj) {
            TrustedListenableFutureTask.this.B(obj);
        }

        public final boolean d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        public Object e() {
            return this.f29608B.call();
        }

        public String f() {
            return this.f29608B.toString();
        }
    }

    public TrustedListenableFutureTask(Callable callable) {
        this.G = new TrustedFutureInterruptibleTask(callable);
    }

    public static TrustedListenableFutureTask H(Runnable runnable, Object obj) {
        return new TrustedListenableFutureTask(Executors.callable(runnable, obj));
    }

    public static TrustedListenableFutureTask I(Callable callable) {
        return new TrustedListenableFutureTask(callable);
    }

    public void m() {
        InterruptibleTask interruptibleTask;
        super.m();
        if (F() && (interruptibleTask = this.G) != null) {
            interruptibleTask.c();
        }
        this.G = null;
    }

    public void run() {
        InterruptibleTask interruptibleTask = this.G;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.G = null;
    }

    public String y() {
        InterruptibleTask interruptibleTask = this.G;
        if (interruptibleTask == null) {
            return super.y();
        }
        String valueOf = String.valueOf(interruptibleTask);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
