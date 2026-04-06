package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LockFareMediaCardUseCase_Factory implements Factory<LockFareMediaCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33919a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33920b;

    public static LockFareMediaCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new LockFareMediaCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public LockFareMediaCardUseCase get() {
        return b((FareMediaManager) this.f33919a.get(), (FareMediaRepository) this.f33920b.get());
    }
}
