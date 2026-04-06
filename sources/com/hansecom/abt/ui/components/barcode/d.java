package com.hansecom.abt.ui.components.barcode;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37970A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37971B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeState f37972z;

    public /* synthetic */ d(BarcodeState barcodeState, Function1 function1, int i2) {
        this.f37972z = barcodeState;
        this.f37970A = function1;
        this.f37971B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeKt.l(this.f37972z, this.f37970A, this.f37971B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
