package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeAccountInfoUseCase_Factory implements Factory<ChangeAccountInfoUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33764a;

    public static ChangeAccountInfoUseCase b(UserRepository userRepository) {
        return new ChangeAccountInfoUseCase(userRepository);
    }

    /* renamed from: a */
    public ChangeAccountInfoUseCase get() {
        return b((UserRepository) this.f33764a.get());
    }
}
