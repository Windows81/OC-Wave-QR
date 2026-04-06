package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36417A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36418B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardHistory.State f36419z;

    public /* synthetic */ d(CardHistory.State state, Function1 function1, Flow flow, int i2, int i3) {
        this.f36419z = state;
        this.f36417A = function1;
        this.f36418B = flow;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CardHistoryScreenKt.l(this.f36419z, this.f36417A, this.f36418B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
