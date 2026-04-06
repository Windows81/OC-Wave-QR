package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f29869A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29870B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29871z;

    public /* synthetic */ h(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.f29871z = delegatingScheduledExecutorService;
        this.f29869A = runnable;
        this.f29870B = completer;
    }

    public final void run() {
        this.f29871z.t(this.f29869A, this.f29870B);
    }
}
