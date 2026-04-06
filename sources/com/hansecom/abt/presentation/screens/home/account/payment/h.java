package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35821A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35822B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodsViewModel f35823z;

    public /* synthetic */ h(PaymentMethodsViewModel paymentMethodsViewModel, Function0 function0, Function1 function1, int i2, int i3) {
        this.f35823z = paymentMethodsViewModel;
        this.f35821A = function0;
        this.f35822B = function1;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodsScreenKt.t(this.f35823z, this.f35821A, this.f35822B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
