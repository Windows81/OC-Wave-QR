package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36146A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f36147B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueCashPaymentBarcodeViewModel f36148z;

    public /* synthetic */ d(FareMediaAddValueCashPaymentBarcodeViewModel fareMediaAddValueCashPaymentBarcodeViewModel, Function0 function0, Function2 function2, int i2, int i3) {
        this.f36148z = fareMediaAddValueCashPaymentBarcodeViewModel;
        this.f36146A = function0;
        this.f36147B = function2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaAddValueCashBarcodeScreenKt.e(this.f36148z, this.f36146A, this.f36147B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
