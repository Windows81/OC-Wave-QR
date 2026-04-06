package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import java.util.WeakHashMap;

public class FragmentStateMonitor extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: f  reason: collision with root package name */
    public static final AndroidLogger f30907f = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap f30908a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Clock f30909b;

    /* renamed from: c  reason: collision with root package name */
    public final TransportManager f30910c;

    /* renamed from: d  reason: collision with root package name */
    public final AppStateMonitor f30911d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameMetricsRecorder f30912e;

    public FragmentStateMonitor(Clock clock, TransportManager transportManager, AppStateMonitor appStateMonitor, FrameMetricsRecorder frameMetricsRecorder) {
        this.f30909b = clock;
        this.f30910c = transportManager;
        this.f30911d = appStateMonitor;
        this.f30912e = frameMetricsRecorder;
    }

    public void f(FragmentManager fragmentManager, Fragment fragment) {
        super.f(fragmentManager, fragment);
        AndroidLogger androidLogger = f30907f;
        androidLogger.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f30908a.containsKey(fragment)) {
            androidLogger.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f30908a.get(fragment);
        this.f30908a.remove(fragment);
        Optional f2 = this.f30912e.f(fragment);
        if (!f2.d()) {
            androidLogger.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        ScreenTraceUtil.a(trace, (FrameMetricsCalculator.PerfFrameMetrics) f2.c());
        trace.stop();
    }

    public void i(FragmentManager fragmentManager, Fragment fragment) {
        super.i(fragmentManager, fragment);
        f30907f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f30910c, this.f30909b, this.f30911d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.I() == null ? "No parent" : fragment.I().getClass().getSimpleName());
        if (fragment.l() != null) {
            trace.putAttribute("Hosting_activity", fragment.l().getClass().getSimpleName());
        }
        this.f30908a.put(fragment, trace);
        this.f30912e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
