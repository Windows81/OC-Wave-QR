package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f37914A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtButtonStyle f37915z;

    public /* synthetic */ e(AbtButtonStyle abtButtonStyle, int i2) {
        this.f37915z = abtButtonStyle;
        this.f37914A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtButtonKt.y(this.f37915z, this.f37914A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
