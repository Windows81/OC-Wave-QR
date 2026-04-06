package com.hansecom.abt.data.useCases.institution;

import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetInstitutionsUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaInstitutionsRepository f33948a;

    public GetInstitutionsUseCase(FareMediaInstitutionsRepository fareMediaInstitutionsRepository) {
        Intrinsics.i(fareMediaInstitutionsRepository, "fareMediaInstitutionsRepository");
        this.f33948a = fareMediaInstitutionsRepository;
    }

    public final Flow a(String str) {
        Intrinsics.i(str, "fareMediaCardId");
        return this.f33948a.h(str);
    }
}
