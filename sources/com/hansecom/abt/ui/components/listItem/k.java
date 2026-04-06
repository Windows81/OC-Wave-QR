package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f38513A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Painter f38514B;
    public final /* synthetic */ Painter C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38515z;

    public /* synthetic */ k(String str, Modifier modifier, Painter painter, Painter painter2, boolean z2, boolean z3, Function3 function3, int i2, int i3) {
        this.f38515z = str;
        this.f38513A = modifier;
        this.f38514B = painter;
        this.C = painter2;
        this.D = z2;
        this.E = z3;
        this.F = function3;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return GroupMenuItemKt.g(this.f38515z, this.f38513A, this.f38514B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
