package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class F implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BigDecimal f38605A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f38606B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38607z;

    public /* synthetic */ F(String str, BigDecimal bigDecimal, boolean z2, int i2) {
        this.f38607z = str;
        this.f38605A = bigDecimal;
        this.f38606B = z2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PassOfferCardKt.l(this.f38607z, this.f38605A, this.f38606B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
