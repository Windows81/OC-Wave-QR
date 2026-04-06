package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class m implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AccountInformation.Action f35475z;

    public /* synthetic */ m(AccountInformation.Action action) {
        this.f35475z = action;
    }

    public final Object invoke(Object obj) {
        return AccountInformationViewModel.O(this.f35475z, (AccountInformation.State) obj);
    }
}
