package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f38941A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38942B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f38943z;

    public /* synthetic */ f(boolean z2, Function2 function2, int i2, int i3) {
        this.f38943z = z2;
        this.f38941A = function2;
        this.f38942B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtThemeKt.c(this.f38943z, this.f38941A, this.f38942B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
