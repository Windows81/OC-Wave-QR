package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f29872A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29873B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29874z;

    public /* synthetic */ i(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29874z = delegatingScheduledExecutorService;
        this.f29872A = runnable;
        this.f29873B = completer;
    }

    public final void run() {
        this.f29874z.n(this.f29872A, this.f29873B);
    }
}
