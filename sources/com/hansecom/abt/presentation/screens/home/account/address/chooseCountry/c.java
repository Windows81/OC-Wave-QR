package com.hansecom.abt.presentation.screens.home.account.address.chooseCountry;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35178A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f35179B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.State.ChooseCountry f35180z;

    public /* synthetic */ c(ChangeAddress.State.ChooseCountry chooseCountry, Function1 function1, int i2) {
        this.f35180z = chooseCountry;
        this.f35178A = function1;
        this.f35179B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeAddressChooseCountryScreenKt.i(this.f35180z, this.f35178A, this.f35179B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
