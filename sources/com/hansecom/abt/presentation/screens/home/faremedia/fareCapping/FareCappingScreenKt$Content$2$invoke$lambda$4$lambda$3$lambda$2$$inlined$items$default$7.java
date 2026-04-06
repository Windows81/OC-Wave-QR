package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$7 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36726A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f36727z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingScreenKt$Content$2$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$7(Function1 function1, List list) {
        super(1);
        this.f36727z = function1;
        this.f36726A = list;
    }

    public final Object b(int i2) {
        return this.f36727z.invoke(this.f36726A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
