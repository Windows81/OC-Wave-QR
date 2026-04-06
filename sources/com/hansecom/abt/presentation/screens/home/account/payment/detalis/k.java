package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35805A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f35806B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodDetails.State f35807z;

    public /* synthetic */ k(PaymentMethodDetails.State state, Function1 function1, int i2) {
        this.f35807z = state;
        this.f35805A = function1;
        this.f35806B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodDetailsScreenKt.x(this.f35807z, this.f35805A, this.f35806B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
