package com.hansecom.abt.ui.components.quickSelectionButton;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionButtonKt$lambda-1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$1  reason: invalid class name */
public final class ComposableSingletons$QuickSelectionButtonKt$lambda1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$1 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f38737A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f38738z;

    public final Object b(int i2) {
        return this.f38738z.m(Integer.valueOf(i2), this.f38737A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
