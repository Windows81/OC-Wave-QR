package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaCreateCardScreenKt$FareMediaCreateCardScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMediaCreateCard.Action, Unit> {
    public FareMediaCreateCardScreenKt$FareMediaCreateCardScreen$1$1(Object obj) {
        super(1, obj, FareMediaCreateCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaCreateCard.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaCreateCard.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaCreateCardViewModel) this.f40885A).k(action);
    }
}
