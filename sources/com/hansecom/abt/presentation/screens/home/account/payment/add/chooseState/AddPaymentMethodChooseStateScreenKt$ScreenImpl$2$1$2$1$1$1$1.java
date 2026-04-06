package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$1$2$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35742A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f35743z;

    public AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$1$2$1$1$1$1(Function1 function1, String str) {
        this.f35743z = function1;
        this.f35742A = str;
    }

    public final void b() {
        this.f35743z.invoke(new AddPaymentMethodNmi.Action.ChooseState.StateChange(this.f35742A));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
