package com.hansecom.abt.presentation.screens.auth.login;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.login.LoginViewModel", f = "LoginViewModel.kt", l = {96}, m = "signIn")
public final class LoginViewModel$signIn$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ LoginViewModel G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModel$signIn$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(continuation);
        this.G = loginViewModel;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.L((String) null, (String) null, this);
    }
}
