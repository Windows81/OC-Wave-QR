package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PaymentMethodDetailsViewModel_Factory implements Factory<PaymentMethodDetailsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35781a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35782b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35783c;

    public static PaymentMethodDetailsViewModel b(SavedStateHandle savedStateHandle, PaymentMethodsRepository paymentMethodsRepository, AppFeatures appFeatures) {
        return new PaymentMethodDetailsViewModel(savedStateHandle, paymentMethodsRepository, appFeatures);
    }

    /* renamed from: a */
    public PaymentMethodDetailsViewModel get() {
        return b((SavedStateHandle) this.f35781a.get(), (PaymentMethodsRepository) this.f35782b.get(), (AppFeatures) this.f35783c.get());
    }
}
