package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.mapi.models.VirtualFareMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaPurchaseCardKt {
    public static final FareMediaPurchaseCard.RiderType a(VirtualFareMedia virtualFareMedia) {
        Intrinsics.i(virtualFareMedia, "<this>");
        Integer c2 = virtualFareMedia.c();
        int intValue = c2 != null ? c2.intValue() : 0;
        String d2 = virtualFareMedia.d();
        if (d2 == null) {
            d2 = "";
        }
        String str = d2;
        String e2 = virtualFareMedia.e();
        return new FareMediaPurchaseCard.RiderType(intValue, str, e2 != null ? new StringValue.Key(e2, (Integer) null, (List) null, 6, (DefaultConstructorMarker) null) : null, virtualFareMedia.a(), BigDecimalExtKt.c(virtualFareMedia.b()));
    }
}
