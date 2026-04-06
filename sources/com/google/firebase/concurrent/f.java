package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class f implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f29861b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f29862c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f29863d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f29864e;

    public /* synthetic */ f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        this.f29860a = delegatingScheduledExecutorService;
        this.f29861b = runnable;
        this.f29862c = j2;
        this.f29863d = j3;
        this.f29864e = timeUnit;
    }

    public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
        return this.f29860a.w(this.f29861b, this.f29862c, this.f29863d, this.f29864e, completer);
    }
}
