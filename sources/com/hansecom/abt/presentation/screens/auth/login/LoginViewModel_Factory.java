package com.hansecom.abt.presentation.screens.auth.login;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.auth.LogInUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LoginViewModel_Factory implements Factory<LoginViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34308a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34309b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34310c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f34311d;

    public static LoginViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, AppFeatures appFeatures, LogInUseCase logInUseCase) {
        return new LoginViewModel(savedStateHandle, inputValidators, appFeatures, logInUseCase);
    }

    /* renamed from: a */
    public LoginViewModel get() {
        return b((SavedStateHandle) this.f34308a.get(), (InputValidators) this.f34309b.get(), (AppFeatures) this.f34310c.get(), (LogInUseCase) this.f34311d.get());
    }
}
