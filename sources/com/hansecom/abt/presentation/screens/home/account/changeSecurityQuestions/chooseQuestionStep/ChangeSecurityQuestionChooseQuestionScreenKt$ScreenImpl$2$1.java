package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1", f = "ChangeSecurityQuestionChooseQuestionScreen.kt", l = {}, m = "invokeSuspend")
public final class ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<ChangeSecurityQuestions.Effect.Questions, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
    }

    /* renamed from: A */
    public final Object m(ChangeSecurityQuestions.Effect.Questions questions, Continuation continuation) {
        return ((ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1) s(questions, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1 changeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1 = new ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1(this.F, continuation);
        changeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1.E = obj;
        return changeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (Intrinsics.d((ChangeSecurityQuestions.Effect.Questions) this.E, ChangeSecurityQuestions.Effect.Questions.GoBack.f35370a)) {
                this.F.invoke();
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
