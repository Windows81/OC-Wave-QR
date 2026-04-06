package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f38707A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38708B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38709z;

    public /* synthetic */ l(PaymentMethodItem paymentMethodItem, Function3 function3, int i2) {
        this.f38709z = paymentMethodItem;
        this.f38707A = function3;
        this.f38708B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.y(this.f38709z, this.f38707A, this.f38708B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
