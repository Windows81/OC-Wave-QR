package com.hansecom.abt.data.repositories.generalData;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository", f = "EnvironmentConfigurationRepository.kt", l = {30}, m = "getFreshData-IoAF18A")
public final class EnvironmentConfigurationRepository$getFreshData$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ EnvironmentConfigurationRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnvironmentConfigurationRepository$getFreshData$1(EnvironmentConfigurationRepository environmentConfigurationRepository, Continuation continuation) {
        super(continuation);
        this.D = environmentConfigurationRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object q2 = this.D.q(this);
        return q2 == IntrinsicsKt.f() ? q2 : Result.a(q2);
    }
}
