package com.hansecom.abt.ui.components.historyItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HistoryItemState f38424A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38425B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38426z;

    public /* synthetic */ a(Modifier modifier, HistoryItemState historyItemState, int i2) {
        this.f38426z = modifier;
        this.f38424A = historyItemState;
        this.f38425B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HistoryItemKt.c(this.f38426z, this.f38424A, this.f38425B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
