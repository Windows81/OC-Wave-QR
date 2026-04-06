package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35818A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35819B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethods.State f35820z;

    public /* synthetic */ g(PaymentMethods.State state, Function0 function0, Function1 function1, int i2) {
        this.f35820z = state;
        this.f35818A = function0;
        this.f35819B = function1;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodsScreenKt.o(this.f35820z, this.f35818A, this.f35819B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
