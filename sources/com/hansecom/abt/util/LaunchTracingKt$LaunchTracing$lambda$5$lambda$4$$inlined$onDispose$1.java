package com.hansecom.abt.util;

import androidx.compose.runtime.DisposableEffectResult;
import com.google.firebase.perf.application.FrameMetricsRecorder;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import kotlin.Metadata;

@Metadata
public final class LaunchTracingKt$LaunchTracing$lambda$5$lambda$4$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameMetricsRecorder f39017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Trace f39018b;

    public LaunchTracingKt$LaunchTracing$lambda$5$lambda$4$$inlined$onDispose$1(FrameMetricsRecorder frameMetricsRecorder, Trace trace) {
        this.f39017a = frameMetricsRecorder;
        this.f39018b = trace;
    }

    public void d() {
        Optional e2 = this.f39017a.e();
        if (e2.d()) {
            ScreenTraceUtil.a(this.f39018b, (FrameMetricsCalculator.PerfFrameMetrics) e2.c());
        }
        this.f39018b.stop();
    }
}
