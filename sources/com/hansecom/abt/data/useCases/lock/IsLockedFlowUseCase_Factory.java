package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class IsLockedFlowUseCase_Factory implements Factory<IsLockedFlowUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33976a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33977b;

    public static IsLockedFlowUseCase b(AppFeatures appFeatures, LockPreferences lockPreferences) {
        return new IsLockedFlowUseCase(appFeatures, lockPreferences);
    }

    /* renamed from: a */
    public IsLockedFlowUseCase get() {
        return b((AppFeatures) this.f33976a.get(), (LockPreferences) this.f33977b.get());
    }
}
