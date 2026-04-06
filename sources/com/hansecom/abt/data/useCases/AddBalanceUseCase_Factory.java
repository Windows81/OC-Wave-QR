package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddBalanceUseCase_Factory implements Factory<AddBalanceUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33688a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33689b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33690c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33691d;

    public static AddBalanceUseCase b(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaRepository fareMediaRepository, SaveCreditCardAsDefaultPaymentMethodUseCase saveCreditCardAsDefaultPaymentMethodUseCase) {
        return new AddBalanceUseCase(purchaseManager, cardHistoryRepository, fareMediaRepository, saveCreditCardAsDefaultPaymentMethodUseCase);
    }

    /* renamed from: a */
    public AddBalanceUseCase get() {
        return b((PurchaseManager) this.f33688a.get(), (CardHistoryRepository) this.f33689b.get(), (FareMediaRepository) this.f33690c.get(), (SaveCreditCardAsDefaultPaymentMethodUseCase) this.f33691d.get());
    }
}
