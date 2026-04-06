package com.hansecom.abt.data.useCases.lock;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase", f = "GetShowUserBiometricDialogUseCase.kt", l = {10, 11}, m = "invoke")
public final class GetShowUserBiometricDialogUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ GetShowUserBiometricDialogUseCase E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetShowUserBiometricDialogUseCase$invoke$1(GetShowUserBiometricDialogUseCase getShowUserBiometricDialogUseCase, Continuation continuation) {
        super(continuation);
        this.E = getShowUserBiometricDialogUseCase;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(this);
    }
}
