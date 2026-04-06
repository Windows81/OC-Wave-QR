package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f38190A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38191B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38192z;

    public /* synthetic */ e(Modifier modifier, float f2, int i2) {
        this.f38192z = modifier;
        this.f38190A = f2;
        this.f38191B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareCappingInProgressCardKt.h(this.f38192z, this.f38190A, this.f38191B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
