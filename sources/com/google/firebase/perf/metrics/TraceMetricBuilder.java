package com.google.firebase.perf.metrics;

import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Arrays;
import java.util.List;

class TraceMetricBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Trace f30993a;

    public TraceMetricBuilder(Trace trace) {
        this.f30993a = trace;
    }

    public TraceMetric a() {
        TraceMetric.Builder Z = TraceMetric.K0().a0(this.f30993a.f()).Y(this.f30993a.h().e()).Z(this.f30993a.h().d(this.f30993a.e()));
        for (Counter counter : this.f30993a.d().values()) {
            Z.W(counter.b(), counter.a());
        }
        List<Trace> i2 = this.f30993a.i();
        if (!i2.isEmpty()) {
            for (Trace traceMetricBuilder : i2) {
                Z.T(new TraceMetricBuilder(traceMetricBuilder).a());
            }
        }
        Z.V(this.f30993a.getAttributes());
        PerfSession[] b2 = com.google.firebase.perf.session.PerfSession.b(this.f30993a.g());
        if (b2 != null) {
            Z.O(Arrays.asList(b2));
        }
        return (TraceMetric) Z.d();
    }
}
