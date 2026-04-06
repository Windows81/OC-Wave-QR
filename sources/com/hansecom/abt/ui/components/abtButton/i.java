package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f37923A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37924B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f37925z;

    public /* synthetic */ i(Modifier modifier, int i2, int i3) {
        this.f37925z = modifier;
        this.f37923A = i2;
        this.f37924B = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtButtonKt.t(this.f37925z, this.f37923A, this.f37924B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
