package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class I implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f37806A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37807B;
    public final /* synthetic */ List C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState f37808z;

    public /* synthetic */ I(PaymentMethodState paymentMethodState, List list, Function1 function1, List list2, String str, Function3 function3, Function3 function32, Function3 function33, int i2, int i3) {
        this.f37808z = paymentMethodState;
        this.f37806A = list;
        this.f37807B = function1;
        this.C = list2;
        this.D = str;
        this.E = function3;
        this.F = function32;
        this.G = function33;
        this.H = i2;
        this.I = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodSelectorKt.m(this.f37808z, this.f37806A, this.f37807B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
