package com.hansecom.abt.presentation.screens.home.trip;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f37508A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37509B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TripPlannerViewModel f37510z;

    public /* synthetic */ b(TripPlannerViewModel tripPlannerViewModel, Function2 function2, int i2, int i3) {
        this.f37510z = tripPlannerViewModel;
        this.f37508A = function2;
        this.f37509B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TripPlannerScreenKt.g(this.f37510z, this.f37508A, this.f37509B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
