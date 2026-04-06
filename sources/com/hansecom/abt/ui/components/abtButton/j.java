package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Painter f37926A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f37927B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37928z;

    public /* synthetic */ j(Function0 function0, Painter painter, String str, Modifier modifier, boolean z2, int i2, int i3) {
        this.f37928z = function0;
        this.f37926A = painter;
        this.f37927B = str;
        this.C = modifier;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtIconButtonKt.c(this.f37928z, this.f37926A, this.f37927B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
