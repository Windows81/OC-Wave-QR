package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38767A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38768B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38769z;

    public /* synthetic */ f(String str, boolean z2, Function0 function0, Modifier modifier, boolean z3, int i2, int i3) {
        this.f38769z = str;
        this.f38767A = z2;
        this.f38768B = function0;
        this.C = modifier;
        this.D = z3;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return QuickSelectionButtonKt.g(this.f38769z, this.f38767A, this.f38768B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
