package com.hansecom.abt.ui.components.progress;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f38734A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f38735B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38736z;

    public /* synthetic */ d(Modifier modifier, long j2, float f2, long j3, int i2, int i3, int i4) {
        this.f38736z = modifier;
        this.f38734A = j2;
        this.f38735B = f2;
        this.C = j3;
        this.D = i2;
        this.E = i3;
        this.F = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtCircularProgressIndicatorKt.i(this.f38736z, this.f38734A, this.f38735B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
