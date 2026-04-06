package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ChangeSecurityQuestionScreenKt$ChangeSecurityQuestionScreen$1$1 extends FunctionReferenceImpl implements Function1<ChangeSecurityQuestions.Action, Unit> {
    public ChangeSecurityQuestionScreenKt$ChangeSecurityQuestionScreen$1$1(Object obj) {
        super(1, obj, ChangeSecurityQuestionViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ChangeSecurityQuestions.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ChangeSecurityQuestions.Action action) {
        Intrinsics.i(action, "p0");
        ((ChangeSecurityQuestionViewModel) this.f40885A).k(action);
    }
}
