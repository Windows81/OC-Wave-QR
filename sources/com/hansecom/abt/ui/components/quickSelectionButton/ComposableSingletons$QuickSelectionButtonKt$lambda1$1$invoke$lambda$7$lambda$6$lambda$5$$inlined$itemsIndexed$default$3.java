package com.hansecom.abt.ui.components.quickSelectionButton;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionButtonKt$lambda-1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3  reason: invalid class name */
public final class ComposableSingletons$QuickSelectionButtonKt$lambda1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f38741z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$QuickSelectionButtonKt$lambda1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3(List list) {
        super(1);
        this.f38741z = list;
    }

    public final Object b(int i2) {
        this.f38741z.get(i2);
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
