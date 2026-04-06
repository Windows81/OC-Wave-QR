package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.ImmutableBundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Singleton;

@Singleton
public class FirebasePerformance implements FirebasePerformanceAttributable {
    public static final AndroidLogger H = AndroidLogger.e();

    /* renamed from: A  reason: collision with root package name */
    public final ConfigResolver f30893A;

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableBundle f30894B;
    public Boolean C = null;
    public final FirebaseApp D;
    public final Provider E;
    public final FirebaseInstallationsApi F;
    public final Provider G;

    /* renamed from: z  reason: collision with root package name */
    public final Map f30895z = new ConcurrentHashMap();

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    public FirebasePerformance(FirebaseApp firebaseApp, Provider provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        this.D = firebaseApp;
        this.E = provider;
        this.F = firebaseInstallationsApi;
        this.G = provider2;
        if (firebaseApp == null) {
            this.C = Boolean.FALSE;
            this.f30893A = configResolver;
            this.f30894B = new ImmutableBundle(new Bundle());
            return;
        }
        TransportManager.k().r(firebaseApp, firebaseInstallationsApi, provider2);
        Context k2 = firebaseApp.k();
        ImmutableBundle a2 = a(k2);
        this.f30894B = a2;
        remoteConfigManager.setFirebaseRemoteConfigProvider(provider);
        this.f30893A = configResolver;
        configResolver.P(a2);
        configResolver.O(k2);
        sessionManager.setApplicationContext(k2);
        this.C = configResolver.j();
        AndroidLogger androidLogger = H;
        if (androidLogger.h() && d()) {
            androidLogger.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{ConsoleUrlGenerator.b(firebaseApp.n().e(), k2.getPackageName())}));
        }
    }

    public static ImmutableBundle a(Context context) {
        Bundle bundle;
        ImmutableBundle immutableBundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            Log.d("isEnabled", "No perf enable meta data found " + e2.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            immutableBundle = new ImmutableBundle();
        }
        return immutableBundle;
    }

    public static FirebasePerformance c() {
        return (FirebasePerformance) FirebaseApp.l().j(FirebasePerformance.class);
    }

    public Map b() {
        return new HashMap(this.f30895z);
    }

    public boolean d() {
        Boolean bool = this.C;
        return bool != null ? bool.booleanValue() : FirebaseApp.l().t();
    }
}
