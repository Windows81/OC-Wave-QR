package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37472z;

    public /* synthetic */ i(List list) {
        this.f37472z = list;
    }

    public final Object invoke(Object obj) {
        return GuidedTourViewModel.v(this.f37472z, (GuidedTour.State) obj);
    }
}
