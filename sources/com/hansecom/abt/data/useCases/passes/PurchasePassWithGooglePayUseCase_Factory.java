package com.hansecom.abt.data.useCases.passes;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PurchasePassWithGooglePayUseCase_Factory implements Factory<PurchasePassWithGooglePayUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34023a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34024b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34025c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f34026d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f34027e;

    public static PurchasePassWithGooglePayUseCase b(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, AppPreferences appPreferences) {
        return new PurchasePassWithGooglePayUseCase(purchaseManager, cardHistoryRepository, fareMediaPassesRepository, fareMediaPassesToOfferRepository, appPreferences);
    }

    /* renamed from: a */
    public PurchasePassWithGooglePayUseCase get() {
        return b((PurchaseManager) this.f34023a.get(), (CardHistoryRepository) this.f34024b.get(), (FareMediaPassesRepository) this.f34025c.get(), (FareMediaPassesToOfferRepository) this.f34026d.get(), (AppPreferences) this.f34027e.get());
    }
}
