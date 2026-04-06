package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ChangeAddressScreenKt$ChangeAddressScreen$1$1 extends FunctionReferenceImpl implements Function1<ChangeAddress.Action, Unit> {
    public ChangeAddressScreenKt$ChangeAddressScreen$1$1(Object obj) {
        super(1, obj, ChangeAddressViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ChangeAddress.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ChangeAddress.Action action) {
        Intrinsics.i(action, "p0");
        ((ChangeAddressViewModel) this.f40885A).k(action);
    }
}
