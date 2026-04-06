package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class i implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f29805a;

    public /* synthetic */ i(ComponentRegistrar componentRegistrar) {
        this.f29805a = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.Builder.f(this.f29805a);
    }
}
