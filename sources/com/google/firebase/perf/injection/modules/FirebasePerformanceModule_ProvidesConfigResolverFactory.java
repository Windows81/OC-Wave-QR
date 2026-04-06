package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements Factory<ConfigResolver> {

    /* renamed from: a  reason: collision with root package name */
    public final FirebasePerformanceModule f30965a;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30965a = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory a(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
    }

    public static ConfigResolver c(FirebasePerformanceModule firebasePerformanceModule) {
        return (ConfigResolver) Preconditions.c(firebasePerformanceModule.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public ConfigResolver get() {
        return c(this.f30965a);
    }
}
