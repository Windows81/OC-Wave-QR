package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class TransferFareMediaCardUseCase_Factory implements Factory<TransferFareMediaCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33934a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33935b;

    public static TransferFareMediaCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new TransferFareMediaCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public TransferFareMediaCardUseCase get() {
        return b((FareMediaManager) this.f33934a.get(), (FareMediaRepository) this.f33935b.get());
    }
}
