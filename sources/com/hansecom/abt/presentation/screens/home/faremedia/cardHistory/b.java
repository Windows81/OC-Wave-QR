package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36411A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36412B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardHistory.State f36413z;

    public /* synthetic */ b(CardHistory.State state, Function1 function1, int i2) {
        this.f36413z = state;
        this.f36411A = function1;
        this.f36412B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CardHistoryScreenKt.j(this.f36413z, this.f36411A, this.f36412B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
