package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetCardOptionsMenuConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaRepository f33857a;

    /* renamed from: b  reason: collision with root package name */
    public final AppFeatures f33858b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaMenuConfigConverter f33859c;

    public GetCardOptionsMenuConfigurationUseCase(FareMediaRepository fareMediaRepository, AppFeatures appFeatures, FareMediaMenuConfigConverter fareMediaMenuConfigConverter) {
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(appFeatures, "appFeatures");
        Intrinsics.i(fareMediaMenuConfigConverter, "menuConfigConverter");
        this.f33857a = fareMediaRepository;
        this.f33858b = appFeatures;
        this.f33859c = fareMediaMenuConfigConverter;
    }

    public final Flow c(String str) {
        Intrinsics.i(str, "fareMediaId");
        return new GetCardOptionsMenuConfigurationUseCase$invoke$$inlined$map$1(this.f33857a.o(), this, str);
    }
}
