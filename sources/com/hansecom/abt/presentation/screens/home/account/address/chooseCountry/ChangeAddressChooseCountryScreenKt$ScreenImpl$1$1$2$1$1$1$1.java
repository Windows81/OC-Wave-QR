package com.hansecom.abt.presentation.screens.home.account.address.chooseCountry;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ChangeAddressChooseCountryScreenKt$ScreenImpl$1$1$2$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35169A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f35170z;

    public ChangeAddressChooseCountryScreenKt$ScreenImpl$1$1$2$1$1$1$1(Function1 function1, String str) {
        this.f35170z = function1;
        this.f35169A = str;
    }

    public final void b() {
        this.f35170z.invoke(new ChangeAddress.Action.ChooseCountry.CountryChange(this.f35169A));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
