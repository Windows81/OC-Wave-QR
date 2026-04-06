package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ChoosePaymentMethodScreenKt$Content$1$1$11$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState f37754A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37755z;

    public ChoosePaymentMethodScreenKt$Content$1$1$11$1$1(Function1 function1, PaymentMethodState paymentMethodState) {
        this.f37755z = function1;
        this.f37754A = paymentMethodState;
    }

    public final void b() {
        this.f37755z.invoke(this.f37754A);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
