package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class SetIsLockedFlowUseCase_Factory implements Factory<SetIsLockedFlowUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33991a;

    public static SetIsLockedFlowUseCase b(LockPreferences lockPreferences) {
        return new SetIsLockedFlowUseCase(lockPreferences);
    }

    /* renamed from: a */
    public SetIsLockedFlowUseCase get() {
        return b((LockPreferences) this.f33991a.get());
    }
}
