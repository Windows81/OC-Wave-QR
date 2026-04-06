package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaPurchaseCardScreenKt$FareMediaPurchaseCardScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMediaPurchaseCard.Action, Unit> {
    public FareMediaPurchaseCardScreenKt$FareMediaPurchaseCardScreen$1$1(Object obj) {
        super(1, obj, FareMediaPurchaseCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaPurchaseCard.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaPurchaseCard.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaPurchaseCardViewModel) this.f40885A).k(action);
    }
}
