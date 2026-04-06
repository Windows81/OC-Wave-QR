package com.hansecom.abt.data.useCases.lock;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase", f = "SetIsBiometricLockedUseCase.kt", l = {12, 13, 14}, m = "invoke")
public final class SetIsBiometricLockedUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ SetIsBiometricLockedUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetIsBiometricLockedUseCase$invoke$1(SetIsBiometricLockedUseCase setIsBiometricLockedUseCase, Continuation continuation) {
        super(continuation);
        this.F = setIsBiometricLockedUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(false, this);
    }
}
