package com.hansecom.abt.data.useCases;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.SendHelpRequestUseCase", f = "SendHelpRequestUseCase.kt", l = {39}, m = "invoke-LiYkppA")
public final class SendHelpRequestUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ SendHelpRequestUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendHelpRequestUseCase$invoke$1(SendHelpRequestUseCase sendHelpRequestUseCase, Continuation continuation) {
        super(continuation);
        this.D = sendHelpRequestUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
