package com.hansecom.abt.presentation.screens.auth.reset.success;

import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ResetPasswordSuccessScreenKt$ResetPasswordSuccessScreen$1$1 extends FunctionReferenceImpl implements Function1<ResetPasswordSuccess.Action, Unit> {
    public ResetPasswordSuccessScreenKt$ResetPasswordSuccessScreen$1$1(Object obj) {
        super(1, obj, ResetPasswordSuccessViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ResetPasswordSuccess.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ResetPasswordSuccess.Action action) {
        Intrinsics.i(action, "p0");
        ((ResetPasswordSuccessViewModel) this.f40885A).k(action);
    }
}
