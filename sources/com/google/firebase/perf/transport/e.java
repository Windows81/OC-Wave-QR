package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NetworkRequestMetric f31104A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f31105B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransportManager f31106z;

    public /* synthetic */ e(TransportManager transportManager, NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.f31106z = transportManager;
        this.f31104A = networkRequestMetric;
        this.f31105B = applicationProcessState;
    }

    public final void run() {
        this.f31106z.x(this.f31104A, this.f31105B);
    }
}
