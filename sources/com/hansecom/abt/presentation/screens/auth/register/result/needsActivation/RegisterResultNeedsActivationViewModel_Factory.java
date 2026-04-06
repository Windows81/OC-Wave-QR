package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RegisterResultNeedsActivationViewModel_Factory implements Factory<RegisterResultNeedsActivationViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34559a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34560b;

    public static RegisterResultNeedsActivationViewModel b(SavedStateHandle savedStateHandle, ResendActivationEmailUseCase resendActivationEmailUseCase) {
        return new RegisterResultNeedsActivationViewModel(savedStateHandle, resendActivationEmailUseCase);
    }

    /* renamed from: a */
    public RegisterResultNeedsActivationViewModel get() {
        return b((SavedStateHandle) this.f34559a.get(), (ResendActivationEmailUseCase) this.f34560b.get());
    }
}
