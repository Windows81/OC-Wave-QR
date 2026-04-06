package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LogOutUseCase_Factory implements Factory<LogOutUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33754a;

    public static LogOutUseCase b(AuthenticationPreferences authenticationPreferences) {
        return new LogOutUseCase(authenticationPreferences);
    }

    /* renamed from: a */
    public LogOutUseCase get() {
        return b((AuthenticationPreferences) this.f33754a.get());
    }
}
