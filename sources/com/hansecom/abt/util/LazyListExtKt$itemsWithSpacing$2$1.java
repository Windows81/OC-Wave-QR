package com.hansecom.abt.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyListExtKt$itemsWithSpacing$2$1 implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f39020A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f39021z;

    public LazyListExtKt$itemsWithSpacing$2$1(Function1 function1, List list) {
        this.f39021z = function1;
        this.f39020A = list;
    }

    public final Object b(int i2) {
        return this.f39021z.invoke(this.f39020A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
