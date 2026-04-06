package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29855a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f29856b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f29857c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f29858d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f29859e;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        this.f29855a = delegatingScheduledExecutorService;
        this.f29856b = runnable;
        this.f29857c = j2;
        this.f29858d = j3;
        this.f29859e = timeUnit;
    }

    public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
        return this.f29855a.u(this.f29856b, this.f29857c, this.f29858d, this.f29859e, completer);
    }
}
