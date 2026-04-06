package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FetchPaymentMethodsUntilNewOneAppearsUseCase_Factory implements Factory<FetchPaymentMethodsUntilNewOneAppearsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34037a;

    public static FetchPaymentMethodsUntilNewOneAppearsUseCase b(PaymentMethodsRepository paymentMethodsRepository) {
        return new FetchPaymentMethodsUntilNewOneAppearsUseCase(paymentMethodsRepository);
    }

    /* renamed from: a */
    public FetchPaymentMethodsUntilNewOneAppearsUseCase get() {
        return b((PaymentMethodsRepository) this.f34037a.get());
    }
}
