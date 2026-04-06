package com.hansecom.abt.presentation.screens.home.account.address.chooseState;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35201A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f35202B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.State.ChooseState f35203z;

    public /* synthetic */ c(ChangeAddress.State.ChooseState chooseState, Function1 function1, int i2) {
        this.f35203z = chooseState;
        this.f35201A = function1;
        this.f35202B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChangeAddressChooseStateScreenKt.i(this.f35203z, this.f35201A, this.f35202B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
