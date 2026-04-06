package com.hansecom.abt.presentation.screens.home.more;

import com.hansecom.abt.presentation.screens.home.more.More;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class MoreScreenKt$MoreScreen$1$1 extends FunctionReferenceImpl implements Function1<More.Action, Unit> {
    public MoreScreenKt$MoreScreen$1$1(Object obj) {
        super(1, obj, MoreViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((More.Action) obj);
        return Unit.f40552a;
    }

    public final void v(More.Action action) {
        Intrinsics.i(action, "p0");
        ((MoreViewModel) this.f40885A).k(action);
    }
}
