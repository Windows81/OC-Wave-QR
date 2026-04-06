package com.hansecom.abt.presentation.screens.helpRequest;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel", f = "HelpRequestViewModel.kt", l = {284}, m = "sendRequest")
public final class HelpRequestViewModel$sendRequest$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ HelpRequestViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpRequestViewModel$sendRequest$1(HelpRequestViewModel helpRequestViewModel, Continuation continuation) {
        super(continuation);
        this.E = helpRequestViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.l0(this);
    }
}
