package com.hansecom.abt.data.useCases.institution;

import com.hansecom.abt.data.managers.InstitutionManager;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LinkInstitutionUseCase_Factory implements Factory<LinkInstitutionUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33954a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33955b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33956c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33957d;

    public static LinkInstitutionUseCase b(InstitutionManager institutionManager, FareMediaInstitutionsRepository fareMediaInstitutionsRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        return new LinkInstitutionUseCase(institutionManager, fareMediaInstitutionsRepository, fareMediaPassesRepository, fareMediaPassesToOfferRepository);
    }

    /* renamed from: a */
    public LinkInstitutionUseCase get() {
        return b((InstitutionManager) this.f33954a.get(), (FareMediaInstitutionsRepository) this.f33955b.get(), (FareMediaPassesRepository) this.f33956c.get(), (FareMediaPassesToOfferRepository) this.f33957d.get());
    }
}
