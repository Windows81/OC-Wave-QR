package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import com.hansecom.abt.data.config.signUp.SignUpConfiguration;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SignUpConfiguration f35424A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestionViewModel f35425z;

    public /* synthetic */ s(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, SignUpConfiguration signUpConfiguration) {
        this.f35425z = changeSecurityQuestionViewModel;
        this.f35424A = signUpConfiguration;
    }

    public final Object invoke(Object obj) {
        return ChangeSecurityQuestionViewModel.AnonymousClass1.C(this.f35425z, this.f35424A, (ChangeSecurityQuestions.State) obj);
    }
}
