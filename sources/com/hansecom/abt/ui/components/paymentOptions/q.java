package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class q implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38722A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38723B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38724z;

    public /* synthetic */ q(PaymentMethodItem paymentMethodItem, Modifier modifier, Function0 function0, boolean z2, Function2 function2, Function3 function3, int i2, int i3) {
        this.f38724z = paymentMethodItem;
        this.f38722A = modifier;
        this.f38723B = function0;
        this.C = z2;
        this.D = function2;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.q(this.f38724z, this.f38722A, this.f38723B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
