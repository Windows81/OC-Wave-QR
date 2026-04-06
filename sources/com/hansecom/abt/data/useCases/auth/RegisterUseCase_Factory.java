package com.hansecom.abt.data.useCases.auth;

import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RegisterUseCase_Factory implements Factory<RegisterUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33819a;

    public static RegisterUseCase b(UserDataApi userDataApi) {
        return new RegisterUseCase(userDataApi);
    }

    /* renamed from: a */
    public RegisterUseCase get() {
        return b((UserDataApi) this.f33819a.get());
    }
}
