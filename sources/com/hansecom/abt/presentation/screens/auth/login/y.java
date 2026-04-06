package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class y implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FieldErrorsException f34338z;

    public /* synthetic */ y(FieldErrorsException fieldErrorsException) {
        this.f34338z = fieldErrorsException;
    }

    public final Object invoke(Object obj) {
        return LoginViewModel.K(this.f34338z, (Login.State) obj);
    }
}
