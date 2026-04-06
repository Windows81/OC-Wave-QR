package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class I implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FieldErrorsException f34350z;

    public /* synthetic */ I(FieldErrorsException fieldErrorsException) {
        this.f34350z = fieldErrorsException;
    }

    public final Object invoke(Object obj) {
        return RegisterViewModel.s0(this.f34350z, (Register.State) obj);
    }
}
