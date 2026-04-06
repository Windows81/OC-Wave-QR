package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class CardInformationScreenKt$CardInformationScreen$1$1 extends FunctionReferenceImpl implements Function1<CardInformation.Action, Unit> {
    public CardInformationScreenKt$CardInformationScreen$1$1(Object obj) {
        super(1, obj, CardInformationViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((CardInformation.Action) obj);
        return Unit.f40552a;
    }

    public final void v(CardInformation.Action action) {
        Intrinsics.i(action, "p0");
        ((CardInformationViewModel) this.f40885A).k(action);
    }
}
