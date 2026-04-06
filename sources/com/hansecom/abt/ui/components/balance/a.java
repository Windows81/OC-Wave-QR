package com.hansecom.abt.ui.components.balance;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f37955A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37956B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f37957z;

    public /* synthetic */ a(Modifier modifier, String str, int i2, int i3) {
        this.f37957z = modifier;
        this.f37955A = str;
        this.f37956B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BalanceKt.c(this.f37957z, this.f37955A, this.f37956B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
