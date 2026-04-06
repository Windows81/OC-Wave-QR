package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class u implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38640A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38641B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38642z;

    public /* synthetic */ u(PassOfferCardState passOfferCardState, Function0 function0, Function0 function02, int i2) {
        this.f38642z = passOfferCardState;
        this.f38640A = function0;
        this.f38641B = function02;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return GroupPassOfferCardKt.j(this.f38642z, this.f38640A, this.f38641B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
