package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f35855A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeDisplay.State f35856z;

    public /* synthetic */ a(BarcodeDisplay.State state, int i2) {
        this.f35856z = state;
        this.f35855A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeDisplayScreenKt.e(this.f35856z, this.f35855A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
