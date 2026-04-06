package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class A implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38445A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38446B;
    public final /* synthetic */ Painter C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38447z;

    public /* synthetic */ A(String str, Function1 function1, Modifier modifier, Painter painter, boolean z2, boolean z3, boolean z4, int i2, int i3) {
        this.f38447z = str;
        this.f38445A = function1;
        this.f38446B = modifier;
        this.C = painter;
        this.D = z2;
        this.E = z3;
        this.F = z4;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SwitchMenuItemKt.c(this.f38447z, this.f38445A, this.f38446B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
