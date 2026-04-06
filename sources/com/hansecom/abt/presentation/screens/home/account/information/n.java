package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class n implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AccountInformation.Action f35476z;

    public /* synthetic */ n(AccountInformation.Action action) {
        this.f35476z = action;
    }

    public final Object invoke(Object obj) {
        return AccountInformationViewModel.P(this.f35476z, (AccountInformation.State) obj);
    }
}
