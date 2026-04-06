package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class FareMediaTransferValidUntilFlowUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaTransferTimeRepository f33901a;

    public FareMediaTransferValidUntilFlowUseCase(FareMediaTransferTimeRepository fareMediaTransferTimeRepository) {
        Intrinsics.i(fareMediaTransferTimeRepository, "fareMediaTransferTimeRepository");
        this.f33901a = fareMediaTransferTimeRepository;
    }

    public final Flow a(String str) {
        return (str == null || str.length() == 0) ? FlowKt.K((Object) null) : FlowKt.V(new FareMediaTransferValidUntilFlowUseCase$invoke$$inlined$map$1(this.f33901a.g(str)), new FareMediaTransferValidUntilFlowUseCase$invoke$2((Continuation) null));
    }
}
