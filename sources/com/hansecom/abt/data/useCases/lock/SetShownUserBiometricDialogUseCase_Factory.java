package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class SetShownUserBiometricDialogUseCase_Factory implements Factory<SetShownUserBiometricDialogUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33993a;

    public static SetShownUserBiometricDialogUseCase b(LockPreferences lockPreferences) {
        return new SetShownUserBiometricDialogUseCase(lockPreferences);
    }

    /* renamed from: a */
    public SetShownUserBiometricDialogUseCase get() {
        return b((LockPreferences) this.f33993a.get());
    }
}
