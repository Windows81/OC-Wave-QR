package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36893A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36894B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionsSearchViewModel f36895z;

    public /* synthetic */ b(InstitutionsSearchViewModel institutionsSearchViewModel, Function1 function1, Function0 function0, int i2, int i3) {
        this.f36895z = institutionsSearchViewModel;
        this.f36893A = function1;
        this.f36894B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionsSearchScreenKt.e(this.f36895z, this.f36893A, this.f36894B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
