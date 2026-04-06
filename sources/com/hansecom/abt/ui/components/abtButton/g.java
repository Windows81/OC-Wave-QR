package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f37918A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtButtonStyle f37919B;
    public final /* synthetic */ AbtButtonState C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Integer E;
    public final /* synthetic */ AbtButtonIconPosition F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37920z;

    public /* synthetic */ g(Function0 function0, Modifier modifier, AbtButtonStyle abtButtonStyle, AbtButtonState abtButtonState, String str, Integer num, AbtButtonIconPosition abtButtonIconPosition, int i2, int i3) {
        this.f37920z = function0;
        this.f37918A = modifier;
        this.f37919B = abtButtonStyle;
        this.C = abtButtonState;
        this.D = str;
        this.E = num;
        this.F = abtButtonIconPosition;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtButtonKt.n(this.f37920z, this.f37918A, this.f37919B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
