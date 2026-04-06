package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f31426A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f31427z;

    public /* synthetic */ a(ProducerScope producerScope, ConfigUpdate configUpdate) {
        this.f31427z = producerScope;
        this.f31426A = configUpdate;
    }

    public final void run() {
        RemoteConfigKt$configUpdates$1$registration$1.d(this.f31427z, this.f31426A);
    }
}
