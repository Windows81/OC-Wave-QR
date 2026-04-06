package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29881A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Runnable f29882z;

    public /* synthetic */ l(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29882z = runnable;
        this.f29881A = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.m(this.f29882z, this.f29881A);
    }
}
