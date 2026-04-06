package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PurchaseVirtualCardUseCase_Factory implements Factory<PurchaseVirtualCardUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33924a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33925b;

    public static PurchaseVirtualCardUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository) {
        return new PurchaseVirtualCardUseCase(fareMediaManager, fareMediaRepository);
    }

    /* renamed from: a */
    public PurchaseVirtualCardUseCase get() {
        return b((FareMediaManager) this.f33924a.get(), (FareMediaRepository) this.f33925b.get());
    }
}
