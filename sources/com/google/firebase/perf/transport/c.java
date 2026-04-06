package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ GaugeMetric f31098A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f31099B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransportManager f31100z;

    public /* synthetic */ c(TransportManager transportManager, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.f31100z = transportManager;
        this.f31098A = gaugeMetric;
        this.f31099B = applicationProcessState;
    }

    public final void run() {
        this.f31100z.y(this.f31098A, this.f31099B);
    }
}
