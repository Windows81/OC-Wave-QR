package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AddPaymentMethodCyberSourceScreenKt$AddPaymentMethodCyberSourceScreen$1$1 extends FunctionReferenceImpl implements Function1<AddPaymentMethodCyberSource.Action, Unit> {
    public AddPaymentMethodCyberSourceScreenKt$AddPaymentMethodCyberSourceScreen$1$1(Object obj) {
        super(1, obj, AddPaymentMethodCyberSourceViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((AddPaymentMethodCyberSource.Action) obj);
        return Unit.f40552a;
    }

    public final void v(AddPaymentMethodCyberSource.Action action) {
        Intrinsics.i(action, "p0");
        ((AddPaymentMethodCyberSourceViewModel) this.f40885A).k(action);
    }
}
