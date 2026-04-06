package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35792A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35793B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodDetails.State f35794z;

    public /* synthetic */ c(PaymentMethodDetails.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2) {
        this.f35794z = state;
        this.f35792A = function1;
        this.f35793B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodDetailsScreenKt.C(this.f35794z, this.f35792A, this.f35793B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
