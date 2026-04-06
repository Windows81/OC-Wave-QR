package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.generalData.VirtualFareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetAllVirtualFareMediaUseCase {

    /* renamed from: b  reason: collision with root package name */
    public static final int f33724b = 8;

    /* renamed from: a  reason: collision with root package name */
    public final VirtualFareMediaRepository f33725a;

    public GetAllVirtualFareMediaUseCase(VirtualFareMediaRepository virtualFareMediaRepository) {
        Intrinsics.i(virtualFareMediaRepository, "repository");
        this.f33725a = virtualFareMediaRepository;
    }

    public final Flow a() {
        return this.f33725a.p();
    }
}
