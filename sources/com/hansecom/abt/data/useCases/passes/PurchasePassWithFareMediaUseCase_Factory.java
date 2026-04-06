package com.hansecom.abt.data.useCases.passes;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PurchasePassWithFareMediaUseCase_Factory implements Factory<PurchasePassWithFareMediaUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34014a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34015b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34016c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f34017d;

    public static PurchasePassWithFareMediaUseCase b(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        return new PurchasePassWithFareMediaUseCase(purchaseManager, cardHistoryRepository, fareMediaPassesRepository, fareMediaPassesToOfferRepository);
    }

    /* renamed from: a */
    public PurchasePassWithFareMediaUseCase get() {
        return b((PurchaseManager) this.f34014a.get(), (CardHistoryRepository) this.f34015b.get(), (FareMediaPassesRepository) this.f34016c.get(), (FareMediaPassesToOfferRepository) this.f34017d.get());
    }
}
