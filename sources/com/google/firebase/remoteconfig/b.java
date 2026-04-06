package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f31236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfigSettings f31237b;

    public /* synthetic */ b(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f31236a = firebaseRemoteConfig;
        this.f31237b = firebaseRemoteConfigSettings;
    }

    public final Object call() {
        return this.f31236a.x(this.f31237b);
    }
}
