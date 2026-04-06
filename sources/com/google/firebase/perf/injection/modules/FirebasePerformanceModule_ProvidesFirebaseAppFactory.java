package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements Factory<FirebaseApp> {

    /* renamed from: a  reason: collision with root package name */
    public final FirebasePerformanceModule f30966a;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30966a = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory a(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
    }

    public static FirebaseApp c(FirebasePerformanceModule firebasePerformanceModule) {
        return (FirebaseApp) Preconditions.c(firebasePerformanceModule.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public FirebaseApp get() {
        return c(this.f30966a);
    }
}
