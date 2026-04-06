package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsController {

    /* renamed from: t  reason: collision with root package name */
    public static final FilenameFilter f29979t = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Context f29980a;

    /* renamed from: b  reason: collision with root package name */
    public final DataCollectionArbiter f29981b;

    /* renamed from: c  reason: collision with root package name */
    public final CrashlyticsFileMarker f29982c;

    /* renamed from: d  reason: collision with root package name */
    public final UserMetadata f29983d;

    /* renamed from: e  reason: collision with root package name */
    public final CrashlyticsBackgroundWorker f29984e;

    /* renamed from: f  reason: collision with root package name */
    public final IdManager f29985f;

    /* renamed from: g  reason: collision with root package name */
    public final FileStore f29986g;

    /* renamed from: h  reason: collision with root package name */
    public final AppData f29987h;

    /* renamed from: i  reason: collision with root package name */
    public final LogFileManager f29988i;

    /* renamed from: j  reason: collision with root package name */
    public final CrashlyticsNativeComponent f29989j;

    /* renamed from: k  reason: collision with root package name */
    public final AnalyticsEventLogger f29990k;

    /* renamed from: l  reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f29991l;

    /* renamed from: m  reason: collision with root package name */
    public final SessionReportingCoordinator f29992m;

    /* renamed from: n  reason: collision with root package name */
    public CrashlyticsUncaughtExceptionHandler f29993n;

    /* renamed from: o  reason: collision with root package name */
    public SettingsProvider f29994o = null;

    /* renamed from: p  reason: collision with root package name */
    public final TaskCompletionSource f29995p = new TaskCompletionSource();

    /* renamed from: q  reason: collision with root package name */
    public final TaskCompletionSource f29996q = new TaskCompletionSource();

    /* renamed from: r  reason: collision with root package name */
    public final TaskCompletionSource f29997r = new TaskCompletionSource();

    /* renamed from: s  reason: collision with root package name */
    public final AtomicBoolean f29998s = new AtomicBoolean(false);

    public CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f29980a = context;
        this.f29984e = crashlyticsBackgroundWorker;
        this.f29985f = idManager;
        this.f29981b = dataCollectionArbiter;
        this.f29986g = fileStore;
        this.f29982c = crashlyticsFileMarker;
        this.f29987h = appData;
        this.f29983d = userMetadata;
        this.f29988i = logFileManager;
        this.f29989j = crashlyticsNativeComponent;
        this.f29990k = analyticsEventLogger;
        this.f29991l = crashlyticsAppQualitySessionsSubscriber;
        this.f29992m = sessionReportingCoordinator;
    }

    public static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long C() {
        return F(System.currentTimeMillis());
    }

    public static List D(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File q2 = fileStore.q(str, "user-data");
        File q3 = fileStore.q(str, "keys");
        File q4 = fileStore.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.g()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.f()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.a()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.c()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.b()));
        arrayList.add(P(nativeSessionFileProvider));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", q2));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", "keys", q3));
        arrayList.add(new FileBackedNativeSessionFile("rollouts_file", "rollouts", q4));
        return arrayList;
    }

    public static long F(long j2) {
        return j2 / 1000;
    }

    public static boolean O(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger f2 = Logger.f();
            f2.k("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger f3 = Logger.f();
            f3.g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && applicationExitInfo == null;
    }

    public static NativeSessionFile P(NativeSessionFileProvider nativeSessionFileProvider) {
        File e2 = nativeSessionFileProvider.e();
        if (e2 != null && e2.exists()) {
            return new FileBackedNativeSessionFile("minidump_file", "minidump", e2);
        }
        return new BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0});
    }

    public static byte[] R(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static StaticSessionData.AppData o(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.b(idManager.f(), appData.f29939f, appData.f29940g, idManager.a().c(), DeliveryMechanism.f(appData.f29937d).h(), appData.f29941h);
    }

    public static StaticSessionData.DeviceData p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.c(CommonUtils.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.w(), CommonUtils.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static StaticSessionData.OsData q() {
        return StaticSessionData.OsData.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.x());
    }

    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final String B() {
        SortedSet p2 = this.f29992m.p();
        if (!p2.isEmpty()) {
            return (String) p2.first();
        }
        return null;
    }

    public final InputStream E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Logger.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        Logger.f().g("No version control information found");
        return null;
    }

    public String G() {
        InputStream E = E("META-INF/version-control-info.textproto");
        if (E == null) {
            return null;
        }
        Logger.f().b("Read version control info");
        return Base64.encodeToString(R(E), 0);
    }

    public void H(SettingsProvider settingsProvider, Thread thread, Throwable th) {
        I(settingsProvider, thread, th, false);
    }

    public synchronized void I(SettingsProvider settingsProvider, Thread thread, Throwable th, boolean z2) {
        Logger f2 = Logger.f();
        f2.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        final long currentTimeMillis = System.currentTimeMillis();
        final Throwable th2 = th;
        final Thread thread2 = thread;
        final SettingsProvider settingsProvider2 = settingsProvider;
        final boolean z3 = z2;
        try {
            Utils.f(this.f29984e.i(new Callable<Task<Void>>() {
                /* renamed from: a */
                public Task call() {
                    long b2 = CrashlyticsController.F(currentTimeMillis);
                    final String c2 = CrashlyticsController.this.B();
                    if (c2 == null) {
                        Logger.f().d("Tried to write a fatal exception while no session was open.");
                        return Tasks.e((Object) null);
                    }
                    CrashlyticsController.this.f29982c.a();
                    CrashlyticsController.this.f29992m.t(th2, thread2, c2, b2);
                    CrashlyticsController.this.w(currentTimeMillis);
                    CrashlyticsController.this.t(settingsProvider2);
                    CrashlyticsController.this.v(new CLSUUID(CrashlyticsController.this.f29985f).toString(), Boolean.valueOf(z3));
                    if (!CrashlyticsController.this.f29981b.d()) {
                        return Tasks.e((Object) null);
                    }
                    final Executor c3 = CrashlyticsController.this.f29984e.c();
                    return settingsProvider2.a().p(c3, new SuccessContinuation<Settings, Void>() {
                        /* renamed from: b */
                        public Task a(Settings settings) {
                            String str = null;
                            if (settings == null) {
                                Logger.f().k("Received null app settings, cannot send reports at crash time.");
                                return Tasks.e((Object) null);
                            }
                            Task n2 = CrashlyticsController.this.N();
                            SessionReportingCoordinator h2 = CrashlyticsController.this.f29992m;
                            Executor executor = c3;
                            if (z3) {
                                str = c2;
                            }
                            return Tasks.g(n2, h2.y(executor, str));
                        }
                    });
                }
            }));
        } catch (TimeoutException unused) {
            Logger.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            Logger.f().e("Error handling uncaught exception", e2);
        }
    }

    public boolean J() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.f29993n;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.a();
    }

    public List L() {
        return this.f29986g.h(f29979t);
    }

    public final Task M(final long j2) {
        if (A()) {
            Logger.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.e((Object) null);
        }
        Logger.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.c(new ScheduledThreadPoolExecutor(1), new Callable<Void>() {
            /* renamed from: a */
            public Void call() {
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", j2);
                CrashlyticsController.this.f29990k.a("_ae", bundle);
                return null;
            }
        });
    }

    public final Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger f2 = Logger.f();
                f2.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.f(arrayList);
    }

    public void Q(final String str) {
        this.f29984e.h(new Callable<Void>() {
            /* renamed from: a */
            public Void call() {
                CrashlyticsController.this.v(str, Boolean.FALSE);
                return null;
            }
        });
    }

    public void S() {
        try {
            String G = G();
            if (G != null) {
                T("com.crashlytics.version-control-info", G);
                Logger.f().g("Saved version control info");
            }
        } catch (IOException e2) {
            Logger.f().l("Unable to save version control info", e2);
        }
    }

    public void T(String str, String str2) {
        try {
            this.f29983d.l(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.f29980a;
            if (context == null || !CommonUtils.u(context)) {
                Logger.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e2;
        }
    }

    public Task U(final Task task) {
        if (!this.f29992m.n()) {
            Logger.f().i("No crash reports are available to be sent.");
            this.f29995p.e(Boolean.FALSE);
            return Tasks.e((Object) null);
        }
        Logger.f().i("Crash reports are available to be sent.");
        return V().o(new SuccessContinuation<Boolean, Void>() {
            /* renamed from: b */
            public Task a(final Boolean bool) {
                return CrashlyticsController.this.f29984e.i(new Callable<Task<Void>>() {
                    /* renamed from: a */
                    public Task call() {
                        if (!bool.booleanValue()) {
                            Logger.f().i("Deleting cached crash reports...");
                            CrashlyticsController.r(CrashlyticsController.this.L());
                            CrashlyticsController.this.f29992m.w();
                            CrashlyticsController.this.f29997r.e((Object) null);
                            return Tasks.e((Object) null);
                        }
                        Logger.f().b("Sending cached crash reports...");
                        CrashlyticsController.this.f29981b.c(bool.booleanValue());
                        final Executor c2 = CrashlyticsController.this.f29984e.c();
                        return task.p(c2, new SuccessContinuation<Settings, Void>() {
                            /* renamed from: b */
                            public Task a(Settings settings) {
                                if (settings == null) {
                                    Logger.f().k("Received null app settings at app startup. Cannot send cached reports");
                                    return Tasks.e((Object) null);
                                }
                                Task unused = CrashlyticsController.this.N();
                                CrashlyticsController.this.f29992m.x(c2);
                                CrashlyticsController.this.f29997r.e((Object) null);
                                return Tasks.e((Object) null);
                            }
                        });
                    }
                });
            }
        });
    }

    public final Task V() {
        if (this.f29981b.d()) {
            Logger.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f29995p.e(Boolean.FALSE);
            return Tasks.e(Boolean.TRUE);
        }
        Logger.f().b("Automatic data collection is disabled.");
        Logger.f().i("Notifying that unsent reports are available.");
        this.f29995p.e(Boolean.TRUE);
        Task o2 = this.f29981b.h().o(new SuccessContinuation<Void, Boolean>() {
            /* renamed from: b */
            public Task a(Void voidR) {
                return Tasks.e(Boolean.TRUE);
            }
        });
        Logger.f().b("Waiting for send/deleteUnsentReports to be called.");
        return Utils.n(o2, this.f29996q.a());
    }

    public final void W(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            List a2 = ((ActivityManager) this.f29980a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (a2.size() != 0) {
                this.f29992m.v(str, a2, new LogFileManager(this.f29986g, str), UserMetadata.j(str, this.f29986g, this.f29984e));
                return;
            }
            Logger f2 = Logger.f();
            f2.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Logger f3 = Logger.f();
        f3.i("ANR feature enabled, but device is API " + i2);
    }

    public void X(Thread thread, Throwable th) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Throwable th2 = th;
        final Thread thread2 = thread;
        this.f29984e.g(new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.J()) {
                    long b2 = CrashlyticsController.F(currentTimeMillis);
                    String c2 = CrashlyticsController.this.B();
                    if (c2 == null) {
                        Logger.f().k("Tried to write a non-fatal exception while no session was open.");
                    } else {
                        CrashlyticsController.this.f29992m.u(th2, thread2, c2, b2);
                    }
                }
            }
        });
    }

    public void Y(final long j2, final String str) {
        this.f29984e.h(new Callable<Void>() {
            /* renamed from: a */
            public Void call() {
                if (CrashlyticsController.this.J()) {
                    return null;
                }
                CrashlyticsController.this.f29988i.g(j2, str);
                return null;
            }
        });
    }

    public boolean s() {
        if (!this.f29982c.c()) {
            String B2 = B();
            return B2 != null && this.f29989j.d(B2);
        }
        Logger.f().i("Found previous crash marker.");
        this.f29982c.d();
        return true;
    }

    public void t(SettingsProvider settingsProvider) {
        u(false, settingsProvider);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(boolean r4, com.google.firebase.crashlytics.internal.settings.SettingsProvider r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r1 = r3.f29992m
            java.util.SortedSet r1 = r1.p()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.internal.settings.Settings r5 = r5.b()
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r5 = r5.f30654b
            boolean r5 = r5.f30662b
            if (r5 == 0) goto L_0x002f
            r3.W(r1)
            goto L_0x0038
        L_0x002f:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.f()
            java.lang.String r2 = "ANR feature disabled."
            r5.i(r2)
        L_0x0038:
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r5 = r3.f29989j
            boolean r5 = r5.d(r1)
            if (r5 == 0) goto L_0x0043
            r3.y(r1)
        L_0x0043:
            if (r4 == 0) goto L_0x004d
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0054
        L_0x004d:
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r4 = r3.f29991l
            r5 = 0
            r4.e(r5)
            r4 = r5
        L_0x0054:
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r5 = r3.f29992m
            long r0 = C()
            r5.k(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.u(boolean, com.google.firebase.crashlytics.internal.settings.SettingsProvider):void");
    }

    public final void v(String str, Boolean bool) {
        long C = C();
        Logger f2 = Logger.f();
        f2.b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{CrashlyticsCore.i()});
        StaticSessionData.AppData o2 = o(this.f29985f, this.f29987h);
        StaticSessionData.OsData q2 = q();
        StaticSessionData.DeviceData p2 = p(this.f29980a);
        this.f29989j.c(str, format, C, StaticSessionData.b(o2, q2, p2));
        if (bool.booleanValue() && str != null) {
            this.f29983d.m(str);
        }
        this.f29988i.e(str);
        this.f29991l.e(str);
        this.f29992m.q(str, C);
    }

    public final void w(long j2) {
        try {
            FileStore fileStore = this.f29986g;
            if (!fileStore.g(".ae" + j2).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            Logger.f().l("Could not create app exception marker file.", e2);
        }
    }

    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f29994o = settingsProvider;
        Q(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {
            public void a(SettingsProvider settingsProvider, Thread thread, Throwable th) {
                CrashlyticsController.this.H(settingsProvider, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.f29989j);
        this.f29993n = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public final void y(String str) {
        Logger f2 = Logger.f();
        f2.i("Finalizing native report for session " + str);
        NativeSessionFileProvider a2 = this.f29989j.a(str);
        File e2 = a2.e();
        CrashlyticsReport.ApplicationExitInfo d2 = a2.d();
        if (O(str, e2, d2)) {
            Logger.f().k("No native core present");
            return;
        }
        long lastModified = e2.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.f29986g, str);
        File k2 = this.f29986g.k(str);
        if (!k2.isDirectory()) {
            Logger.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List D = D(a2, str, this.f29986g, logFileManager.b());
        NativeSessionFileGzipper.b(k2, D);
        Logger.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f29992m.j(str, D, d2);
        logFileManager.a();
    }

    public boolean z(SettingsProvider settingsProvider) {
        this.f29984e.b();
        if (J()) {
            Logger.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.f().i("Finalizing previously open sessions.");
        try {
            u(true, settingsProvider);
            Logger.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            Logger.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
