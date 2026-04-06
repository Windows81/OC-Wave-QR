package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareCappingRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RefreshFareMediaDataUseCase_Factory implements Factory<RefreshFareMediaDataUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33929a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33930b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33931c;

    public static RefreshFareMediaDataUseCase b(FareMediaTransferTimeRepository fareMediaTransferTimeRepository, FareMediaRepository fareMediaRepository, FareCappingRepository fareCappingRepository) {
        return new RefreshFareMediaDataUseCase(fareMediaTransferTimeRepository, fareMediaRepository, fareCappingRepository);
    }

    /* renamed from: a */
    public RefreshFareMediaDataUseCase get() {
        return b((FareMediaTransferTimeRepository) this.f33929a.get(), (FareMediaRepository) this.f33930b.get(), (FareCappingRepository) this.f33931c.get());
    }
}
