package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository;
import com.hansecom.abt.data.repositories.generalData.SecurityQuestionsRepository;
import com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase;
import com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeSecurityQuestionViewModel_Factory implements Factory<ChangeSecurityQuestionViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35354a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35355b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35356c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35357d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f35358e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f35359f;

    public static ChangeSecurityQuestionViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, SecurityQuestionsRepository securityQuestionsRepository, UserSecurityQuestionsRepository userSecurityQuestionsRepository, ChangeSecurityQuestionsUseCase changeSecurityQuestionsUseCase, GetSignUpConfigurationUseCase getSignUpConfigurationUseCase) {
        return new ChangeSecurityQuestionViewModel(savedStateHandle, inputValidators, securityQuestionsRepository, userSecurityQuestionsRepository, changeSecurityQuestionsUseCase, getSignUpConfigurationUseCase);
    }

    /* renamed from: a */
    public ChangeSecurityQuestionViewModel get() {
        return b((SavedStateHandle) this.f35354a.get(), (InputValidators) this.f35355b.get(), (SecurityQuestionsRepository) this.f35356c.get(), (UserSecurityQuestionsRepository) this.f35357d.get(), (ChangeSecurityQuestionsUseCase) this.f35358e.get(), (GetSignUpConfigurationUseCase) this.f35359f.get());
    }
}
