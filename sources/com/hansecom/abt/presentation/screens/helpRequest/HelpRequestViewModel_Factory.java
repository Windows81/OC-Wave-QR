package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.SendHelpRequestUseCase;
import com.hansecom.abt.data.useCases.account.GetUserUseCase;
import com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class HelpRequestViewModel_Factory implements Factory<HelpRequestViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34874a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34875b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34876c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f34877d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f34878e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f34879f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f34880g;

    public static HelpRequestViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures, InputValidators inputValidators, SendHelpRequestUseCase sendHelpRequestUseCase, IsAccountLoggedInUseCase isAccountLoggedInUseCase, GetUserUseCase getUserUseCase, FareMediaRepository fareMediaRepository) {
        return new HelpRequestViewModel(savedStateHandle, appFeatures, inputValidators, sendHelpRequestUseCase, isAccountLoggedInUseCase, getUserUseCase, fareMediaRepository);
    }

    /* renamed from: a */
    public HelpRequestViewModel get() {
        return b((SavedStateHandle) this.f34874a.get(), (AppFeatures) this.f34875b.get(), (InputValidators) this.f34876c.get(), (SendHelpRequestUseCase) this.f34877d.get(), (IsAccountLoggedInUseCase) this.f34878e.get(), (GetUserUseCase) this.f34879f.get(), (FareMediaRepository) this.f34880g.get());
    }
}
