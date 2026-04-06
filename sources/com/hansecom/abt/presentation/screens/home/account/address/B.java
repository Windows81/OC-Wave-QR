package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class B implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35105z;

    public /* synthetic */ B(ChangeAddress.Action action) {
        this.f35105z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.S(this.f35105z, (ChangeAddress.State) obj);
    }
}
