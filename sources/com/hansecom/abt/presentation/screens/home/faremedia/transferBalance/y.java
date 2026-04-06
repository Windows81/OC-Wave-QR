package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class y implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f37364z;

    public /* synthetic */ y(PaymentMethodState.FareMedia fareMedia) {
        this.f37364z = fareMedia;
    }

    public final Object invoke(Object obj) {
        return TransferBalanceViewModel.I(this.f37364z, (TransferBalance.State) obj);
    }
}
