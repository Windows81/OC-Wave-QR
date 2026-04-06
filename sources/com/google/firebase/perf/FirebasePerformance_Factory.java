package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FirebasePerformance_Factory implements Factory<FirebasePerformance> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f30897a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f30898b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f30899c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f30900d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f30901e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f30902f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f30903g;

    public FirebasePerformance_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f30897a = provider;
        this.f30898b = provider2;
        this.f30899c = provider3;
        this.f30900d = provider4;
        this.f30901e = provider5;
        this.f30902f = provider6;
        this.f30903g = provider7;
    }

    public static FirebasePerformance_Factory a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new FirebasePerformance_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static FirebasePerformance c(FirebaseApp firebaseApp, com.google.firebase.inject.Provider provider, FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        return new FirebasePerformance(firebaseApp, provider, firebaseInstallationsApi, provider2, remoteConfigManager, configResolver, sessionManager);
    }

    /* renamed from: b */
    public FirebasePerformance get() {
        return c((FirebaseApp) this.f30897a.get(), (com.google.firebase.inject.Provider) this.f30898b.get(), (FirebaseInstallationsApi) this.f30899c.get(), (com.google.firebase.inject.Provider) this.f30900d.get(), (RemoteConfigManager) this.f30901e.get(), (ConfigResolver) this.f30902f.get(), (SessionManager) this.f30903g.get());
    }
}
