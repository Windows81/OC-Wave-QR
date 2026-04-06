package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class t implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f37703A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37704B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MainViewModel f37705z;

    public /* synthetic */ t(MainViewModel mainViewModel, int i2, int i3) {
        this.f37705z = mainViewModel;
        this.f37703A = i2;
        this.f37704B = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MainScreenKt.l(this.f37705z, this.f37703A, this.f37704B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
