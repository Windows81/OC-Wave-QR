package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class E implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38602A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f38603B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38604z;

    public /* synthetic */ E(PassOfferCardState passOfferCardState, Modifier modifier, String str, Function0 function0, int i2, int i3) {
        this.f38604z = passOfferCardState;
        this.f38602A = modifier;
        this.f38603B = str;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PassOfferCardKt.f(this.f38604z, this.f38602A, this.f38603B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
