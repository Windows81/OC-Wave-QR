package com.hansecom.abt.ui.components.checkout;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38088A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38089B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CheckoutItem f38090z;

    public /* synthetic */ b(CheckoutItem checkoutItem, boolean z2, int i2) {
        this.f38090z = checkoutItem;
        this.f38088A = z2;
        this.f38089B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckoutSummaryKt.f(this.f38090z, this.f38088A, this.f38089B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
