package com.hansecom.abt.presentation.screens.home.account.changePassword;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.account.ChangePasswordUseCase;
import com.hansecom.abt.data.useCases.account.GetUserEmailUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangePasswordViewModel_Factory implements Factory<ChangePasswordViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35304a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35305b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35306c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35307d;

    public static ChangePasswordViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, ChangePasswordUseCase changePasswordUseCase, GetUserEmailUseCase getUserEmailUseCase) {
        return new ChangePasswordViewModel(savedStateHandle, inputValidators, changePasswordUseCase, getUserEmailUseCase);
    }

    /* renamed from: a */
    public ChangePasswordViewModel get() {
        return b((SavedStateHandle) this.f35304a.get(), (InputValidators) this.f35305b.get(), (ChangePasswordUseCase) this.f35306c.get(), (GetUserEmailUseCase) this.f35307d.get());
    }
}
