package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class o implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38716A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38717B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38718z;

    public /* synthetic */ o(PaymentMethodItem paymentMethodItem, String str, int i2) {
        this.f38718z = paymentMethodItem;
        this.f38716A = str;
        this.f38717B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.m(this.f38718z, this.f38716A, this.f38717B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
