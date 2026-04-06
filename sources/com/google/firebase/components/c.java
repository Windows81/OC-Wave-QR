package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class c implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29798a;

    public /* synthetic */ c(String str) {
        this.f29798a = str;
    }

    public final Object get() {
        return ComponentDiscovery.d(this.f29798a);
    }
}
