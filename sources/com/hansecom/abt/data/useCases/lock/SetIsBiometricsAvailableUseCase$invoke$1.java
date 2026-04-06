package com.hansecom.abt.data.useCases.lock;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase", f = "SetIsBiometricsAvailableUseCase.kt", l = {10, 11}, m = "invoke")
public final class SetIsBiometricsAvailableUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public boolean D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ SetIsBiometricsAvailableUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetIsBiometricsAvailableUseCase$invoke$1(SetIsBiometricsAvailableUseCase setIsBiometricsAvailableUseCase, Continuation continuation) {
        super(continuation);
        this.G = setIsBiometricsAvailableUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(false, this);
    }
}
