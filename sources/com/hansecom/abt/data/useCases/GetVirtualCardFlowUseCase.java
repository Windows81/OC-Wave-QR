package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetVirtualCardFlowUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaRepository f33749a;

    public GetVirtualCardFlowUseCase(FareMediaRepository fareMediaRepository) {
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        this.f33749a = fareMediaRepository;
    }

    public final Flow a() {
        return new GetVirtualCardFlowUseCase$invoke$$inlined$map$1(this.f33749a.o());
    }
}
