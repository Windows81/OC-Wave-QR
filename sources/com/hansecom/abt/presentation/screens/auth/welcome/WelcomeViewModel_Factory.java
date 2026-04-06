package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class WelcomeViewModel_Factory implements Factory<WelcomeViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34668a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34669b;

    public static WelcomeViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures) {
        return new WelcomeViewModel(savedStateHandle, appFeatures);
    }

    /* renamed from: a */
    public WelcomeViewModel get() {
        return b((SavedStateHandle) this.f34668a.get(), (AppFeatures) this.f34669b.get());
    }
}
