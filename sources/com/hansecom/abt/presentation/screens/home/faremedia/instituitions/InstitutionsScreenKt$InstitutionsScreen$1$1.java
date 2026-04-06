package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class InstitutionsScreenKt$InstitutionsScreen$1$1 extends FunctionReferenceImpl implements Function1<Institutions.Action, Unit> {
    public InstitutionsScreenKt$InstitutionsScreen$1$1(Object obj) {
        super(1, obj, InstitutionsViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Institutions.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Institutions.Action action) {
        Intrinsics.i(action, "p0");
        ((InstitutionsViewModel) this.f40885A).k(action);
    }
}
