package com.hansecom.abt.presentation.screens.home;

import com.hansecom.abt.presentation.screens.home.Home;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class HomeScreenKt$HomeScreen$2$1 extends FunctionReferenceImpl implements Function1<Home.Action, Unit> {
    public HomeScreenKt$HomeScreen$2$1(Object obj) {
        super(1, obj, HomeViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Home.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Home.Action action) {
        Intrinsics.i(action, "p0");
        ((HomeViewModel) this.f40885A).k(action);
    }
}
