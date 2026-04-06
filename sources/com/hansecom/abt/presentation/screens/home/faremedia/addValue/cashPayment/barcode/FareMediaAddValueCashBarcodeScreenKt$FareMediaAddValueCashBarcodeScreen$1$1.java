package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class FareMediaAddValueCashBarcodeScreenKt$FareMediaAddValueCashBarcodeScreen$1$1 extends FunctionReferenceImpl implements Function1<FareMediaAddValueCashPaymentBarcode.Action, Unit> {
    public FareMediaAddValueCashBarcodeScreenKt$FareMediaAddValueCashBarcodeScreen$1$1(Object obj) {
        super(1, obj, FareMediaAddValueCashPaymentBarcodeViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((FareMediaAddValueCashPaymentBarcode.Action) obj);
        return Unit.f40552a;
    }

    public final void v(FareMediaAddValueCashPaymentBarcode.Action action) {
        Intrinsics.i(action, "p0");
        ((FareMediaAddValueCashPaymentBarcodeViewModel) this.f40885A).k(action);
    }
}
