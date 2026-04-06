package com.hansecom.abt.presentation.screens.home.account.address.chooseCountry;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35182A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.State.ChooseCountry f35183z;

    public /* synthetic */ e(ChangeAddress.State.ChooseCountry chooseCountry, Function1 function1) {
        this.f35183z = chooseCountry;
        this.f35182A = function1;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressChooseCountryScreenKt$ScreenImpl$1.g(this.f35183z, this.f35182A, (LazyListScope) obj);
    }
}
