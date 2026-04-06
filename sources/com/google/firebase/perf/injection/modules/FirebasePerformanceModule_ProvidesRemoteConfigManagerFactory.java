package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements Factory<RemoteConfigManager> {

    /* renamed from: a  reason: collision with root package name */
    public final FirebasePerformanceModule f30969a;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30969a = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory a(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
    }

    public static RemoteConfigManager c(FirebasePerformanceModule firebasePerformanceModule) {
        return (RemoteConfigManager) Preconditions.c(firebasePerformanceModule.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.f30969a);
    }
}
