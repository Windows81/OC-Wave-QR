package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class D implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f38599A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38600B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38601z;

    public /* synthetic */ D(Modifier modifier, Function3 function3, int i2) {
        this.f38601z = modifier;
        this.f38599A = function3;
        this.f38600B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PassCardStatusKt.n(this.f38601z, this.f38599A, this.f38600B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
