package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.util.formatters.CardNumberValueFormater;
import com.hansecom.mapi.models.FareMedium;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardNumberStateKt {
    public static final CardNumberState a(FareMedium fareMedium) {
        Intrinsics.i(fareMedium, "<this>");
        String f2 = fareMedium.f();
        String k2 = fareMedium.k();
        if (k2 == null) {
            k2 = "";
        }
        String str = k2;
        String a2 = CardNumberValueFormater.f39044a.a(fareMedium.f());
        Boolean q2 = fareMedium.q();
        return new CardNumberState(f2, str, a2, q2 != null ? q2.booleanValue() : false, false, 16, (DefaultConstructorMarker) null);
    }
}
