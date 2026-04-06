package com.google.firebase.remoteconfig;

import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f31428A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f31429z;

    public /* synthetic */ l(ProducerScope producerScope, ConfigUpdate configUpdate) {
        this.f31429z = producerScope;
        this.f31428A = configUpdate;
    }

    public final void run() {
        RemoteConfigKt$configUpdates$1$registration$1.d(this.f31429z, this.f31428A);
    }
}
