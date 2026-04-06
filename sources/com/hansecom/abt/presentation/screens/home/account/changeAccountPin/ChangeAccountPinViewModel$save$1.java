package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel", f = "ChangeAccountPinViewModel.kt", l = {88}, m = "save")
public final class ChangeAccountPinViewModel$save$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ChangeAccountPinViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAccountPinViewModel$save$1(ChangeAccountPinViewModel changeAccountPinViewModel, Continuation continuation) {
        super(continuation);
        this.E = changeAccountPinViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.N(this);
    }
}
