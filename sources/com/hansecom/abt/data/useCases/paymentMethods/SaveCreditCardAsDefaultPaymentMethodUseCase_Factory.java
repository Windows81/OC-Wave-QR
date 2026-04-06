package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class SaveCreditCardAsDefaultPaymentMethodUseCase_Factory implements Factory<SaveCreditCardAsDefaultPaymentMethodUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34056a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34057b;

    public static SaveCreditCardAsDefaultPaymentMethodUseCase b(PaymentMethodsRepository paymentMethodsRepository, AppPreferences appPreferences) {
        return new SaveCreditCardAsDefaultPaymentMethodUseCase(paymentMethodsRepository, appPreferences);
    }

    /* renamed from: a */
    public SaveCreditCardAsDefaultPaymentMethodUseCase get() {
        return b((PaymentMethodsRepository) this.f34056a.get(), (AppPreferences) this.f34057b.get());
    }
}
