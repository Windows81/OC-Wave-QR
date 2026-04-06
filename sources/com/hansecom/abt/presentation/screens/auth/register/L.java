package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.data.config.signUp.SignUpConfiguration;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class L implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RegisterViewModel f34353A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SignUpConfiguration f34354z;

    public /* synthetic */ L(SignUpConfiguration signUpConfiguration, RegisterViewModel registerViewModel) {
        this.f34354z = signUpConfiguration;
        this.f34353A = registerViewModel;
    }

    public final Object invoke(Object obj) {
        return RegisterViewModel.AnonymousClass1.C(this.f34354z, this.f34353A, (Register.State) obj);
    }
}
