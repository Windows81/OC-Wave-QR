package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f38698A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f38699B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38700z;

    public /* synthetic */ i(String str, long j2, long j3, Modifier modifier, int i2, int i3) {
        this.f38700z = str;
        this.f38698A = j2;
        this.f38699B = j3;
        this.C = modifier;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodBadgeKt.c(this.f38700z, this.f38698A, this.f38699B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
