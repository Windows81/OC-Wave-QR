package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {

    /* renamed from: z  reason: collision with root package name */
    public final ExecutionList f29525z = new ExecutionList();

    public ListenableFutureTask(Callable callable) {
        super(callable);
    }

    public static ListenableFutureTask a(Callable callable) {
        return new ListenableFutureTask(callable);
    }

    public void C(Runnable runnable, Executor executor) {
        this.f29525z.a(runnable, executor);
    }

    public void done() {
        this.f29525z.b();
    }

    public Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        return nanos <= 2147483647999999999L ? super.get(j2, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
