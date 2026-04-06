package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.ApplicationProcessState;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f31063A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f31064B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f31065z;

    public /* synthetic */ d(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.f31065z = gaugeManager;
        this.f31063A = str;
        this.f31064B = applicationProcessState;
    }

    public final void run() {
        this.f31065z.lambda$startCollectingGauges$2(this.f31063A, this.f31064B);
    }
}
