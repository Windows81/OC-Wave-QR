package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaPassesScreenKt$FareMediaPassesScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMediaPasses.Action, Unit> {
    public FareMediaPassesScreenKt$FareMediaPassesScreen$1$1(Object obj) {
        super(1, obj, FareMediaPassesViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaPasses.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaPasses.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaPassesViewModel) this.f40885A).k(action);
    }
}
