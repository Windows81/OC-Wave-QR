package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38183A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38184B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCappingCardState.Concluded f38185z;

    public /* synthetic */ a(FareCappingCardState.Concluded concluded, Modifier modifier, int i2, int i3) {
        this.f38185z = concluded;
        this.f38183A = modifier;
        this.f38184B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareCappingConcludedCardKt.c(this.f38185z, this.f38183A, this.f38184B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
