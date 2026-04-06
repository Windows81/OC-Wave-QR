package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class PaymentMethodsViewModel$1$2$2$1 implements Function1<PaymentMethods.State, PaymentMethods.State> {

    /* renamed from: z  reason: collision with root package name */
    public static final PaymentMethodsViewModel$1$2$2$1 f35525z = new PaymentMethodsViewModel$1$2$2$1();

    /* renamed from: b */
    public final PaymentMethods.State invoke(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethods.State.b(state, false, false, false, (ImmutableList) null, (Integer) null, 26, (Object) null);
    }
}
