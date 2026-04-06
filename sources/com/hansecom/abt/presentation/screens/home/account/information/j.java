package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class j implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AccountInformation.Action f35473z;

    public /* synthetic */ j(AccountInformation.Action action) {
        this.f35473z = action;
    }

    public final Object invoke(Object obj) {
        return AccountInformationViewModel.N(this.f35473z, (AccountInformation.State) obj);
    }
}
