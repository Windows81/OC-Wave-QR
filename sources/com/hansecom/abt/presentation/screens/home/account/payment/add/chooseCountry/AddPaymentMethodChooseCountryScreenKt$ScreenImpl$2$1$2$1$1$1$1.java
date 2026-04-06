package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2$1$2$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35718A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f35719z;

    public AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2$1$2$1$1$1$1(Function1 function1, String str) {
        this.f35719z = function1;
        this.f35718A = str;
    }

    public final void b() {
        this.f35719z.invoke(new AddPaymentMethodNmi.Action.ChooseCountry.CountryChange(this.f35718A));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
