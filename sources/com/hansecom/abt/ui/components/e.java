package com.hansecom.abt.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f38161A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f38162B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38163z;

    public /* synthetic */ e(Modifier modifier, long j2, long j3, Function2 function2, int i2, int i3) {
        this.f38163z = modifier;
        this.f38161A = j2;
        this.f38162B = j3;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ScreenContentKt.g(this.f38163z, this.f38161A, this.f38162B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
