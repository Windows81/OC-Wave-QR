package com.hansecom.abt.data.useCases.auth;

import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ResendActivationEmailUseCase_Factory implements Factory<ResendActivationEmailUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33821a;

    public static ResendActivationEmailUseCase b(UserDataApi userDataApi) {
        return new ResendActivationEmailUseCase(userDataApi);
    }

    /* renamed from: a */
    public ResendActivationEmailUseCase get() {
        return b((UserDataApi) this.f33821a.get());
    }
}
