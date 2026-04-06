package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaAddValueScreenKt$FareMediaAddValueScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMediaAddValue.Action, Unit> {
    public FareMediaAddValueScreenKt$FareMediaAddValueScreen$1$1(Object obj) {
        super(1, obj, FareMediaAddValueViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaAddValue.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaAddValue.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaAddValueViewModel) this.f40885A).k(action);
    }
}
