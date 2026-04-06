package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TraceMetric f31101A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f31102B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransportManager f31103z;

    public /* synthetic */ d(TransportManager transportManager, TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.f31103z = transportManager;
        this.f31101A = traceMetric;
        this.f31102B = applicationProcessState;
    }

    public final void run() {
        this.f31103z.w(this.f31101A, this.f31102B);
    }
}
