package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class PaymentMethodsScreenKt$Content$1$1$3$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f35506A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f35507z;

    public PaymentMethodsScreenKt$Content$1$1$3$1$1(Function1 function1, PaymentMethodState.CreditCard creditCard) {
        this.f35507z = function1;
        this.f35506A = creditCard;
    }

    public final void b() {
        this.f35507z.invoke(Long.valueOf(this.f35506A.c()));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
