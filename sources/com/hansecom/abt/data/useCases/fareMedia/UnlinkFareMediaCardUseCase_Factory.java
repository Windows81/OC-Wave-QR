package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class UnlinkFareMediaCardUseCase_Factory implements Factory<UnlinkFareMediaCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33938a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33939b;

    public static UnlinkFareMediaCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new UnlinkFareMediaCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public UnlinkFareMediaCardUseCase get() {
        return b((FareMediaManager) this.f33938a.get(), (FareMediaRepository) this.f33939b.get());
    }
}
