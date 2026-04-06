package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class HelpRequestScreenKt$HelpRequestScreen$1$1 extends FunctionReferenceImpl implements Function1<HelpRequest.Action, Unit> {
    public HelpRequestScreenKt$HelpRequestScreen$1$1(Object obj) {
        super(1, obj, HelpRequestViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((HelpRequest.Action) obj);
        return Unit.f40552a;
    }

    public final void v(HelpRequest.Action action) {
        Intrinsics.i(action, "p0");
        ((HelpRequestViewModel) this.f40885A).k(action);
    }
}
