package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class m implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RowScope f38710A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f38711B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38712z;

    public /* synthetic */ m(PaymentMethodItem paymentMethodItem, RowScope rowScope, Function3 function3, int i2) {
        this.f38712z = paymentMethodItem;
        this.f38710A = rowScope;
        this.f38711B = function3;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.A(this.f38712z, this.f38710A, this.f38711B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
