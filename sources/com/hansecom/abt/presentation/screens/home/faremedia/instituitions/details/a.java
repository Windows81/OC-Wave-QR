package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36844A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36845B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionDetailsViewModel f36846z;

    public /* synthetic */ a(InstitutionDetailsViewModel institutionDetailsViewModel, Function0 function0, int i2, int i3) {
        this.f36846z = institutionDetailsViewModel;
        this.f36844A = function0;
        this.f36845B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionDetailsScreenKt.e(this.f36846z, this.f36844A, this.f36845B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
