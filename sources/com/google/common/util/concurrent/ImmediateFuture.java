package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
class ImmediateFuture<V> implements ListenableFuture<V> {

    /* renamed from: A  reason: collision with root package name */
    public static final ListenableFuture f29516A = new ImmediateFuture((Object) null);

    /* renamed from: B  reason: collision with root package name */
    public static final Logger f29517B = Logger.getLogger(ImmediateFuture.class.getName());

    /* renamed from: z  reason: collision with root package name */
    public final Object f29518z;

    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public static final ImmediateCancelledFuture G = (AbstractFuture.C ? null : new ImmediateCancelledFuture());

        public ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public ImmediateFailedFuture(Throwable th) {
            D(th);
        }
    }

    public ImmediateFuture(Object obj) {
        this.f29518z = obj;
    }

    public void C(Runnable runnable, Executor executor) {
        Preconditions.r(runnable, "Runnable was null.");
        Preconditions.r(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f29517B;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e2);
        }
    }

    public boolean cancel(boolean z2) {
        return false;
    }

    public Object get() {
        return this.f29518z;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f29518z);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    public Object get(long j2, TimeUnit timeUnit) {
        Preconditions.q(timeUnit);
        return get();
    }
}
