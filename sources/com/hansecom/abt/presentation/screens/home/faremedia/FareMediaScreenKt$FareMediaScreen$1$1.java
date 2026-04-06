package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaScreenKt$FareMediaScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMedia.Action, Unit> {
    public FareMediaScreenKt$FareMediaScreen$1$1(Object obj) {
        super(1, obj, FareMediaViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMedia.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMedia.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaViewModel) this.f40885A).k(action);
    }
}
