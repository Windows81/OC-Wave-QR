package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    public static final Timer X = new Clock().a();
    public static final long Y = TimeUnit.MINUTES.toMicros(1);
    public static volatile AppStartTrace Z;
    public static ExecutorService a0;

    /* renamed from: A  reason: collision with root package name */
    public final TransportManager f30976A;

    /* renamed from: B  reason: collision with root package name */
    public final Clock f30977B;
    public final ConfigResolver C;
    public final TraceMetric.Builder D;
    public Context E;
    public WeakReference F;
    public WeakReference G;
    public boolean H = false;
    public final Timer I;
    public final Timer J;
    public Timer K;
    public Timer L;
    public Timer M;
    public Timer N;
    public Timer O;
    public Timer P;
    public Timer Q;
    public Timer R;
    public PerfSession S;
    public boolean T;
    public int U;
    public final DrawCounter V;
    public boolean W;

    /* renamed from: z  reason: collision with root package name */
    public boolean f30978z = false;

    public final class DrawCounter implements ViewTreeObserver.OnDrawListener {
        public DrawCounter() {
        }

        public void onDraw() {
            AppStartTrace.n(AppStartTrace.this);
        }
    }

    public static class StartFromBackgroundRunnable implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final AppStartTrace f30980z;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.f30980z = appStartTrace;
        }

        public void run() {
            if (this.f30980z.K == null) {
                boolean unused = this.f30980z.T = true;
            }
        }
    }

    public AppStartTrace(TransportManager transportManager, Clock clock, ConfigResolver configResolver, ExecutorService executorService) {
        Timer timer = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.T = false;
        this.U = 0;
        this.V = new DrawCounter();
        this.W = false;
        this.f30976A = transportManager;
        this.f30977B = clock;
        this.C = configResolver;
        a0 = executorService;
        this.D = TraceMetric.K0().a0("_experiment_app_start_ttid");
        this.I = Timer.f(Process.getStartElapsedRealtime());
        StartupTime startupTime = (StartupTime) FirebaseApp.l().j(StartupTime.class);
        this.J = startupTime != null ? Timer.f(startupTime.b()) : timer;
    }

    public static /* synthetic */ int n(AppStartTrace appStartTrace) {
        int i2 = appStartTrace.U;
        appStartTrace.U = i2 + 1;
        return i2;
    }

    public static AppStartTrace p() {
        return Z != null ? Z : q(TransportManager.k(), new Clock());
    }

    public static AppStartTrace q(TransportManager transportManager, Clock clock) {
        if (Z == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (Z == null) {
                        Z = new AppStartTrace(transportManager, clock, ConfigResolver.g(), new ThreadPoolExecutor(0, 1, Y + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Z;
    }

    public static boolean s(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    public synchronized void A() {
        if (this.f30978z) {
            ProcessLifecycleOwner.n().a().d(this);
            ((Application) this.E).unregisterActivityLifecycleCallbacks(this);
            this.f30978z = false;
        }
    }

    public final Timer o() {
        Timer timer = this.J;
        return timer != null ? timer : X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[Catch:{ all -> 0x001a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.T     // Catch:{ all -> 0x001a }
            if (r5 != 0) goto L_0x0042
            com.google.firebase.perf.util.Timer r5 = r3.K     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x000a
            goto L_0x0042
        L_0x000a:
            boolean r5 = r3.W     // Catch:{ all -> 0x001a }
            r0 = 1
            if (r5 != 0) goto L_0x001c
            android.content.Context r5 = r3.E     // Catch:{ all -> 0x001a }
            boolean r5 = s(r5)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r5 = 0
            goto L_0x001d
        L_0x001a:
            r4 = move-exception
            goto L_0x0044
        L_0x001c:
            r5 = r0
        L_0x001d:
            r3.W = r5     // Catch:{ all -> 0x001a }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x001a }
            r5.<init>(r4)     // Catch:{ all -> 0x001a }
            r3.F = r5     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Clock r4 = r3.f30977B     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Timer r4 = r4.a()     // Catch:{ all -> 0x001a }
            r3.K = r4     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Timer r4 = r3.r()     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Timer r5 = r3.K     // Catch:{ all -> 0x001a }
            long r4 = r4.d(r5)     // Catch:{ all -> 0x001a }
            long r1 = Y     // Catch:{ all -> 0x001a }
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0040
            r3.H = r0     // Catch:{ all -> 0x001a }
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (!this.T && !this.H && this.C.h()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.V);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.T     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r5.H     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x000b
            goto L_0x00a2
        L_0x000b:
            com.google.firebase.perf.config.ConfigResolver r0 = r5.C     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.h()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x003b
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ all -> 0x0039 }
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.metrics.AppStartTrace$DrawCounter r3 = r5.V     // Catch:{ all -> 0x0039 }
            r2.addOnDrawListener(r3)     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.metrics.a r2 = new com.google.firebase.perf.metrics.a     // Catch:{ all -> 0x0039 }
            r2.<init>(r5)     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.util.FirstDrawDoneListener.c(r1, r2)     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.metrics.b r2 = new com.google.firebase.perf.metrics.b     // Catch:{ all -> 0x0039 }
            r2.<init>(r5)     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.metrics.c r3 = new com.google.firebase.perf.metrics.c     // Catch:{ all -> 0x0039 }
            r3.<init>(r5)     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.util.PreDrawListener.a(r1, r2, r3)     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r6 = move-exception
            goto L_0x00a4
        L_0x003b:
            com.google.firebase.perf.util.Timer r1 = r5.M     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0041
            monitor-exit(r5)
            return
        L_0x0041:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0039 }
            r1.<init>(r6)     // Catch:{ all -> 0x0039 }
            r5.G = r1     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.util.Clock r1 = r5.f30977B     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.util.Timer r1 = r1.a()     // Catch:{ all -> 0x0039 }
            r5.M = r1     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.session.PerfSession r1 = r1.perfSession()     // Catch:{ all -> 0x0039 }
            r5.S = r1     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.logging.AndroidLogger r1 = com.google.firebase.perf.logging.AndroidLogger.e()     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r2.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "onResume(): "
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0039 }
            r2.append(r6)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.util.Timer r6 = r5.o()     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.util.Timer r3 = r5.M     // Catch:{ all -> 0x0039 }
            long r3 = r6.d(r3)     // Catch:{ all -> 0x0039 }
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0039 }
            r1.a(r6)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.ExecutorService r6 = a0     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.metrics.d r1 = new com.google.firebase.perf.metrics.d     // Catch:{ all -> 0x0039 }
            r1.<init>(r5)     // Catch:{ all -> 0x0039 }
            r6.execute(r1)     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x00a0
            r5.A()     // Catch:{ all -> 0x0039 }
        L_0x00a0:
            monitor-exit(r5)
            return
        L_0x00a2:
            monitor-exit(r5)
            return
        L_0x00a4:
            monitor-exit(r5)     // Catch:{ all -> 0x0039 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.T     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            com.google.firebase.perf.util.Timer r1 = r0.L     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r0.H     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            com.google.firebase.perf.util.Clock r1 = r0.f30977B     // Catch:{ all -> 0x0018 }
            com.google.firebase.perf.util.Timer r1 = r1.a()     // Catch:{ all -> 0x0018 }
            r0.L = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return
        L_0x0018:
            r1 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityStopped(Activity activity) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.T && !this.H && this.O == null) {
            this.O = this.f30977B.a();
            this.D.T((TraceMetric) TraceMetric.K0().a0("_experiment_firstBackgrounding").Y(r().e()).Z(r().d(this.O)).d());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (!this.T && !this.H && this.N == null) {
            this.N = this.f30977B.a();
            this.D.T((TraceMetric) TraceMetric.K0().a0("_experiment_firstForegrounding").Y(r().e()).Z(r().d(this.N)).d());
        }
    }

    public final Timer r() {
        Timer timer = this.I;
        return timer != null ? timer : o();
    }

    public final /* synthetic */ void t(TraceMetric.Builder builder) {
        this.f30976A.C((TraceMetric) builder.d(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    public final void u() {
        TraceMetric.Builder Z2 = TraceMetric.K0().a0(Constants.TraceNames.APP_START_TRACE_NAME.toString()).Y(o().e()).Z(o().d(this.M));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((TraceMetric) TraceMetric.K0().a0(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).Y(o().e()).Z(o().d(this.K)).d());
        if (this.L != null) {
            TraceMetric.Builder K0 = TraceMetric.K0();
            K0.a0(Constants.TraceNames.ON_START_TRACE_NAME.toString()).Y(this.K.e()).Z(this.K.d(this.L));
            arrayList.add((TraceMetric) K0.d());
            TraceMetric.Builder K02 = TraceMetric.K0();
            K02.a0(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).Y(this.L.e()).Z(this.L.d(this.M));
            arrayList.add((TraceMetric) K02.d());
        }
        Z2.P(arrayList).R(this.S.a());
        this.f30976A.C((TraceMetric) Z2.d(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    public final void v(TraceMetric.Builder builder) {
        if (this.P != null && this.Q != null && this.R != null) {
            a0.execute(new e(this, builder));
            A();
        }
    }

    public final void w() {
        if (this.R == null) {
            this.R = this.f30977B.a();
            this.D.T((TraceMetric) TraceMetric.K0().a0("_experiment_onDrawFoQ").Y(r().e()).Z(r().d(this.R)).d());
            if (this.I != null) {
                this.D.T((TraceMetric) TraceMetric.K0().a0("_experiment_procStart_to_classLoad").Y(r().e()).Z(r().d(o())).d());
            }
            this.D.X("systemDeterminedForeground", this.W ? "true" : "false");
            this.D.W("onDrawCount", (long) this.U);
            this.D.R(this.S.a());
            v(this.D);
        }
    }

    public final void x() {
        if (this.P == null) {
            this.P = this.f30977B.a();
            this.D.Y(r().e()).Z(r().d(this.P));
            v(this.D);
        }
    }

    public final void y() {
        if (this.Q == null) {
            this.Q = this.f30977B.a();
            this.D.T((TraceMetric) TraceMetric.K0().a0("_experiment_preDrawFoQ").Y(r().e()).Z(r().d(this.Q)).d());
            v(this.D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void z(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f30978z     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.n()     // Catch:{ all -> 0x002e }
            androidx.lifecycle.Lifecycle r0 = r0.a()     // Catch:{ all -> 0x002e }
            r0.a(r2)     // Catch:{ all -> 0x002e }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x002e }
            boolean r0 = r3 instanceof android.app.Application     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0037
            r0 = r3
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x002e }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x002e }
            boolean r0 = r2.W     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 != 0) goto L_0x0030
            boolean r0 = s(r3)     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = 0
            goto L_0x0031
        L_0x002e:
            r3 = move-exception
            goto L_0x0039
        L_0x0030:
            r0 = r1
        L_0x0031:
            r2.W = r0     // Catch:{ all -> 0x002e }
            r2.f30978z = r1     // Catch:{ all -> 0x002e }
            r2.E = r3     // Catch:{ all -> 0x002e }
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.z(android.content.Context):void");
    }
}
