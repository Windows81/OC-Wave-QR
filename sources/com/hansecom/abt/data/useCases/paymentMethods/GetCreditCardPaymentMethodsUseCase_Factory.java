package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetCreditCardPaymentMethodsUseCase_Factory implements Factory<GetCreditCardPaymentMethodsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34041a;

    public static GetCreditCardPaymentMethodsUseCase b(PaymentMethodsRepository paymentMethodsRepository) {
        return new GetCreditCardPaymentMethodsUseCase(paymentMethodsRepository);
    }

    /* renamed from: a */
    public GetCreditCardPaymentMethodsUseCase get() {
        return b((PaymentMethodsRepository) this.f34041a.get());
    }
}
