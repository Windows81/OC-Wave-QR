package com.hansecom.abt.api;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

@Metadata
public final class JsonParser {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonParser f33114a = new JsonParser();

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f33115b = LazyKt.b(new b());

    /* renamed from: c  reason: collision with root package name */
    public static final int f33116c = 8;

    public static final Json d() {
        return JsonKt.b((Json) null, new c(), 1, (Object) null);
    }

    public static final Unit e(JsonBuilder jsonBuilder) {
        Intrinsics.i(jsonBuilder, "$this$Json");
        jsonBuilder.c(true);
        jsonBuilder.d(true);
        jsonBuilder.i(true);
        jsonBuilder.f(true);
        jsonBuilder.e(true);
        jsonBuilder.g(false);
        jsonBuilder.h(false);
        return Unit.f40552a;
    }

    public final Json c() {
        return (Json) f33115b.getValue();
    }
}
