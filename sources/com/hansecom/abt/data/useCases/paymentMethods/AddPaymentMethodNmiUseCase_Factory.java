package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.managers.PaymentMethodsManager;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddPaymentMethodNmiUseCase_Factory implements Factory<AddPaymentMethodNmiUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34031a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34032b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34033c;

    public static AddPaymentMethodNmiUseCase b(PaymentMethodsRepository paymentMethodsRepository, UserRepository userRepository, PaymentMethodsManager paymentMethodsManager) {
        return new AddPaymentMethodNmiUseCase(paymentMethodsRepository, userRepository, paymentMethodsManager);
    }

    /* renamed from: a */
    public AddPaymentMethodNmiUseCase get() {
        return b((PaymentMethodsRepository) this.f34031a.get(), (UserRepository) this.f34032b.get(), (PaymentMethodsManager) this.f34033c.get());
    }
}
