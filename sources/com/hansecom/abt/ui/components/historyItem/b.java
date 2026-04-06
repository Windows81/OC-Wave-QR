package com.hansecom.abt.ui.components.historyItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HistorySectionState f38427A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38428B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38429z;

    public /* synthetic */ b(Modifier modifier, HistorySectionState historySectionState, int i2) {
        this.f38429z = modifier;
        this.f38427A = historySectionState;
        this.f38428B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HistorySectionKt.c(this.f38429z, this.f38427A, this.f38428B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
