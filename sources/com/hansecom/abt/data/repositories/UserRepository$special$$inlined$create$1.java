package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.CacheValue;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class UserRepository$special$$inlined$create$1 extends ValueLocalDataProvider.EncoderDecoder<User> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f33539a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f33540b;

    public UserRepository$special$$inlined$create$1(final Json json, final KSerializer kSerializer) {
        this.f33539a = new Function1<String, CacheValue<User>>() {
            /* renamed from: b */
            public final CacheValue invoke(String str) {
                Intrinsics.i(str, "it");
                return (CacheValue) json.b(kSerializer, str);
            }
        };
        this.f33540b = new Function1<CacheValue<User>, String>() {
            /* renamed from: b */
            public final String invoke(CacheValue cacheValue) {
                Intrinsics.i(cacheValue, "it");
                return json.c(kSerializer, cacheValue);
            }
        };
    }

    public Function1 a() {
        return this.f33539a;
    }

    public Function1 b() {
        return this.f33540b;
    }
}
