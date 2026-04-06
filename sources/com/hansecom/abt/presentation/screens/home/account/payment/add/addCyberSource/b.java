package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35576A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f35577B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodCyberSource.State f35578z;

    public /* synthetic */ b(AddPaymentMethodCyberSource.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2) {
        this.f35578z = state;
        this.f35576A = function1;
        this.f35577B = flow;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodCyberSourceScreenKt.r(this.f35578z, this.f35576A, this.f35577B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
