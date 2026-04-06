package com.hansecom.abt.data.preferences.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

@Metadata
public final class ValueLocalDataProvider$Companion$create$encoderDecoder$1$decoder$1 implements Function1<String, CacheValue<Object>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ KSerializer f33376A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Json f33377z;

    /* renamed from: b */
    public final CacheValue invoke(String str) {
        Intrinsics.i(str, "it");
        return (CacheValue) this.f33377z.b(this.f33376A, str);
    }
}
