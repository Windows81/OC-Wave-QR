package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigCacheClient f31370a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConfigContainer f31371b;

    public /* synthetic */ c(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        this.f31370a = configCacheClient;
        this.f31371b = configContainer;
    }

    public final Object call() {
        return this.f31370a.i(this.f31371b);
    }
}
