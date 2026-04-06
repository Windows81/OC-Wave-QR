package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel", f = "AddPaymentMethodNmiViewModel.kt", l = {99, 139, 152, 164}, m = "handle")
public final class AddPaymentMethodNmiViewModel$handle$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AddPaymentMethodNmiViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNmiViewModel$handle$1(AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel, Continuation continuation) {
        super(continuation);
        this.F = addPaymentMethodNmiViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.o((AddPaymentMethodNmi.Action) null, this);
    }
}
