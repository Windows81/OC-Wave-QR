package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel", f = "FareCappingViewModel.kt", l = {59}, m = "handle")
public final class FareCappingViewModel$handle$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ FareCappingViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingViewModel$handle$1(FareCappingViewModel fareCappingViewModel, Continuation continuation) {
        super(continuation);
        this.E = fareCappingViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.o((FareCapping.Action) null, this);
    }
}
