package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36149A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f36150B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueCashPaymentBarcode.State f36151z;

    public /* synthetic */ e(FareMediaAddValueCashPaymentBarcode.State state, Function1 function1, Flow flow, Function0 function0, Function2 function2, int i2) {
        this.f36151z = state;
        this.f36149A = function1;
        this.f36150B = flow;
        this.C = function0;
        this.D = function2;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaAddValueCashBarcodeScreenKt.g(this.f36151z, this.f36149A, this.f36150B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
