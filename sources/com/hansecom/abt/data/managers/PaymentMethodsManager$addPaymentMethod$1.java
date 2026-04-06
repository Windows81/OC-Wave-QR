package com.hansecom.abt.data.managers;

import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import com.hansecom.mapi.models.BillingAddress;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.PaymentMethodsManager", f = "PaymentMethodsManager.kt", l = {60}, m = "addPaymentMethod-BWLJW6A")
public final class PaymentMethodsManager$addPaymentMethod$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PaymentMethodsManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsManager$addPaymentMethod$1(PaymentMethodsManager paymentMethodsManager, Continuation continuation) {
        super(continuation);
        this.D = paymentMethodsManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, (CreditCardInfoNetworkMerchantResponse) null, (BillingAddress) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
