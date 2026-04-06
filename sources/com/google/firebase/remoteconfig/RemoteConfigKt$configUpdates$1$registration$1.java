package com.google.firebase.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f31234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f31235b;

    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, ProducerScope producerScope) {
        this.f31234a = firebaseRemoteConfig;
        this.f31235b = producerScope;
    }

    public static final void d(ProducerScope producerScope, ConfigUpdate configUpdate) {
        Intrinsics.i(producerScope, "$$this$callbackFlow");
        Intrinsics.i(configUpdate, "$configUpdate");
        ChannelsKt.w(producerScope, configUpdate);
    }

    public void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Intrinsics.i(firebaseRemoteConfigException, "error");
        CoroutineScopeKt.c(this.f31235b, "Error listening for config updates.", firebaseRemoteConfigException);
    }

    public void b(ConfigUpdate configUpdate) {
        Intrinsics.i(configUpdate, "configUpdate");
        this.f31234a.A(new l(this.f31235b, configUpdate));
    }
}
