package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38695A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38696B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f38697z;

    public /* synthetic */ h(PaymentMethodState.FareMedia fareMedia, Modifier modifier, int i2, int i3) {
        this.f38697z = fareMedia;
        this.f38695A = modifier;
        this.f38696B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaPaymentMethodItemKt.e(this.f38697z, this.f38695A, this.f38696B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
