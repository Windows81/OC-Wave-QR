package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetVirtualCardFlowUseCase_Factory implements Factory<GetVirtualCardFlowUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33752a;

    public static GetVirtualCardFlowUseCase b(FareMediaRepository fareMediaRepository) {
        return new GetVirtualCardFlowUseCase(fareMediaRepository);
    }

    /* renamed from: a */
    public GetVirtualCardFlowUseCase get() {
        return b((FareMediaRepository) this.f33752a.get());
    }
}
