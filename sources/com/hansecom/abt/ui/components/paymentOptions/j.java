package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState f38701A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38702B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38703z;

    public /* synthetic */ j(PaymentMethodItem paymentMethodItem, PaymentMethodState paymentMethodState, Function0 function0, Function2 function2, int i2, int i3) {
        this.f38703z = paymentMethodItem;
        this.f38701A = paymentMethodState;
        this.f38702B = function0;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.k(this.f38703z, this.f38701A, this.f38702B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
