package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddBalanceWithGooglePayUseCase_Factory implements Factory<AddBalanceWithGooglePayUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33696a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33697b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33698c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33699d;

    public static AddBalanceWithGooglePayUseCase b(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaRepository fareMediaRepository, AppPreferences appPreferences) {
        return new AddBalanceWithGooglePayUseCase(purchaseManager, cardHistoryRepository, fareMediaRepository, appPreferences);
    }

    /* renamed from: a */
    public AddBalanceWithGooglePayUseCase get() {
        return b((PurchaseManager) this.f33696a.get(), (CardHistoryRepository) this.f33697b.get(), (FareMediaRepository) this.f33698c.get(), (AppPreferences) this.f33699d.get());
    }
}
