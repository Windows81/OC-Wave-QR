package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel", f = "RegisterViewModel.kt", l = {217}, m = "handleQuestionsStep")
public final class RegisterViewModel$handleQuestionsStep$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ RegisterViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterViewModel$handleQuestionsStep$1(RegisterViewModel registerViewModel, Continuation continuation) {
        super(continuation);
        this.E = registerViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.t0((Register.Action.QuestionsStep) null, this);
    }
}
