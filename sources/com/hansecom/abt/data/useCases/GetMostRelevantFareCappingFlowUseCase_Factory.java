package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.FareCappingRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetMostRelevantFareCappingFlowUseCase_Factory implements Factory<GetMostRelevantFareCappingFlowUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33738a;

    public static GetMostRelevantFareCappingFlowUseCase b(FareCappingRepository fareCappingRepository) {
        return new GetMostRelevantFareCappingFlowUseCase(fareCappingRepository);
    }

    /* renamed from: a */
    public GetMostRelevantFareCappingFlowUseCase get() {
        return b((FareCappingRepository) this.f33738a.get());
    }
}
