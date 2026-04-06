package com.hansecom.abt.presentation.screens.main.debugMenu;

import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class DebugMenuDialogKt$DebugMenuDialog$1$1 extends FunctionReferenceImpl implements Function1<DebugMenu.Action, Unit> {
    public DebugMenuDialogKt$DebugMenuDialog$1$1(Object obj) {
        super(1, obj, DebugMenuViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((DebugMenu.Action) obj);
        return Unit.f40552a;
    }

    public final void v(DebugMenu.Action action) {
        Intrinsics.i(action, "p0");
        ((DebugMenuViewModel) this.f40885A).k(action);
    }
}
