package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38235A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38236B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38237z;

    public /* synthetic */ f(String str, Modifier modifier, int i2, int i3) {
        this.f38237z = str;
        this.f38235A = modifier;
        this.f38236B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaTransferCardKt.c(this.f38237z, this.f38235A, this.f38236B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
