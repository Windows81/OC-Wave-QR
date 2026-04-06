package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RegisterResultExitingAccountViewModel_Factory implements Factory<RegisterResultExitingAccountViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34507a;

    public static RegisterResultExitingAccountViewModel b(SavedStateHandle savedStateHandle) {
        return new RegisterResultExitingAccountViewModel(savedStateHandle);
    }

    /* renamed from: a */
    public RegisterResultExitingAccountViewModel get() {
        return b((SavedStateHandle) this.f34507a.get());
    }
}
