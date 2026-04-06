package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements Factory<SessionManager> {

    /* renamed from: a  reason: collision with root package name */
    public final FirebasePerformanceModule f30970a;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30970a = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesSessionManagerFactory a(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule);
    }

    public static SessionManager c(FirebasePerformanceModule firebasePerformanceModule) {
        return (SessionManager) Preconditions.c(firebasePerformanceModule.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public SessionManager get() {
        return c(this.f30970a);
    }
}
