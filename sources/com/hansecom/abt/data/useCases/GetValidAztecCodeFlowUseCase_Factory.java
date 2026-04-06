package com.hansecom.abt.data.useCases;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaKeysRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetValidAztecCodeFlowUseCase_Factory implements Factory<GetValidAztecCodeFlowUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33746a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33747b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33748c;

    public static GetValidAztecCodeFlowUseCase b(GetVirtualCardFlowUseCase getVirtualCardFlowUseCase, FareMediaKeysRepository fareMediaKeysRepository, AppFeatures appFeatures) {
        return new GetValidAztecCodeFlowUseCase(getVirtualCardFlowUseCase, fareMediaKeysRepository, appFeatures);
    }

    /* renamed from: a */
    public GetValidAztecCodeFlowUseCase get() {
        return b((GetVirtualCardFlowUseCase) this.f33746a.get(), (FareMediaKeysRepository) this.f33747b.get(), (AppFeatures) this.f33748c.get());
    }
}
