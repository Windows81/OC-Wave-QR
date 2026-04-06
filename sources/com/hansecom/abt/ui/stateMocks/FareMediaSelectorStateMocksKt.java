package com.hansecom.abt.ui.stateMocks;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaSelectorStateMocksKt {
    public static final PaymentMethodState.FareMedia a(PaymentMethodState.FareMedia.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return new PaymentMethodState.FareMedia("0", StringValueKt.d("Virtual Card"), false, new BigDecimal(String.valueOf(5.0d)), false);
    }
}
