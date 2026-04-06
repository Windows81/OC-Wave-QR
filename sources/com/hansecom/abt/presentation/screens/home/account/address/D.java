package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class D implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35156z;

    public /* synthetic */ D(ChangeAddress.Action action) {
        this.f35156z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.U(this.f35156z, (ChangeAddress.State) obj);
    }
}
