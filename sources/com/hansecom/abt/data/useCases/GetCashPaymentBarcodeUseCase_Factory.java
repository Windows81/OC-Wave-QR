package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.FareMediaManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetCashPaymentBarcodeUseCase_Factory implements Factory<GetCashPaymentBarcodeUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33728a;

    public static GetCashPaymentBarcodeUseCase b(FareMediaManager fareMediaManager) {
        return new GetCashPaymentBarcodeUseCase(fareMediaManager);
    }

    /* renamed from: a */
    public GetCashPaymentBarcodeUseCase get() {
        return b((FareMediaManager) this.f33728a.get());
    }
}
