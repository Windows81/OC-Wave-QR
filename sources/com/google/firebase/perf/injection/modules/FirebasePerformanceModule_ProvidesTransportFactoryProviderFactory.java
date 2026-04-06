package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements Factory<Provider<TransportFactory>> {

    /* renamed from: a  reason: collision with root package name */
    public final FirebasePerformanceModule f30971a;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30971a = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory a(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule);
    }

    public static Provider c(FirebasePerformanceModule firebasePerformanceModule) {
        return (Provider) Preconditions.c(firebasePerformanceModule.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Provider get() {
        return c(this.f30971a);
    }
}
