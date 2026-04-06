package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f29875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f29876b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f29877c;

    public /* synthetic */ j(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture.Completer completer) {
        this.f29875a = delegatingScheduledExecutorService;
        this.f29876b = callable;
        this.f29877c = completer;
    }

    public final Object call() {
        return this.f29875a.q(this.f29876b, this.f29877c);
    }
}
