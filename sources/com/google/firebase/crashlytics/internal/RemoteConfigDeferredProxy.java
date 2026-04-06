package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

public class RemoteConfigDeferredProxy {

    /* renamed from: a  reason: collision with root package name */
    public final Deferred f29920a;

    public RemoteConfigDeferredProxy(Deferred deferred) {
        this.f29920a = deferred;
    }

    public static /* synthetic */ void b(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).a("firebase", crashlyticsRemoteConfigListener);
        Logger.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.f().k("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        this.f29920a.a(new d(new CrashlyticsRemoteConfigListener(userMetadata)));
    }
}
