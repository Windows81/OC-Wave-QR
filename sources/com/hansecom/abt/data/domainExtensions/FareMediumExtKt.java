package com.hansecom.abt.data.domainExtensions;

import com.hansecom.abt.util.formatters.CardNumberValueFormater;
import com.hansecom.mapi.models.FareMedium;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediumExtKt {
    public static final String a(FareMedium fareMedium) {
        Intrinsics.i(fareMedium, "<this>");
        String k2 = fareMedium.k();
        return k2 == null ? CardNumberValueFormater.f39044a.a(fareMedium.f()) : k2;
    }

    public static final boolean b(FareMedium fareMedium) {
        Intrinsics.i(fareMedium, "<this>");
        return Intrinsics.d(fareMedium.f(), "");
    }
}
