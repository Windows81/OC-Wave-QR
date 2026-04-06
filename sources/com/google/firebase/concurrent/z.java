package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f29891a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29892b;

    public /* synthetic */ z(Runnable runnable, Object obj) {
        this.f29891a = runnable;
        this.f29892b = obj;
    }

    public final Object call() {
        return this.f29891a.run();
    }
}
