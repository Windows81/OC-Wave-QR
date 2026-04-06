package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class r implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35221z;

    public /* synthetic */ r(ChangeAddress.Action action) {
        this.f35221z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.M(this.f35221z, (ChangeAddress.State) obj);
    }
}
