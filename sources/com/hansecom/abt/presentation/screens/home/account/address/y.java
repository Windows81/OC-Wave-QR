package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class y implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35226z;

    public /* synthetic */ y(ChangeAddress.Action action) {
        this.f35226z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.P(this.f35226z, (ChangeAddress.State) obj);
    }
}
