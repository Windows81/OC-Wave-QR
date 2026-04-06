package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareCappingScreenKt$FareCappingScreen$1$1 extends FunctionReferenceImpl implements Function1<FareCapping.Action, Unit> {
    public FareCappingScreenKt$FareCappingScreen$1$1(Object obj) {
        super(1, obj, FareCappingViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareCapping.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareCapping.Action action) {
        Intrinsics.i(action, "p0");
        ((FareCappingViewModel) this.f40885A).k(action);
    }
}
