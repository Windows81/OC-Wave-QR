package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.hansecom.abt.presentation.screens.payment.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0630j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37832A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37833B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethod.State f37834z;

    public /* synthetic */ C0630j(ChoosePaymentMethod.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, int i2) {
        this.f37834z = state;
        this.f37832A = function1;
        this.f37833B = flow;
        this.C = function0;
        this.D = function12;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChoosePaymentMethodScreenKt.F(this.f37834z, this.f37832A, this.f37833B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
