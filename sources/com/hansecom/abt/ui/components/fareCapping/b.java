package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38186A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38187B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCappingCardState.InProgress f38188z;

    public /* synthetic */ b(FareCappingCardState.InProgress inProgress, Modifier modifier, int i2, int i3) {
        this.f38188z = inProgress;
        this.f38186A = modifier;
        this.f38187B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareCappingInProgressCardKt.f(this.f38188z, this.f38186A, this.f38187B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
