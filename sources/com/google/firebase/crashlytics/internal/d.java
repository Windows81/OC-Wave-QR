package com.google.firebase.crashlytics.internal;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class d implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsRemoteConfigListener f30115a;

    public /* synthetic */ d(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener) {
        this.f30115a = crashlyticsRemoteConfigListener;
    }

    public final void a(Provider provider) {
        RemoteConfigDeferredProxy.b(this.f30115a, provider);
    }
}
