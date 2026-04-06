package com.hansecom.abt.presentation.screens.helpRequest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$3 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f34770A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f34771z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$3(Function1 function1, List list) {
        super(1);
        this.f34771z = function1;
        this.f34770A = list;
    }

    public final Object b(int i2) {
        return this.f34771z.invoke(this.f34770A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
