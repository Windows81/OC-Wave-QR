package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class r implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38725A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38726B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38727z;

    public /* synthetic */ r(PaymentMethodItem paymentMethodItem, Modifier modifier, Function0 function0, Function2 function2, int i2, int i3) {
        this.f38727z = paymentMethodItem;
        this.f38725A = modifier;
        this.f38726B = function0;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.w(this.f38727z, this.f38725A, this.f38726B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
