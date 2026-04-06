package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class p implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38526A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f38527B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Painter E;
    public final /* synthetic */ Painter F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ String J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38528z;

    public /* synthetic */ p(String str, Modifier modifier, float f2, PaddingValues paddingValues, Function0 function0, Painter painter, Painter painter2, boolean z2, boolean z3, boolean z4, String str2, int i2, int i3, int i4) {
        this.f38528z = str;
        this.f38526A = modifier;
        this.f38527B = f2;
        this.C = paddingValues;
        this.D = function0;
        this.E = painter;
        this.F = painter2;
        this.G = z2;
        this.H = z3;
        this.I = z4;
        this.J = str2;
        this.K = i2;
        this.L = i3;
        this.M = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemKt.t(this.f38528z, this.f38526A, this.f38527B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (Composer) obj, ((Integer) obj2).intValue());
    }
}
