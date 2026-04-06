package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeAddressUseCase_Factory implements Factory<ChangeAddressUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33766a;

    public static ChangeAddressUseCase b(UserRepository userRepository) {
        return new ChangeAddressUseCase(userRepository);
    }

    /* renamed from: a */
    public ChangeAddressUseCase get() {
        return b((UserRepository) this.f33766a.get());
    }
}
