package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionButtonKt$lambda-1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$2  reason: invalid class name */
public final class ComposableSingletons$QuickSelectionButtonKt$lambda1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$2 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f38739A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f38740z;

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return ((GridItemSpan) this.f38740z.d(lazyGridItemSpanScope, Integer.valueOf(i2), this.f38739A.get(i2))).g();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }
}
