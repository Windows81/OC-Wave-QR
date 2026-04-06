package com.hansecom.abt.ui.components.bottomSheet;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$2 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f38037z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionsBottomSheetKt$BottomSheet$2$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$2(List list) {
        super(1);
        this.f38037z = list;
    }

    public final Object b(int i2) {
        this.f38037z.get(i2);
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
