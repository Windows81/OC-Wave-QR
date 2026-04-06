package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Provider f29803A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazySet f29804z;

    public /* synthetic */ h(LazySet lazySet, Provider provider) {
        this.f29804z = lazySet;
        this.f29803A = provider;
    }

    public final void run() {
        this.f29804z.a(this.f29803A);
    }
}
