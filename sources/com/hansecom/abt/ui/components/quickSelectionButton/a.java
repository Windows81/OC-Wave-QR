package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f38761A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f38762z;

    public /* synthetic */ a(List list, MutableState mutableState) {
        this.f38762z = list;
        this.f38761A = mutableState;
    }

    public final Object invoke(Object obj) {
        return ComposableSingletons$QuickSelectionButtonKt$lambda1$1.i(this.f38762z, this.f38761A, (LazyGridScope) obj);
    }
}
