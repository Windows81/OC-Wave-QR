package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class IsAccountLoggedInUseCase_Factory implements Factory<IsAccountLoggedInUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33793a;

    public static IsAccountLoggedInUseCase b(AuthenticationPreferences authenticationPreferences) {
        return new IsAccountLoggedInUseCase(authenticationPreferences);
    }

    /* renamed from: a */
    public IsAccountLoggedInUseCase get() {
        return b((AuthenticationPreferences) this.f33793a.get());
    }
}
