package com.hansecom.abt.presentation.screens.auth.reset.success;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ResetPasswordSuccessViewModel_Factory implements Factory<ResetPasswordSuccessViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34642a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34643b;

    public static ResetPasswordSuccessViewModel b(SavedStateHandle savedStateHandle, UserRepository userRepository) {
        return new ResetPasswordSuccessViewModel(savedStateHandle, userRepository);
    }

    /* renamed from: a */
    public ResetPasswordSuccessViewModel get() {
        return b((SavedStateHandle) this.f34642a.get(), (UserRepository) this.f34643b.get());
    }
}
