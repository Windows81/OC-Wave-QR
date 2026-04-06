package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f29887a;

    public /* synthetic */ w(Runnable runnable) {
        this.f29887a = runnable;
    }

    public final Object call() {
        return this.f29887a.run();
    }
}
