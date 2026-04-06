package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ChangeAccountPinScreenKt$ChangeAccountPinScreen$1$1 extends FunctionReferenceImpl implements Function1<ChangeAccountPin.Action, Unit> {
    public ChangeAccountPinScreenKt$ChangeAccountPinScreen$1$1(Object obj) {
        super(1, obj, ChangeAccountPinViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ChangeAccountPin.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ChangeAccountPin.Action action) {
        Intrinsics.i(action, "p0");
        ((ChangeAccountPinViewModel) this.f40885A).k(action);
    }
}
