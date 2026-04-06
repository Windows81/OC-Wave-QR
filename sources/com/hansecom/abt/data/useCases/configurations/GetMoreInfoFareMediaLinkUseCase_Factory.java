package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetMoreInfoFareMediaLinkUseCase_Factory implements Factory<GetMoreInfoFareMediaLinkUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33878a;

    public static GetMoreInfoFareMediaLinkUseCase b(GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
        return new GetMoreInfoFareMediaLinkUseCase(getLinksConfigurationUseCase);
    }

    /* renamed from: a */
    public GetMoreInfoFareMediaLinkUseCase get() {
        return b((GetLinksConfigurationUseCase) this.f33878a.get());
    }
}
