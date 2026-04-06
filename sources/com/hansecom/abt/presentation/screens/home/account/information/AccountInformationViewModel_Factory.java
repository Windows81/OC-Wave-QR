package com.hansecom.abt.presentation.screens.home.account.information;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase;
import com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AccountInformationViewModel_Factory implements Factory<AccountInformationViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35454a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35455b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35456c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35457d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f35458e;

    public static AccountInformationViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, UserRepository userRepository, ChangeAccountInfoUseCase changeAccountInfoUseCase, GetSignUpConfigurationUseCase getSignUpConfigurationUseCase) {
        return new AccountInformationViewModel(savedStateHandle, inputValidators, userRepository, changeAccountInfoUseCase, getSignUpConfigurationUseCase);
    }

    /* renamed from: a */
    public AccountInformationViewModel get() {
        return b((SavedStateHandle) this.f35454a.get(), (InputValidators) this.f35455b.get(), (UserRepository) this.f35456c.get(), (ChangeAccountInfoUseCase) this.f35457d.get(), (GetSignUpConfigurationUseCase) this.f35458e.get());
    }
}
