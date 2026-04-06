package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.util.GooglePayClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetDefaultPaymentMethodUseCase_Factory implements Factory<GetDefaultPaymentMethodUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34049a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34050b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34051c;

    public static GetDefaultPaymentMethodUseCase b(AppPreferences appPreferences, PaymentMethodsRepository paymentMethodsRepository, GooglePayClient googlePayClient) {
        return new GetDefaultPaymentMethodUseCase(appPreferences, paymentMethodsRepository, googlePayClient);
    }

    /* renamed from: a */
    public GetDefaultPaymentMethodUseCase get() {
        return b((AppPreferences) this.f34049a.get(), (PaymentMethodsRepository) this.f34050b.get(), (GooglePayClient) this.f34051c.get());
    }
}
