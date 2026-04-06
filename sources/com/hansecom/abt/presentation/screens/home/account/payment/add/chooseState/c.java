package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35751A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35752B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State.ChooseState f35753z;

    public /* synthetic */ c(AddPaymentMethodNmi.State.ChooseState chooseState, Function1 function1, Function0 function0, int i2) {
        this.f35753z = chooseState;
        this.f35751A = function1;
        this.f35752B = function0;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodChooseStateScreenKt.i(this.f35753z, this.f35751A, this.f35752B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
