package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.managers.PaymentMethodsManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetAddPaymentMethodPageCyberSourceUseCase_Factory implements Factory<GetAddPaymentMethodPageCyberSourceUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34039a;

    public static GetAddPaymentMethodPageCyberSourceUseCase b(PaymentMethodsManager paymentMethodsManager) {
        return new GetAddPaymentMethodPageCyberSourceUseCase(paymentMethodsManager);
    }

    /* renamed from: a */
    public GetAddPaymentMethodPageCyberSourceUseCase get() {
        return b((PaymentMethodsManager) this.f34039a.get());
    }
}
