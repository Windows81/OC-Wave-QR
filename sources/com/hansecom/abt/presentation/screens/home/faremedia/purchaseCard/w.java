package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class w implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BigDecimal f37222z;

    public /* synthetic */ w(BigDecimal bigDecimal) {
        this.f37222z = bigDecimal;
    }

    public final Object invoke(Object obj) {
        return FareMediaPurchaseCardViewModel.X(this.f37222z, (FareMediaPurchaseCard.State) obj);
    }
}
