package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@ElementTypesAreNonnullByDefault
final class CombinedFuture<V> extends AggregateFuture<Object, V> {
    public CombinedFutureInterruptibleTask M;

    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {
        public final AsyncCallable C;
        public final /* synthetic */ CombinedFuture D;

        public String f() {
            return this.C.toString();
        }

        /* renamed from: i */
        public ListenableFuture e() {
            return (ListenableFuture) Preconditions.s(this.C.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.C);
        }

        /* renamed from: j */
        public void h(ListenableFuture listenableFuture) {
            this.D.E(listenableFuture);
        }
    }

    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        public final Callable C;
        public final /* synthetic */ CombinedFuture D;

        public Object e() {
            return this.C.call();
        }

        public String f() {
            return this.C.toString();
        }

        public void h(Object obj) {
            this.D.B(obj);
        }
    }

    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ CombinedFuture f29451B;

        public final void a(Throwable th) {
            CombinedFutureInterruptibleTask unused = this.f29451B.M = null;
            if (th instanceof ExecutionException) {
                this.f29451B.D(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                this.f29451B.cancel(false);
            } else {
                this.f29451B.D(th);
            }
        }

        public final void b(Object obj) {
            CombinedFutureInterruptibleTask unused = this.f29451B.M = null;
            h(obj);
        }

        public final boolean d() {
            return this.f29451B.isDone();
        }

        public abstract void h(Object obj);
    }

    public void G(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.G(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.M = null;
        }
    }

    public void w() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.M;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.c();
        }
    }
}
