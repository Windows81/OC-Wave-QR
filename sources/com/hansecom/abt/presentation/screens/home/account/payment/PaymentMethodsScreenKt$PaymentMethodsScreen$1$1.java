package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class PaymentMethodsScreenKt$PaymentMethodsScreen$1$1 extends FunctionReferenceImpl implements Function1<PaymentMethods.Action, Unit> {
    public PaymentMethodsScreenKt$PaymentMethodsScreen$1$1(Object obj) {
        super(1, obj, PaymentMethodsViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((PaymentMethods.Action) obj);
        return Unit.f40552a;
    }

    public final void v(PaymentMethods.Action action) {
        Intrinsics.i(action, "p0");
        ((PaymentMethodsViewModel) this.f40885A).k(action);
    }
}
