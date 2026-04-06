package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.CacheValue;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.Institution;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class FareMediaInstitutionsRepository$special$$inlined$create$1 extends HashMapLocalDataProvider.EncoderDecoder<List<? extends Institution>> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f33453a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f33454b;

    public FareMediaInstitutionsRepository$special$$inlined$create$1(final Json json, final KSerializer kSerializer) {
        this.f33453a = new Function1<String, Map<String, ? extends CacheValue<List<? extends Institution>>>>() {
            /* renamed from: b */
            public final Map invoke(String str) {
                Intrinsics.i(str, "it");
                return (Map) json.b(kSerializer, str);
            }
        };
        this.f33454b = new Function1<Map<String, ? extends CacheValue<List<? extends Institution>>>, String>() {
            /* renamed from: b */
            public final String invoke(Map map) {
                Intrinsics.i(map, "it");
                return json.c(kSerializer, map);
            }
        };
    }

    public Function1 a() {
        return this.f33453a;
    }

    public Function1 b() {
        return this.f33454b;
    }
}
