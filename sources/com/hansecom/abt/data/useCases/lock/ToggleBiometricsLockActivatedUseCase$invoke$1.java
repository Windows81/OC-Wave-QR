package com.hansecom.abt.data.useCases.lock;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase", f = "ToggleBiometricsLockActivatedUseCase.kt", l = {12, 13, 14, 14}, m = "invoke")
public final class ToggleBiometricsLockActivatedUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ToggleBiometricsLockActivatedUseCase E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleBiometricsLockActivatedUseCase$invoke$1(ToggleBiometricsLockActivatedUseCase toggleBiometricsLockActivatedUseCase, Continuation continuation) {
        super(continuation);
        this.E = toggleBiometricsLockActivatedUseCase;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(this);
    }
}
