package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaUnlockCardDialogKt$FareMediaUnlockCardDialog$1$1 extends FunctionReferenceImpl implements Function1<FareMediaUnlockCard.Action, Unit> {
    public FareMediaUnlockCardDialogKt$FareMediaUnlockCardDialog$1$1(Object obj) {
        super(1, obj, FareMediaUnlockCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaUnlockCard.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaUnlockCard.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaUnlockCardViewModel) this.f40885A).k(action);
    }
}
