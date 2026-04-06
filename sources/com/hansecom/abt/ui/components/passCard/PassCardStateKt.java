package com.hansecom.abt.ui.components.passCard;

import com.hansecom.abt.util.DateParser;
import com.hansecom.mapi.models.FareProduct;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassCardStateKt {
    public static final PassCardState a(FareProduct fareProduct) {
        ZonedDateTime withZoneSameInstant;
        ZonedDateTime withZoneSameInstant2;
        Intrinsics.i(fareProduct, "<this>");
        Long e2 = fareProduct.e();
        Intrinsics.f(e2);
        long longValue = e2.longValue();
        String f2 = fareProduct.f();
        if (f2 == null) {
            f2 = "";
        }
        String str = f2;
        Boolean h2 = fareProduct.h();
        Boolean bool = Boolean.TRUE;
        boolean d2 = Intrinsics.d(h2, bool);
        boolean d3 = Intrinsics.d(fareProduct.d(), bool);
        boolean d4 = Intrinsics.d(fareProduct.b(), bool);
        Integer c2 = fareProduct.c();
        int intValue = c2 != null ? c2.intValue() : 1;
        DateParser dateParser = DateParser.f39003a;
        ZonedDateTime a2 = dateParser.a(fareProduct.a());
        LocalDateTime localDateTime = null;
        LocalDateTime localDateTime2 = (a2 == null || (withZoneSameInstant2 = a2.withZoneSameInstant(ZoneId.systemDefault())) == null) ? null : withZoneSameInstant2.toLocalDateTime();
        ZonedDateTime a3 = dateParser.a(fareProduct.g());
        if (!(a3 == null || (withZoneSameInstant = a3.withZoneSameInstant(ZoneId.systemDefault())) == null)) {
            localDateTime = withZoneSameInstant.toLocalDateTime();
        }
        return new PassCardState(longValue, str, d2, d3, d4, intValue, localDateTime2, localDateTime);
    }
}
