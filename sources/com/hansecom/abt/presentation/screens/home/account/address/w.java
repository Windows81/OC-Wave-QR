package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class w implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35224z;

    public /* synthetic */ w(ChangeAddress.Action action) {
        this.f35224z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.N(this.f35224z, (ChangeAddress.State) obj);
    }
}
