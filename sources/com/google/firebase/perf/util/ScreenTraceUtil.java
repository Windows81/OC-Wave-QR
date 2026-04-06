package com.google.firebase.perf.util;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants;

public class ScreenTraceUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLogger f31130a = AndroidLogger.e();

    public static Trace a(Trace trace, FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics) {
        if (perfFrameMetrics.d() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_TOTAL.toString(), (long) perfFrameMetrics.d());
        }
        if (perfFrameMetrics.c() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_SLOW.toString(), (long) perfFrameMetrics.c());
        }
        if (perfFrameMetrics.b() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_FROZEN.toString(), (long) perfFrameMetrics.b());
        }
        AndroidLogger androidLogger = f31130a;
        androidLogger.a("Screen trace: " + trace.f() + " _fr_tot:" + perfFrameMetrics.d() + " _fr_slo:" + perfFrameMetrics.c() + " _fr_fzn:" + perfFrameMetrics.b());
        return trace;
    }
}
