package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class ValueLocalDataProvider$Companion$create$encoderDecoder$1$encoder$1 implements Function1<CacheValue<Object>, String> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KSerializer f33378A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Json f33379z;

    /* renamed from: b */
    public final String invoke(CacheValue cacheValue) {
        Intrinsics.i(cacheValue, "it");
        return this.f33379z.c(this.f33378A, cacheValue);
    }
}
