package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AddPaymentMethodNmiScreenKt$AddPaymentMethodNmiScreen$1$1 extends FunctionReferenceImpl implements Function1<AddPaymentMethodNmi.Action, Unit> {
    public AddPaymentMethodNmiScreenKt$AddPaymentMethodNmiScreen$1$1(Object obj) {
        super(1, obj, AddPaymentMethodNmiViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((AddPaymentMethodNmi.Action) obj);
        return Unit.f40552a;
    }

    public final void v(AddPaymentMethodNmi.Action action) {
        Intrinsics.i(action, "p0");
        ((AddPaymentMethodNmiViewModel) this.f40885A).k(action);
    }
}
