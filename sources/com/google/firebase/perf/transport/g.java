package com.google.firebase.perf.transport;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PendingPerfEvent f31108A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransportManager f31109z;

    public /* synthetic */ g(TransportManager transportManager, PendingPerfEvent pendingPerfEvent) {
        this.f31109z = transportManager;
        this.f31108A = pendingPerfEvent;
    }

    public final void run() {
        this.f31109z.v(this.f31108A);
    }
}
