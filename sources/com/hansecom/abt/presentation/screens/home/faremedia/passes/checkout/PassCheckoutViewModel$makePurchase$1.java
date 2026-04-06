package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel", f = "PassCheckoutViewModel.kt", l = {140, 162, 196}, m = "makePurchase")
public final class PassCheckoutViewModel$makePurchase$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PassCheckoutViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassCheckoutViewModel$makePurchase$1(PassCheckoutViewModel passCheckoutViewModel, Continuation continuation) {
        super(continuation);
        this.F = passCheckoutViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.V(this);
    }
}
