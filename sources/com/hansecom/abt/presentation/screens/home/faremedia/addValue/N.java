package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.mapi.models.PrePurchaseWithPromoCodeResponse;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class N implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PrePurchaseWithPromoCodeResponse f36115z;

    public /* synthetic */ N(PrePurchaseWithPromoCodeResponse prePurchaseWithPromoCodeResponse) {
        this.f36115z = prePurchaseWithPromoCodeResponse;
    }

    public final Object invoke(Object obj) {
        return FareMediaAddValueViewModel$applyCoupon$1.F(this.f36115z, (FareMediaAddValue.State) obj);
    }
}
