package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
abstract class WrappingExecutorService implements ExecutorService {

    /* renamed from: z  reason: collision with root package name */
    public final ExecutorService f29611z;

    public static /* synthetic */ void b(Callable callable) {
        try {
            callable.call();
        } catch (Exception e2) {
            Throwables.o(e2);
            throw new RuntimeException(e2);
        }
    }

    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f29611z.awaitTermination(j2, timeUnit);
    }

    public Runnable c(Runnable runnable) {
        return new f(d(Executors.callable(runnable, (Object) null)));
    }

    public abstract Callable d(Callable callable);

    public final ImmutableList e(Collection collection) {
        ImmutableList.Builder s2 = ImmutableList.s();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            s2.e(d((Callable) it.next()));
        }
        return s2.l();
    }

    public final void execute(Runnable runnable) {
        this.f29611z.execute(c(runnable));
    }

    public final List invokeAll(Collection collection) {
        return this.f29611z.invokeAll(e(collection));
    }

    public final Object invokeAny(Collection collection) {
        return this.f29611z.invokeAny(e(collection));
    }

    public final boolean isShutdown() {
        return this.f29611z.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f29611z.isTerminated();
    }

    public final void shutdown() {
        this.f29611z.shutdown();
    }

    public final List shutdownNow() {
        return this.f29611z.shutdownNow();
    }

    public final Future submit(Callable callable) {
        return this.f29611z.submit(d((Callable) Preconditions.q(callable)));
    }

    public final List invokeAll(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f29611z.invokeAll(e(collection), j2, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f29611z.invokeAny(e(collection), j2, timeUnit);
    }

    public final Future submit(Runnable runnable) {
        return this.f29611z.submit(c(runnable));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f29611z.submit(c(runnable), obj);
    }
}
