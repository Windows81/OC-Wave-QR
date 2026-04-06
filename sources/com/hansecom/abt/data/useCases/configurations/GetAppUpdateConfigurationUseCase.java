package com.hansecom.abt.data.useCases.configurations;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.appUpdate.AppUpdateConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import timber.log.Timber;
import u.a;

@Metadata
public final class GetAppUpdateConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final Json f33854a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33855b = LazyKt.b(new a(this));

    public GetAppUpdateConfigurationUseCase(Json json) {
        Intrinsics.i(json, "json");
        this.f33854a = json;
    }

    public static final AppUpdateConfiguration b(GetAppUpdateConfigurationUseCase getAppUpdateConfigurationUseCase) {
        try {
            FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.APP_UPDATE.j());
            Intrinsics.h(r2, "getValue(...)");
            Json json = getAppUpdateConfigurationUseCase.f33854a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            return (AppUpdateConfiguration) json.b(AppUpdateConfiguration.Companion.serializer(), d2);
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            return new AppUpdateConfiguration((String) null, (String) null);
        }
    }

    public final AppUpdateConfiguration c() {
        return (AppUpdateConfiguration) this.f33855b.getValue();
    }

    public final AppUpdateConfiguration d() {
        return c();
    }
}
