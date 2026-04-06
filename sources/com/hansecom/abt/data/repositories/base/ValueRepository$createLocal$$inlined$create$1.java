package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.CacheValue;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class ValueRepository$createLocal$$inlined$create$1 extends ValueLocalDataProvider.EncoderDecoder<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f33599a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f33600b;

    @Metadata
    /* renamed from: com.hansecom.abt.data.repositories.base.ValueRepository$createLocal$$inlined$create$1$1  reason: invalid class name */
    public final class AnonymousClass1 implements Function1<String, CacheValue<Object>> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ KSerializer f33601A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Json f33602z;

        /* renamed from: b */
        public final CacheValue invoke(String str) {
            Intrinsics.i(str, "it");
            return (CacheValue) this.f33602z.b(this.f33601A, str);
        }
    }

    @Metadata
    /* renamed from: com.hansecom.abt.data.repositories.base.ValueRepository$createLocal$$inlined$create$1$2  reason: invalid class name */
    public final class AnonymousClass2 implements Function1<CacheValue<Object>, String> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ KSerializer f33603A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Json f33604z;

        /* renamed from: b */
        public final String invoke(CacheValue cacheValue) {
            Intrinsics.i(cacheValue, "it");
            return this.f33604z.c(this.f33603A, cacheValue);
        }
    }

    public Function1 a() {
        return this.f33599a;
    }

    public Function1 b() {
        return this.f33600b;
    }
}
