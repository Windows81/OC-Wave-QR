package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class s implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f38533A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f38534B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38535z;

    public /* synthetic */ s(Modifier modifier, float f2, PaddingValues paddingValues, boolean z2, Function3 function3, int i2, int i3) {
        this.f38535z = modifier;
        this.f38533A = f2;
        this.f38534B = paddingValues;
        this.C = z2;
        this.D = function3;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuItemKt.r(this.f38535z, this.f38533A, this.f38534B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
