package com.google.firebase.concurrent;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f29885A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LimitedConcurrencyExecutor f29886z;

    public /* synthetic */ v(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        this.f29886z = limitedConcurrencyExecutor;
        this.f29885A = runnable;
    }

    public final void run() {
        this.f29886z.c(this.f29885A);
    }
}
