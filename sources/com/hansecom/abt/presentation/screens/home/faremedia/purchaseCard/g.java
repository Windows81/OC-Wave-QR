package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import androidx.compose.ui.focus.FocusManager;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class g implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37210A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusManager f37211z;

    public /* synthetic */ g(FocusManager focusManager, Function1 function1) {
        this.f37211z = focusManager;
        this.f37210A = function1;
    }

    public final Object invoke(Object obj) {
        return FareMediaPurchaseCardScreenKt$ScreenImpl$1.x(this.f37211z, this.f37210A, (BigDecimal) obj);
    }
}
