package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ToggleBiometricsLockActivatedUseCase_Factory implements Factory<ToggleBiometricsLockActivatedUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33997a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33998b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33999c;

    public static ToggleBiometricsLockActivatedUseCase b(LockPreferences lockPreferences, SetIsLockedFlowUseCase setIsLockedFlowUseCase, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase) {
        return new ToggleBiometricsLockActivatedUseCase(lockPreferences, setIsLockedFlowUseCase, resetUnlockEndDateTimeUseCase);
    }

    /* renamed from: a */
    public ToggleBiometricsLockActivatedUseCase get() {
        return b((LockPreferences) this.f33997a.get(), (SetIsLockedFlowUseCase) this.f33998b.get(), (ResetUnlockEndDateTimeUseCase) this.f33999c.get());
    }
}
