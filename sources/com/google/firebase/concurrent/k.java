package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f29878A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29879B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29880z;

    public /* synthetic */ k(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29880z = delegatingScheduledExecutorService;
        this.f29878A = runnable;
        this.f29879B = completer;
    }

    public final void run() {
        this.f29880z.v(this.f29878A, this.f29879B);
    }
}
