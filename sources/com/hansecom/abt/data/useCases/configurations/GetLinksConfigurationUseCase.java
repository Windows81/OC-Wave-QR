package com.hansecom.abt.data.useCases.configurations;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.links.LinksConfigItem;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import timber.log.Timber;
import u.c;

@Singleton
@Metadata
public final class GetLinksConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final Json f33874a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33875b = LazyKt.b(new c(this));

    public GetLinksConfigurationUseCase(Json json) {
        Intrinsics.i(json, "json");
        this.f33874a = json;
    }

    public static final Map b(GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
        try {
            FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.LINKS.j());
            Intrinsics.h(r2, "getValue(...)");
            Json json = getLinksConfigurationUseCase.f33874a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            Iterable iterable = (Iterable) json.b(new ArrayListSerializer(LinksConfigItem.Companion.serializer()), d2);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(((LinksConfigItem) next).b(), next);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            return MapsKt.h();
        }
    }

    public final Map c() {
        return (Map) this.f33875b.getValue();
    }

    public final LinksConfigItem d(String str) {
        Intrinsics.i(str, "name");
        return (LinksConfigItem) c().get(str);
    }
}
