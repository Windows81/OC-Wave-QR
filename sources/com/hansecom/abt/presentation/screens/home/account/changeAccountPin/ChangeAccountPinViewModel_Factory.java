package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeAccountPinViewModel_Factory implements Factory<ChangeAccountPinViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35250a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35251b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35252c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35253d;

    public static ChangeAccountPinViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, UserRepository userRepository, AppFeatures appFeatures) {
        return new ChangeAccountPinViewModel(savedStateHandle, inputValidators, userRepository, appFeatures);
    }

    /* renamed from: a */
    public ChangeAccountPinViewModel get() {
        return b((SavedStateHandle) this.f35250a.get(), (InputValidators) this.f35251b.get(), (UserRepository) this.f35252c.get(), (AppFeatures) this.f35253d.get());
    }
}
