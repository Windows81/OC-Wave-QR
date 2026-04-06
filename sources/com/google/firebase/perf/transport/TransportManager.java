package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfMetricOrBuilder;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class TransportManager implements AppStateMonitor.AppStateCallback {
    public static final AndroidLogger Q = AndroidLogger.e();
    public static final TransportManager R = new TransportManager();

    /* renamed from: A  reason: collision with root package name */
    public final ConcurrentLinkedQueue f31094A = new ConcurrentLinkedQueue();

    /* renamed from: B  reason: collision with root package name */
    public final AtomicBoolean f31095B = new AtomicBoolean(false);
    public FirebaseApp C;
    public FirebasePerformance D;
    public FirebaseInstallationsApi E;
    public Provider F;
    public FlgTransport G;
    public ExecutorService H = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public Context I;
    public ConfigResolver J;
    public RateLimiter K;
    public AppStateMonitor L;
    public ApplicationInfo.Builder M;
    public String N;
    public String O;
    public boolean P = false;

    /* renamed from: z  reason: collision with root package name */
    public final Map f31096z;

    public TransportManager() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f31096z = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static TransportManager k() {
        return R;
    }

    public static String l(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(gaugeMetric.r0()), Integer.valueOf(gaugeMetric.o0()), Integer.valueOf(gaugeMetric.n0())});
    }

    public static String m(NetworkRequestMetric networkRequestMetric) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{networkRequestMetric.G0(), networkRequestMetric.J0() ? String.valueOf(networkRequestMetric.y0()) : "UNKNOWN", new DecimalFormat("#.####").format(((double) (networkRequestMetric.N0() ? networkRequestMetric.E0() : 0)) / 1000.0d)});
    }

    public static String n(PerfMetricOrBuilder perfMetricOrBuilder) {
        return perfMetricOrBuilder.l() ? o(perfMetricOrBuilder.n()) : perfMetricOrBuilder.o() ? m(perfMetricOrBuilder.p()) : perfMetricOrBuilder.j() ? l(perfMetricOrBuilder.q()) : "log";
    }

    public static String o(TraceMetric traceMetric) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{traceMetric.C0(), new DecimalFormat("#.####").format(((double) traceMetric.z0()) / 1000.0d)});
    }

    public static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void A(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.H.execute(new c(this, gaugeMetric, applicationProcessState));
    }

    public void B(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.H.execute(new e(this, networkRequestMetric, applicationProcessState));
    }

    public void C(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.H.execute(new d(this, traceMetric, applicationProcessState));
    }

    public final PerfMetric D(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        G();
        ApplicationInfo.Builder U = this.M.U(applicationProcessState);
        if (builder.l() || builder.o()) {
            U = ((ApplicationInfo.Builder) U.t()).P(j());
        }
        return (PerfMetric) builder.O(U).d();
    }

    public final void E() {
        Context k2 = this.C.k();
        this.I = k2;
        this.N = k2.getPackageName();
        this.J = ConfigResolver.g();
        this.K = new RateLimiter(this.I, new Rate(100, 1, TimeUnit.MINUTES), 500);
        this.L = AppStateMonitor.b();
        this.G = new FlgTransport(this.F, this.J.a());
        h();
    }

    public final void F(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        if (u()) {
            PerfMetric D2 = D(builder, applicationProcessState);
            if (t(D2)) {
                g(D2);
                SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
            }
        } else if (s(builder)) {
            Q.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(builder));
            this.f31094A.add(new PendingPerfEvent(builder, applicationProcessState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G() {
        /*
            r4 = this;
            com.google.firebase.perf.config.ConfigResolver r0 = r4.J
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0070
            com.google.firebase.perf.v1.ApplicationInfo$Builder r0 = r4.M
            boolean r0 = r0.O()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.P
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            com.google.firebase.installations.FirebaseInstallationsApi r0 = r4.E     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            com.google.android.gms.tasks.Task r0 = r0.m()     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.b(r0, r2, r1)     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x002b, InterruptedException -> 0x0029, TimeoutException -> 0x0027 }
            goto L_0x005d
        L_0x0027:
            r0 = move-exception
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            goto L_0x004d
        L_0x002d:
            com.google.firebase.perf.logging.AndroidLogger r1 = Q
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is timed out: %s"
            r1.d(r2, r0)
            goto L_0x005c
        L_0x003d:
            com.google.firebase.perf.logging.AndroidLogger r1 = Q
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is interrupted: %s"
            r1.d(r2, r0)
            goto L_0x005c
        L_0x004d:
            com.google.firebase.perf.logging.AndroidLogger r1 = Q
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unable to retrieve Installation Id: %s"
            r1.d(r2, r0)
        L_0x005c:
            r0 = 0
        L_0x005d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0069
            com.google.firebase.perf.v1.ApplicationInfo$Builder r1 = r4.M
            r1.T(r0)
            goto L_0x0070
        L_0x0069:
            com.google.firebase.perf.logging.AndroidLogger r0 = Q
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.TransportManager.G():void");
    }

    public final void H() {
        if (this.D == null && u()) {
            this.D = FirebasePerformance.c();
        }
    }

    public final void g(PerfMetric perfMetric) {
        if (perfMetric.l()) {
            Q.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(perfMetric), i(perfMetric.n()));
        } else {
            Q.g("Logging %s", n(perfMetric));
        }
        this.G.b(perfMetric);
    }

    public final void h() {
        this.L.k(new WeakReference(R));
        ApplicationInfo.Builder s0 = ApplicationInfo.s0();
        this.M = s0;
        s0.V(this.C.n().c()).R(AndroidApplicationInfo.l0().O(this.N).P(BuildConfig.f30891b).R(p(this.I)));
        this.f31095B.set(true);
        while (!this.f31094A.isEmpty()) {
            PendingPerfEvent pendingPerfEvent = (PendingPerfEvent) this.f31094A.poll();
            if (pendingPerfEvent != null) {
                this.H.execute(new g(this, pendingPerfEvent));
            }
        }
    }

    public final String i(TraceMetric traceMetric) {
        String C0 = traceMetric.C0();
        return C0.startsWith("_st_") ? ConsoleUrlGenerator.c(this.O, this.N, C0) : ConsoleUrlGenerator.a(this.O, this.N, C0);
    }

    public final Map j() {
        H();
        FirebasePerformance firebasePerformance = this.D;
        return firebasePerformance != null ? firebasePerformance.b() : Collections.emptyMap();
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.P = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (u()) {
            this.H.execute(new b(this));
        }
    }

    public final void q(PerfMetric perfMetric) {
        if (perfMetric.l()) {
            this.L.d(Constants.CounterNames.TRACE_EVENT_RATE_LIMITED.toString(), 1);
        } else if (perfMetric.o()) {
            this.L.d(Constants.CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
        }
    }

    public void r(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider) {
        this.C = firebaseApp;
        this.O = firebaseApp.n().e();
        this.E = firebaseInstallationsApi;
        this.F = provider;
        this.H.execute(new f(this));
    }

    public final boolean s(PerfMetricOrBuilder perfMetricOrBuilder) {
        Integer num = (Integer) this.f31096z.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int intValue = num.intValue();
        Integer num2 = (Integer) this.f31096z.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) this.f31096z.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int intValue3 = num3.intValue();
        if (perfMetricOrBuilder.l() && intValue > 0) {
            this.f31096z.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (perfMetricOrBuilder.o() && intValue2 > 0) {
            this.f31096z.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!perfMetricOrBuilder.j() || intValue3 <= 0) {
            Q.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(perfMetricOrBuilder), num, num2, num3);
            return false;
        } else {
            this.f31096z.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    public final boolean t(PerfMetric perfMetric) {
        if (!this.J.K()) {
            Q.g("Performance collection is not enabled, dropping %s", n(perfMetric));
            return false;
        } else if (!perfMetric.j0().o0()) {
            Q.k("App Instance ID is null or empty, dropping %s", n(perfMetric));
            return false;
        } else if (!PerfMetricValidator.b(perfMetric, this.I)) {
            Q.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(perfMetric));
            return false;
        } else if (!this.K.h(perfMetric)) {
            q(perfMetric);
            Q.g("Event dropped due to device sampling - %s", n(perfMetric));
            return false;
        } else if (!this.K.g(perfMetric)) {
            return true;
        } else {
            q(perfMetric);
            Q.g("Rate limited (per device) - %s", n(perfMetric));
            return false;
        }
    }

    public boolean u() {
        return this.f31095B.get();
    }

    public final /* synthetic */ void v(PendingPerfEvent pendingPerfEvent) {
        F(pendingPerfEvent.f31074a, pendingPerfEvent.f31075b);
    }

    public final /* synthetic */ void w(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        F(PerfMetric.l0().T(traceMetric), applicationProcessState);
    }

    public final /* synthetic */ void x(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        F(PerfMetric.l0().R(networkRequestMetric), applicationProcessState);
    }

    public final /* synthetic */ void y(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        F(PerfMetric.l0().P(gaugeMetric), applicationProcessState);
    }

    public final /* synthetic */ void z() {
        this.K.a(this.P);
    }
}
