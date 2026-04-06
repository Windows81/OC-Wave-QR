package com.google.firebase.remoteconfig;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;

public final /* synthetic */ class m implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Qualified f31430a;

    public /* synthetic */ m(Qualified qualified) {
        this.f31430a = qualified;
    }

    public final Object a(ComponentContainer componentContainer) {
        return RemoteConfigRegistrar.lambda$getComponents$0(this.f31430a, componentContainer);
    }
}
