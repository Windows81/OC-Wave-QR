package com.hansecom.abt.presentation.screens.home;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase;
import com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase;
import com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class HomeViewModel_Factory implements Factory<HomeViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34999a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35000b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35001c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35002d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f35003e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f35004f;

    public static HomeViewModel b(SavedStateHandle savedStateHandle, GetVirtualCardFlowUseCase getVirtualCardFlowUseCase, AppFeatures appFeatures, GetShowUserBiometricDialogUseCase getShowUserBiometricDialogUseCase, SetShownUserBiometricDialogUseCase setShownUserBiometricDialogUseCase, SetIsBiometricLockedUseCase setIsBiometricLockedUseCase) {
        return new HomeViewModel(savedStateHandle, getVirtualCardFlowUseCase, appFeatures, getShowUserBiometricDialogUseCase, setShownUserBiometricDialogUseCase, setIsBiometricLockedUseCase);
    }

    /* renamed from: a */
    public HomeViewModel get() {
        return b((SavedStateHandle) this.f34999a.get(), (GetVirtualCardFlowUseCase) this.f35000b.get(), (AppFeatures) this.f35001c.get(), (GetShowUserBiometricDialogUseCase) this.f35002d.get(), (SetShownUserBiometricDialogUseCase) this.f35003e.get(), (SetIsBiometricLockedUseCase) this.f35004f.get());
    }
}
