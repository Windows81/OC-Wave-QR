package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
abstract class WrappingScheduledExecutorService extends WrappingExecutorService implements ScheduledExecutorService {

    /* renamed from: A  reason: collision with root package name */
    public final ScheduledExecutorService f29612A;

    public final ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f29612A.schedule(c(runnable), j2, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f29612A.scheduleAtFixedRate(c(runnable), j2, j3, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f29612A.scheduleWithFixedDelay(c(runnable), j2, j3, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        return this.f29612A.schedule(d(callable), j2, timeUnit);
    }
}
