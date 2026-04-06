package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    public ListenableFuture G;
    public Object H;

    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        /* renamed from: K */
        public ListenableFuture I(AsyncFunction asyncFunction, Object obj) {
            ListenableFuture apply = asyncFunction.apply(obj);
            Preconditions.s(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        /* renamed from: L */
        public void J(ListenableFuture listenableFuture) {
            E(listenableFuture);
        }
    }

    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        public TransformFuture(ListenableFuture listenableFuture, Function function) {
            super(listenableFuture, function);
        }

        public void J(Object obj) {
            B(obj);
        }

        /* renamed from: K */
        public Object I(Function function, Object obj) {
            return function.apply(obj);
        }
    }

    public AbstractTransformFuture(ListenableFuture listenableFuture, Object obj) {
        this.G = (ListenableFuture) Preconditions.q(listenableFuture);
        this.H = Preconditions.q(obj);
    }

    public static ListenableFuture H(ListenableFuture listenableFuture, Function function, Executor executor) {
        Preconditions.q(function);
        TransformFuture transformFuture = new TransformFuture(listenableFuture, function);
        listenableFuture.C(transformFuture, MoreExecutors.e(executor, transformFuture));
        return transformFuture;
    }

    public abstract Object I(Object obj, Object obj2);

    public abstract void J(Object obj);

    public final void m() {
        x(this.G);
        this.G = null;
        this.H = null;
    }

    public final void run() {
        ListenableFuture listenableFuture = this.G;
        Object obj = this.H;
        boolean z2 = true;
        boolean isCancelled = isCancelled() | (listenableFuture == null);
        if (obj != null) {
            z2 = false;
        }
        if (!isCancelled && !z2) {
            this.G = null;
            if (listenableFuture.isCancelled()) {
                E(listenableFuture);
                return;
            }
            try {
                try {
                    Object I = I(obj, Futures.b(listenableFuture));
                    this.H = null;
                    J(I);
                } catch (Throwable th) {
                    this.H = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                D(e2.getCause());
            } catch (RuntimeException e3) {
                D(e3);
            } catch (Error e4) {
                D(e4);
            }
        }
    }

    public String y() {
        String str;
        ListenableFuture listenableFuture = this.G;
        Object obj = this.H;
        String y2 = super.y();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + valueOf2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (y2 == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            return y2.length() != 0 ? valueOf3.concat(y2) : new String(valueOf3);
        }
    }
}
