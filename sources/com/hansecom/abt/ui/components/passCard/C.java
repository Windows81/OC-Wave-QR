package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38583A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f38584B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38585z;

    public /* synthetic */ C(Modifier modifier, boolean z2, Function1 function1, int i2) {
        this.f38585z = modifier;
        this.f38583A = z2;
        this.f38584B = function1;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PassCardStatusKt.g(this.f38585z, this.f38583A, this.f38584B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
