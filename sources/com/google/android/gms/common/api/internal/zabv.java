package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final class zabv extends zaag {

    /* renamed from: c  reason: collision with root package name */
    public final GoogleApi f24681c;

    public zabv(GoogleApi googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f24681c = googleApi;
    }

    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        return this.f24681c.h(apiMethodImpl);
    }

    public final Looper h() {
        return this.f24681c.m();
    }

    public final void j(zada zada) {
    }

    public final void k(zada zada) {
    }
}
