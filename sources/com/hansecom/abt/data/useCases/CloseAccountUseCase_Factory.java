package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CloseAccountUseCase_Factory implements Factory<CloseAccountUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33723a;

    public static CloseAccountUseCase b(UserRepository userRepository) {
        return new CloseAccountUseCase(userRepository);
    }

    /* renamed from: a */
    public CloseAccountUseCase get() {
        return b((UserRepository) this.f33723a.get());
    }
}
