package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class C implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35106z;

    public /* synthetic */ C(ChangeAddress.Action action) {
        this.f35106z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.T(this.f35106z, (ChangeAddress.State) obj);
    }
}
