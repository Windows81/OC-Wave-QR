package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class CheckFareMediaBalanceScreenKt$CheckFareMediaBalanceScreen$1$1 extends FunctionReferenceImpl implements Function1<CheckFareMediaBalance.Action, Unit> {
    public CheckFareMediaBalanceScreenKt$CheckFareMediaBalanceScreen$1$1(Object obj) {
        super(1, obj, CheckFareMediaBalanceViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((CheckFareMediaBalance.Action) obj);
        return Unit.f40552a;
    }

    public final void v(CheckFareMediaBalance.Action action) {
        Intrinsics.i(action, "p0");
        ((CheckFareMediaBalanceViewModel) this.f40885A).k(action);
    }
}
