package com.hansecom.abt.presentation.screens.home.faremedia;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel", f = "FareMediaViewModel.kt", l = {342}, m = "refreshAllFareMedia")
public final class FareMediaViewModel$refreshAllFareMedia$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ FareMediaViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaViewModel$refreshAllFareMedia$1(FareMediaViewModel fareMediaViewModel, Continuation continuation) {
        super(continuation);
        this.E = fareMediaViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.l0(this);
    }
}
