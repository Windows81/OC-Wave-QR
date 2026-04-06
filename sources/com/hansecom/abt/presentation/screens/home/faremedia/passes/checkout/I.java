package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.mapi.models.PrePurchaseWithPromoCodeResponse;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class I implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PrePurchaseWithPromoCodeResponse f37083z;

    public /* synthetic */ I(PrePurchaseWithPromoCodeResponse prePurchaseWithPromoCodeResponse) {
        this.f37083z = prePurchaseWithPromoCodeResponse;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel$applyCoupon$1.F(this.f37083z, (PassCheckout.State) obj);
    }
}
