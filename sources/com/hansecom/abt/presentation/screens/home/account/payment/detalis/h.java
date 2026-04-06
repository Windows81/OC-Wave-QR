package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35799A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f35800B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodDetails.State f35801z;

    public /* synthetic */ h(PaymentMethodDetails.State state, Function1 function1, int i2) {
        this.f35801z = state;
        this.f35799A = function1;
        this.f35800B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodDetailsScreenKt.t(this.f35801z, this.f35799A, this.f35800B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
