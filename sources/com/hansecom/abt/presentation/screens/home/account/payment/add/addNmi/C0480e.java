package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0480e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35687A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35688B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State f35689z;

    public /* synthetic */ C0480e(AddPaymentMethodNmi.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2) {
        this.f35689z = state;
        this.f35687A = function1;
        this.f35688B = flow;
        this.C = function0;
        this.D = function02;
        this.E = function03;
        this.F = function04;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodNmiScreenKt.K(this.f35689z, this.f35687A, this.f35688B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
