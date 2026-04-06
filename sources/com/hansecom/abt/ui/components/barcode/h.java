package com.hansecom.abt.ui.components.barcode;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37980A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f37981B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f37982z;

    public /* synthetic */ h(Density density, Function1 function1, MutableState mutableState) {
        this.f37982z = density;
        this.f37980A = function1;
        this.f37981B = mutableState;
    }

    public final Object invoke(Object obj) {
        return BarcodeKt$Barcode$1$1.f(this.f37982z, this.f37980A, this.f37981B, (IntSize) obj);
    }
}
