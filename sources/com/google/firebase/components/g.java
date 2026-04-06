package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Provider f29801A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OptionalProvider f29802z;

    public /* synthetic */ g(OptionalProvider optionalProvider, Provider provider) {
        this.f29802z = optionalProvider;
        this.f29801A = provider;
    }

    public final void run() {
        this.f29802z.j(this.f29801A);
    }
}
