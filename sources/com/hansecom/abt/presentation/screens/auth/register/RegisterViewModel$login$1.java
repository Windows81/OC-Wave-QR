package com.hansecom.abt.presentation.screens.auth.register;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel", f = "RegisterViewModel.kt", l = {489}, m = "login")
public final class RegisterViewModel$login$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ RegisterViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterViewModel$login$1(RegisterViewModel registerViewModel, Continuation continuation) {
        super(continuation);
        this.E = registerViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.K0((String) null, (String) null, this);
    }
}
