package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f29615A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Supplier f29616z;

    public /* synthetic */ c(Supplier supplier, Runnable runnable) {
        this.f29616z = supplier;
        this.f29615A = runnable;
    }

    public final void run() {
        Callables.d(this.f29616z, this.f29615A);
    }
}
