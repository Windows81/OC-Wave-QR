package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29883A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Callable f29884z;

    public /* synthetic */ m(Callable callable, DelegatingScheduledFuture.Completer completer) {
        this.f29884z = callable;
        this.f29883A = completer;
    }

    public final void run() {
        DelegatingScheduledExecutorService.p(this.f29884z, this.f29883A);
    }
}
