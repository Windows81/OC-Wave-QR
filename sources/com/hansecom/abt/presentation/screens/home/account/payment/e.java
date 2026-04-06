package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Integer f35812A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f35813B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f35814z;

    public /* synthetic */ e(boolean z2, Integer num, boolean z3, Function0 function0, int i2) {
        this.f35814z = z2;
        this.f35812A = num;
        this.f35813B = z3;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodsScreenKt.q(this.f35814z, this.f35812A, this.f35813B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
