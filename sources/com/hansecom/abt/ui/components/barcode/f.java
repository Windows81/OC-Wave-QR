package com.hansecom.abt.ui.components.barcode;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37974A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37975B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeState f37976z;

    public /* synthetic */ f(BarcodeState barcodeState, Function0 function0, int i2) {
        this.f37976z = barcodeState;
        this.f37974A = function0;
        this.f37975B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeKt.n(this.f37976z, this.f37974A, this.f37975B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
