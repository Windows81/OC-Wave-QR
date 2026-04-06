package com.hansecom.abt.presentation.screens.home.trip;

import com.hansecom.abt.data.config.links.LinksConfigItem;
import com.hansecom.abt.presentation.screens.home.trip.TripPlanner;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LinksConfigItem f37516z;

    public /* synthetic */ e(LinksConfigItem linksConfigItem) {
        this.f37516z = linksConfigItem;
    }

    public final Object invoke(Object obj) {
        return TripPlannerViewModel.w(this.f37516z, (TripPlanner.State) obj);
    }
}
