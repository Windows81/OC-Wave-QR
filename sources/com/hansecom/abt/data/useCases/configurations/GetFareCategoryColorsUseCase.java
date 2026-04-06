package com.hansecom.abt.data.useCases.configurations;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.featureConfig.FareCategoryColorConfig;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import timber.log.Timber;
import u.b;

@Singleton
@Metadata
public final class GetFareCategoryColorsUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final Json f33869a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33870b = LazyKt.b(new b(this));

    public GetFareCategoryColorsUseCase(Json json) {
        Intrinsics.i(json, "json");
        this.f33869a = json;
    }

    public static final List b(GetFareCategoryColorsUseCase getFareCategoryColorsUseCase) {
        FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.FARE_CATEGORY_COLORS.j());
        Intrinsics.h(r2, "getValue(...)");
        try {
            Json json = getFareCategoryColorsUseCase.f33869a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            return (List) json.b(new ArrayListSerializer(FareCategoryColorConfig.Companion.serializer()), d2);
        } catch (SerializationException e2) {
            Timber.f44337a.c(e2);
            return CollectionsKt.m();
        } catch (IllegalArgumentException e3) {
            Timber.f44337a.c(e3);
            return CollectionsKt.m();
        }
    }

    public final List c() {
        return (List) this.f33870b.getValue();
    }

    public final Map d() {
        try {
            return GetFareCategoryColorsUseCaseKt.b(c());
        } catch (Exception e2) {
            Timber.f44337a.c(e2);
            return MapsKt.h();
        }
    }
}
