package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Timer f31066A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MemoryGaugeCollector f31067z;

    public /* synthetic */ h(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        this.f31067z = memoryGaugeCollector;
        this.f31066A = timer;
    }

    public final void run() {
        this.f31067z.g(this.f31066A);
    }
}
