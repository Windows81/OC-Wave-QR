package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.util.Optional;
import java.util.HashMap;
import java.util.Map;

public class FrameMetricsRecorder {

    /* renamed from: e  reason: collision with root package name */
    public static final AndroidLogger f30913e = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final Activity f30914a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameMetricsAggregator f30915b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f30916c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30917d;

    public FrameMetricsRecorder(Activity activity) {
        this(activity, new FrameMetricsAggregator(), new HashMap());
    }

    public static boolean a() {
        return true;
    }

    public final Optional b() {
        if (!this.f30917d) {
            f30913e.a("No recording has been started.");
            return Optional.a();
        }
        SparseIntArray[] b2 = this.f30915b.b();
        if (b2 == null) {
            f30913e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return Optional.a();
        } else if (b2[0] != null) {
            return Optional.e(FrameMetricsCalculator.a(b2));
        } else {
            f30913e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return Optional.a();
        }
    }

    public void c() {
        if (this.f30917d) {
            f30913e.b("FrameMetricsAggregator is already recording %s", this.f30914a.getClass().getSimpleName());
            return;
        }
        this.f30915b.a(this.f30914a);
        this.f30917d = true;
    }

    public void d(Fragment fragment) {
        if (!this.f30917d) {
            f30913e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f30916c.containsKey(fragment)) {
            f30913e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            Optional b2 = b();
            if (!b2.d()) {
                f30913e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            } else {
                this.f30916c.put(fragment, (FrameMetricsCalculator.PerfFrameMetrics) b2.c());
            }
        }
    }

    public Optional e() {
        if (!this.f30917d) {
            f30913e.a("Cannot stop because no recording was started");
            return Optional.a();
        }
        if (!this.f30916c.isEmpty()) {
            f30913e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f30916c.clear();
        }
        Optional b2 = b();
        try {
            this.f30915b.c(this.f30914a);
        } catch (IllegalArgumentException | NullPointerException e2) {
            if (!(e2 instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                f30913e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e2.toString());
                b2 = Optional.a();
            } else {
                throw e2;
            }
        }
        this.f30915b.d();
        this.f30917d = false;
        return b2;
    }

    public Optional f(Fragment fragment) {
        if (!this.f30917d) {
            f30913e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return Optional.a();
        } else if (!this.f30916c.containsKey(fragment)) {
            f30913e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return Optional.a();
        } else {
            FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics = (FrameMetricsCalculator.PerfFrameMetrics) this.f30916c.remove(fragment);
            Optional b2 = b();
            if (b2.d()) {
                return Optional.e(((FrameMetricsCalculator.PerfFrameMetrics) b2.c()).a(perfFrameMetrics));
            }
            f30913e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return Optional.a();
        }
    }

    public FrameMetricsRecorder(Activity activity, FrameMetricsAggregator frameMetricsAggregator, Map map) {
        this.f30917d = false;
        this.f30914a = activity;
        this.f30915b = frameMetricsAggregator;
        this.f30916c = map;
    }
}
