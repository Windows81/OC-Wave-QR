package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35731A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State.ChooseCountry f35732z;

    public /* synthetic */ e(AddPaymentMethodNmi.State.ChooseCountry chooseCountry, Function1 function1) {
        this.f35732z = chooseCountry;
        this.f35731A = function1;
    }

    public final Object invoke(Object obj) {
        return AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2.g(this.f35732z, this.f35731A, (LazyListScope) obj);
    }
}
