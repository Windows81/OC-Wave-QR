package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.CacheValue;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.SecurityQuestionAllResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class SecurityQuestionsRepository$special$$inlined$create$1 extends ValueLocalDataProvider.EncoderDecoder<List<? extends SecurityQuestionAllResponse>> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f33651a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f33652b;

    public SecurityQuestionsRepository$special$$inlined$create$1(final Json json, final KSerializer kSerializer) {
        this.f33651a = new Function1<String, CacheValue<List<? extends SecurityQuestionAllResponse>>>() {
            /* renamed from: b */
            public final CacheValue invoke(String str) {
                Intrinsics.i(str, "it");
                return (CacheValue) json.b(kSerializer, str);
            }
        };
        this.f33652b = new Function1<CacheValue<List<? extends SecurityQuestionAllResponse>>, String>() {
            /* renamed from: b */
            public final String invoke(CacheValue cacheValue) {
                Intrinsics.i(cacheValue, "it");
                return json.c(kSerializer, cacheValue);
            }
        };
    }

    public Function1 a() {
        return this.f33651a;
    }

    public Function1 b() {
        return this.f33652b;
    }
}
