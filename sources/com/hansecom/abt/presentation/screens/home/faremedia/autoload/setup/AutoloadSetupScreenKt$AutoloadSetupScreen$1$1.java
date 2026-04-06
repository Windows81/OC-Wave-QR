package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AutoloadSetupScreenKt$AutoloadSetupScreen$1$1 extends FunctionReferenceImpl implements Function1<AutoloadSetup.Action, Unit> {
    public AutoloadSetupScreenKt$AutoloadSetupScreen$1$1(Object obj) {
        super(1, obj, AutoloadSetupViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((AutoloadSetup.Action) obj);
        return Unit.f40552a;
    }

    public final void v(AutoloadSetup.Action action) {
        Intrinsics.i(action, "p0");
        ((AutoloadSetupViewModel) this.f40885A).k(action);
    }
}
