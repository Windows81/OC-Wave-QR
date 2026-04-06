package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.payment.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0626f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37825A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37826B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethodViewModel f37827z;

    public /* synthetic */ C0626f(ChoosePaymentMethodViewModel choosePaymentMethodViewModel, Function0 function0, Function1 function1, int i2, int i3) {
        this.f37827z = choosePaymentMethodViewModel;
        this.f37825A = function0;
        this.f37826B = function1;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ChoosePaymentMethodScreenKt.q(this.f37827z, this.f37825A, this.f37826B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
