package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AutoloadScreenKt$AutoloadScreen$1$1 extends FunctionReferenceImpl implements Function1<Autoload.Action, Unit> {
    public AutoloadScreenKt$AutoloadScreen$1$1(Object obj) {
        super(1, obj, AutoloadViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Autoload.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Autoload.Action action) {
        Intrinsics.i(action, "p0");
        ((AutoloadViewModel) this.f40885A).k(action);
    }
}
