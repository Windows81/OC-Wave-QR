package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class t implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38637A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f38638B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38639z;

    public /* synthetic */ t(PassOfferCardState passOfferCardState, Modifier modifier, String str, Function0 function0, Function0 function02, Function0 function03, int i2, int i3) {
        this.f38639z = passOfferCardState;
        this.f38637A = modifier;
        this.f38638B = str;
        this.C = function0;
        this.D = function02;
        this.E = function03;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return GroupPassOfferCardKt.f(this.f38639z, this.f38637A, this.f38638B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
