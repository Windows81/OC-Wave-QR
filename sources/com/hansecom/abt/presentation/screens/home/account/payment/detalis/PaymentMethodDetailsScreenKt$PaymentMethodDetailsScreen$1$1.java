package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class PaymentMethodDetailsScreenKt$PaymentMethodDetailsScreen$1$1 extends FunctionReferenceImpl implements Function1<PaymentMethodDetails.Action, Unit> {
    public PaymentMethodDetailsScreenKt$PaymentMethodDetailsScreen$1$1(Object obj) {
        super(1, obj, PaymentMethodDetailsViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((PaymentMethodDetails.Action) obj);
        return Unit.f40552a;
    }

    public final void v(PaymentMethodDetails.Action action) {
        Intrinsics.i(action, "p0");
        ((PaymentMethodDetailsViewModel) this.f40885A).k(action);
    }
}
