package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import dagger.Module;

@Module
public class FirebasePerformanceModule {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseApp f30961a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseInstallationsApi f30962b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f30963c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f30964d;

    public FirebasePerformanceModule(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Provider provider2) {
        this.f30961a = firebaseApp;
        this.f30962b = firebaseInstallationsApi;
        this.f30963c = provider;
        this.f30964d = provider2;
    }

    public ConfigResolver a() {
        return ConfigResolver.g();
    }

    public FirebaseApp b() {
        return this.f30961a;
    }

    public FirebaseInstallationsApi c() {
        return this.f30962b;
    }

    public Provider d() {
        return this.f30963c;
    }

    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager f() {
        return SessionManager.getInstance();
    }

    public Provider g() {
        return this.f30964d;
    }
}
