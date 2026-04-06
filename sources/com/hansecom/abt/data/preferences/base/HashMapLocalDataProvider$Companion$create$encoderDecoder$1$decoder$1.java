package com.hansecom.abt.data.preferences.base;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class HashMapLocalDataProvider$Companion$create$encoderDecoder$1$decoder$1 implements Function1<String, Map<String, ? extends CacheValue<Object>>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KSerializer f33360A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Json f33361z;

    /* renamed from: b */
    public final Map invoke(String str) {
        Intrinsics.i(str, "it");
        return (Map) this.f33361z.b(this.f33360A, str);
    }
}
