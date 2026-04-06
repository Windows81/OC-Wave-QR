package com.hansecom.abt.presentation.screens.auth.reset;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ResetPasswordViewModel_Factory implements Factory<ResetPasswordViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34612a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34613b;

    public static ResetPasswordViewModel b(SavedStateHandle savedStateHandle, UserRepository userRepository) {
        return new ResetPasswordViewModel(savedStateHandle, userRepository);
    }

    /* renamed from: a */
    public ResetPasswordViewModel get() {
        return b((SavedStateHandle) this.f34612a.get(), (UserRepository) this.f34613b.get());
    }
}
