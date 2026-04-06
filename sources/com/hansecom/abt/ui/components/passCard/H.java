package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class H implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38619A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38620B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38621z;

    public /* synthetic */ H(PassOfferCardState passOfferCardState, Modifier modifier, int i2, int i3) {
        this.f38621z = passOfferCardState;
        this.f38619A = modifier;
        this.f38620B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PassOfferCardKt.j(this.f38621z, this.f38619A, this.f38620B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
