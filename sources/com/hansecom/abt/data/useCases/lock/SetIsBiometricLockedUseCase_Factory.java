package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class SetIsBiometricLockedUseCase_Factory implements Factory<SetIsBiometricLockedUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33985a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33986b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33987c;

    public static SetIsBiometricLockedUseCase b(LockPreferences lockPreferences, SetIsLockedFlowUseCase setIsLockedFlowUseCase, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase) {
        return new SetIsBiometricLockedUseCase(lockPreferences, setIsLockedFlowUseCase, resetUnlockEndDateTimeUseCase);
    }

    /* renamed from: a */
    public SetIsBiometricLockedUseCase get() {
        return b((LockPreferences) this.f33985a.get(), (SetIsLockedFlowUseCase) this.f33986b.get(), (ResetUnlockEndDateTimeUseCase) this.f33987c.get());
    }
}
