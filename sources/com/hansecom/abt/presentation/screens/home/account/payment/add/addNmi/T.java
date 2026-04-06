package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;

public final /* synthetic */ class T implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CreditCardInfoNetworkMerchantResponse f35678A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ JsInterface f35679z;

    public /* synthetic */ T(JsInterface jsInterface, CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse) {
        this.f35679z = jsInterface;
        this.f35678A = creditCardInfoNetworkMerchantResponse;
    }

    public final void run() {
        JsInterface.b(this.f35679z, this.f35678A);
    }
}
