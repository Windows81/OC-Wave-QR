package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f37916A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f37917z;

    public /* synthetic */ f(Density density, MutableState mutableState) {
        this.f37917z = density;
        this.f37916A = mutableState;
    }

    public final Object invoke(Object obj) {
        return AbtButtonKt.m(this.f37917z, this.f37916A, (IntSize) obj);
    }
}
