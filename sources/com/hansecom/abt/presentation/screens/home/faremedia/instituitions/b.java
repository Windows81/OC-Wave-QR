package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36819A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f36820B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionsViewModel f36821z;

    public /* synthetic */ b(InstitutionsViewModel institutionsViewModel, Function0 function0, Function1 function1, int i2, int i3) {
        this.f36821z = institutionsViewModel;
        this.f36819A = function0;
        this.f36820B = function1;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionsScreenKt.e(this.f36821z, this.f36819A, this.f36820B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
