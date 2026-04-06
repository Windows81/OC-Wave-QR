package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import com.hansecom.mapi.models.Country;
import com.hansecom.mapi.models.User;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class E implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Country f35659A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ User f35660z;

    public /* synthetic */ E(User user, Country country) {
        this.f35660z = user;
        this.f35659A = country;
    }

    public final Object invoke(Object obj) {
        return AddPaymentMethodNmiViewModel.j0(this.f35660z, this.f35659A, (AddPaymentMethodNmi.State) obj);
    }
}
