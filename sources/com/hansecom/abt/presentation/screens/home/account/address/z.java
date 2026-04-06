package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class z implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35227z;

    public /* synthetic */ z(ChangeAddress.Action action) {
        this.f35227z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.Q(this.f35227z, (ChangeAddress.State) obj);
    }
}
