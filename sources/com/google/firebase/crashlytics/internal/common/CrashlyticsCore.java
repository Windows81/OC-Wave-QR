package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CrashlyticsCore {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30026a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f30027b;

    /* renamed from: c  reason: collision with root package name */
    public final DataCollectionArbiter f30028c;

    /* renamed from: d  reason: collision with root package name */
    public final OnDemandCounter f30029d = new OnDemandCounter();

    /* renamed from: e  reason: collision with root package name */
    public final long f30030e = System.currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    public CrashlyticsFileMarker f30031f;

    /* renamed from: g  reason: collision with root package name */
    public CrashlyticsFileMarker f30032g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30033h;

    /* renamed from: i  reason: collision with root package name */
    public CrashlyticsController f30034i;

    /* renamed from: j  reason: collision with root package name */
    public final IdManager f30035j;

    /* renamed from: k  reason: collision with root package name */
    public final FileStore f30036k;

    /* renamed from: l  reason: collision with root package name */
    public final BreadcrumbSource f30037l;

    /* renamed from: m  reason: collision with root package name */
    public final AnalyticsEventLogger f30038m;

    /* renamed from: n  reason: collision with root package name */
    public final ExecutorService f30039n;

    /* renamed from: o  reason: collision with root package name */
    public final CrashlyticsBackgroundWorker f30040o;

    /* renamed from: p  reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f30041p;

    /* renamed from: q  reason: collision with root package name */
    public final CrashlyticsNativeComponent f30042q;

    /* renamed from: r  reason: collision with root package name */
    public final RemoteConfigDeferredProxy f30043r;

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy) {
        this.f30027b = firebaseApp;
        this.f30028c = dataCollectionArbiter;
        this.f30026a = firebaseApp.k();
        this.f30035j = idManager;
        this.f30042q = crashlyticsNativeComponent;
        this.f30037l = breadcrumbSource;
        this.f30038m = analyticsEventLogger;
        this.f30039n = executorService;
        this.f30036k = fileStore;
        this.f30040o = new CrashlyticsBackgroundWorker(executorService);
        this.f30041p = crashlyticsAppQualitySessionsSubscriber;
        this.f30043r = remoteConfigDeferredProxy;
    }

    public static String i() {
        return "19.0.3";
    }

    public static boolean j(String str, boolean z2) {
        if (!z2) {
            Logger.f().i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    public final void d() {
        try {
            this.f30033h = Boolean.TRUE.equals((Boolean) Utils.f(this.f30040o.h(new Callable<Boolean>() {
                /* renamed from: a */
                public Boolean call() {
                    return Boolean.valueOf(CrashlyticsCore.this.f30034i.s());
                }
            })));
        } catch (Exception unused) {
            this.f30033h = false;
        }
    }

    public boolean e() {
        return this.f30031f.c();
    }

    public final Task f(SettingsProvider settingsProvider) {
        n();
        try {
            this.f30037l.a(new f(this));
            this.f30034i.S();
            if (!settingsProvider.b().f30654b.f30661a) {
                Logger.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f30034i.z(settingsProvider)) {
                Logger.f().k("Previous sessions could not be finalized.");
            }
            Task U = this.f30034i.U(settingsProvider.a());
            m();
            return U;
        } catch (Exception e2) {
            Logger.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return Tasks.d(e2);
        } finally {
            m();
        }
    }

    public Task g(final SettingsProvider settingsProvider) {
        return Utils.h(this.f30039n, new Callable<Task<Void>>() {
            /* renamed from: a */
            public Task call() {
                return CrashlyticsCore.this.f(settingsProvider);
            }
        });
    }

    public final void h(final SettingsProvider settingsProvider) {
        Future<?> submit = this.f30039n.submit(new Runnable() {
            public void run() {
                Task unused = CrashlyticsCore.this.f(settingsProvider);
            }
        });
        Logger.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Logger.f().e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            Logger.f().e("Crashlytics encountered a problem during initialization.", e3);
        } catch (TimeoutException e4) {
            Logger.f().e("Crashlytics timed out during initialization.", e4);
        }
    }

    public void k(String str) {
        this.f30034i.Y(System.currentTimeMillis() - this.f30030e, str);
    }

    public void l(Throwable th) {
        this.f30034i.X(Thread.currentThread(), th);
    }

    public void m() {
        this.f30040o.h(new Callable<Boolean>() {
            /* renamed from: a */
            public Boolean call() {
                try {
                    boolean d2 = CrashlyticsCore.this.f30031f.d();
                    if (!d2) {
                        Logger.f().k("Initialization marker file was not properly removed.");
                    }
                    return Boolean.valueOf(d2);
                } catch (Exception e2) {
                    Logger.f().e("Problem encountered deleting Crashlytics initialization marker.", e2);
                    return Boolean.FALSE;
                }
            }
        });
    }

    public void n() {
        this.f30040o.b();
        this.f30031f.a();
        Logger.f().i("Initialization marker file was created.");
    }

    public boolean o(AppData appData, SettingsProvider settingsProvider) {
        SettingsProvider settingsProvider2 = settingsProvider;
        if (j(appData.f29935b, CommonUtils.i(this.f30026a, "com.crashlytics.RequireBuildId", true))) {
            String clsuuid = new CLSUUID(this.f30035j).toString();
            try {
                this.f30032g = new CrashlyticsFileMarker("crash_marker", this.f30036k);
                this.f30031f = new CrashlyticsFileMarker("initialization_marker", this.f30036k);
                UserMetadata userMetadata = new UserMetadata(clsuuid, this.f30036k, this.f30040o);
                LogFileManager logFileManager = new LogFileManager(this.f30036k);
                MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
                this.f30043r.c(userMetadata);
                Context context = this.f30026a;
                IdManager idManager = this.f30035j;
                FileStore fileStore = this.f30036k;
                OnDemandCounter onDemandCounter = this.f30029d;
                OnDemandCounter onDemandCounter2 = onDemandCounter;
                UserMetadata userMetadata2 = userMetadata;
                SessionReportingCoordinator h2 = SessionReportingCoordinator.h(context, idManager, fileStore, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, onDemandCounter2, this.f30041p);
                Context context2 = this.f30026a;
                CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = this.f30040o;
                IdManager idManager2 = this.f30035j;
                DataCollectionArbiter dataCollectionArbiter = this.f30028c;
                FileStore fileStore2 = this.f30036k;
                CrashlyticsFileMarker crashlyticsFileMarker = this.f30032g;
                this.f30034i = new CrashlyticsController(context2, crashlyticsBackgroundWorker, idManager2, dataCollectionArbiter, fileStore2, crashlyticsFileMarker, appData, userMetadata2, logFileManager, h2, this.f30042q, this.f30038m, this.f30041p);
                boolean e2 = e();
                d();
                this.f30034i.x(clsuuid, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider2);
                if (!e2 || !CommonUtils.d(this.f30026a)) {
                    Logger.f().b("Successfully configured exception handler.");
                    return true;
                }
                Logger.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                h(settingsProvider2);
                return false;
            } catch (Exception e3) {
                Logger.f().e("Crashlytics was not started due to an exception during initialization", e3);
                this.f30034i = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
    }
}
