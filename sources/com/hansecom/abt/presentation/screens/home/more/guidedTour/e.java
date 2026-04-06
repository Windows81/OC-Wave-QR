package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37464A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37465B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GuidedTourViewModel f37466z;

    public /* synthetic */ e(GuidedTourViewModel guidedTourViewModel, Function0 function0, int i2, int i3) {
        this.f37466z = guidedTourViewModel;
        this.f37464A = function0;
        this.f37465B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return GuidedTourScreenKt.i(this.f37466z, this.f37464A, this.f37465B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
