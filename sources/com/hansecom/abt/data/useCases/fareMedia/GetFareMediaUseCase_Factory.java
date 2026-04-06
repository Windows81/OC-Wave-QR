package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetFareMediaUseCase_Factory implements Factory<GetFareMediaUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33910a;

    public static GetFareMediaUseCase b(FareMediaRepository fareMediaRepository) {
        return new GetFareMediaUseCase(fareMediaRepository);
    }

    /* renamed from: a */
    public GetFareMediaUseCase get() {
        return b((FareMediaRepository) this.f33910a.get());
    }
}
