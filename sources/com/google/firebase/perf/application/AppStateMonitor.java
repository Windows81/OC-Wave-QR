package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    public static final AndroidLogger Q = AndroidLogger.e();
    public static volatile AppStateMonitor R;

    /* renamed from: A  reason: collision with root package name */
    public final WeakHashMap f30904A;

    /* renamed from: B  reason: collision with root package name */
    public final WeakHashMap f30905B;
    public final WeakHashMap C;
    public final Map D;
    public final Set E;
    public Set F;
    public final AtomicInteger G;
    public final TransportManager H;
    public final ConfigResolver I;
    public final Clock J;
    public final boolean K;
    public Timer L;
    public Timer M;
    public ApplicationProcessState N;
    public boolean O;
    public boolean P;

    /* renamed from: z  reason: collision with root package name */
    public final WeakHashMap f30906z;

    public interface AppColdStartCallback {
        void a();
    }

    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock) {
        this(transportManager, clock, ConfigResolver.g(), g());
    }

    public static AppStateMonitor b() {
        if (R == null) {
            synchronized (AppStateMonitor.class) {
                try {
                    if (R == null) {
                        R = new AppStateMonitor(TransportManager.k(), new Clock());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return R;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    public static boolean g() {
        return FrameMetricsRecorder.a();
    }

    public ApplicationProcessState a() {
        return this.N;
    }

    public void d(String str, long j2) {
        synchronized (this.D) {
            try {
                Long l2 = (Long) this.D.get(str);
                if (l2 == null) {
                    this.D.put(str, Long.valueOf(j2));
                } else {
                    this.D.put(str, Long.valueOf(l2.longValue() + j2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i2) {
        this.G.addAndGet(i2);
    }

    public boolean f() {
        return this.P;
    }

    public boolean h() {
        return this.K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void i(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.O     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0018 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0018 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0018 }
            r2 = 1
            r1.O = r2     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r2 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.AppStateMonitor.i(android.content.Context):void");
    }

    public void j(AppColdStartCallback appColdStartCallback) {
        synchronized (this.F) {
            this.F.add(appColdStartCallback);
        }
    }

    public void k(WeakReference weakReference) {
        synchronized (this.E) {
            this.E.add(weakReference);
        }
    }

    public final void l() {
        synchronized (this.F) {
            try {
                for (AppColdStartCallback appColdStartCallback : this.F) {
                    if (appColdStartCallback != null) {
                        appColdStartCallback.a();
                    }
                }
            } finally {
            }
        }
    }

    public final void m(Activity activity) {
        Trace trace = (Trace) this.C.get(activity);
        if (trace != null) {
            this.C.remove(activity);
            Optional e2 = ((FrameMetricsRecorder) this.f30904A.get(activity)).e();
            if (!e2.d()) {
                Q.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            ScreenTraceUtil.a(trace, (FrameMetricsCalculator.PerfFrameMetrics) e2.c());
            trace.stop();
        }
    }

    public final void n(String str, Timer timer, Timer timer2) {
        if (this.I.K()) {
            TraceMetric.Builder R2 = TraceMetric.K0().a0(str).Y(timer.e()).Z(timer.d(timer2)).R(SessionManager.getInstance().perfSession().a());
            int andSet = this.G.getAndSet(0);
            synchronized (this.D) {
                try {
                    R2.U(this.D);
                    if (andSet != 0) {
                        R2.W(Constants.CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                    }
                    this.D.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.H.C((TraceMetric) R2.d(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    public final void o(Activity activity) {
        if (h() && this.I.K()) {
            FrameMetricsRecorder frameMetricsRecorder = new FrameMetricsRecorder(activity);
            this.f30904A.put(activity, frameMetricsRecorder);
            if (activity instanceof FragmentActivity) {
                FragmentStateMonitor fragmentStateMonitor = new FragmentStateMonitor(this.J, this.H, this, frameMetricsRecorder);
                this.f30905B.put(activity, fragmentStateMonitor);
                ((FragmentActivity) activity).f0().k1(fragmentStateMonitor, true);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f30904A.remove(activity);
        if (this.f30905B.containsKey(activity)) {
            ((FragmentActivity) activity).f0().D1((FragmentManager.FragmentLifecycleCallbacks) this.f30905B.remove(activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f30906z.isEmpty()) {
                this.L = this.J.a();
                this.f30906z.put(activity, Boolean.TRUE);
                if (this.P) {
                    q(ApplicationProcessState.FOREGROUND);
                    l();
                    this.P = false;
                } else {
                    n(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString(), this.M, this.L);
                    q(ApplicationProcessState.FOREGROUND);
                }
            } else {
                this.f30906z.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.I.K()) {
                if (!this.f30904A.containsKey(activity)) {
                    o(activity);
                }
                ((FrameMetricsRecorder) this.f30904A.get(activity)).c();
                Trace trace = new Trace(c(activity), this.H, this.J, this);
                trace.start();
                this.C.put(activity, trace);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f30906z.containsKey(activity)) {
                this.f30906z.remove(activity);
                if (this.f30906z.isEmpty()) {
                    this.M = this.J.a();
                    n(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString(), this.L, this.M);
                    q(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void p(WeakReference weakReference) {
        synchronized (this.E) {
            this.E.remove(weakReference);
        }
    }

    public final void q(ApplicationProcessState applicationProcessState) {
        this.N = applicationProcessState;
        synchronized (this.E) {
            try {
                Iterator it = this.E.iterator();
                while (it.hasNext()) {
                    AppStateCallback appStateCallback = (AppStateCallback) ((WeakReference) it.next()).get();
                    if (appStateCallback != null) {
                        appStateCallback.onUpdateAppState(this.N);
                    } else {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock, ConfigResolver configResolver, boolean z2) {
        this.f30906z = new WeakHashMap();
        this.f30904A = new WeakHashMap();
        this.f30905B = new WeakHashMap();
        this.C = new WeakHashMap();
        this.D = new HashMap();
        this.E = new HashSet();
        this.F = new HashSet();
        this.G = new AtomicInteger(0);
        this.N = ApplicationProcessState.BACKGROUND;
        this.O = false;
        this.P = true;
        this.H = transportManager;
        this.J = clock;
        this.I = configResolver;
        this.K = z2;
    }
}
