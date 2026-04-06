package com.hansecom.abt.data.domainExtensions;

import com.hansecom.abt.util.DateParser;
import com.hansecom.mapi.models.CappingPot;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CappingPotExtKt {
    public static final boolean a(CappingPot cappingPot) {
        Intrinsics.i(cappingPot, "<this>");
        ZonedDateTime now = ZonedDateTime.now();
        return now.isAfter(b(cappingPot)) && now.isBefore(c(cappingPot));
    }

    public static final ZonedDateTime b(CappingPot cappingPot) {
        Intrinsics.i(cappingPot, "<this>");
        ZonedDateTime a2 = DateParser.f39003a.a(cappingPot.f());
        if (a2 != null) {
            return a2.withZoneSameInstant(ZoneId.systemDefault());
        }
        return null;
    }

    public static final ZonedDateTime c(CappingPot cappingPot) {
        Intrinsics.i(cappingPot, "<this>");
        ZonedDateTime a2 = DateParser.f39003a.a(cappingPot.g());
        if (a2 != null) {
            return a2.withZoneSameInstant(ZoneId.systemDefault());
        }
        return null;
    }

    public static final boolean d(CappingPot cappingPot) {
        Intrinsics.i(cappingPot, "<this>");
        return Intrinsics.d(cappingPot.b(), cappingPot.a());
    }
}
