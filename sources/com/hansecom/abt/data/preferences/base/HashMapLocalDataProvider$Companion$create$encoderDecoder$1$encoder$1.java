package com.hansecom.abt.data.preferences.base;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class HashMapLocalDataProvider$Companion$create$encoderDecoder$1$encoder$1 implements Function1<Map<String, ? extends CacheValue<Object>>, String> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KSerializer f33362A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Json f33363z;

    /* renamed from: b */
    public final String invoke(Map map) {
        Intrinsics.i(map, "it");
        return this.f33363z.c(this.f33362A, map);
    }
}
