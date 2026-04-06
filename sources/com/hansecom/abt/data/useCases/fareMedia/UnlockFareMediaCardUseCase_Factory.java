package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class UnlockFareMediaCardUseCase_Factory implements Factory<UnlockFareMediaCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33942a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33943b;

    public static UnlockFareMediaCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new UnlockFareMediaCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public UnlockFareMediaCardUseCase get() {
        return b((FareMediaManager) this.f33942a.get(), (FareMediaRepository) this.f33943b.get());
    }
}
