package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.generalData.VirtualFareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetAllVirtualFareMediaUseCase_Factory implements Factory<GetAllVirtualFareMediaUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33726a;

    public static GetAllVirtualFareMediaUseCase b(VirtualFareMediaRepository virtualFareMediaRepository) {
        return new GetAllVirtualFareMediaUseCase(virtualFareMediaRepository);
    }

    /* renamed from: a */
    public GetAllVirtualFareMediaUseCase get() {
        return b((VirtualFareMediaRepository) this.f33726a.get());
    }
}
