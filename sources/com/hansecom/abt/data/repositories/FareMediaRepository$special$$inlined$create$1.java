package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.CacheValue;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.FareMedium;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class FareMediaRepository$special$$inlined$create$1 extends ValueLocalDataProvider.EncoderDecoder<List<? extends FareMedium>> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f33492a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f33493b;

    public FareMediaRepository$special$$inlined$create$1(final Json json, final KSerializer kSerializer) {
        this.f33492a = new Function1<String, CacheValue<List<? extends FareMedium>>>() {
            /* renamed from: b */
            public final CacheValue invoke(String str) {
                Intrinsics.i(str, "it");
                return (CacheValue) json.b(kSerializer, str);
            }
        };
        this.f33493b = new Function1<CacheValue<List<? extends FareMedium>>, String>() {
            /* renamed from: b */
            public final String invoke(CacheValue cacheValue) {
                Intrinsics.i(cacheValue, "it");
                return json.c(kSerializer, cacheValue);
            }
        };
    }

    public Function1 a() {
        return this.f33492a;
    }

    public Function1 b() {
        return this.f33493b;
    }
}
