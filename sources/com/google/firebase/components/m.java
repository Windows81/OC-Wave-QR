package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class m implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Deferred.DeferredHandler f29808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Deferred.DeferredHandler f29809b;

    public /* synthetic */ m(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2) {
        this.f29808a = deferredHandler;
        this.f29809b = deferredHandler2;
    }

    public final void a(Provider provider) {
        OptionalProvider.h(this.f29808a, this.f29809b, provider);
    }
}
