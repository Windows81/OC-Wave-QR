package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class PassCheckoutScreenKt$PassCheckoutScreen$1$1 extends FunctionReferenceImpl implements Function1<PassCheckout.Action, Unit> {
    public PassCheckoutScreenKt$PassCheckoutScreen$1$1(Object obj) {
        super(1, obj, PassCheckoutViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((PassCheckout.Action) obj);
        return Unit.f40552a;
    }

    public final void v(PassCheckout.Action action) {
        Intrinsics.i(action, "p0");
        ((PassCheckoutViewModel) this.f40885A).k(action);
    }
}
