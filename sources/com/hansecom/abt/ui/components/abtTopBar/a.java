package com.hansecom.abt.ui.components.abtTopBar;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f37946A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f37947B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f37948z;

    public /* synthetic */ a(String str, Modifier modifier, Function0 function0, Function3 function3, boolean z2, int i2, int i3) {
        this.f37948z = str;
        this.f37946A = modifier;
        this.f37947B = function0;
        this.C = function3;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtTopBarKt.c(this.f37948z, this.f37946A, this.f37947B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
