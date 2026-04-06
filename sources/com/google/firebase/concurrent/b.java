package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29847a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f29848b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f29849c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f29850d;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j2, TimeUnit timeUnit) {
        this.f29847a = delegatingScheduledExecutorService;
        this.f29848b = runnable;
        this.f29849c = j2;
        this.f29850d = timeUnit;
    }

    public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
        return this.f29847a.o(this.f29848b, this.f29849c, this.f29850d, completer);
    }
}
