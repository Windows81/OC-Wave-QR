package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Z implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38354A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38355B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38356z;

    public /* synthetic */ Z(String str, boolean z2, Function1 function1, Modifier modifier, boolean z3, int i2, int i3) {
        this.f38356z = str;
        this.f38354A = z2;
        this.f38355B = function1;
        this.C = modifier;
        this.D = z3;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SwitchFieldKt.e(this.f38356z, this.f38354A, this.f38355B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
