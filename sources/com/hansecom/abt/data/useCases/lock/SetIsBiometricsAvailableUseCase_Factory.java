package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class SetIsBiometricsAvailableUseCase_Factory implements Factory<SetIsBiometricsAvailableUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33989a;

    public static SetIsBiometricsAvailableUseCase b(LockPreferences lockPreferences) {
        return new SetIsBiometricsAvailableUseCase(lockPreferences);
    }

    /* renamed from: a */
    public SetIsBiometricsAvailableUseCase get() {
        return b((LockPreferences) this.f33989a.get());
    }
}
