package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class TransferBalanceScreenKt$TransferBalanceScreen$1$1 extends FunctionReferenceImpl implements Function1<TransferBalance.Action, Unit> {
    public TransferBalanceScreenKt$TransferBalanceScreen$1$1(Object obj) {
        super(1, obj, TransferBalanceViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((TransferBalance.Action) obj);
        return Unit.f40552a;
    }

    public final void v(TransferBalance.Action action) {
        Intrinsics.i(action, "p0");
        ((TransferBalanceViewModel) this.f40885A).k(action);
    }
}
