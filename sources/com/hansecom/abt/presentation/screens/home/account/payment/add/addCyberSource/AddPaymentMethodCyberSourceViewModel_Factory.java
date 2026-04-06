package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddPaymentMethodCyberSourceViewModel_Factory implements Factory<AddPaymentMethodCyberSourceViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35565a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35566b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35567c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35568d;

    public static AddPaymentMethodCyberSourceViewModel b(SavedStateHandle savedStateHandle, FetchPaymentMethodsUntilNewOneAppearsUseCase fetchPaymentMethodsUntilNewOneAppearsUseCase, GetAddPaymentMethodPageCyberSourceUseCase getAddPaymentMethodPageCyberSourceUseCase, AppFeatures appFeatures) {
        return new AddPaymentMethodCyberSourceViewModel(savedStateHandle, fetchPaymentMethodsUntilNewOneAppearsUseCase, getAddPaymentMethodPageCyberSourceUseCase, appFeatures);
    }

    /* renamed from: a */
    public AddPaymentMethodCyberSourceViewModel get() {
        return b((SavedStateHandle) this.f35565a.get(), (FetchPaymentMethodsUntilNewOneAppearsUseCase) this.f35566b.get(), (GetAddPaymentMethodPageCyberSourceUseCase) this.f35567c.get(), (AppFeatures) this.f35568d.get());
    }
}
