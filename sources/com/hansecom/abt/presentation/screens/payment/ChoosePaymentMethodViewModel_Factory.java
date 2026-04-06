package com.hansecom.abt.presentation.screens.payment;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase;
import com.hansecom.abt.util.GooglePayClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChoosePaymentMethodViewModel_Factory implements Factory<ChoosePaymentMethodViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37773a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37774b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37775c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f37776d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f37777e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f37778f;

    public static ChoosePaymentMethodViewModel b(SavedStateHandle savedStateHandle, GetCreditCardPaymentMethodsUseCase getCreditCardPaymentMethodsUseCase, GetMaxNumberOfCardPaymentMethodsUseCase getMaxNumberOfCardPaymentMethodsUseCase, GetFareMediaUseCase getFareMediaUseCase, UserRepository userRepository, GooglePayClient googlePayClient) {
        return new ChoosePaymentMethodViewModel(savedStateHandle, getCreditCardPaymentMethodsUseCase, getMaxNumberOfCardPaymentMethodsUseCase, getFareMediaUseCase, userRepository, googlePayClient);
    }

    /* renamed from: a */
    public ChoosePaymentMethodViewModel get() {
        return b((SavedStateHandle) this.f37773a.get(), (GetCreditCardPaymentMethodsUseCase) this.f37774b.get(), (GetMaxNumberOfCardPaymentMethodsUseCase) this.f37775c.get(), (GetFareMediaUseCase) this.f37776d.get(), (UserRepository) this.f37777e.get(), (GooglePayClient) this.f37778f.get());
    }
}
