package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class TransferBalanceUseCase_Factory implements Factory<TransferBalanceUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33760a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33761b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33762c;

    public static TransferBalanceUseCase b(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository, CardHistoryRepository cardHistoryRepository) {
        return new TransferBalanceUseCase(fareMediaManager, fareMediaRepository, cardHistoryRepository);
    }

    /* renamed from: a */
    public TransferBalanceUseCase get() {
        return b((FareMediaManager) this.f33760a.get(), (FareMediaRepository) this.f33761b.get(), (CardHistoryRepository) this.f33762c.get());
    }
}
