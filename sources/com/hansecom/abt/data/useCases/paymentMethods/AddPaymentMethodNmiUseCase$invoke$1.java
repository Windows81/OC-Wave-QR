package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import com.hansecom.mapi.models.UserAddress;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase", f = "AddPaymentMethodNmiUseCase.kt", l = {25, 22, 27, 28, 29, 30}, m = "invoke-BWLJW6A")
public final class AddPaymentMethodNmiUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ AddPaymentMethodNmiUseCase I;
    public int J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNmiUseCase$invoke$1(AddPaymentMethodNmiUseCase addPaymentMethodNmiUseCase, Continuation continuation) {
        super(continuation);
        this.I = addPaymentMethodNmiUseCase;
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        Object a2 = this.I.a((String) null, (CreditCardInfoNetworkMerchantResponse) null, (UserAddress) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
