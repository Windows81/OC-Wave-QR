package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35727A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35728B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State.ChooseCountry f35729z;

    public /* synthetic */ c(AddPaymentMethodNmi.State.ChooseCountry chooseCountry, Function1 function1, Function0 function0, int i2) {
        this.f35729z = chooseCountry;
        this.f35727A = function1;
        this.f35728B = function0;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodChooseCountryScreenKt.i(this.f35729z, this.f35727A, this.f35728B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
