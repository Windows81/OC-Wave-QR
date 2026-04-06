package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class n implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f38713A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38714B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38715z;

    public /* synthetic */ n(PaymentMethodItem paymentMethodItem, PaymentMethodState.CreditCard creditCard, Modifier modifier, Function0 function0, Function2 function2, int i2, int i3) {
        this.f38715z = paymentMethodItem;
        this.f38713A = creditCard;
        this.f38714B = modifier;
        this.C = function0;
        this.D = function2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.s(this.f38715z, this.f38713A, this.f38714B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
