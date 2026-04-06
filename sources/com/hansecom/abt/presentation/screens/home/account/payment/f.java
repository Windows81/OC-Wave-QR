package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35815A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35816B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethods.State f35817z;

    public /* synthetic */ f(PaymentMethods.State state, Function1 function1, Function0 function0) {
        this.f35817z = state;
        this.f35815A = function1;
        this.f35816B = function0;
    }

    public final Object invoke(Object obj) {
        return PaymentMethodsScreenKt.l(this.f35817z, this.f35815A, this.f35816B, (LazyListScope) obj);
    }
}
