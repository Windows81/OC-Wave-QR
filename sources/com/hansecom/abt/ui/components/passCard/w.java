package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class w implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38646A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38647B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38648z;

    public /* synthetic */ w(PassOfferCardState passOfferCardState, Modifier modifier, int i2, int i3) {
        this.f38648z = passOfferCardState;
        this.f38646A = modifier;
        this.f38647B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return GroupPassOfferCardKt.h(this.f38648z, this.f38646A, this.f38647B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
