package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetUserEmailUseCase_Factory implements Factory<GetUserEmailUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33774a;

    public static GetUserEmailUseCase b(UserRepository userRepository) {
        return new GetUserEmailUseCase(userRepository);
    }

    /* renamed from: a */
    public GetUserEmailUseCase get() {
        return b((UserRepository) this.f33774a.get());
    }
}
