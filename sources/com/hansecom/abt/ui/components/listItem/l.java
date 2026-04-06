package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38516A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Painter f38517B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ Painter D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38518z;

    public /* synthetic */ l(String str, Function0 function0, Painter painter, Modifier modifier, Painter painter2, int i2, int i3) {
        this.f38518z = str;
        this.f38516A = function0;
        this.f38517B = painter;
        this.C = modifier;
        this.D = painter2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemCardKt.c(this.f38518z, this.f38516A, this.f38517B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
