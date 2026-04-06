package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AutoloadStateKt {
    public static final AutoloadState a(FareMediaAutoload fareMediaAutoload) {
        Intrinsics.i(fareMediaAutoload, "<this>");
        Long c2 = fareMediaAutoload.c();
        Intrinsics.f(c2);
        long longValue = c2.longValue();
        BigDecimal d2 = BigDecimalExtKt.d(fareMediaAutoload.b());
        BigDecimal d3 = BigDecimalExtKt.d(fareMediaAutoload.e());
        Boolean g2 = fareMediaAutoload.g();
        return new AutoloadState(longValue, d2, d3, g2 != null ? g2.booleanValue() : false, (PaymentMethodState.CreditCard) null, (PaymentMethodState.CreditCard) null, 48, (DefaultConstructorMarker) null);
    }
}
