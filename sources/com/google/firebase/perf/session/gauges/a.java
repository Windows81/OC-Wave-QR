package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Timer f31056A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CpuGaugeCollector f31057z;

    public /* synthetic */ a(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        this.f31057z = cpuGaugeCollector;
        this.f31056A = timer;
    }

    public final void run() {
        this.f31057z.h(this.f31056A);
    }
}
