package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase;
import com.hansecom.abt.data.useCases.configurations.GetLinksConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaAddValueCashPaymentBarcodeViewModel_Factory implements Factory<FareMediaAddValueCashPaymentBarcodeViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36139a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36140b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36141c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f36142d;

    public static FareMediaAddValueCashPaymentBarcodeViewModel b(SavedStateHandle savedStateHandle, GetCashPaymentBarcodeUseCase getCashPaymentBarcodeUseCase, EnvironmentConfigurationRepository environmentConfigurationRepository, GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
        return new FareMediaAddValueCashPaymentBarcodeViewModel(savedStateHandle, getCashPaymentBarcodeUseCase, environmentConfigurationRepository, getLinksConfigurationUseCase);
    }

    /* renamed from: a */
    public FareMediaAddValueCashPaymentBarcodeViewModel get() {
        return b((SavedStateHandle) this.f36139a.get(), (GetCashPaymentBarcodeUseCase) this.f36140b.get(), (EnvironmentConfigurationRepository) this.f36141c.get(), (GetLinksConfigurationUseCase) this.f36142d.get());
    }
}
