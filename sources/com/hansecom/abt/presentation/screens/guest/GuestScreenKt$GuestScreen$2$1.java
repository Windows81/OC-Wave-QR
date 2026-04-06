package com.hansecom.abt.presentation.screens.guest;

import com.hansecom.abt.presentation.screens.guest.Guest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class GuestScreenKt$GuestScreen$2$1 extends FunctionReferenceImpl implements Function1<Guest.Action, Unit> {
    public GuestScreenKt$GuestScreen$2$1(Object obj) {
        super(1, obj, GuestViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Guest.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Guest.Action action) {
        Intrinsics.i(action, "p0");
        ((GuestViewModel) this.f40885A).k(action);
    }
}
