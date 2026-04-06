package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.lang.Throwable;

@ElementTypesAreNonnullByDefault
abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {
    public ListenableFuture G;
    public Class H;
    public Object I;

    public static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        /* renamed from: J */
        public ListenableFuture H(AsyncFunction asyncFunction, Throwable th) {
            ListenableFuture apply = asyncFunction.apply(th);
            Preconditions.s(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        /* renamed from: K */
        public void I(ListenableFuture listenableFuture) {
            E(listenableFuture);
        }
    }

    public static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
        public void I(Object obj) {
            B(obj);
        }

        /* renamed from: J */
        public Object H(Function function, Throwable th) {
            return function.apply(th);
        }
    }

    public abstract Object H(Object obj, Throwable th);

    public abstract void I(Object obj);

    public final void m() {
        x(this.G);
        this.G = null;
        this.H = null;
        this.I = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r9.G
            java.lang.Class r1 = r9.H
            java.lang.Object r2 = r9.I
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x000c
            r5 = r4
            goto L_0x000d
        L_0x000c:
            r5 = r3
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = r4
            goto L_0x0012
        L_0x0011:
            r6 = r3
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            r3 = r4
        L_0x0016:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00b3
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L_0x0021
            goto L_0x00b3
        L_0x0021:
            r3 = 0
            r9.G = r3
            boolean r4 = r0 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess     // Catch:{ ExecutionException -> 0x0032, all -> 0x0030 }
            if (r4 == 0) goto L_0x0034
            r4 = r0
            com.google.common.util.concurrent.internal.InternalFutureFailureAccess r4 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r4     // Catch:{ ExecutionException -> 0x0032, all -> 0x0030 }
            java.lang.Throwable r4 = com.google.common.util.concurrent.internal.InternalFutures.a(r4)     // Catch:{ ExecutionException -> 0x0032, all -> 0x0030 }
            goto L_0x0035
        L_0x0030:
            r4 = move-exception
            goto L_0x003c
        L_0x0032:
            r4 = move-exception
            goto L_0x003e
        L_0x0034:
            r4 = r3
        L_0x0035:
            if (r4 != 0) goto L_0x003c
            java.lang.Object r5 = com.google.common.util.concurrent.Futures.b(r0)     // Catch:{ ExecutionException -> 0x0032, all -> 0x0030 }
            goto L_0x0084
        L_0x003c:
            r5 = r3
            goto L_0x0084
        L_0x003e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0082
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Future type "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " threw "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " without a cause"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r5.<init>(r4)
        L_0x0082:
            r4 = r5
            goto L_0x003c
        L_0x0084:
            if (r4 != 0) goto L_0x008e
            java.lang.Object r0 = com.google.common.util.concurrent.NullnessCasts.a(r5)
            r9.B(r0)
            return
        L_0x008e:
            boolean r1 = com.google.common.util.concurrent.Platform.a(r4, r1)
            if (r1 != 0) goto L_0x0098
            r9.E(r0)
            return
        L_0x0098:
            java.lang.Object r0 = r9.H(r2, r4)     // Catch:{ all -> 0x00a4 }
            r9.H = r3
            r9.I = r3
            r9.I(r0)
            return
        L_0x00a4:
            r0 = move-exception
            r9.D(r0)     // Catch:{ all -> 0x00ad }
            r9.H = r3
            r9.I = r3
            return
        L_0x00ad:
            r0 = move-exception
            r9.H = r3
            r9.I = r3
            throw r0
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractCatchingFuture.run():void");
    }

    public String y() {
        String str;
        ListenableFuture listenableFuture = this.G;
        Class cls = this.H;
        Object obj = this.I;
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
        if (cls != null && obj != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + valueOf2.length() + valueOf3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (y2 == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            return y2.length() != 0 ? valueOf4.concat(y2) : new String(valueOf4);
        }
    }
}
