package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.preferences.LockPreferences;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareCappingRepository;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ClearUserCacheUseCase_Factory implements Factory<ClearUserCacheUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33711a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33712b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33713c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33714d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f33715e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f33716f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f33717g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f33718h;

    /* renamed from: i  reason: collision with root package name */
    public final Provider f33719i;

    /* renamed from: j  reason: collision with root package name */
    public final Provider f33720j;

    /* renamed from: k  reason: collision with root package name */
    public final Provider f33721k;

    public static ClearUserCacheUseCase b(FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaRepository fareMediaRepository, FareCappingRepository fareCappingRepository, FareMediaConfigRepository fareMediaConfigRepository, FareMediaTransferTimeRepository fareMediaTransferTimeRepository, InstitutionsRepository institutionsRepository, PaymentMethodsRepository paymentMethodsRepository, UserRepository userRepository, LockPreferences lockPreferences) {
        return new ClearUserCacheUseCase(fareMediaPassesToOfferRepository, cardHistoryRepository, fareMediaPassesRepository, fareMediaRepository, fareCappingRepository, fareMediaConfigRepository, fareMediaTransferTimeRepository, institutionsRepository, paymentMethodsRepository, userRepository, lockPreferences);
    }

    /* renamed from: a */
    public ClearUserCacheUseCase get() {
        return b((FareMediaPassesToOfferRepository) this.f33711a.get(), (CardHistoryRepository) this.f33712b.get(), (FareMediaPassesRepository) this.f33713c.get(), (FareMediaRepository) this.f33714d.get(), (FareCappingRepository) this.f33715e.get(), (FareMediaConfigRepository) this.f33716f.get(), (FareMediaTransferTimeRepository) this.f33717g.get(), (InstitutionsRepository) this.f33718h.get(), (PaymentMethodsRepository) this.f33719i.get(), (UserRepository) this.f33720j.get(), (LockPreferences) this.f33721k.get());
    }
}
