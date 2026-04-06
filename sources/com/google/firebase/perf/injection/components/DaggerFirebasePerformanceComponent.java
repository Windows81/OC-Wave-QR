package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerFirebasePerformanceComponent implements FirebasePerformanceComponent {

    /* renamed from: a  reason: collision with root package name */
    public Provider f30952a;

    /* renamed from: b  reason: collision with root package name */
    public Provider f30953b;

    /* renamed from: c  reason: collision with root package name */
    public Provider f30954c;

    /* renamed from: d  reason: collision with root package name */
    public Provider f30955d;

    /* renamed from: e  reason: collision with root package name */
    public Provider f30956e;

    /* renamed from: f  reason: collision with root package name */
    public Provider f30957f;

    /* renamed from: g  reason: collision with root package name */
    public Provider f30958g;

    /* renamed from: h  reason: collision with root package name */
    public Provider f30959h;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public FirebasePerformanceModule f30960a;

        public FirebasePerformanceComponent a() {
            Preconditions.a(this.f30960a, FirebasePerformanceModule.class);
            return new DaggerFirebasePerformanceComponent(this.f30960a);
        }

        public Builder b(FirebasePerformanceModule firebasePerformanceModule) {
            this.f30960a = (FirebasePerformanceModule) Preconditions.b(firebasePerformanceModule);
            return this;
        }

        public Builder() {
        }
    }

    public static Builder b() {
        return new Builder();
    }

    public FirebasePerformance a() {
        return (FirebasePerformance) this.f30959h.get();
    }

    public final void c(FirebasePerformanceModule firebasePerformanceModule) {
        this.f30952a = FirebasePerformanceModule_ProvidesFirebaseAppFactory.a(firebasePerformanceModule);
        this.f30953b = FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.a(firebasePerformanceModule);
        this.f30954c = FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.a(firebasePerformanceModule);
        this.f30955d = FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.a(firebasePerformanceModule);
        this.f30956e = FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.a(firebasePerformanceModule);
        this.f30957f = FirebasePerformanceModule_ProvidesConfigResolverFactory.a(firebasePerformanceModule);
        FirebasePerformanceModule_ProvidesSessionManagerFactory a2 = FirebasePerformanceModule_ProvidesSessionManagerFactory.a(firebasePerformanceModule);
        this.f30958g = a2;
        this.f30959h = DoubleCheck.d(FirebasePerformance_Factory.a(this.f30952a, this.f30953b, this.f30954c, this.f30955d, this.f30956e, this.f30957f, a2));
    }

    public DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule) {
        c(firebasePerformanceModule);
    }
}
