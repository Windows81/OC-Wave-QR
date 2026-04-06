package com.hansecom.abt.data.useCases.institution;

import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetInstitutionsUseCase_Factory implements Factory<GetInstitutionsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33949a;

    public static GetInstitutionsUseCase b(FareMediaInstitutionsRepository fareMediaInstitutionsRepository) {
        return new GetInstitutionsUseCase(fareMediaInstitutionsRepository);
    }

    /* renamed from: a */
    public GetInstitutionsUseCase get() {
        return b((FareMediaInstitutionsRepository) this.f33949a.get());
    }
}
