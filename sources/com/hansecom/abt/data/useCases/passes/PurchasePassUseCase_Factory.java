package com.hansecom.abt.data.useCases.passes;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PurchasePassUseCase_Factory implements Factory<PurchasePassUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34005a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34006b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34007c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f34008d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f34009e;

    public static PurchasePassUseCase b(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, SaveCreditCardAsDefaultPaymentMethodUseCase saveCreditCardAsDefaultPaymentMethodUseCase) {
        return new PurchasePassUseCase(purchaseManager, cardHistoryRepository, fareMediaPassesRepository, fareMediaPassesToOfferRepository, saveCreditCardAsDefaultPaymentMethodUseCase);
    }

    /* renamed from: a */
    public PurchasePassUseCase get() {
        return b((PurchaseManager) this.f34005a.get(), (CardHistoryRepository) this.f34006b.get(), (FareMediaPassesRepository) this.f34007c.get(), (FareMediaPassesToOfferRepository) this.f34008d.get(), (SaveCreditCardAsDefaultPaymentMethodUseCase) this.f34009e.get());
    }
}
