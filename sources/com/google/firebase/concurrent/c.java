package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29851A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Runnable f29852z;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29852z = runnable;
        this.f29851A = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.s(this.f29852z, this.f29851A);
    }
}
