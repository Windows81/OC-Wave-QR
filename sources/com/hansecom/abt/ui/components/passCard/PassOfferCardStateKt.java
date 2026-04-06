package com.hansecom.abt.ui.components.passCard;

import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.mapi.models.FareProductOffer;
import com.hansecom.mapi.models.GroupConstraints;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassOfferCardStateKt {
    public static final PassOfferCardState a(FareProductOffer fareProductOffer, Integer num) {
        Integer a2;
        Integer b2;
        Boolean c2;
        Intrinsics.i(fareProductOffer, "<this>");
        Integer f2 = fareProductOffer.f();
        Intrinsics.f(f2);
        int intValue = f2.intValue();
        String c3 = fareProductOffer.c();
        String str = c3 == null ? "" : c3;
        BigDecimal c4 = BigDecimalExtKt.c(fareProductOffer.e());
        String a3 = fareProductOffer.a();
        String str2 = a3 == null ? "" : a3;
        String g2 = fareProductOffer.g();
        String d2 = fareProductOffer.d();
        String str3 = d2 == null ? "" : d2;
        GroupConstraints b3 = fareProductOffer.b();
        boolean booleanValue = (b3 == null || (c2 = b3.c()) == null) ? false : c2.booleanValue();
        GroupConstraints b4 = fareProductOffer.b();
        int intValue2 = (b4 == null || (b2 = b4.b()) == null) ? 0 : b2.intValue();
        GroupConstraints b5 = fareProductOffer.b();
        return new PassOfferCardState(intValue, str, str2, g2, c4, str3, booleanValue, num != null ? num.intValue() : 0, intValue2, (b5 == null || (a2 = b5.a()) == null) ? 0 : a2.intValue());
    }
}
