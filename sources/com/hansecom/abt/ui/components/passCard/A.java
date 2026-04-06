package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class A implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f38578A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f38579B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCardState f38580z;

    public /* synthetic */ A(PassCardState passCardState, Function1 function1, Modifier modifier, int i2, int i3) {
        this.f38580z = passCardState;
        this.f38578A = function1;
        this.f38579B = modifier;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PassCardStatusKt.l(this.f38580z, this.f38578A, this.f38579B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
