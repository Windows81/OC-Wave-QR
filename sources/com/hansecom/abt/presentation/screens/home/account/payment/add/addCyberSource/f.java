package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodCyberSource.State f35585A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35586B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f35587z;

    public /* synthetic */ f(PaddingValues paddingValues, AddPaymentMethodCyberSource.State state, Function1 function1, int i2) {
        this.f35587z = paddingValues;
        this.f35585A = state;
        this.f35586B = function1;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodCyberSourceScreenKt.n(this.f35587z, this.f35585A, this.f35586B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
