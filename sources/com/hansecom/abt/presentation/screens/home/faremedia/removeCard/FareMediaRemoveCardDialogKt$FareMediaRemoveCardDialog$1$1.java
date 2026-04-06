package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaRemoveCardDialogKt$FareMediaRemoveCardDialog$1$1 extends FunctionReferenceImpl implements Function1<FareMediaRemoveCard.Action, Unit> {
    public FareMediaRemoveCardDialogKt$FareMediaRemoveCardDialog$1$1(Object obj) {
        super(1, obj, FareMediaRemoveCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaRemoveCard.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaRemoveCard.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaRemoveCardViewModel) this.f40885A).k(action);
    }
}
