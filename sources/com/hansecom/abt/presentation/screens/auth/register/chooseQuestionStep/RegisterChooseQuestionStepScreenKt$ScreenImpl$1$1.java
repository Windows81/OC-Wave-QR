package com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep;

import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1", f = "RegisterChooseQuestionStepScreen.kt", l = {}, m = "invokeSuspend")
public final class RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Function1 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.E = function1;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RegisterChooseQuestionStepScreenKt$ScreenImpl$1$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            this.E.invoke(Register.Action.ChooseQuestionStep.UpdateQuestions.f34358a);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
