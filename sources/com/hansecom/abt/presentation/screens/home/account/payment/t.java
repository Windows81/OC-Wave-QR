package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel;
import com.hansecom.mapi.models.EnvironmentConfiguration;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class t implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnvironmentConfiguration f35827z;

    public /* synthetic */ t(EnvironmentConfiguration environmentConfiguration) {
        this.f35827z = environmentConfiguration;
    }

    public final Object invoke(Object obj) {
        return PaymentMethodsViewModel.AnonymousClass1.AnonymousClass3.C(this.f35827z, (PaymentMethods.State) obj);
    }
}
