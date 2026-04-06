package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteConfigComponent f31422a;

    public /* synthetic */ j(RemoteConfigComponent remoteConfigComponent) {
        this.f31422a = remoteConfigComponent;
    }

    public final Object call() {
        return this.f31422a.g();
    }
}
