package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetShowUserBiometricDialogUseCase_Factory implements Factory<GetShowUserBiometricDialogUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33973a;

    public static GetShowUserBiometricDialogUseCase b(LockPreferences lockPreferences) {
        return new GetShowUserBiometricDialogUseCase(lockPreferences);
    }

    /* renamed from: a */
    public GetShowUserBiometricDialogUseCase get() {
        return b((LockPreferences) this.f33973a.get());
    }
}
