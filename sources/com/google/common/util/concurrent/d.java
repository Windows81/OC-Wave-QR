package com.google.common.util.concurrent;

import com.google.common.util.concurrent.JdkFutureAdapters;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ JdkFutureAdapters.ListenableFutureAdapter f29617z;

    public /* synthetic */ d(JdkFutureAdapters.ListenableFutureAdapter listenableFutureAdapter) {
        this.f29617z = listenableFutureAdapter;
    }

    public final void run() {
        this.f29617z.S();
    }
}
