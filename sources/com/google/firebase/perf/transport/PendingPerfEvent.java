package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.PerfMetric;

final class PendingPerfEvent {

    /* renamed from: a  reason: collision with root package name */
    public final PerfMetric.Builder f31074a;

    /* renamed from: b  reason: collision with root package name */
    public final ApplicationProcessState f31075b;

    public PendingPerfEvent(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        this.f31074a = builder;
        this.f31075b = applicationProcessState;
    }
}
