package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.mapi.models.Country;
import com.hansecom.mapi.models.User;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class v implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Country f35222A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ User f35223z;

    public /* synthetic */ v(User user, Country country) {
        this.f35223z = user;
        this.f35222A = country;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressViewModel.X(this.f35223z, this.f35222A, (ChangeAddress.State) obj);
    }
}
