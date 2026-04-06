package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* renamed from: com.google.common.util.concurrent.Futures$1  reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Future f29497z;

        public void run() {
            this.f29497z.cancel(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$2  reason: invalid class name */
    class AnonymousClass2 implements Future<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Function f29498A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Future f29499z;

        public final Object a(Object obj) {
            try {
                return this.f29498A.apply(obj);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        public boolean cancel(boolean z2) {
            return this.f29499z.cancel(z2);
        }

        public Object get() {
            return a(this.f29499z.get());
        }

        public boolean isCancelled() {
            return this.f29499z.isCancelled();
        }

        public boolean isDone() {
            return this.f29499z.isDone();
        }

        public Object get(long j2, TimeUnit timeUnit) {
            return a(this.f29499z.get(j2, timeUnit));
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$3  reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ ImmutableList f29500A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ int f29501B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ InCompletionOrderState f29502z;

        public void run() {
            this.f29502z.f(this.f29500A, this.f29501B);
        }
    }

    public static final class CallbackListener<V> implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final FutureCallback f29503A;

        /* renamed from: z  reason: collision with root package name */
        public final Future f29504z;

        public CallbackListener(Future future, FutureCallback futureCallback) {
            this.f29504z = future;
            this.f29503A = futureCallback;
        }

        public void run() {
            Throwable a2;
            Future future = this.f29504z;
            if (!(future instanceof InternalFutureFailureAccess) || (a2 = InternalFutures.a((InternalFutureFailureAccess) future)) == null) {
                try {
                    this.f29503A.a(Futures.b(this.f29504z));
                } catch (ExecutionException e2) {
                    this.f29503A.b(e2.getCause());
                } catch (Error | RuntimeException e3) {
                    this.f29503A.b(e3);
                }
            } else {
                this.f29503A.b(a2);
            }
        }

        public String toString() {
            return MoreObjects.c(this).j(this.f29503A).toString();
        }
    }

    public static final class FutureCombiner<V> {

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1  reason: invalid class name */
        class AnonymousClass1 implements Callable<Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f29505a;

            /* renamed from: a */
            public Void call() {
                this.f29505a.run();
                return null;
            }
        }
    }

    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        public InCompletionOrderState G;

        public boolean cancel(boolean z2) {
            InCompletionOrderState inCompletionOrderState = this.G;
            if (!super.cancel(z2)) {
                return false;
            }
            Objects.requireNonNull(inCompletionOrderState);
            inCompletionOrderState.g(z2);
            return true;
        }

        public void m() {
            this.G = null;
        }

        public String y() {
            InCompletionOrderState inCompletionOrderState = this.G;
            if (inCompletionOrderState == null) {
                return null;
            }
            int length = inCompletionOrderState.f29509d.length;
            int i2 = inCompletionOrderState.f29508c.get();
            StringBuilder sb = new StringBuilder(49);
            sb.append("inputCount=[");
            sb.append(length);
            sb.append("], remaining=[");
            sb.append(i2);
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class InCompletionOrderState<T> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29506a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29507b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f29508c;

        /* renamed from: d  reason: collision with root package name */
        public final ListenableFuture[] f29509d;

        /* renamed from: e  reason: collision with root package name */
        public volatile int f29510e;

        public final void e() {
            if (this.f29508c.decrementAndGet() == 0 && this.f29506a) {
                for (ListenableFuture listenableFuture : this.f29509d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.f29507b);
                    }
                }
            }
        }

        public final void f(ImmutableList immutableList, int i2) {
            ListenableFuture listenableFuture = this.f29509d[i2];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture listenableFuture2 = listenableFuture;
            this.f29509d[i2] = null;
            for (int i3 = this.f29510e; i3 < immutableList.size(); i3++) {
                if (((AbstractFuture) immutableList.get(i3)).E(listenableFuture2)) {
                    e();
                    this.f29510e = i3 + 1;
                    return;
                }
            }
            this.f29510e = immutableList.size();
        }

        public final void g(boolean z2) {
            this.f29506a = true;
            if (!z2) {
                this.f29507b = false;
            }
            e();
        }
    }

    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        public ListenableFuture G;

        public void m() {
            this.G = null;
        }

        public void run() {
            ListenableFuture listenableFuture = this.G;
            if (listenableFuture != null) {
                E(listenableFuture);
            }
        }

        public String y() {
            ListenableFuture listenableFuture = this.G;
            if (listenableFuture == null) {
                return null;
            }
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 11);
            sb.append("delegate=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        Preconditions.q(futureCallback);
        listenableFuture.C(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static Object b(Future future) {
        Preconditions.z(future.isDone(), "Future was expected to be done: %s", future);
        return Uninterruptibles.a(future);
    }

    public static ListenableFuture c() {
        ImmediateFuture.ImmediateCancelledFuture immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.G;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new ImmediateFuture.ImmediateCancelledFuture();
    }

    public static ListenableFuture d(Throwable th) {
        Preconditions.q(th);
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static ListenableFuture e(Object obj) {
        return obj == null ? ImmediateFuture.f29516A : new ImmediateFuture(obj);
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Function function, Executor executor) {
        return AbstractTransformFuture.H(listenableFuture, function, executor);
    }
}
