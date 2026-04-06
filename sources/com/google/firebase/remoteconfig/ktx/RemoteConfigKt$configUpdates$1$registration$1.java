package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f31424a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f31425b;

    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, ProducerScope producerScope) {
        this.f31424a = firebaseRemoteConfig;
        this.f31425b = producerScope;
    }

    /* access modifiers changed from: private */
    public static final void d(ProducerScope producerScope, ConfigUpdate configUpdate) {
        Intrinsics.i(producerScope, "$$this$callbackFlow");
        Intrinsics.i(configUpdate, "$configUpdate");
        ChannelsKt.w(producerScope, configUpdate);
    }

    public void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Intrinsics.i(firebaseRemoteConfigException, "error");
        CoroutineScopeKt.c(this.f31425b, "Error listening for config updates.", firebaseRemoteConfigException);
    }

    public void b(ConfigUpdate configUpdate) {
        Intrinsics.i(configUpdate, "configUpdate");
        this.f31424a.A(new a(this.f31425b, configUpdate));
    }
}
