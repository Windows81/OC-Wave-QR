package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import com.hansecom.mapi.models.User;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ User f35477z;

    public /* synthetic */ s(User user) {
        this.f35477z = user;
    }

    public final Object invoke(Object obj) {
        return AccountInformationViewModel.S(this.f35477z, (AccountInformation.State) obj);
    }
}
