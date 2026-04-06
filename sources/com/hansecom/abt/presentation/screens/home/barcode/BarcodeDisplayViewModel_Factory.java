package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.GetValidAztecCodeFlowUseCase;
import com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class BarcodeDisplayViewModel_Factory implements Factory<BarcodeDisplayViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35849a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35850b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35851c;

    public static BarcodeDisplayViewModel b(SavedStateHandle savedStateHandle, GetVirtualCardFlowUseCase getVirtualCardFlowUseCase, GetValidAztecCodeFlowUseCase getValidAztecCodeFlowUseCase) {
        return new BarcodeDisplayViewModel(savedStateHandle, getVirtualCardFlowUseCase, getValidAztecCodeFlowUseCase);
    }

    /* renamed from: a */
    public BarcodeDisplayViewModel get() {
        return b((SavedStateHandle) this.f35849a.get(), (GetVirtualCardFlowUseCase) this.f35850b.get(), (GetValidAztecCodeFlowUseCase) this.f35851c.get());
    }
}
