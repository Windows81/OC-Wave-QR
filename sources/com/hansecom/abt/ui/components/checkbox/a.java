package com.hansecom.abt.ui.components.checkbox;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38078A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38079B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f38080z;

    public /* synthetic */ a(boolean z2, Function1 function1, Modifier modifier, boolean z3, int i2, int i3) {
        this.f38080z = z2;
        this.f38078A = function1;
        this.f38079B = modifier;
        this.C = z3;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtCheckBoxKt.c(this.f38080z, this.f38078A, this.f38079B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
