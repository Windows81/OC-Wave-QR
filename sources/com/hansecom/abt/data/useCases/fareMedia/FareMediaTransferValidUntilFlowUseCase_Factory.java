package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaTransferValidUntilFlowUseCase_Factory implements Factory<FareMediaTransferValidUntilFlowUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33904a;

    public static FareMediaTransferValidUntilFlowUseCase b(FareMediaTransferTimeRepository fareMediaTransferTimeRepository) {
        return new FareMediaTransferValidUntilFlowUseCase(fareMediaTransferTimeRepository);
    }

    /* renamed from: a */
    public FareMediaTransferValidUntilFlowUseCase get() {
        return b((FareMediaTransferTimeRepository) this.f33904a.get());
    }
}
