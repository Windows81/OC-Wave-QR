package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ChoosePaymentMethodScreenKt$ChoosePaymentMethodScreen$2$1 extends FunctionReferenceImpl implements Function1<ChoosePaymentMethod.Action, Unit> {
    public ChoosePaymentMethodScreenKt$ChoosePaymentMethodScreen$2$1(Object obj) {
        super(1, obj, ChoosePaymentMethodViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ChoosePaymentMethod.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ChoosePaymentMethod.Action action) {
        Intrinsics.i(action, "p0");
        ((ChoosePaymentMethodViewModel) this.f40885A).k(action);
    }
}
