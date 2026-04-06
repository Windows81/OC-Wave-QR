package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {

    /* renamed from: a  reason: collision with root package name */
    public final CrashlyticsCore f29899a;

    public FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.f29899a = crashlyticsCore;
    }

    public static FirebaseCrashlytics a() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.l().j(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static FirebaseCrashlytics b(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred deferred, Deferred deferred2, Deferred deferred3) {
        Context k2 = firebaseApp.k();
        String packageName = k2.getPackageName();
        Logger f2 = Logger.f();
        f2.g("Initializing Firebase Crashlytics " + CrashlyticsCore.i() + " for " + packageName);
        FileStore fileStore = new FileStore(k2);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(k2, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        ExecutorService c2 = ExecutorUtils.c("Crashlytics Exception Handler");
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.e(crashlyticsAppQualitySessionsSubscriber);
        RemoteConfigDeferredProxy remoteConfigDeferredProxy = new RemoteConfigDeferredProxy(deferred3);
        CrashlyticsCore crashlyticsCore = r4;
        IdManager idManager2 = idManager;
        CrashlyticsCore crashlyticsCore2 = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.e(), analyticsDeferredProxy.d(), fileStore, c2, crashlyticsAppQualitySessionsSubscriber, remoteConfigDeferredProxy);
        String c3 = firebaseApp.n().c();
        String m2 = CommonUtils.m(k2);
        List<BuildIdInfo> j2 = CommonUtils.j(k2);
        Logger f3 = Logger.f();
        f3.b("Mapping file ID is: " + m2);
        for (BuildIdInfo buildIdInfo : j2) {
            Logger.f().b(String.format("Build id for %s on %s: %s", new Object[]{buildIdInfo.c(), buildIdInfo.a(), buildIdInfo.b()}));
        }
        DataCollectionArbiter dataCollectionArbiter2 = dataCollectionArbiter;
        try {
            AppData a2 = AppData.a(k2, idManager2, c3, m2, j2, new DevelopmentPlatformProvider(k2));
            Logger f4 = Logger.f();
            f4.i("Installer package name is: " + a2.f29937d);
            ExecutorService c4 = ExecutorUtils.c("com.google.firebase.crashlytics.startup");
            final SettingsController l2 = SettingsController.l(k2, c3, idManager2, new HttpRequestFactory(), a2.f29939f, a2.f29940g, fileStore, dataCollectionArbiter2);
            l2.p(c4).h(c4, new Continuation<Void, Object>() {
                public Object a(Task task) {
                    if (task.n()) {
                        return null;
                    }
                    Logger.f().e("Error fetching settings.", task.j());
                    return null;
                }
            });
            final CrashlyticsCore crashlyticsCore3 = crashlyticsCore;
            final boolean o2 = crashlyticsCore3.o(a2, l2);
            Tasks.c(c4, new Callable<Void>() {
                /* renamed from: a */
                public Void call() {
                    if (!o2) {
                        return null;
                    }
                    crashlyticsCore3.g(l2);
                    return null;
                }
            });
            return new FirebaseCrashlytics(crashlyticsCore3);
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.f().e("Error retrieving app package info.", e2);
            return null;
        }
    }

    public void c(Throwable th) {
        if (th == null) {
            Logger.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f29899a.l(th);
        }
    }
}
