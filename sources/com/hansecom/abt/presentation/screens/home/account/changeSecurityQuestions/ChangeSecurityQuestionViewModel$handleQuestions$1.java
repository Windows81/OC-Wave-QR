package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import com.hansecom.mapi.models.SecurityQuestionAllResponse;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$handleQuestions$1", f = "ChangeSecurityQuestionViewModel.kt", l = {173}, m = "invokeSuspend")
public final class ChangeSecurityQuestionViewModel$handleQuestions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ ChangeSecurityQuestionViewModel E;
    public final /* synthetic */ ChangeSecurityQuestions.Action.Questions F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionViewModel$handleQuestions$1(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, ChangeSecurityQuestions.Action.Questions questions, Continuation continuation) {
        super(2, continuation);
        this.E = changeSecurityQuestionViewModel;
        this.F = questions;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ChangeSecurityQuestionViewModel$handleQuestions$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ChangeSecurityQuestionViewModel$handleQuestions$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.D = 1;
            if (DelayKt.b(300, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChangeSecurityQuestions.Action.Questions questions = this.F;
        for (SecurityQuestionAllResponse securityQuestionAllResponse : this.E.f35350l) {
            if (Intrinsics.d(securityQuestionAllResponse.b(), ((ChangeSecurityQuestions.Action.Questions.ChooseSecurityQuestion) questions).a())) {
                Integer a2 = securityQuestionAllResponse.a();
                if (a2 != null) {
                    this.E.b0(a2.intValue());
                }
                return Unit.f40552a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
