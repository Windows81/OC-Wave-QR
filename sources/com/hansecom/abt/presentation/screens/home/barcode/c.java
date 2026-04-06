package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35860A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35861B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeDisplayViewModel f35862z;

    public /* synthetic */ c(BarcodeDisplayViewModel barcodeDisplayViewModel, Function0 function0, Function0 function02, int i2, int i3) {
        this.f35862z = barcodeDisplayViewModel;
        this.f35860A = function0;
        this.f35861B = function02;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeDisplayScreenKt.h(this.f35862z, this.f35860A, this.f35861B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
