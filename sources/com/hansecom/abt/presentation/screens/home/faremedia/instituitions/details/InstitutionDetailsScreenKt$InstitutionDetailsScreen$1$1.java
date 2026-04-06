package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class InstitutionDetailsScreenKt$InstitutionDetailsScreen$1$1 extends FunctionReferenceImpl implements Function1<InstitutionDetails.Action, Unit> {
    public InstitutionDetailsScreenKt$InstitutionDetailsScreen$1$1(Object obj) {
        super(1, obj, InstitutionDetailsViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((InstitutionDetails.Action) obj);
        return Unit.f40552a;
    }

    public final void v(InstitutionDetails.Action action) {
        Intrinsics.i(action, "p0");
        ((InstitutionDetailsViewModel) this.f40885A).k(action);
    }
}
