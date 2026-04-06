package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetAllFareMediaUseCase_Factory implements Factory<GetAllFareMediaUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33906a;

    public static GetAllFareMediaUseCase b(FareMediaRepository fareMediaRepository) {
        return new GetAllFareMediaUseCase(fareMediaRepository);
    }

    /* renamed from: a */
    public GetAllFareMediaUseCase get() {
        return b((FareMediaRepository) this.f33906a.get());
    }
}
