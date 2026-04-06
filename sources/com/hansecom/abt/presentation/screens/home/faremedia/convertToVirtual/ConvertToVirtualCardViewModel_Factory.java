package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.fareMedia.ConvertToVirtualUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ConvertToVirtualCardViewModel_Factory implements Factory<ConvertToVirtualCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36659a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36660b;

    public static ConvertToVirtualCardViewModel b(SavedStateHandle savedStateHandle, ConvertToVirtualUseCase convertToVirtualUseCase) {
        return new ConvertToVirtualCardViewModel(savedStateHandle, convertToVirtualUseCase);
    }

    /* renamed from: a */
    public ConvertToVirtualCardViewModel get() {
        return b((SavedStateHandle) this.f36659a.get(), (ConvertToVirtualUseCase) this.f36660b.get());
    }
}
