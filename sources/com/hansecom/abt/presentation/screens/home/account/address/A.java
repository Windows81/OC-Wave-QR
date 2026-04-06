package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.mapi.models.Country;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class A implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Country f35104z;

    public /* synthetic */ A(Country country) {
        this.f35104z = country;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.R(this.f35104z, (ChangeAddress.State) obj);
    }
}
