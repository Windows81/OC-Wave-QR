package com.hansecom.abt.data.useCases.account;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase", f = "ChangeSecurityQuestionsUseCase.kt", l = {32, 18, 19, 23}, m = "invoke-gIAlu-s")
public final class ChangeSecurityQuestionsUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ChangeSecurityQuestionsUseCase E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionsUseCase$invoke$1(ChangeSecurityQuestionsUseCase changeSecurityQuestionsUseCase, Continuation continuation) {
        super(continuation);
        this.E = changeSecurityQuestionsUseCase;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object b2 = this.E.b((List) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
