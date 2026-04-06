package com.hansecom.abt.ui.components.institution;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.InstitutionState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InstitutionState f38442A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38443B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38444z;

    public /* synthetic */ c(Modifier modifier, InstitutionState institutionState, boolean z2, int i2, int i3) {
        this.f38444z = modifier;
        this.f38442A = institutionState;
        this.f38443B = z2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return InstitutionDetailsCardKt.c(this.f38444z, this.f38442A, this.f38443B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
