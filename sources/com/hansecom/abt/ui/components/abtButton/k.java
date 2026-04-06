package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f37929A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtButtonState f37930B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Integer D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37931z;

    public /* synthetic */ k(Function0 function0, Modifier modifier, AbtButtonState abtButtonState, String str, Integer num, int i2, int i3) {
        this.f37931z = function0;
        this.f37929A = modifier;
        this.f37930B = abtButtonState;
        this.C = str;
        this.D = num;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtSideButtonKt.d(this.f37931z, this.f37929A, this.f37930B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
