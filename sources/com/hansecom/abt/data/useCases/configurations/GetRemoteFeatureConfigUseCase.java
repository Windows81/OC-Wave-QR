package com.hansecom.abt.data.useCases.configurations;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.featureConfig.RemoteFeatureConfig;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import timber.log.Timber;
import u.e;

@Singleton
@Metadata
public final class GetRemoteFeatureConfigUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final Json f33884a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33885b = LazyKt.b(new e(this));

    public GetRemoteFeatureConfigUseCase(Json json) {
        Intrinsics.i(json, "json");
        this.f33884a = json;
    }

    public static final RemoteFeatureConfig b(GetRemoteFeatureConfigUseCase getRemoteFeatureConfigUseCase) {
        try {
            FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.FEATURE_CONFIG.j());
            Intrinsics.h(r2, "getValue(...)");
            Json json = getRemoteFeatureConfigUseCase.f33884a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            return (RemoteFeatureConfig) json.b(RemoteFeatureConfig.Companion.serializer(), d2);
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            return new RemoteFeatureConfig(2);
        }
    }

    public final RemoteFeatureConfig c() {
        return (RemoteFeatureConfig) this.f33885b.getValue();
    }

    public final RemoteFeatureConfig d() {
        return c();
    }
}
