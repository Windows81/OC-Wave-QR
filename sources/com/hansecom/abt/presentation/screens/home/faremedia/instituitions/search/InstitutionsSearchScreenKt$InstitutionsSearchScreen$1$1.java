package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class InstitutionsSearchScreenKt$InstitutionsSearchScreen$1$1 extends FunctionReferenceImpl implements Function1<InstitutionsSearch.Action, Unit> {
    public InstitutionsSearchScreenKt$InstitutionsSearchScreen$1$1(Object obj) {
        super(1, obj, InstitutionsSearchViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((InstitutionsSearch.Action) obj);
        return Unit.f40552a;
    }

    public final void v(InstitutionsSearch.Action action) {
        Intrinsics.i(action, "p0");
        ((InstitutionsSearchViewModel) this.f40885A).k(action);
    }
}
