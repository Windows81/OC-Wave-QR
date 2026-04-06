package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class x implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.Action f35225z;

    public /* synthetic */ x(ChangeAddress.Action action) {
        this.f35225z = action;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.O(this.f35225z, (ChangeAddress.State) obj);
    }
}
