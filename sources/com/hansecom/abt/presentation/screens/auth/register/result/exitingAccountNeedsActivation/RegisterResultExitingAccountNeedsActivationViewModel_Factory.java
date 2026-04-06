package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RegisterResultExitingAccountNeedsActivationViewModel_Factory implements Factory<RegisterResultExitingAccountNeedsActivationViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34532a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34533b;

    public static RegisterResultExitingAccountNeedsActivationViewModel b(SavedStateHandle savedStateHandle, ResendActivationEmailUseCase resendActivationEmailUseCase) {
        return new RegisterResultExitingAccountNeedsActivationViewModel(savedStateHandle, resendActivationEmailUseCase);
    }

    /* renamed from: a */
    public RegisterResultExitingAccountNeedsActivationViewModel get() {
        return b((SavedStateHandle) this.f34532a.get(), (ResendActivationEmailUseCase) this.f34533b.get());
    }
}
