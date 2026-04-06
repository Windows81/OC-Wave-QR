package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Callable f29621z;

    public /* synthetic */ f(Callable callable) {
        this.f29621z = callable;
    }

    public final void run() {
        WrappingExecutorService.b(this.f29621z);
    }
}
