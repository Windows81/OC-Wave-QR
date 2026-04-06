package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetEnvironmentConfigurationUseCase {

    /* renamed from: b  reason: collision with root package name */
    public static final int f33729b = 8;

    /* renamed from: a  reason: collision with root package name */
    public final EnvironmentConfigurationRepository f33730a;

    public GetEnvironmentConfigurationUseCase(EnvironmentConfigurationRepository environmentConfigurationRepository) {
        Intrinsics.i(environmentConfigurationRepository, "repository");
        this.f33730a = environmentConfigurationRepository;
    }

    public final Flow a() {
        return this.f33730a.p();
    }
}
