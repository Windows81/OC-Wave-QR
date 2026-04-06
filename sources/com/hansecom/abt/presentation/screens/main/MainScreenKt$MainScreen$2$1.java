package com.hansecom.abt.presentation.screens.main;

import com.hansecom.abt.presentation.screens.main.Main;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class MainScreenKt$MainScreen$2$1 extends FunctionReferenceImpl implements Function1<Main.Action, Unit> {
    public MainScreenKt$MainScreen$2$1(Object obj) {
        super(1, obj, MainViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Main.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Main.Action action) {
        Intrinsics.i(action, "p0");
        ((MainViewModel) this.f40885A).k(action);
    }
}
