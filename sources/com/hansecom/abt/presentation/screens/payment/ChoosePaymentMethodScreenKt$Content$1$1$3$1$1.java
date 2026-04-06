package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ChoosePaymentMethodScreenKt$Content$1$1$3$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f37756A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37757z;

    public ChoosePaymentMethodScreenKt$Content$1$1$3$1$1(Function1 function1, PaymentMethodState.FareMedia fareMedia) {
        this.f37757z = function1;
        this.f37756A = fareMedia;
    }

    public final void b() {
        this.f37757z.invoke(this.f37756A);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
