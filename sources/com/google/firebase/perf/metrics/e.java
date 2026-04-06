package com.google.firebase.perf.metrics;

import com.google.firebase.perf.v1.TraceMetric;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TraceMetric.Builder f30998A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f30999z;

    public /* synthetic */ e(AppStartTrace appStartTrace, TraceMetric.Builder builder) {
        this.f30999z = appStartTrace;
        this.f30998A = builder;
    }

    public final void run() {
        this.f30999z.t(this.f30998A);
    }
}
