package com.hansecom.abt.presentation.screens.main;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.RemoteConfigSetup;
import com.hansecom.abt.data.useCases.ClearUserCacheUseCase;
import com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase;
import com.hansecom.abt.data.useCases.appUpdate.IgnoreAppUpdateUseCase;
import com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase;
import com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase;
import com.hansecom.abt.data.useCases.lock.IsLockedFlowUseCase;
import com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class MainViewModel_Factory implements Factory<MainViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37581a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37582b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37583c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f37584d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f37585e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f37586f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f37587g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f37588h;

    /* renamed from: i  reason: collision with root package name */
    public final Provider f37589i;

    /* renamed from: j  reason: collision with root package name */
    public final Provider f37590j;

    /* renamed from: k  reason: collision with root package name */
    public final Provider f37591k;

    public static MainViewModel b(SavedStateHandle savedStateHandle, RemoteConfigSetup remoteConfigSetup, IsAccountLoggedInUseCase isAccountLoggedInUseCase, AppFeatures appFeatures, ClearUserCacheUseCase clearUserCacheUseCase, GetAppUpdateUseCase getAppUpdateUseCase, IgnoreAppUpdateUseCase ignoreAppUpdateUseCase, IsLockedFlowUseCase isLockedFlowUseCase, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase, AutoLockAfterInactivityUseCase autoLockAfterInactivityUseCase, SetIsBiometricsAvailableUseCase setIsBiometricsAvailableUseCase) {
        return new MainViewModel(savedStateHandle, remoteConfigSetup, isAccountLoggedInUseCase, appFeatures, clearUserCacheUseCase, getAppUpdateUseCase, ignoreAppUpdateUseCase, isLockedFlowUseCase, resetUnlockEndDateTimeUseCase, autoLockAfterInactivityUseCase, setIsBiometricsAvailableUseCase);
    }

    /* renamed from: a */
    public MainViewModel get() {
        return b((SavedStateHandle) this.f37581a.get(), (RemoteConfigSetup) this.f37582b.get(), (IsAccountLoggedInUseCase) this.f37583c.get(), (AppFeatures) this.f37584d.get(), (ClearUserCacheUseCase) this.f37585e.get(), (GetAppUpdateUseCase) this.f37586f.get(), (IgnoreAppUpdateUseCase) this.f37587g.get(), (IsLockedFlowUseCase) this.f37588h.get(), (ResetUnlockEndDateTimeUseCase) this.f37589i.get(), (AutoLockAfterInactivityUseCase) this.f37590j.get(), (SetIsBiometricsAvailableUseCase) this.f37591k.get());
    }
}
