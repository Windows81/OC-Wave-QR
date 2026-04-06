package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Timer f31068A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MemoryGaugeCollector f31069z;

    public /* synthetic */ i(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        this.f31069z = memoryGaugeCollector;
        this.f31068A = timer;
    }

    public final void run() {
        this.f31069z.f(this.f31068A);
    }
}
