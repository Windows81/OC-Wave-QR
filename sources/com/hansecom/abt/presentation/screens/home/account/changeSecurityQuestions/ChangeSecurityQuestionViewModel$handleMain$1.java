package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel", f = "ChangeSecurityQuestionViewModel.kt", l = {146}, m = "handleMain")
public final class ChangeSecurityQuestionViewModel$handleMain$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ChangeSecurityQuestionViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionViewModel$handleMain$1(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, Continuation continuation) {
        super(continuation);
        this.E = changeSecurityQuestionViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.U((ChangeSecurityQuestions.Action.Main) null, this);
    }
}
