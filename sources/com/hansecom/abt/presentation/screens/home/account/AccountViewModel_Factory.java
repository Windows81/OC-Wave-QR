package com.hansecom.abt.presentation.screens.home.account;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.CloseAccountUseCase;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase;
import com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AccountViewModel_Factory implements Factory<AccountViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35067a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35068b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35069c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35070d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f35071e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f35072f;

    public static AccountViewModel b(SavedStateHandle savedStateHandle, BiometricHelper biometricHelper, GetAccountMenuConfigurationUseCase getAccountMenuConfigurationUseCase, LogOutUseCase logOutUseCase, CloseAccountUseCase closeAccountUseCase, ToggleBiometricsLockActivatedUseCase toggleBiometricsLockActivatedUseCase) {
        return new AccountViewModel(savedStateHandle, biometricHelper, getAccountMenuConfigurationUseCase, logOutUseCase, closeAccountUseCase, toggleBiometricsLockActivatedUseCase);
    }

    /* renamed from: a */
    public AccountViewModel get() {
        return b((SavedStateHandle) this.f35067a.get(), (BiometricHelper) this.f35068b.get(), (GetAccountMenuConfigurationUseCase) this.f35069c.get(), (LogOutUseCase) this.f35070d.get(), (CloseAccountUseCase) this.f35071e.get(), (ToggleBiometricsLockActivatedUseCase) this.f35072f.get());
    }
}
