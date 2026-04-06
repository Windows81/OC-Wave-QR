package com.hansecom.abt.presentation.screens.home.faremedia.lockCard;

import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaLockCardDialogKt$FareMediaLockCardDialog$1$1 extends FunctionReferenceImpl implements Function1<FareMediaLockCard.Action, Unit> {
    public FareMediaLockCardDialogKt$FareMediaLockCardDialog$1$1(Object obj) {
        super(1, obj, FareMediaLockCardViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaLockCard.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaLockCard.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaLockCardViewModel) this.f40885A).k(action);
    }
}
