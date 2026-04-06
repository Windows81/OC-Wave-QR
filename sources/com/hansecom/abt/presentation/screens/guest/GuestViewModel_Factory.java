package com.hansecom.abt.presentation.screens.guest;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.data.useCases.configurations.GetGuestMenuConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GuestViewModel_Factory implements Factory<GuestViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34704a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34705b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34706c;

    public static GuestViewModel b(SavedStateHandle savedStateHandle, GetGuestMenuConfigurationUseCase getGuestMenuConfigurationUseCase, AppInfo appInfo) {
        return new GuestViewModel(savedStateHandle, getGuestMenuConfigurationUseCase, appInfo);
    }

    /* renamed from: a */
    public GuestViewModel get() {
        return b((SavedStateHandle) this.f34704a.get(), (GetGuestMenuConfigurationUseCase) this.f34705b.get(), (AppInfo) this.f34706c.get());
    }
}
