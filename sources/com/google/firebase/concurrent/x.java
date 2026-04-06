package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final /* synthetic */ class x implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f29888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29889b;

    public /* synthetic */ x(Runnable runnable, Object obj) {
        this.f29888a = runnable;
        this.f29889b = obj;
    }

    public final Object call() {
        return this.f29888a.run();
    }
}
