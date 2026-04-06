package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AddPassesScreenKt$AddPassesScreen$1$1 extends FunctionReferenceImpl implements Function1<AddPasses.Action, Unit> {
    public AddPassesScreenKt$AddPassesScreen$1$1(Object obj) {
        super(1, obj, AddPassesViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((AddPasses.Action) obj);
        return Unit.f40552a;
    }

    public final void v(AddPasses.Action action) {
        Intrinsics.i(action, "p0");
        ((AddPassesViewModel) this.f40885A).k(action);
    }
}
