package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.links.LinksConfigItem;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata
public final class GetMoreInfoFareMediaLinkUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final GetLinksConfigurationUseCase f33877a;

    public GetMoreInfoFareMediaLinkUseCase(GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
        Intrinsics.i(getLinksConfigurationUseCase, "getLinksConfigurationUseCase");
        this.f33877a = getLinksConfigurationUseCase;
    }

    public final LinksConfigItem a() {
        return this.f33877a.d("more_info_fare_media");
    }
}
