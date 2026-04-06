package com.hansecom.abt.presentation.screens.home.account.address.chooseState;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ChangeAddressChooseStateScreenKt$ScreenImpl$1$1$2$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35192A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f35193z;

    public ChangeAddressChooseStateScreenKt$ScreenImpl$1$1$2$1$1$1$1(Function1 function1, String str) {
        this.f35193z = function1;
        this.f35192A = str;
    }

    public final void b() {
        this.f35193z.invoke(new ChangeAddress.Action.ChooseState.StateChange(this.f35192A));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
