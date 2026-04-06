package com.hansecom.abt.data.useCases.institution;

import com.hansecom.abt.data.managers.InstitutionManager;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class UnlinkInstitutionUseCase_Factory implements Factory<UnlinkInstitutionUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33962a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33963b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33964c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33965d;

    public static UnlinkInstitutionUseCase b(InstitutionManager institutionManager, FareMediaInstitutionsRepository fareMediaInstitutionsRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        return new UnlinkInstitutionUseCase(institutionManager, fareMediaInstitutionsRepository, fareMediaPassesRepository, fareMediaPassesToOfferRepository);
    }

    /* renamed from: a */
    public UnlinkInstitutionUseCase get() {
        return b((InstitutionManager) this.f33962a.get(), (FareMediaInstitutionsRepository) this.f33963b.get(), (FareMediaPassesRepository) this.f33964c.get(), (FareMediaPassesToOfferRepository) this.f33965d.get());
    }
}
