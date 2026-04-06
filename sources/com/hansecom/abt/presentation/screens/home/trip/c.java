package com.hansecom.abt.presentation.screens.home.trip;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.trip.TripPlanner;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f37511A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37512B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TripPlanner.State f37513z;

    public /* synthetic */ c(TripPlanner.State state, Function2 function2, int i2) {
        this.f37513z = state;
        this.f37511A = function2;
        this.f37512B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TripPlannerScreenKt.d(this.f37513z, this.f37511A, this.f37512B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
