package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.payment.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0632l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37838A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37839B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethod.State f37840z;

    public /* synthetic */ C0632l(ChoosePaymentMethod.State state, Function0 function0, Function1 function1, int i2) {
        this.f37840z = state;
        this.f37838A = function0;
        this.f37839B = function1;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChoosePaymentMethodScreenKt.z(this.f37840z, this.f37838A, this.f37839B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
