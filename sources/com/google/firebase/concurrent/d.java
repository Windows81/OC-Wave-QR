package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29853A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Runnable f29854z;

    public /* synthetic */ d(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29854z = runnable;
        this.f29853A = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.x(this.f29854z, this.f29853A);
    }
}
