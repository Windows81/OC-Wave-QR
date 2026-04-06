package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository;
import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeSecurityQuestionsUseCase_Factory implements Factory<ChangeSecurityQuestionsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33771a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33772b;

    public static ChangeSecurityQuestionsUseCase b(UserDataApi userDataApi, UserSecurityQuestionsRepository userSecurityQuestionsRepository) {
        return new ChangeSecurityQuestionsUseCase(userDataApi, userSecurityQuestionsRepository);
    }

    /* renamed from: a */
    public ChangeSecurityQuestionsUseCase get() {
        return b((UserDataApi) this.f33771a.get(), (UserSecurityQuestionsRepository) this.f33772b.get());
    }
}
