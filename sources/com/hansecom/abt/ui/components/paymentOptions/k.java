package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38704A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f38705B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodItem f38706z;

    public /* synthetic */ k(PaymentMethodItem paymentMethodItem, Modifier modifier, PaymentMethodState.FareMedia fareMedia, Function0 function0, boolean z2, Function2 function2, int i2, int i3) {
        this.f38706z = paymentMethodItem;
        this.f38704A = modifier;
        this.f38705B = fareMedia;
        this.C = function0;
        this.D = z2;
        this.E = function2;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodItem.u(this.f38706z, this.f38704A, this.f38705B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
