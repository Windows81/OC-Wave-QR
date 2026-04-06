package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState f37218z;

    public /* synthetic */ s(PaymentMethodState paymentMethodState) {
        this.f37218z = paymentMethodState;
    }

    public final Object invoke(Object obj) {
        return FareMediaPurchaseCardViewModel.T(this.f37218z, (FareMediaPurchaseCard.State) obj);
    }
}
