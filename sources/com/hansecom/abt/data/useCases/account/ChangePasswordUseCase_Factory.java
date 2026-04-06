package com.hansecom.abt.data.useCases.account;

import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangePasswordUseCase_Factory implements Factory<ChangePasswordUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33768a;

    public static ChangePasswordUseCase b(UserDataApi userDataApi) {
        return new ChangePasswordUseCase(userDataApi);
    }

    /* renamed from: a */
    public ChangePasswordUseCase get() {
        return b((UserDataApi) this.f33768a.get());
    }
}
