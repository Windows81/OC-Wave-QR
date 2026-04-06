package com.hansecom.abt.data.repositories.generalData;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.generalData.SecurityQuestionsRepository", f = "SecurityQuestionsRepository.kt", l = {31}, m = "getFreshData-IoAF18A")
public final class SecurityQuestionsRepository$getFreshData$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ SecurityQuestionsRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityQuestionsRepository$getFreshData$1(SecurityQuestionsRepository securityQuestionsRepository, Continuation continuation) {
        super(continuation);
        this.D = securityQuestionsRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object q2 = this.D.q(this);
        return q2 == IntrinsicsKt.f() ? q2 : Result.a(q2);
    }
}
