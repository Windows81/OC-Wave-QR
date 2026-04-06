package com.hansecom.abt.presentation.screens.auth.register;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.generalData.SecurityQuestionsRepository;
import com.hansecom.abt.data.useCases.auth.LogInUseCase;
import com.hansecom.abt.data.useCases.auth.RegisterUseCase;
import com.hansecom.abt.data.useCases.configurations.GetLinksConfigurationUseCase;
import com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34417a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34418b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34419c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f34420d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f34421e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f34422f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f34423g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f34424h;

    public static RegisterViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, SecurityQuestionsRepository securityQuestionsRepository, GetSignUpConfigurationUseCase getSignUpConfigurationUseCase, GetLinksConfigurationUseCase getLinksConfigurationUseCase, RegisterUseCase registerUseCase, LogInUseCase logInUseCase, AppFeatures appFeatures) {
        return new RegisterViewModel(savedStateHandle, inputValidators, securityQuestionsRepository, getSignUpConfigurationUseCase, getLinksConfigurationUseCase, registerUseCase, logInUseCase, appFeatures);
    }

    /* renamed from: a */
    public RegisterViewModel get() {
        return b((SavedStateHandle) this.f34417a.get(), (InputValidators) this.f34418b.get(), (SecurityQuestionsRepository) this.f34419c.get(), (GetSignUpConfigurationUseCase) this.f34420d.get(), (GetLinksConfigurationUseCase) this.f34421e.get(), (RegisterUseCase) this.f34422f.get(), (LogInUseCase) this.f34423g.get(), (AppFeatures) this.f34424h.get());
    }
}
