package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.v1.GaugeMetric;

final class FirebasePerfGaugeMetricValidator extends PerfMetricValidator {

    /* renamed from: a  reason: collision with root package name */
    public final GaugeMetric f31002a;

    public FirebasePerfGaugeMetricValidator(GaugeMetric gaugeMetric) {
        this.f31002a = gaugeMetric;
    }

    public boolean c() {
        return this.f31002a.s0() && (this.f31002a.o0() > 0 || this.f31002a.n0() > 0 || (this.f31002a.r0() && this.f31002a.q0().j0()));
    }
}
