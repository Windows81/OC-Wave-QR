package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements Factory<Provider<RemoteConfigComponent>> {

    /* renamed from: a  reason: collision with root package name */
    public final FirebasePerformanceModule f30968a;

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30968a = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory a(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
    }

    public static Provider c(FirebasePerformanceModule firebasePerformanceModule) {
        return (Provider) Preconditions.c(firebasePerformanceModule.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Provider get() {
        return c(this.f30968a);
    }
}
