package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class p implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38719A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38720B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38721z;

    public /* synthetic */ p(PaymentMethodItem paymentMethodItem, Modifier modifier, Function0 function0, Function2 function2, int i2, int i3) {
        this.f38721z = paymentMethodItem;
        this.f38719A = modifier;
        this.f38720B = function0;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.o(this.f38721z, this.f38719A, this.f38720B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
