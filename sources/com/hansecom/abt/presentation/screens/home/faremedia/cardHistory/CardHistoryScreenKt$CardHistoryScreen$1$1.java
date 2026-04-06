package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class CardHistoryScreenKt$CardHistoryScreen$1$1 extends FunctionReferenceImpl implements Function1<CardHistory.Action, Unit> {
    public CardHistoryScreenKt$CardHistoryScreen$1$1(Object obj) {
        super(1, obj, CardHistoryViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((CardHistory.Action) obj);
        return Unit.f40552a;
    }

    public final void v(CardHistory.Action action) {
        Intrinsics.i(action, "p0");
        ((CardHistoryViewModel) this.f40885A).k(action);
    }
}
