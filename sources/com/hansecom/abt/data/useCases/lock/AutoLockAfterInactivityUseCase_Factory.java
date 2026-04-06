package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AutoLockAfterInactivityUseCase_Factory implements Factory<AutoLockAfterInactivityUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33969a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33970b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33971c;

    public static AutoLockAfterInactivityUseCase b(LockPreferences lockPreferences, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase, SetIsLockedFlowUseCase setIsLockedFlowUseCase) {
        return new AutoLockAfterInactivityUseCase(lockPreferences, resetUnlockEndDateTimeUseCase, setIsLockedFlowUseCase);
    }

    /* renamed from: a */
    public AutoLockAfterInactivityUseCase get() {
        return b((LockPreferences) this.f33969a.get(), (ResetUnlockEndDateTimeUseCase) this.f33970b.get(), (SetIsLockedFlowUseCase) this.f33971c.get());
    }
}
