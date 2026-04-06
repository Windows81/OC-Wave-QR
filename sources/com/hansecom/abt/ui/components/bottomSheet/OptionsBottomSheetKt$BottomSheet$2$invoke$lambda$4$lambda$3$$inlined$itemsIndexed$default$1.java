package com.hansecom.abt.ui.components.bottomSheet;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$1 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f38035A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f38036z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        super(1);
        this.f38036z = function2;
        this.f38035A = list;
    }

    public final Object b(int i2) {
        return this.f38036z.m(Integer.valueOf(i2), this.f38035A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
