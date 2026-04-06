package com.hansecom.abt.ui.components.barcode;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f37977A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f37978B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f37979z;

    public /* synthetic */ g(String str, String str2, Function0 function0, int i2) {
        this.f37979z = str;
        this.f37977A = str2;
        this.f37978B = function0;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return BarcodeKt.p(this.f37979z, this.f37977A, this.f37978B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
