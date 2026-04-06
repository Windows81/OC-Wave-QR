package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ResetUnlockEndDateTimeUseCase_Factory implements Factory<ResetUnlockEndDateTimeUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33981a;

    public static ResetUnlockEndDateTimeUseCase b(LockPreferences lockPreferences) {
        return new ResetUnlockEndDateTimeUseCase(lockPreferences);
    }

    /* renamed from: a */
    public ResetUnlockEndDateTimeUseCase get() {
        return b((LockPreferences) this.f33981a.get());
    }
}
