package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetAutoloadConfigurationsUseCase_Factory implements Factory<GetAutoloadConfigurationsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33844a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33845b;

    public static GetAutoloadConfigurationsUseCase b(FareMediaConfigRepository fareMediaConfigRepository, AppFeatures appFeatures) {
        return new GetAutoloadConfigurationsUseCase(fareMediaConfigRepository, appFeatures);
    }

    /* renamed from: a */
    public GetAutoloadConfigurationsUseCase get() {
        return b((FareMediaConfigRepository) this.f33844a.get(), (AppFeatures) this.f33845b.get());
    }
}
