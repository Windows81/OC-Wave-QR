package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29865a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f29866b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f29867c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f29868d;

    public /* synthetic */ g(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, long j2, TimeUnit timeUnit) {
        this.f29865a = delegatingScheduledExecutorService;
        this.f29866b = callable;
        this.f29867c = j2;
        this.f29868d = timeUnit;
    }

    public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
        return this.f29865a.r(this.f29866b, this.f29867c, this.f29868d, completer);
    }
}
