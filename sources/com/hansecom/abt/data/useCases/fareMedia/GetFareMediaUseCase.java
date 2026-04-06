package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetFareMediaUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaRepository f33907a;

    public GetFareMediaUseCase(FareMediaRepository fareMediaRepository) {
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        this.f33907a = fareMediaRepository;
    }

    public final Flow a(String str) {
        Intrinsics.i(str, "fareMediaId");
        return new GetFareMediaUseCase$invoke$$inlined$map$1(this.f33907a.O(str));
    }
}
