package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0479d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State f35684A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35685B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f35686z;

    public /* synthetic */ C0479d(PaddingValues paddingValues, AddPaymentMethodNmi.State state, Function1 function1, Function0 function0, Function0 function02, int i2) {
        this.f35686z = paddingValues;
        this.f35684A = state;
        this.f35685B = function1;
        this.C = function0;
        this.D = function02;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodNmiScreenKt.F(this.f35686z, this.f35684A, this.f35685B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
