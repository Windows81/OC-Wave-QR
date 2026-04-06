package com.hansecom.abt.presentation.screens.home.account.address.chooseState;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35205A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.State.ChooseState f35206z;

    public /* synthetic */ e(ChangeAddress.State.ChooseState chooseState, Function1 function1) {
        this.f35206z = chooseState;
        this.f35205A = function1;
    }

    public final Object invoke(Object obj) {
        return ChangeAddressChooseStateScreenKt$ScreenImpl$1.g(this.f35206z, this.f35205A, (LazyListScope) obj);
    }
}
