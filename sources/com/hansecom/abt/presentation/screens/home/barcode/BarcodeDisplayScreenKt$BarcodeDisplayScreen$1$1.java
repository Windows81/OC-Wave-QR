package com.hansecom.abt.presentation.screens.home.barcode;

import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class BarcodeDisplayScreenKt$BarcodeDisplayScreen$1$1 extends FunctionReferenceImpl implements Function1<BarcodeDisplay.Action, Unit> {
    public BarcodeDisplayScreenKt$BarcodeDisplayScreen$1$1(Object obj) {
        super(1, obj, BarcodeDisplayViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((BarcodeDisplay.Action) obj);
        return Unit.f40552a;
    }

    public final void v(BarcodeDisplay.Action action) {
        Intrinsics.i(action, "p0");
        ((BarcodeDisplayViewModel) this.f40885A).k(action);
    }
}
