package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.data.config.signUp.SignUpConfiguration;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class v implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AccountInformationViewModel f35479A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SignUpConfiguration f35480z;

    public /* synthetic */ v(SignUpConfiguration signUpConfiguration, AccountInformationViewModel accountInformationViewModel) {
        this.f35480z = signUpConfiguration;
        this.f35479A = accountInformationViewModel;
    }

    public final Object invoke(Object obj) {
        return AccountInformationViewModel.AnonymousClass1.C(this.f35480z, this.f35479A, (AccountInformation.State) obj);
    }
}
