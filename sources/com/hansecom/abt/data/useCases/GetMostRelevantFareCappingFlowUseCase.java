package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.FareCappingRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class GetMostRelevantFareCappingFlowUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareCappingRepository f33734a;

    public GetMostRelevantFareCappingFlowUseCase(FareCappingRepository fareCappingRepository) {
        Intrinsics.i(fareCappingRepository, "fareCappingRepository");
        this.f33734a = fareCappingRepository;
    }

    public final Flow a(String str) {
        return (str == null || str.length() == 0) ? FlowKt.K(Result.a(Result.b((Object) null))) : new GetMostRelevantFareCappingFlowUseCase$invoke$$inlined$map$1(this.f33734a.u(str));
    }
}
