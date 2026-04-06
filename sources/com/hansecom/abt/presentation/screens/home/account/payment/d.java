package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35761A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35762B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethods.State f35763z;

    public /* synthetic */ d(PaymentMethods.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, int i2, int i3) {
        this.f35763z = state;
        this.f35761A = function1;
        this.f35762B = flow;
        this.C = function0;
        this.D = function12;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodsScreenKt.v(this.f35763z, this.f35761A, this.f35762B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
