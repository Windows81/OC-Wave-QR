package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Timer f31058A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CpuGaugeCollector f31059z;

    public /* synthetic */ b(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        this.f31059z = cpuGaugeCollector;
        this.f31058A = timer;
    }

    public final void run() {
        this.f31059z.g(this.f31058A);
    }
}
