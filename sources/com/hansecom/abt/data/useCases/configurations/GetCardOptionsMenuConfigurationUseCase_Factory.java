package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetCardOptionsMenuConfigurationUseCase_Factory implements Factory<GetCardOptionsMenuConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33866a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33867b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33868c;

    public static GetCardOptionsMenuConfigurationUseCase b(FareMediaRepository fareMediaRepository, AppFeatures appFeatures, FareMediaMenuConfigConverter fareMediaMenuConfigConverter) {
        return new GetCardOptionsMenuConfigurationUseCase(fareMediaRepository, appFeatures, fareMediaMenuConfigConverter);
    }

    /* renamed from: a */
    public GetCardOptionsMenuConfigurationUseCase get() {
        return b((FareMediaRepository) this.f33866a.get(), (AppFeatures) this.f33867b.get(), (FareMediaMenuConfigConverter) this.f33868c.get());
    }
}
