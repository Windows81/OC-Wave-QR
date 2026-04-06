package com.hansecom.abt.presentation.screens.home.more;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.data.useCases.configurations.GetMoreMenuConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class MoreViewModel_Factory implements Factory<MoreViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37436a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37437b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37438c;

    public static MoreViewModel b(SavedStateHandle savedStateHandle, GetMoreMenuConfigurationUseCase getMoreMenuConfigurationUseCase, AppInfo appInfo) {
        return new MoreViewModel(savedStateHandle, getMoreMenuConfigurationUseCase, appInfo);
    }

    /* renamed from: a */
    public MoreViewModel get() {
        return b((SavedStateHandle) this.f37436a.get(), (GetMoreMenuConfigurationUseCase) this.f37437b.get(), (AppInfo) this.f37438c.get());
    }
}
