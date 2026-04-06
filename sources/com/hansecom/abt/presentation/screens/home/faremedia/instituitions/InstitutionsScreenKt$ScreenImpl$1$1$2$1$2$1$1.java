package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import com.hansecom.abt.presentation.model.InstitutionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class InstitutionsScreenKt$ScreenImpl$1$1$2$1$2$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InstitutionState f36778A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f36779z;

    public InstitutionsScreenKt$ScreenImpl$1$1$2$1$2$1$1(Function1 function1, InstitutionState institutionState) {
        this.f36779z = function1;
        this.f36778A = institutionState;
    }

    public final void b() {
        this.f36779z.invoke(Integer.valueOf(this.f36778A.a()));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
