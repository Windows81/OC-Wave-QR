package com.hansecom.abt.ui.components.institution;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.InstitutionState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InstitutionState f38439A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38440B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38441z;

    public /* synthetic */ b(Modifier modifier, InstitutionState institutionState, Function0 function0, int i2, int i3) {
        this.f38441z = modifier;
        this.f38439A = institutionState;
        this.f38440B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionCardKt.c(this.f38441z, this.f38439A, this.f38440B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
