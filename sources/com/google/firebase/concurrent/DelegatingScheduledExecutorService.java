package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class DelegatingScheduledExecutorService implements ScheduledExecutorService {

    /* renamed from: A  reason: collision with root package name */
    public final ScheduledExecutorService f29815A;

    /* renamed from: z  reason: collision with root package name */
    public final ExecutorService f29816z;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f29816z = executorService;
        this.f29815A = scheduledExecutorService;
    }

    public static /* synthetic */ void m(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set((Object) null);
        } catch (Exception e2) {
            completer.a(e2);
        }
    }

    public static /* synthetic */ void p(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e2) {
            completer.a(e2);
        }
    }

    public static /* synthetic */ void s(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e2) {
            completer.a(e2);
            throw e2;
        }
    }

    public static /* synthetic */ void x(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e2) {
            completer.a(e2);
        }
    }

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f29816z.awaitTermination(j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f29816z.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f29816z.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f29816z.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f29816z.isShutdown();
    }

    public boolean isTerminated() {
        return this.f29816z.isTerminated();
    }

    public final /* synthetic */ void n(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29816z.execute(new l(runnable, completer));
    }

    public final /* synthetic */ ScheduledFuture o(Runnable runnable, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.f29815A.schedule(new i(this, runnable, completer), j2, timeUnit);
    }

    public final /* synthetic */ Future q(Callable callable, DelegatingScheduledFuture.Completer completer) {
        return this.f29816z.submit(new m(callable, completer));
    }

    public final /* synthetic */ ScheduledFuture r(Callable callable, long j2, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.f29815A.schedule(new j(this, callable, completer), j2, timeUnit);
    }

    public ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new b(this, runnable, j2, timeUnit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new e(this, runnable, j2, j3, timeUnit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new f(this, runnable, j2, j3, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Callable callable) {
        return this.f29816z.submit(callable);
    }

    public final /* synthetic */ void t(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29816z.execute(new c(runnable, completer));
    }

    public final /* synthetic */ ScheduledFuture u(Runnable runnable, long j2, long j3, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.f29815A.scheduleAtFixedRate(new h(this, runnable, completer), j2, j3, timeUnit);
    }

    public final /* synthetic */ void v(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29816z.execute(new d(runnable, completer));
    }

    public final /* synthetic */ ScheduledFuture w(Runnable runnable, long j2, long j3, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.f29815A.scheduleWithFixedDelay(new k(this, runnable, completer), j2, j3, timeUnit);
    }

    public List invokeAll(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f29816z.invokeAll(collection, j2, timeUnit);
    }

    public Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f29816z.invokeAny(collection, j2, timeUnit);
    }

    public ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new g(this, callable, j2, timeUnit));
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.f29816z.submit(runnable, obj);
    }

    public Future submit(Runnable runnable) {
        return this.f29816z.submit(runnable);
    }
}
