package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class UpdateNicknameUseCase_Factory implements Factory<UpdateNicknameUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33946a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33947b;

    public static UpdateNicknameUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new UpdateNicknameUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public UpdateNicknameUseCase get() {
        return b((FareMediaManager) this.f33946a.get(), (FareMediaRepository) this.f33947b.get());
    }
}
