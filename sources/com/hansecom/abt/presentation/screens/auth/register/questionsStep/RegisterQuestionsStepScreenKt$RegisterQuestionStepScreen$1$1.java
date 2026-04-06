package com.hansecom.abt.presentation.screens.auth.register.questionsStep;

import com.hansecom.abt.presentation.screens.auth.register.Register;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class RegisterQuestionsStepScreenKt$RegisterQuestionStepScreen$1$1 extends FunctionReferenceImpl implements Function1<Register.Action, Unit> {
    public RegisterQuestionsStepScreenKt$RegisterQuestionStepScreen$1$1(Object obj) {
        super(1, obj, RegisterViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Register.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Register.Action action) {
        Intrinsics.i(action, "p0");
        ((RegisterViewModel) this.f40885A).k(action);
    }
}
