package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class f implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentRuntime f29799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Component f29800b;

    public /* synthetic */ f(ComponentRuntime componentRuntime, Component component) {
        this.f29799a = componentRuntime;
        this.f29800b = component;
    }

    public final Object get() {
        return this.f29799a.r(this.f29800b);
    }
}
