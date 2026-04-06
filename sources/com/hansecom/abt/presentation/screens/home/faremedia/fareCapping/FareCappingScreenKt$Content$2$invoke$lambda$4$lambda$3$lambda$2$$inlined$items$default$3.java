package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$3 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36720A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f36721z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$3(Function1 function1, List list) {
        super(1);
        this.f36721z = function1;
        this.f36720A = list;
    }

    public final Object b(int i2) {
        return this.f36721z.invoke(this.f36720A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
