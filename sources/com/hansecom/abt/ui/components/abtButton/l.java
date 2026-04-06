package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Integer f37932A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37933B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f37934z;

    public /* synthetic */ l(String str, Integer num, int i2) {
        this.f37934z = str;
        this.f37932A = num;
        this.f37933B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtSideButtonKt.f(this.f37934z, this.f37932A, this.f37933B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
