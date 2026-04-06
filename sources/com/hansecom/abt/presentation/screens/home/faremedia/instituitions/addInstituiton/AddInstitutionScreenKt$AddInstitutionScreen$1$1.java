package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class AddInstitutionScreenKt$AddInstitutionScreen$1$1 extends FunctionReferenceImpl implements Function1<AddInstitution.Action, Unit> {
    public AddInstitutionScreenKt$AddInstitutionScreen$1$1(Object obj) {
        super(1, obj, AddInstitutionViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((AddInstitution.Action) obj);
        return Unit.f40552a;
    }

    public final void v(AddInstitution.Action action) {
        Intrinsics.i(action, "p0");
        ((AddInstitutionViewModel) this.f40885A).k(action);
    }
}
