package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetUserUseCase_Factory implements Factory<GetUserUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33776a;

    public static GetUserUseCase b(UserRepository userRepository) {
        return new GetUserUseCase(userRepository);
    }

    /* renamed from: a */
    public GetUserUseCase get() {
        return b((UserRepository) this.f33776a.get());
    }
}
