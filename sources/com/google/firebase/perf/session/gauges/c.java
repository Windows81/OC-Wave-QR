package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.ApplicationProcessState;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f31060A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f31061B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f31062z;

    public /* synthetic */ c(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.f31062z = gaugeManager;
        this.f31060A = str;
        this.f31061B = applicationProcessState;
    }

    public final void run() {
        this.f31062z.lambda$stopCollectingGauges$3(this.f31060A, this.f31061B);
    }
}
